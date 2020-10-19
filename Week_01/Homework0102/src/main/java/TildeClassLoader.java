import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;

/**
 * @author Hout
 * @version 1.0
 */
public class TildeClassLoader extends ClassLoader {

    private static final String CLASS_FILE_SUFFIX = ".xlass";

    public static int count = 0;

    public TildeClassLoader(ClassLoader parent) {
        super(parent);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        byte[] bytes = loadBytesForClassWithTilde(name);
        if (bytes != null) {
            return defineClass(name, bytes, 0, bytes.length);
        }
        return super.findClass(name);
    }

    private byte[] loadBytesForClassWithTilde(String name) throws ClassNotFoundException {
        InputStream is = openStreamForClass(name);
        if (is == null) {
            return null;
        }
        try {
            // Load the raw bytes.
            byte[] bytes = FileCopyUtils.copyToByteArray(is);
            // Transform if necessary and use the potentially transformed bytes.
            return tilde(bytes);
        }
        catch (IOException ex) {
            throw new ClassNotFoundException("Cannot load resource for class [" + name + "]", ex);
        }
    }

    private byte[] tilde(byte[] bytes) {
        count++;
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = (byte)~bytes[i];
        }
        return bytes;
    }

    /**
     * Open an InputStream for the specified class.
     * <p>The default implementation loads a standard class file through
     * the parent ClassLoader's {@code getResourceAsStream} method.
     * @param name the name of the class
     * @return the InputStream containing the byte code for the specified class
     */
    protected InputStream openStreamForClass(String name) {
        String internalName = name.replace('.', '/') + CLASS_FILE_SUFFIX;
        return getParent().getResourceAsStream(internalName);
    }



    public static void main(String[] args) throws InterruptedException {
        TildeClassLoader tildeClassLoader = new TildeClassLoader(TildeClassLoader.getSystemClassLoader());
        try {
            Class<?> aClass = tildeClassLoader.loadClass("Hello");
            Class<?> aClass2 = tildeClassLoader.loadClass("Hello");
            Method hello = aClass.getDeclaredMethod("hello");
            hello.setAccessible(true);
            hello.invoke(aClass.newInstance());
            System.out.println(count);
        } catch (Exception e) {
            System.out.println("加载失败");
            e.printStackTrace();
        }
    }
}
