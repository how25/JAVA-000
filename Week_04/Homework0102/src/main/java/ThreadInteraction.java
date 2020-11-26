import com.google.common.collect.Lists;
import io.netty.util.concurrent.ThreadPerTaskExecutor;
import lombok.Data;
import lombok.SneakyThrows;
import org.omg.CORBA.StringHolder;

import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 2.（必做）思考有多少种方式，在 main 函数启动一个新线程，运行一个方法，拿到这个方法的返回值后，退出主线程？
 *
 * @author Hout
 * @version 1.0
 */
public class ThreadInteraction {

    private static int i = 0;

    static ExecutorService executorService;

    @SneakyThrows
    public static void main(String[] args) {
        ArrayList<Consumer<Integer>> funcs = Lists.newArrayList(
                ThreadInteraction::func0_errorDemon,
                ThreadInteraction::func1,
                ThreadInteraction::func2,
                ThreadInteraction::func3,
                ThreadInteraction::func4,
                ThreadInteraction::func5,
                ThreadInteraction::func6,
                ThreadInteraction::func7,
                ThreadInteraction::func8,
                ThreadInteraction::func9
        );
        executorService = Executors.newFixedThreadPool(funcs.size());
        CountDownLatch countDownLatch = new CountDownLatch(funcs.size());
        funcs.stream().map(f -> {
            int c = i++;
            return (Supplier<Boolean>)() -> {
                f.accept(c);
                return true; };
        }).collect(Collectors.toList())
                .stream().parallel()
                .forEach(supplier -> {
                    try {
                        supplier.get();
                    } finally {
                        countDownLatch.countDown();
                    }
                });
        countDownLatch.await();
        executorService.shutdown();
    }

    @SneakyThrows
    private static String hello() {
//        System.out.println(Thread.currentThread().getId() + "in");
        Thread.sleep(1000);
//        System.out.println(Thread.currentThread().getId() + "end");
        return " Hello world!";
    }

    private static Supplier<String> supplier = ThreadInteraction::hello;

    @SneakyThrows
    private static void func0_errorDemon(int i) {
        StringHolder stringHolder = new StringHolder();
        Thread thread = new Thread(() -> stringHolder.setStr(supplier.get()));
        thread.start();
//        thread.join(); // 错误示范
        print(stringHolder.getStr(), i);

    }

    @SneakyThrows
    private static void func1(int i) {
        StringHolder stringHolder = new StringHolder();
        Thread thread = new Thread(() -> stringHolder.setStr(supplier.get()));
        thread.start();
        thread.join();
        print(stringHolder.getStr(), i);
    }

    @SneakyThrows
    private static void func2(int i) {
        Future<String> submit = executorService.submit(() -> supplier.get());
        print(submit.get(), i);
    }

    private static void func3(int i) {
        StringHolder stringHolder = new StringHolder();
        executorService.execute(() -> stringHolder.setStr(supplier.get()));
        while (!stringHolder.hasValue()) { }
        print(stringHolder.getStr(), i);
    }

    @SneakyThrows
    private static void func4(int i) {
        Semaphore semaphore = new Semaphore(1);
        StringHolder stringHolder = new StringHolder();
        semaphore.acquire();
        executorService.execute(() -> {
            stringHolder.setStr(supplier.get());
            semaphore.release();
        });
        semaphore.acquire();
        print(stringHolder.getStr(), i);
        semaphore.release();
    }

    @SneakyThrows
    private static void func5(int i) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        StringHolder stringHolder = new StringHolder();
        executorService.execute(() -> {
            stringHolder.setStr(supplier.get());
            countDownLatch.countDown();
        });
        countDownLatch.await();
        print(stringHolder.getStr(), i);
    }

    @SneakyThrows
    private static void func6(int i) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(2);
        StringHolder stringHolder = new StringHolder();
        executorService.execute(() -> {
            stringHolder.setStr(supplier.get());
            try {
                cyclicBarrier.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        });
        cyclicBarrier.await();
        print(stringHolder.getStr(), i);
    }

    @SneakyThrows
    private static void func7(int i) {
        ReentrantLock lock = new ReentrantLock();
        StringHolder stringHolder = new StringHolder();
        executorService.execute(() -> {
            try {
                lock.lock();
                stringHolder.setStr(supplier.get());
            } finally {
                lock.unlock();
            }
        });
        Thread.sleep(1000);
        lock.lock();
        lock.unlock();
        print(stringHolder.getStr(), i);
    }

    private static void func8(int i) {

    }

    @SneakyThrows
    private static void func9(int i) {
    }

    private static void print(String s, int i) {
        System.out.println(i + s);
    }
    @Data
    public static class StringHolder {
        private volatile boolean flag;
        private String str;

        public boolean hasValue() {
            return flag;
        }

        public void setStr(String str) {
            this.str = str;
            this.flag = true;
        }
    }
}