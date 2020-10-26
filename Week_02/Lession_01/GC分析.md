# GCLogAnalysis.java 案例

## 环境

### JDK
```shell
java version "1.8.0_192"
Java(TM) SE Runtime Environment (build 1.8.0_192-b12)
Java HotSpot(TM) 64-Bit Server VM (build 25.192-b12, mixed mode)
```


### OS
macOS 10.15.7

### CPU
2.9 GHz 六核Intel Core i9

### 内存
32 GB 2400 MHz DDR4

## 串行
### 128m
```shell
start
2020-10-26T00:10:50.035-0800: [GC (Allocation Failure) 2020-10-26T00:10:50.035-0800: [DefNew: 34662K->4352K(39296K), 0.0082968 secs] 34662K->13138K(126720K), 0.0083793 secs] [Times: user=0.01 sys=0.00, real=0.01 secs]
2020-10-26T00:10:50.053-0800: [GC (Allocation Failure) 2020-10-26T00:10:50.053-0800: [DefNew: 39228K->4351K(39296K), 0.0096895 secs] 48015K->24648K(126720K), 0.0097635 secs] [Times: user=0.01 sys=0.01, real=0.01 secs]
2020-10-26T00:10:50.068-0800: [GC (Allocation Failure) 2020-10-26T00:10:50.068-0800: [DefNew: 39205K->4349K(39296K), 0.0100054 secs] 59502K->40476K(126720K), 0.0100771 secs] [Times: user=0.01 sys=0.00, real=0.01 secs]
2020-10-26T00:10:50.085-0800: [GC (Allocation Failure) 2020-10-26T00:10:50.085-0800: [DefNew: 38988K->4350K(39296K), 0.0077792 secs] 75115K->52367K(126720K), 0.0078569 secs] [Times: user=0.00 sys=0.01, real=0.01 secs]
2020-10-26T00:10:50.100-0800: [GC (Allocation Failure) 2020-10-26T00:10:50.100-0800: [DefNew: 39187K->4328K(39296K), 0.0068199 secs] 87203K->62326K(126720K), 0.0068974 secs] [Times: user=0.01 sys=0.00, real=0.00 secs]
2020-10-26T00:10:50.112-0800: [GC (Allocation Failure) 2020-10-26T00:10:50.112-0800: [DefNew: 38896K->4344K(39296K), 0.0088800 secs] 96894K->77445K(126720K), 0.0089588 secs] [Times: user=0.01 sys=0.00, real=0.01 secs]
2020-10-26T00:10:50.128-0800: [GC (Allocation Failure) 2020-10-26T00:10:50.128-0800: [DefNew: 39288K->39288K(39296K), 0.0000433 secs]2020-10-26T00:10:50.128-0800: [Tenured: 73101K->87000K(87424K), 0.0139462 secs] 112389K->87000K(126720K), [Metaspace: 2673K->2673K(1056768K)], 0.0140935 secs] [Times: user=0.01 sys=0.01, real=0.02 secs]
2020-10-26T00:10:50.148-0800: [GC (Allocation Failure) 2020-10-26T00:10:50.148-0800: [DefNew: 34944K->34944K(39296K), 0.0000424 secs]2020-10-26T00:10:50.148-0800: [Tenured: 87000K->87340K(87424K), 0.0080810 secs] 121944K->97136K(126720K), [Metaspace: 2673K->2673K(1056768K)], 0.0082476 secs] [Times: user=0.01 sys=0.00, real=0.01 secs]
2020-10-26T00:10:50.161-0800: [Full GC (Allocation Failure) 2020-10-26T00:10:50.161-0800: [Tenured: 87376K->87180K(87424K), 0.0087468 secs] 126641K->104461K(126720K), [Metaspace: 2673K->2673K(1056768K)], 0.0088489 secs] [Times: user=0.01 sys=0.00, real=0.01 secs]
2020-10-26T00:10:50.175-0800: [Full GC (Allocation Failure) 2020-10-26T00:10:50.175-0800: [Tenured: 87180K->86938K(87424K), 0.0168859 secs] 126044K->105968K(126720K), [Metaspace: 2673K->2673K(1056768K)], 0.0169897 secs] [Times: user=0.01 sys=0.00, real=0.02 secs]
2020-10-26T00:10:50.195-0800: [Full GC (Allocation Failure) 2020-10-26T00:10:50.195-0800: [Tenured: 87219K->87219K(87424K), 0.0027951 secs] 126283K->115085K(126720K), [Metaspace: 2673K->2673K(1056768K)], 0.0028862 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-26T00:10:50.199-0800: [Full GC (Allocation Failure) 2020-10-26T00:10:50.199-0800: [Tenured: 87400K->87400K(87424K), 0.0036320 secs] 126691K->118972K(126720K), [Metaspace: 2673K->2673K(1056768K)], 0.0037049 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
2020-10-26T00:10:50.204-0800: [Full GC (Allocation Failure) 2020-10-26T00:10:50.204-0800: [Tenured: 87400K->86980K(87424K), 0.0047712 secs] 126609K->120928K(126720K), [Metaspace: 2673K->2673K(1056768K)], 0.0048460 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-26T00:10:50.210-0800: [Full GC (Allocation Failure) 2020-10-26T00:10:50.210-0800: [Tenured: 87300K->87304K(87424K), 0.0145169 secs] 126363K->118385K(126720K), [Metaspace: 2673K->2673K(1056768K)], 0.0146050 secs] [Times: user=0.02 sys=0.00, real=0.01 secs]
2020-10-26T00:10:50.226-0800: [Full GC (Allocation Failure) 2020-10-26T00:10:50.226-0800: [Tenured: 87304K->87304K(87424K), 0.0026172 secs] 126560K->121585K(126720K), [Metaspace: 2673K->2673K(1056768K)], 0.0027123 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-26T00:10:50.230-0800: [Full GC (Allocation Failure) 2020-10-26T00:10:50.230-0800: [Tenured: 87304K->87304K(87424K), 0.0034329 secs] 126389K->122244K(126720K), [Metaspace: 2673K->2673K(1056768K)], 0.0035131 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-26T00:10:50.235-0800: [Full GC (Allocation Failure) 2020-10-26T00:10:50.235-0800: [Tenured: 87412K->87412K(87424K), 0.0016828 secs] 126694K->122475K(126720K), [Metaspace: 2673K->2673K(1056768K)], 0.0017340 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-26T00:10:50.237-0800: [Full GC (Allocation Failure) 2020-10-26T00:10:50.237-0800: [Tenured: 87412K->87253K(87424K), 0.0139009 secs] 126179K->122392K(126720K), [Metaspace: 2673K->2673K(1056768K)], 0.0139616 secs] [Times: user=0.01 sys=0.00, real=0.02 secs]
2020-10-26T00:10:50.252-0800: [Full GC (Allocation Failure) 2020-10-26T00:10:50.252-0800: [Tenured: 87367K->87367K(87424K), 0.0020787 secs] 126615K->124909K(126720K), [Metaspace: 2673K->2673K(1056768K)], 0.0021392 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-26T00:10:50.254-0800: [Full GC (Allocation Failure) 2020-10-26T00:10:50.254-0800: [Tenured: 87367K->87367K(87424K), 0.0020882 secs] 126634K->126010K(126720K), [Metaspace: 2673K->2673K(1056768K)], 0.0021526 secs] [Times: user=0.01 sys=0.00, real=0.00 secs]
2020-10-26T00:10:50.257-0800: [Full GC (Allocation Failure) 2020-10-26T00:10:50.257-0800: [Tenured: 87367K->87367K(87424K), 0.0019161 secs] 126615K->126185K(126720K), [Metaspace: 2673K->2673K(1056768K)], 0.0019720 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-26T00:10:50.259-0800: [Full GC (Allocation Failure) 2020-10-26T00:10:50.259-0800: [Tenured: 87367K->87366K(87424K), 0.0136058 secs] 126185K->125407K(126720K), [Metaspace: 2673K->2673K(1056768K)], 0.0136749 secs] [Times: user=0.01 sys=0.00, real=0.02 secs]
2020-10-26T00:10:50.273-0800: [Full GC (Allocation Failure) 2020-10-26T00:10:50.273-0800: [Tenured: 87366K->87366K(87424K), 0.0023950 secs] 126479K->126194K(126720K), [Metaspace: 2673K->2673K(1056768K)], 0.0024857 secs] [Times: user=0.01 sys=0.00, real=0.00 secs]
2020-10-26T00:10:50.276-0800: [Full GC (Allocation Failure) 2020-10-26T00:10:50.276-0800: [Tenured: 87366K->87366K(87424K), 0.0016978 secs] 126585K->126194K(126720K), [Metaspace: 2673K->2673K(1056768K)], 0.0017554 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-26T00:10:50.278-0800: [Full GC (Allocation Failure) 2020-10-26T00:10:50.278-0800: [Tenured: 87366K->87366K(87424K), 0.0016668 secs] 126607K->126530K(126720K), [Metaspace: 2673K->2673K(1056768K)], 0.0017202 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-26T00:10:50.279-0800: [Full GC (Allocation Failure) 2020-10-26T00:10:50.279-0800: [Tenured: 87366K->87352K(87424K), 0.0043334 secs] 126530K->126516K(126720K), [Metaspace: 2673K->2673K(1056768K)], 0.0043793 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]

Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
	at java.util.Arrays.copyOf(Arrays.java:3332)
	at java.lang.AbstractStringBuilder.ensureCapacityInternal(AbstractStringBuilder.java:124)
	at java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:674)
	at java.lang.StringBuilder.append(StringBuilder.java:208)
	at GCLogAnalysis.generateGarbage(GCLogAnalysis.java:47)
	at GCLogAnalysis.main(GCLogAnalysis.java:18)

Heap
 def new generation   total 39296K, used 39178K [0x00000007b8000000, 0x00000007baaa0000, 0x00000007baaa0000)
  eden space 34944K, 100% used [0x00000007b8000000, 0x00000007ba220000, 0x00000007ba220000)
  from space 4352K,  97% used [0x00000007ba220000, 0x00000007ba642b40, 0x00000007ba660000)
  to   space 4352K,   0% used [0x00000007ba660000, 0x00000007ba660000, 0x00000007baaa0000)
 tenured generation   total 87424K, used 87352K [0x00000007baaa0000, 0x00000007c0000000, 0x00000007c0000000)
   the space 87424K,  99% used [0x00000007baaa0000, 0x00000007bffee090, 0x00000007bffee200, 0x00000007c0000000)
 Metaspace       used 2704K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 295K, capacity 386K, committed 512K, reserved 1048576K
```
#### 现象
OOM

#### GC分析
- 最后多次 Full GC 几乎没有释放内存 说明没有可用内存和可释放内存了
- 从 OOM 的堆栈可以看出是在垃圾回收造成的 OOM, 可以推测在内存不足时, 应用程序的新对象已经无法生成了, 而垃圾回收需要生成对象, 内存不足会导致 OOM;

#### 内存分析
- eden 区 100% from 区 97% tenured 区 99%
- 说明可用内存都满了而 to 区无法容纳剩余对象

### 256m
```log
start
2020-10-26T00:10:55.504-0800: [GC (Allocation Failure) 2020-10-26T00:10:55.504-0800: [DefNew: 69836K->8703K(78656K), 0.0151941 secs] 69836K->26952K(253440K), 0.0152757 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
2020-10-26T00:10:55.533-0800: [GC (Allocation Failure) 2020-10-26T00:10:55.533-0800: [DefNew: 78655K->8703K(78656K), 0.0175322 secs] 96904K->49052K(253440K), 0.0176123 secs] [Times: user=0.01 sys=0.01, real=0.02 secs] 
2020-10-26T00:10:55.561-0800: [GC (Allocation Failure) 2020-10-26T00:10:55.561-0800: [DefNew: 78385K->8697K(78656K), 0.0167455 secs] 118734K->76319K(253440K), 0.0168264 secs] [Times: user=0.01 sys=0.01, real=0.01 secs] 
2020-10-26T00:10:55.588-0800: [GC (Allocation Failure) 2020-10-26T00:10:55.588-0800: [DefNew: 78616K->8703K(78656K), 0.0135908 secs] 146238K->98173K(253440K), 0.0136662 secs] [Times: user=0.00 sys=0.00, real=0.02 secs] 
2020-10-26T00:10:55.611-0800: [GC (Allocation Failure) 2020-10-26T00:10:55.611-0800: [DefNew: 78655K->8695K(78656K), 0.0159924 secs] 168125K->123603K(253440K), 0.0160555 secs] [Times: user=0.01 sys=0.01, real=0.01 secs] 
2020-10-26T00:10:55.637-0800: [GC (Allocation Failure) 2020-10-26T00:10:55.637-0800: [DefNew: 78081K->8699K(78656K), 0.0144785 secs] 192990K->146768K(253440K), 0.0145436 secs] [Times: user=0.01 sys=0.00, real=0.02 secs] 
2020-10-26T00:10:55.662-0800: [GC (Allocation Failure) 2020-10-26T00:10:55.662-0800: [DefNew: 78210K->8697K(78656K), 0.0126306 secs] 216279K->166396K(253440K), 0.0127061 secs] [Times: user=0.01 sys=0.01, real=0.01 secs] 
2020-10-26T00:10:55.686-0800: [GC (Allocation Failure) 2020-10-26T00:10:55.686-0800: [DefNew: 78649K->78649K(78656K), 0.0000432 secs]2020-10-26T00:10:55.686-0800: [Tenured: 157699K->166824K(174784K), 0.0248022 secs] 236348K->166824K(253440K), [Metaspace: 2673K->2673K(1056768K)], 0.0249503 secs] [Times: user=0.02 sys=0.00, real=0.03 secs] 
2020-10-26T00:10:55.721-0800: [GC (Allocation Failure) 2020-10-26T00:10:55.721-0800: [DefNew: 69952K->69952K(78656K), 0.0000441 secs]2020-10-26T00:10:55.721-0800: [Tenured: 166824K->174774K(174784K), 0.0236780 secs] 236776K->185941K(253440K), [Metaspace: 2673K->2673K(1056768K)], 0.0238273 secs] [Times: user=0.03 sys=0.00, real=0.02 secs] 
2020-10-26T00:10:55.755-0800: [Full GC (Allocation Failure) 2020-10-26T00:10:55.755-0800: [Tenured: 174774K->174621K(174784K), 0.0208608 secs] 253429K->191862K(253440K), [Metaspace: 2673K->2673K(1056768K)], 0.0209518 secs] [Times: user=0.02 sys=0.00, real=0.02 secs] 
2020-10-26T00:10:55.785-0800: [Full GC (Allocation Failure) 2020-10-26T00:10:55.786-0800: [Tenured: 174759K->174562K(174784K), 0.0284743 secs] 253406K->196027K(253440K), [Metaspace: 2673K->2673K(1056768K)], 0.0285754 secs] [Times: user=0.03 sys=0.00, real=0.03 secs] 
2020-10-26T00:10:55.825-0800: [Full GC (Allocation Failure) 2020-10-26T00:10:55.825-0800: [Tenured: 174774K->174774K(174784K), 0.0059511 secs] 253425K->214542K(253440K), [Metaspace: 2673K->2673K(1056768K)], 0.0060503 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
2020-10-26T00:10:55.836-0800: [Full GC (Allocation Failure) 2020-10-26T00:10:55.836-0800: [Tenured: 174774K->174543K(174784K), 0.0152666 secs] 252707K->221019K(253440K), [Metaspace: 2673K->2673K(1056768K)], 0.0153589 secs] [Times: user=0.02 sys=0.00, real=0.02 secs] 
2020-10-26T00:10:55.857-0800: [Full GC (Allocation Failure) 2020-10-26T00:10:55.857-0800: [Tenured: 174741K->174635K(174784K), 0.0168444 secs] 253220K->225723K(253440K), [Metaspace: 2673K->2673K(1056768K)], 0.0169518 secs] [Times: user=0.02 sys=0.00, real=0.02 secs] 
2020-10-26T00:10:55.878-0800: [Full GC (Allocation Failure) 2020-10-26T00:10:55.878-0800: [Tenured: 174753K->174554K(174784K), 0.0304281 secs] 253374K->220985K(253440K), [Metaspace: 2673K->2673K(1056768K)], 0.0305422 secs] [Times: user=0.03 sys=0.01, real=0.03 secs] 
2020-10-26T00:10:55.914-0800: [Full GC (Allocation Failure) 2020-10-26T00:10:55.914-0800: [Tenured: 174599K->174599K(174784K), 0.0074569 secs] 253239K->233060K(253440K), [Metaspace: 2673K->2673K(1056768K)], 0.0075494 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
2020-10-26T00:10:55.924-0800: [Full GC (Allocation Failure) 2020-10-26T00:10:55.924-0800: [Tenured: 174731K->174731K(174784K), 0.0058268 secs] 253380K->240934K(253440K), [Metaspace: 2673K->2673K(1056768K)], 0.0058882 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
2020-10-26T00:10:55.932-0800: [Full GC (Allocation Failure) 2020-10-26T00:10:55.932-0800: [Tenured: 174731K->174311K(174784K), 0.0101852 secs] 253339K->242329K(253440K), [Metaspace: 2673K->2673K(1056768K)], 0.0102487 secs] [Times: user=0.01 sys=0.00, real=0.01 secs] 
2020-10-26T00:10:55.944-0800: [Full GC (Allocation Failure) 2020-10-26T00:10:55.944-0800: [Tenured: 174672K->174601K(174784K), 0.0304371 secs] 253211K->236443K(253440K), [Metaspace: 2673K->2673K(1056768K)], 0.0305011 secs] [Times: user=0.03 sys=0.00, real=0.03 secs] 
2020-10-26T00:10:55.977-0800: [Full GC (Allocation Failure) 2020-10-26T00:10:55.977-0800: [Tenured: 174741K->174741K(174784K), 0.0086539 secs] 253396K->243539K(253440K), [Metaspace: 2673K->2673K(1056768K)], 0.0087213 secs] [Times: user=0.01 sys=0.00, real=0.01 secs] 
2020-10-26T00:10:55.988-0800: [Full GC (Allocation Failure) 2020-10-26T00:10:55.988-0800: [Tenured: 174741K->174741K(174784K), 0.0074002 secs] 253372K->245878K(253440K), [Metaspace: 2673K->2673K(1056768K)], 0.0074649 secs] [Times: user=0.01 sys=0.00, real=0.01 secs] 
2020-10-26T00:10:55.997-0800: [Full GC (Allocation Failure) 2020-10-26T00:10:55.997-0800: [Tenured: 174741K->174741K(174784K), 0.0024224 secs] 253329K->248257K(253440K), [Metaspace: 2673K->2673K(1056768K)], 0.0024809 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:10:56.000-0800: [Full GC (Allocation Failure) 2020-10-26T00:10:56.000-0800: [Tenured: 174741K->174768K(174784K), 0.0293826 secs] 253174K->241901K(253440K), [Metaspace: 2673K->2673K(1056768K)], 0.0294458 secs] [Times: user=0.03 sys=0.00, real=0.03 secs] 
2020-10-26T00:10:56.033-0800: [Full GC (Allocation Failure) 2020-10-26T00:10:56.033-0800: [Tenured: 174768K->174768K(174784K), 0.0098038 secs] 253281K->243665K(253440K), [Metaspace: 2673K->2673K(1056768K)], 0.0098694 secs] [Times: user=0.01 sys=0.00, real=0.01 secs] 
2020-10-26T00:10:56.045-0800: [Full GC (Allocation Failure) 2020-10-26T00:10:56.045-0800: [Tenured: 174768K->174768K(174784K), 0.0083480 secs] 253383K->246553K(253440K), [Metaspace: 2673K->2673K(1056768K)], 0.0084061 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
2020-10-26T00:10:56.054-0800: [Full GC (Allocation Failure) 2020-10-26T00:10:56.054-0800: [Tenured: 174768K->174768K(174784K), 0.0119155 secs] 253369K->249452K(253440K), [Metaspace: 2673K->2673K(1056768K)], 0.0119725 secs] [Times: user=0.01 sys=0.00, real=0.01 secs] 
2020-10-26T00:10:56.067-0800: [Full GC (Allocation Failure) 2020-10-26T00:10:56.067-0800: [Tenured: 174768K->174630K(174784K), 0.0368646 secs] 253063K->246346K(253440K), [Metaspace: 2673K->2673K(1056768K)], 0.0369203 secs] [Times: user=0.04 sys=0.00, real=0.04 secs] 
2020-10-26T00:10:56.106-0800: [Full GC (Allocation Failure) 2020-10-26T00:10:56.106-0800: [Tenured: 174702K->174702K(174784K), 0.0044358 secs] 253348K->248508K(253440K), [Metaspace: 2673K->2673K(1056768K)], 0.0044909 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
2020-10-26T00:10:56.111-0800: [Full GC (Allocation Failure) 2020-10-26T00:10:56.111-0800: [Tenured: 174702K->174702K(174784K), 0.0079290 secs] 253223K->249776K(253440K), [Metaspace: 2673K->2673K(1056768K)], 0.0079792 secs] [Times: user=0.01 sys=0.00, real=0.00 secs] 
2020-10-26T00:10:56.119-0800: [Full GC (Allocation Failure) 2020-10-26T00:10:56.119-0800: [Tenured: 174702K->174702K(174784K), 0.0077423 secs] 252886K->250643K(253440K), [Metaspace: 2673K->2673K(1056768K)], 0.0077951 secs] [Times: user=0.01 sys=0.00, real=0.01 secs] 
2020-10-26T00:10:56.127-0800: [Full GC (Allocation Failure) 2020-10-26T00:10:56.127-0800: [Tenured: 174702K->174383K(174784K), 0.0248030 secs] 253120K->248890K(253440K), [Metaspace: 2673K->2673K(1056768K)], 0.0248676 secs] [Times: user=0.02 sys=0.00, real=0.03 secs] 
2020-10-26T00:10:56.153-0800: [Full GC (Allocation Failure) 2020-10-26T00:10:56.153-0800: [Tenured: 174670K->174670K(174784K), 0.0039096 secs] 253303K->249460K(253440K), [Metaspace: 2673K->2673K(1056768K)], 0.0039765 secs] [Times: user=0.01 sys=0.00, real=0.00 secs] 
2020-10-26T00:10:56.158-0800: [Full GC (Allocation Failure) 2020-10-26T00:10:56.158-0800: [Tenured: 174670K->174670K(174784K), 0.0022209 secs] 253116K->250280K(253440K), [Metaspace: 2673K->2673K(1056768K)], 0.0022812 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
2020-10-26T00:10:56.161-0800: [Full GC (Allocation Failure) 2020-10-26T00:10:56.161-0800: [Tenured: 174670K->174670K(174784K), 0.0068928 secs] 253163K->251304K(253440K), [Metaspace: 2673K->2673K(1056768K)], 0.0069532 secs] [Times: user=0.01 sys=0.00, real=0.00 secs] 
2020-10-26T00:10:56.168-0800: [Full GC (Allocation Failure) 2020-10-26T00:10:56.168-0800: [Tenured: 174670K->174363K(174784K), 0.0258400 secs] 252771K->251054K(253440K), [Metaspace: 2673K->2673K(1056768K)], 0.0259064 secs] [Times: user=0.02 sys=0.00, real=0.03 secs] 
2020-10-26T00:10:56.194-0800: [Full GC (Allocation Failure) 2020-10-26T00:10:56.194-0800: [Tenured: 174363K->174363K(174784K), 0.0022651 secs] 252458K->251362K(253440K), [Metaspace: 2673K->2673K(1056768K)], 0.0023253 secs] [Times: user=0.01 sys=0.00, real=0.00 secs] 
2020-10-26T00:10:56.197-0800: [Full GC (Allocation Failure) 2020-10-26T00:10:56.197-0800: [Tenured: 174363K->174363K(174784K), 0.0092075 secs] 252903K->251894K(253440K), [Metaspace: 2673K->2673K(1056768K)], 0.0092692 secs] [Times: user=0.01 sys=0.00, real=0.01 secs] 
2020-10-26T00:10:56.206-0800: [Full GC (Allocation Failure) 2020-10-26T00:10:56.206-0800: [Tenured: 174781K->174781K(174784K), 0.0022389 secs] 253425K->252843K(253440K), [Metaspace: 2673K->2673K(1056768K)], 0.0023001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:10:56.209-0800: [Full GC (Allocation Failure) 2020-10-26T00:10:56.209-0800: [Tenured: 174781K->174688K(174784K), 0.0194208 secs] 253021K->252131K(253440K), [Metaspace: 2673K->2673K(1056768K)], 0.0194848 secs] [Times: user=0.02 sys=0.00, real=0.02 secs] 
2020-10-26T00:10:56.229-0800: [Full GC (Allocation Failure) 2020-10-26T00:10:56.229-0800: [Tenured: 174688K->174688K(174784K), 0.0053487 secs] 253273K->253113K(253440K), [Metaspace: 2673K->2673K(1056768K)], 0.0054097 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
2020-10-26T00:10:56.234-0800: [Full GC (Allocation Failure) 2020-10-26T00:10:56.234-0800: [Tenured: 174762K->174762K(174784K), 0.0020098 secs] 253381K->253133K(253440K), [Metaspace: 2673K->2673K(1056768K)], 0.0020648 secs] [Times: user=0.01 sys=0.00, real=0.00 secs] 
2020-10-26T00:10:56.236-0800: [Full GC (Allocation Failure) 2020-10-26T00:10:56.236-0800: [Tenured: 174762K->174762K(174784K), 0.0019066 secs] 253241K->253187K(253440K), [Metaspace: 2673K->2673K(1056768K)], 0.0019604 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:10:56.238-0800: [Full GC (Allocation Failure) 2020-10-26T00:10:56.239-0800: [Tenured: 174762K->174773K(174784K), 0.0168050 secs] 253354K->253075K(253440K), [Metaspace: 2673K->2673K(1056768K)], 0.0168657 secs] [Times: user=0.01 sys=0.00, real=0.02 secs] 
2020-10-26T00:10:56.255-0800: [Full GC (Allocation Failure) 2020-10-26T00:10:56.256-0800: [Tenured: 174773K->174773K(174784K), 0.0022429 secs] 253153K->253009K(253440K), [Metaspace: 2673K->2673K(1056768K)], 0.0023012 secs] [Times: user=0.01 sys=0.00, real=0.00 secs] 
2020-10-26T00:10:56.258-0800: [Full GC (Allocation Failure) 2020-10-26T00:10:56.258-0800: [Tenured: 174773K->174773K(174784K), 0.0051988 secs] 253237K->253056K(253440K), [Metaspace: 2673K->2673K(1056768K)], 0.0052593 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
2020-10-26T00:10:56.263-0800: [Full GC (Allocation Failure) 2020-10-26T00:10:56.263-0800: [Tenured: 174773K->174732K(174784K), 0.0169506 secs] 253056K->253015K(253440K), [Metaspace: 2673K->2673K(1056768K)], 0.0170026 secs] [Times: user=0.02 sys=0.00, real=0.02 secs] 

Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
	at GCLogAnalysis.generateGarbage(GCLogAnalysis.java:33)
	at GCLogAnalysis.main(GCLogAnalysis.java:18)

Heap
 def new generation   total 78656K, used 78390K [0x00000007b0000000, 0x00000007b5550000, 0x00000007b5550000)
  eden space 69952K, 100% used [0x00000007b0000000, 0x00000007b4450000, 0x00000007b4450000)
  from space 8704K,  96% used [0x00000007b4cd0000, 0x00000007b550db70, 0x00000007b5550000)
  to   space 8704K,   0% used [0x00000007b4450000, 0x00000007b4450000, 0x00000007b4cd0000)
 tenured generation   total 174784K, used 174732K [0x00000007b5550000, 0x00000007c0000000, 0x00000007c0000000)
   the space 174784K,  99% used [0x00000007b5550000, 0x00000007bfff3048, 0x00000007bfff3200, 0x00000007c0000000)
 Metaspace       used 2704K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 295K, capacity 386K, committed 512K, reserved 1048576K
```
#### 现象
OOM

### 512m
```shell
start
2020-10-26T00:11:01.546-0800: [GC (Allocation Failure) 2020-10-26T00:11:01.546-0800: [DefNew: 139776K->17472K(157248K), 0.0290195 secs] 139776K->50041K(506816K), 0.0291024 secs] [Times: user=0.02 sys=0.01, real=0.03 secs] 
2020-10-26T00:11:01.598-0800: [GC (Allocation Failure) 2020-10-26T00:11:01.598-0800: [DefNew: 157248K->17471K(157248K), 0.0360361 secs] 189817K->92099K(506816K), 0.0361145 secs] [Times: user=0.02 sys=0.02, real=0.04 secs] 
2020-10-26T00:11:01.653-0800: [GC (Allocation Failure) 2020-10-26T00:11:01.653-0800: [DefNew: 157247K->17470K(157248K), 0.0284441 secs] 231875K->136477K(506816K), 0.0285112 secs] [Times: user=0.02 sys=0.01, real=0.03 secs] 
2020-10-26T00:11:01.701-0800: [GC (Allocation Failure) 2020-10-26T00:11:01.701-0800: [DefNew: 157082K->17472K(157248K), 0.0275331 secs] 276088K->179636K(506816K), 0.0276148 secs] [Times: user=0.02 sys=0.01, real=0.02 secs] 
2020-10-26T00:11:01.749-0800: [GC (Allocation Failure) 2020-10-26T00:11:01.749-0800: [DefNew: 157248K->17471K(157248K), 0.0256913 secs] 319412K->221386K(506816K), 0.0257701 secs] [Times: user=0.01 sys=0.01, real=0.03 secs] 
2020-10-26T00:11:01.793-0800: [GC (Allocation Failure) 2020-10-26T00:11:01.794-0800: [DefNew: 157245K->17470K(157248K), 0.0282794 secs] 361159K->267915K(506816K), 0.0283529 secs] [Times: user=0.01 sys=0.01, real=0.03 secs] 
2020-10-26T00:11:01.840-0800: [GC (Allocation Failure) 2020-10-26T00:11:01.840-0800: [DefNew: 157246K->17471K(157248K), 0.0262418 secs] 407691K->310100K(506816K), 0.0263138 secs] [Times: user=0.02 sys=0.01, real=0.02 secs] 
2020-10-26T00:11:01.887-0800: [GC (Allocation Failure) 2020-10-26T00:11:01.887-0800: [DefNew: 157247K->17469K(157248K), 0.0306163 secs] 449876K->360353K(506816K), 0.0306964 secs] [Times: user=0.02 sys=0.01, real=0.03 secs] 
2020-10-26T00:11:01.935-0800: [GC (Allocation Failure) 2020-10-26T00:11:01.935-0800: [DefNew: 157245K->157245K(157248K), 0.0000430 secs]2020-10-26T00:11:01.935-0800: [Tenured: 342883K->283417K(349568K), 0.0479972 secs] 500129K->283417K(506816K), [Metaspace: 2673K->2673K(1056768K)], 0.0481478 secs] [Times: user=0.05 sys=0.00, real=0.05 secs] 
2020-10-26T00:11:02.004-0800: [GC (Allocation Failure) 2020-10-26T00:11:02.004-0800: [DefNew: 139277K->17472K(157248K), 0.0092626 secs] 422695K->336364K(506816K), 0.0093418 secs] [Times: user=0.01 sys=0.00, real=0.01 secs] 
2020-10-26T00:11:02.034-0800: [GC (Allocation Failure) 2020-10-26T00:11:02.035-0800: [DefNew: 157248K->157248K(157248K), 0.0000438 secs]2020-10-26T00:11:02.035-0800: [Tenured: 318892K->315345K(349568K), 0.0453005 secs] 476140K->315345K(506816K), [Metaspace: 2673K->2673K(1056768K)], 0.0454569 secs] [Times: user=0.05 sys=0.01, real=0.05 secs] 
2020-10-26T00:11:02.106-0800: [GC (Allocation Failure) 2020-10-26T00:11:02.106-0800: [DefNew: 139678K->139678K(157248K), 0.0000437 secs]2020-10-26T00:11:02.106-0800: [Tenured: 315345K->329669K(349568K), 0.0459956 secs] 455024K->329669K(506816K), [Metaspace: 2673K->2673K(1056768K)], 0.0461623 secs] [Times: user=0.04 sys=0.00, real=0.05 secs] 
2020-10-26T00:11:02.180-0800: [GC (Allocation Failure) 2020-10-26T00:11:02.180-0800: [DefNew: 139776K->139776K(157248K), 0.0000433 secs]2020-10-26T00:11:02.180-0800: [Tenured: 329669K->323670K(349568K), 0.0485569 secs] 469445K->323670K(506816K), [Metaspace: 2673K->2673K(1056768K)], 0.0487186 secs] [Times: user=0.05 sys=0.00, real=0.04 secs] 
2020-10-26T00:11:02.254-0800: [GC (Allocation Failure) 2020-10-26T00:11:02.254-0800: [DefNew: 139337K->139337K(157248K), 0.0000434 secs]2020-10-26T00:11:02.254-0800: [Tenured: 323670K->346590K(349568K), 0.0328582 secs] 463008K->346590K(506816K), [Metaspace: 2673K->2673K(1056768K)], 0.0330169 secs] [Times: user=0.03 sys=0.00, real=0.03 secs] 
2020-10-26T00:11:02.311-0800: [GC (Allocation Failure) 2020-10-26T00:11:02.311-0800: [DefNew: 139776K->139776K(157248K), 0.0000443 secs]2020-10-26T00:11:02.311-0800: [Tenured: 346590K->349540K(349568K), 0.0433784 secs] 486366K->357347K(506816K), [Metaspace: 2673K->2673K(1056768K)], 0.0435396 secs] [Times: user=0.04 sys=0.00, real=0.04 secs] 
2020-10-26T00:11:02.379-0800: [Full GC (Allocation Failure) 2020-10-26T00:11:02.379-0800: [Tenured: 349540K->349451K(349568K), 0.0473124 secs] 506641K->357998K(506816K), [Metaspace: 2673K->2673K(1056768K)], 0.0474002 secs] [Times: user=0.05 sys=0.00, real=0.05 secs] 
2020-10-26T00:11:02.455-0800: [Full GC (Allocation Failure) 2020-10-26T00:11:02.455-0800: [Tenured: 349451K->337847K(349568K), 0.0496723 secs] 506545K->337847K(506816K), [Metaspace: 2673K->2673K(1056768K)], 0.0497531 secs] [Times: user=0.05 sys=0.00, real=0.05 secs] 
creat: 9145
Heap
 def new generation   total 157248K, used 5741K [0x00000007a0000000, 0x00000007aaaa0000, 0x00000007aaaa0000)
  eden space 139776K,   4% used [0x00000007a0000000, 0x00000007a059b4b8, 0x00000007a8880000)
  from space 17472K,   0% used [0x00000007a9990000, 0x00000007a9990000, 0x00000007aaaa0000)
  to   space 17472K,   0% used [0x00000007a8880000, 0x00000007a8880000, 0x00000007a9990000)
 tenured generation   total 349568K, used 337847K [0x00000007aaaa0000, 0x00000007c0000000, 0x00000007c0000000)
   the space 349568K,  96% used [0x00000007aaaa0000, 0x00000007bf48dc68, 0x00000007bf48de00, 0x00000007c0000000)
 Metaspace       used 2680K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 292K, capacity 386K, committed 512K, reserved 1048576K
```

### 1g
```log
start
2020-10-26T00:11:07.872-0800: [GC (Allocation Failure) 2020-10-26T00:11:07.872-0800: [DefNew: 279616K->34944K(314560K), 0.0457087 secs] 279616K->77013K(1013632K), 0.0458803 secs] [Times: user=0.03 sys=0.02, real=0.04 secs] 
2020-10-26T00:11:07.960-0800: [GC (Allocation Failure) 2020-10-26T00:11:07.960-0800: [DefNew: 314560K->34943K(314560K), 0.0659864 secs] 356629K->156283K(1013632K), 0.0660620 secs] [Times: user=0.04 sys=0.03, real=0.06 secs] 
2020-10-26T00:11:08.063-0800: [GC (Allocation Failure) 2020-10-26T00:11:08.063-0800: [DefNew: 314559K->34943K(314560K), 0.0500906 secs] 435899K->236046K(1013632K), 0.0501646 secs] [Times: user=0.03 sys=0.02, real=0.05 secs] 
2020-10-26T00:11:08.149-0800: [GC (Allocation Failure) 2020-10-26T00:11:08.149-0800: [DefNew: 314559K->34944K(314560K), 0.0496661 secs] 515662K->314173K(1013632K), 0.0497395 secs] [Times: user=0.03 sys=0.02, real=0.05 secs] 
2020-10-26T00:11:08.256-0800: [GC (Allocation Failure) 2020-10-26T00:11:08.256-0800: [DefNew: 314560K->34943K(314560K), 0.0480645 secs] 593789K->388278K(1013632K), 0.0481450 secs] [Times: user=0.03 sys=0.02, real=0.05 secs] 
2020-10-26T00:11:08.344-0800: [GC (Allocation Failure) 2020-10-26T00:11:08.344-0800: [DefNew: 314559K->34942K(314560K), 0.0546230 secs] 667894K->472901K(1013632K), 0.0546981 secs] [Times: user=0.04 sys=0.02, real=0.05 secs] 
2020-10-26T00:11:08.436-0800: [GC (Allocation Failure) 2020-10-26T00:11:08.436-0800: [DefNew: 314558K->34943K(314560K), 0.0454813 secs] 752517K->543955K(1013632K), 0.0455564 secs] [Times: user=0.03 sys=0.02, real=0.05 secs] 
2020-10-26T00:11:08.519-0800: [GC (Allocation Failure) 2020-10-26T00:11:08.519-0800: [DefNew: 314559K->34943K(314560K), 0.0485673 secs] 823571K->620844K(1013632K), 0.0486476 secs] [Times: user=0.03 sys=0.02, real=0.05 secs] 
2020-10-26T00:11:08.604-0800: [GC (Allocation Failure) 2020-10-26T00:11:08.604-0800: [DefNew: 314559K->34941K(314560K), 0.0478465 secs] 900460K->696926K(1013632K), 0.0479211 secs] [Times: user=0.03 sys=0.02, real=0.05 secs] 
2020-10-26T00:11:08.688-0800: [GC (Allocation Failure) 2020-10-26T00:11:08.688-0800: [DefNew: 314557K->314557K(314560K), 0.0000434 secs]2020-10-26T00:11:08.688-0800: [Tenured: 661985K->367855K(699072K), 0.0554476 secs] 976542K->367855K(1013632K), [Metaspace: 2673K->2673K(1056768K)], 0.0555953 secs] [Times: user=0.06 sys=0.00, real=0.06 secs] 
creat: 10559
Heap
 def new generation   total 314560K, used 11374K [0x0000000780000000, 0x0000000795550000, 0x0000000795550000)
  eden space 279616K,   4% used [0x0000000780000000, 0x0000000780b1bbf8, 0x0000000791110000)
  from space 34944K,   0% used [0x0000000793330000, 0x0000000793330000, 0x0000000795550000)
  to   space 34944K,   0% used [0x0000000791110000, 0x0000000791110000, 0x0000000793330000)
 tenured generation   total 699072K, used 367855K [0x0000000795550000, 0x00000007c0000000, 0x00000007c0000000)
   the space 699072K,  52% used [0x0000000795550000, 0x00000007abc8bf58, 0x00000007abc8c000, 0x00000007c0000000)
 Metaspace       used 2680K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 292K, capacity 386K, committed 512K, reserved 1048576K
```

### 2g
```log
start
2020-10-26T00:11:14.314-0800: [GC (Allocation Failure) 2020-10-26T00:11:14.314-0800: [DefNew: 559232K->69888K(629120K), 0.0878501 secs] 559232K->140521K(2027264K), 0.0879324 secs] [Times: user=0.06 sys=0.04, real=0.09 secs] 
2020-10-26T00:11:14.500-0800: [GC (Allocation Failure) 2020-10-26T00:11:14.500-0800: [DefNew: 629120K->69888K(629120K), 0.1139684 secs] 699753K->272471K(2027264K), 0.1140477 secs] [Times: user=0.07 sys=0.05, real=0.11 secs] 
2020-10-26T00:11:14.688-0800: [GC (Allocation Failure) 2020-10-26T00:11:14.688-0800: [DefNew: 629120K->69887K(629120K), 0.0822425 secs] 831703K->396548K(2027264K), 0.0823299 secs] [Times: user=0.06 sys=0.03, real=0.09 secs] 
2020-10-26T00:11:14.843-0800: [GC (Allocation Failure) 2020-10-26T00:11:14.843-0800: [DefNew: 629119K->69887K(629120K), 0.0803991 secs] 955780K->517370K(2027264K), 0.0804746 secs] [Times: user=0.05 sys=0.03, real=0.08 secs] 
creat: 9716
Heap
 def new generation   total 629120K, used 439003K [0x0000000740000000, 0x000000076aaa0000, 0x000000076aaa0000)
  eden space 559232K,  66% used [0x0000000740000000, 0x0000000756876ea8, 0x0000000762220000)
  from space 69888K,  99% used [0x0000000762220000, 0x000000076665fff0, 0x0000000766660000)
  to   space 69888K,   0% used [0x0000000766660000, 0x0000000766660000, 0x000000076aaa0000)
 tenured generation   total 1398144K, used 447482K [0x000000076aaa0000, 0x00000007c0000000, 0x00000007c0000000)
   the space 1398144K,  32% used [0x000000076aaa0000, 0x0000000785f9e840, 0x0000000785f9ea00, 0x00000007c0000000)
 Metaspace       used 2679K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 292K, capacity 386K, committed 512K, reserved 1048576K
```

### 4g
```log
start
2020-10-26T00:11:20.841-0800: [GC (Allocation Failure) 2020-10-26T00:11:20.841-0800: [DefNew: 1118528K->139775K(1258304K), 0.1423924 secs] 1118528K->237923K(4054528K), 0.1424750 secs] [Times: user=0.08 sys=0.06, real=0.14 secs] 
2020-10-26T00:11:21.161-0800: [GC (Allocation Failure) 2020-10-26T00:11:21.162-0800: [DefNew: 1258303K->139775K(1258304K), 0.1741913 secs] 1356451K->398480K(4054528K), 0.1742670 secs] [Times: user=0.10 sys=0.08, real=0.17 secs] 
creat: 8250
Heap
 def new generation   total 1258304K, used 184518K [0x00000006c0000000, 0x0000000715550000, 0x0000000715550000)
  eden space 1118528K,   4% used [0x00000006c0000000, 0x00000006c2bb18e0, 0x0000000704450000)
  from space 139776K,  99% used [0x0000000704450000, 0x000000070cccfff0, 0x000000070ccd0000)
  to   space 139776K,   0% used [0x000000070ccd0000, 0x000000070ccd0000, 0x0000000715550000)
 tenured generation   total 2796224K, used 258704K [0x0000000715550000, 0x00000007c0000000, 0x00000007c0000000)
   the space 2796224K,   9% used [0x0000000715550000, 0x00000007251f4078, 0x00000007251f4200, 0x00000007c0000000)
 Metaspace       used 2679K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 292K, capacity 386K, committed 512K, reserved 1048576K
```

### 总结
以下结论为 SerialGC 在上面声明的环境下测量得出
1. 随着内存达到 512m 后, 应用已经不出现OOM了, 说明增大内存可以防止在内存过小时大量生成存活对象导致的OOM;
2. 在内存达到1g之后, 已经不再出现 Full GC , 说明增大内存可以减少 Full GC 的频率;
3. 随着内存的增大, 生成对象数没有增加, 说明不是内存越大性能越好; 但是可以降低 GC 的频率, 但是单次 GC 时间会变长

## 并行
### 128m
```log
start
2020-10-26T00:10:13.817-0800: [GC (Allocation Failure) [PSYoungGen: 32911K->5114K(38400K)] 32911K->12139K(125952K), 0.0051523 secs] [Times: user=0.01 sys=0.03, real=0.01 secs] 
2020-10-26T00:10:13.831-0800: [GC (Allocation Failure) [PSYoungGen: 37878K->5110K(38400K)] 44903K->23920K(125952K), 0.0066193 secs] [Times: user=0.02 sys=0.04, real=0.00 secs] 
2020-10-26T00:10:13.843-0800: [GC (Allocation Failure) [PSYoungGen: 37805K->5118K(38400K)] 56615K->33524K(125952K), 0.0049235 secs] [Times: user=0.01 sys=0.02, real=0.00 secs] 
2020-10-26T00:10:13.855-0800: [GC (Allocation Failure) [PSYoungGen: 38290K->5109K(38400K)] 66696K->42854K(125952K), 0.0048787 secs] [Times: user=0.01 sys=0.03, real=0.01 secs] 
2020-10-26T00:10:13.865-0800: [GC (Allocation Failure) [PSYoungGen: 38389K->5119K(38400K)] 76134K->53104K(125952K), 0.0055301 secs] [Times: user=0.02 sys=0.03, real=0.01 secs] 
2020-10-26T00:10:13.876-0800: [GC (Allocation Failure) [PSYoungGen: 38308K->5113K(19968K)] 86293K->65790K(107520K), 0.0063854 secs] [Times: user=0.02 sys=0.03, real=0.01 secs] 
2020-10-26T00:10:13.885-0800: [GC (Allocation Failure) [PSYoungGen: 19883K->7225K(29184K)] 80560K->70688K(116736K), 0.0021228 secs] [Times: user=0.01 sys=0.01, real=0.00 secs] 
2020-10-26T00:10:13.889-0800: [GC (Allocation Failure) [PSYoungGen: 22042K->11551K(29184K)] 85506K->76106K(116736K), 0.0018473 secs] [Times: user=0.01 sys=0.00, real=0.01 secs] 
2020-10-26T00:10:13.895-0800: [GC (Allocation Failure) [PSYoungGen: 26374K->14135K(29184K)] 90929K->79869K(116736K), 0.0021769 secs] [Times: user=0.01 sys=0.00, real=0.00 secs] 
2020-10-26T00:10:13.899-0800: [GC (Allocation Failure) [PSYoungGen: 28983K->8537K(29184K)] 94717K->83997K(116736K), 0.0049981 secs] [Times: user=0.02 sys=0.03, real=0.01 secs] 
2020-10-26T00:10:13.904-0800: [Full GC (Ergonomics) [PSYoungGen: 8537K->0K(29184K)] [ParOldGen: 75459K->77671K(87552K)] 83997K->77671K(116736K), [Metaspace: 2673K->2673K(1056768K)], 0.0094603 secs] [Times: user=0.07 sys=0.00, real=0.01 secs] 
2020-10-26T00:10:13.917-0800: [Full GC (Ergonomics) [PSYoungGen: 14756K->0K(29184K)] [ParOldGen: 77671K->79133K(87552K)] 92427K->79133K(116736K), [Metaspace: 2673K->2673K(1056768K)], 0.0089014 secs] [Times: user=0.07 sys=0.00, real=0.01 secs] 
2020-10-26T00:10:13.928-0800: [Full GC (Ergonomics) [PSYoungGen: 14848K->0K(29184K)] [ParOldGen: 79133K->82093K(87552K)] 93981K->82093K(116736K), [Metaspace: 2673K->2673K(1056768K)], 0.0071046 secs] [Times: user=0.05 sys=0.01, real=0.01 secs] 
2020-10-26T00:10:13.938-0800: [Full GC (Ergonomics) [PSYoungGen: 14493K->0K(29184K)] [ParOldGen: 82093K->85148K(87552K)] 96587K->85148K(116736K), [Metaspace: 2673K->2673K(1056768K)], 0.0048907 secs] [Times: user=0.02 sys=0.00, real=0.01 secs] 
2020-10-26T00:10:13.945-0800: [Full GC (Ergonomics) [PSYoungGen: 14691K->2908K(29184K)] [ParOldGen: 85148K->86912K(87552K)] 99840K->89820K(116736K), [Metaspace: 2673K->2673K(1056768K)], 0.0093348 secs] [Times: user=0.07 sys=0.01, real=0.01 secs] 
2020-10-26T00:10:13.957-0800: [Full GC (Ergonomics) [PSYoungGen: 14620K->6522K(29184K)] [ParOldGen: 86912K->87384K(87552K)] 101532K->93907K(116736K), [Metaspace: 2673K->2673K(1056768K)], 0.0127820 secs] [Times: user=0.12 sys=0.00, real=0.02 secs] 
2020-10-26T00:10:13.971-0800: [Full GC (Ergonomics) [PSYoungGen: 14737K->10562K(29184K)] [ParOldGen: 87384K->86770K(87552K)] 102121K->97332K(116736K), [Metaspace: 2673K->2673K(1056768K)], 0.0105065 secs] [Times: user=0.08 sys=0.00, real=0.01 secs] 
2020-10-26T00:10:13.983-0800: [Full GC (Ergonomics) [PSYoungGen: 14395K->12051K(29184K)] [ParOldGen: 86770K->86770K(87552K)] 101165K->98821K(116736K), [Metaspace: 2673K->2673K(1056768K)], 0.0020067 secs] [Times: user=0.01 sys=0.00, real=0.00 secs] 
2020-10-26T00:10:13.985-0800: [Full GC (Ergonomics) [PSYoungGen: 14537K->12438K(29184K)] [ParOldGen: 86770K->87539K(87552K)] 101307K->99977K(116736K), [Metaspace: 2673K->2673K(1056768K)], 0.0049465 secs] [Times: user=0.03 sys=0.00, real=0.01 secs] 
2020-10-26T00:10:13.990-0800: [Full GC (Ergonomics) [PSYoungGen: 14848K->13672K(29184K)] [ParOldGen: 87539K->87539K(87552K)] 102387K->101212K(116736K), [Metaspace: 2673K->2673K(1056768K)], 0.0023351 secs] [Times: user=0.01 sys=0.00, real=0.00 secs] 
2020-10-26T00:10:13.993-0800: [Full GC (Ergonomics) [PSYoungGen: 14570K->14062K(29184K)] [ParOldGen: 87539K->87539K(87552K)] 102109K->101601K(116736K), [Metaspace: 2673K->2673K(1056768K)], 0.0020478 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:10:13.995-0800: [Full GC (Ergonomics) [PSYoungGen: 14814K->14769K(29184K)] [ParOldGen: 87539K->87539K(87552K)] 102353K->102308K(116736K), [Metaspace: 2673K->2673K(1056768K)], 0.0020454 secs] [Times: user=0.01 sys=0.00, real=0.00 secs] 
2020-10-26T00:10:13.997-0800: [Full GC (Ergonomics) [PSYoungGen: 14805K->14787K(29184K)] [ParOldGen: 87539K->87539K(87552K)] 102344K->102326K(116736K), [Metaspace: 2673K->2673K(1056768K)], 0.0019458 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:10:13.999-0800: [Full GC (Allocation Failure) [PSYoungGen: 14787K->14787K(29184K)] [ParOldGen: 87539K->87520K(87552K)] 102326K->102307K(116736K), [Metaspace: 2673K->2673K(1056768K)], 0.0094844 secs] [Times: user=0.08 sys=0.00, real=0.01 secs] 

Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
	at java.util.Arrays.copyOf(Arrays.java:3332)
	at java.lang.AbstractStringBuilder.ensureCapacityInternal(AbstractStringBuilder.java:124)
	at java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:674)
	at java.lang.StringBuilder.append(StringBuilder.java:208)
	at GCLogAnalysis.generateGarbage(GCLogAnalysis.java:47)
	at GCLogAnalysis.main(GCLogAnalysis.java:18)

Heap
 PSYoungGen      total 29184K, used 14848K [0x00000007bd580000, 0x00000007c0000000, 0x00000007c0000000)
  eden space 14848K, 100% used [0x00000007bd580000,0x00000007be400000,0x00000007be400000)
  from space 14336K, 0% used [0x00000007bf200000,0x00000007bf200000,0x00000007c0000000)
  to   space 14336K, 0% used [0x00000007be400000,0x00000007be400000,0x00000007bf200000)
 ParOldGen       total 87552K, used 87520K [0x00000007b8000000, 0x00000007bd580000, 0x00000007bd580000)
  object space 87552K, 99% used [0x00000007b8000000,0x00000007bd578190,0x00000007bd580000)
 Metaspace       used 2704K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 295K, capacity 386K, committed 512K, reserved 1048576K
```
#### 现象
OOM

### 256m
```log
start
2020-10-26T00:10:19.229-0800: [GC (Allocation Failure) [PSYoungGen: 65536K->10741K(76288K)] 65536K->24863K(251392K), 0.0100513 secs] [Times: user=0.02 sys=0.06, real=0.01 secs] 
2020-10-26T00:10:19.253-0800: [GC (Allocation Failure) [PSYoungGen: 76277K->10748K(76288K)] 90399K->45847K(251392K), 0.0132356 secs] [Times: user=0.03 sys=0.09, real=0.01 secs] 
2020-10-26T00:10:19.275-0800: [GC (Allocation Failure) [PSYoungGen: 76220K->10729K(76288K)] 111319K->65891K(251392K), 0.0105460 secs] [Times: user=0.03 sys=0.06, real=0.01 secs] 
2020-10-26T00:10:19.299-0800: [GC (Allocation Failure) [PSYoungGen: 76052K->10751K(76288K)] 131215K->90171K(251392K), 0.0123312 secs] [Times: user=0.02 sys=0.07, real=0.02 secs] 
2020-10-26T00:10:19.320-0800: [GC (Allocation Failure) [PSYoungGen: 76144K->10732K(76288K)] 155564K->114465K(251392K), 0.0129204 secs] [Times: user=0.03 sys=0.08, real=0.01 secs] 
2020-10-26T00:10:19.342-0800: [GC (Allocation Failure) [PSYoungGen: 75677K->10743K(40448K)] 179410K->138892K(215552K), 0.0124133 secs] [Times: user=0.02 sys=0.07, real=0.01 secs] 
2020-10-26T00:10:19.359-0800: [GC (Allocation Failure) [PSYoungGen: 40439K->18363K(58368K)] 168587K->149977K(233472K), 0.0030777 secs] [Times: user=0.02 sys=0.01, real=0.01 secs] 
2020-10-26T00:10:19.367-0800: [GC (Allocation Failure) [PSYoungGen: 47929K->24464K(58368K)] 179543K->159229K(233472K), 0.0035912 secs] [Times: user=0.02 sys=0.00, real=0.01 secs] 
2020-10-26T00:10:19.375-0800: [GC (Allocation Failure) [PSYoungGen: 53874K->28595K(58368K)] 188640K->168026K(233472K), 0.0043089 secs] [Times: user=0.03 sys=0.01, real=0.01 secs] 
2020-10-26T00:10:19.385-0800: [GC (Allocation Failure) [PSYoungGen: 58175K->18526K(58368K)] 197607K->176674K(233472K), 0.0090668 secs] [Times: user=0.02 sys=0.05, real=0.01 secs] 
2020-10-26T00:10:19.394-0800: [Full GC (Ergonomics) [PSYoungGen: 18526K->0K(58368K)] [ParOldGen: 158148K->148848K(175104K)] 176674K->148848K(233472K), [Metaspace: 2673K->2673K(1056768K)], 0.0172325 secs] [Times: user=0.14 sys=0.01, real=0.02 secs] 
2020-10-26T00:10:19.416-0800: [Full GC (Ergonomics) [PSYoungGen: 29581K->0K(58368K)] [ParOldGen: 148848K->155245K(175104K)] 178429K->155245K(233472K), [Metaspace: 2673K->2673K(1056768K)], 0.0141106 secs] [Times: user=0.12 sys=0.00, real=0.02 secs] 
2020-10-26T00:10:19.436-0800: [Full GC (Ergonomics) [PSYoungGen: 29505K->0K(58368K)] [ParOldGen: 155245K->166428K(175104K)] 184751K->166428K(233472K), [Metaspace: 2673K->2673K(1056768K)], 0.0155868 secs] [Times: user=0.10 sys=0.03, real=0.02 secs] 
2020-10-26T00:10:19.458-0800: [Full GC (Ergonomics) [PSYoungGen: 29673K->0K(58368K)] [ParOldGen: 166428K->173503K(175104K)] 196101K->173503K(233472K), [Metaspace: 2673K->2673K(1056768K)], 0.0156965 secs] [Times: user=0.12 sys=0.01, real=0.02 secs] 
2020-10-26T00:10:19.478-0800: [Full GC (Ergonomics) [PSYoungGen: 29475K->993K(58368K)] [ParOldGen: 173503K->175059K(175104K)] 202979K->176053K(233472K), [Metaspace: 2673K->2673K(1056768K)], 0.0164171 secs] [Times: user=0.14 sys=0.01, real=0.02 secs] 
2020-10-26T00:10:19.500-0800: [Full GC (Ergonomics) [PSYoungGen: 29696K->6610K(58368K)] [ParOldGen: 175059K->174897K(175104K)] 204755K->181508K(233472K), [Metaspace: 2673K->2673K(1056768K)], 0.0185882 secs] [Times: user=0.16 sys=0.00, real=0.01 secs] 
2020-10-26T00:10:19.524-0800: [Full GC (Ergonomics) [PSYoungGen: 29501K->10085K(58368K)] [ParOldGen: 174897K->174761K(175104K)] 204399K->184847K(233472K), [Metaspace: 2673K->2673K(1056768K)], 0.0182355 secs] [Times: user=0.16 sys=0.00, real=0.02 secs] 
2020-10-26T00:10:19.545-0800: [Full GC (Ergonomics) [PSYoungGen: 29555K->12954K(58368K)] [ParOldGen: 174761K->174672K(175104K)] 204316K->187626K(233472K), [Metaspace: 2673K->2673K(1056768K)], 0.0189428 secs] [Times: user=0.17 sys=0.00, real=0.02 secs] 
2020-10-26T00:10:19.567-0800: [Full GC (Ergonomics) [PSYoungGen: 29224K->14631K(58368K)] [ParOldGen: 174672K->174617K(175104K)] 203896K->189248K(233472K), [Metaspace: 2673K->2673K(1056768K)], 0.0183234 secs] [Times: user=0.16 sys=0.00, real=0.02 secs] 
2020-10-26T00:10:19.587-0800: [Full GC (Ergonomics) [PSYoungGen: 29626K->17753K(58368K)] [ParOldGen: 174617K->174423K(175104K)] 204243K->192177K(233472K), [Metaspace: 2673K->2673K(1056768K)], 0.0187465 secs] [Times: user=0.16 sys=0.00, real=0.02 secs] 
2020-10-26T00:10:19.608-0800: [Full GC (Ergonomics) [PSYoungGen: 29562K->20513K(58368K)] [ParOldGen: 174423K->174063K(175104K)] 203985K->194577K(233472K), [Metaspace: 2673K->2673K(1056768K)], 0.0178115 secs] [Times: user=0.15 sys=0.00, real=0.02 secs] 
2020-10-26T00:10:19.628-0800: [Full GC (Ergonomics) [PSYoungGen: 29554K->21610K(58368K)] [ParOldGen: 174063K->174802K(175104K)] 203618K->196412K(233472K), [Metaspace: 2673K->2673K(1056768K)], 0.0199595 secs] [Times: user=0.17 sys=0.00, real=0.02 secs] 
2020-10-26T00:10:19.649-0800: [Full GC (Ergonomics) [PSYoungGen: 29575K->22792K(58368K)] [ParOldGen: 174802K->175036K(175104K)] 204377K->197829K(233472K), [Metaspace: 2673K->2673K(1056768K)], 0.0169984 secs] [Times: user=0.14 sys=0.01, real=0.02 secs] 
2020-10-26T00:10:19.667-0800: [Full GC (Ergonomics) [PSYoungGen: 29259K->23613K(58368K)] [ParOldGen: 175036K->174842K(175104K)] 204296K->198456K(233472K), [Metaspace: 2673K->2673K(1056768K)], 0.0182321 secs] [Times: user=0.15 sys=0.00, real=0.02 secs] 
2020-10-26T00:10:19.687-0800: [Full GC (Ergonomics) [PSYoungGen: 29597K->24616K(58368K)] [ParOldGen: 174842K->174686K(175104K)] 204439K->199302K(233472K), [Metaspace: 2673K->2673K(1056768K)], 0.0202182 secs] [Times: user=0.17 sys=0.00, real=0.02 secs] 
2020-10-26T00:10:19.708-0800: [Full GC (Ergonomics) [PSYoungGen: 29405K->25498K(58368K)] [ParOldGen: 174686K->174945K(175104K)] 204092K->200444K(233472K), [Metaspace: 2673K->2673K(1056768K)], 0.0194003 secs] [Times: user=0.17 sys=0.00, real=0.02 secs] 
2020-10-26T00:10:19.728-0800: [Full GC (Ergonomics) [PSYoungGen: 29696K->26469K(58368K)] [ParOldGen: 174945K->174794K(175104K)] 204641K->201264K(233472K), [Metaspace: 2673K->2673K(1056768K)], 0.0103609 secs] [Times: user=0.09 sys=0.00, real=0.01 secs] 
2020-10-26T00:10:19.739-0800: [Full GC (Ergonomics) [PSYoungGen: 29192K->26598K(58368K)] [ParOldGen: 174794K->174850K(175104K)] 203987K->201448K(233472K), [Metaspace: 2673K->2673K(1056768K)], 0.0181495 secs] [Times: user=0.16 sys=0.00, real=0.02 secs] 
2020-10-26T00:10:19.758-0800: [Full GC (Ergonomics) [PSYoungGen: 29696K->27701K(58368K)] [ParOldGen: 174850K->174820K(175104K)] 204546K->202521K(233472K), [Metaspace: 2673K->2673K(1056768K)], 0.0105075 secs] [Times: user=0.09 sys=0.00, real=0.01 secs] 
2020-10-26T00:10:19.769-0800: [Full GC (Ergonomics) [PSYoungGen: 29293K->27703K(58368K)] [ParOldGen: 174820K->174820K(175104K)] 204113K->202523K(233472K), [Metaspace: 2673K->2673K(1056768K)], 0.0022721 secs] [Times: user=0.01 sys=0.00, real=0.01 secs] 
2020-10-26T00:10:19.771-0800: [Full GC (Ergonomics) [PSYoungGen: 29395K->27041K(58368K)] [ParOldGen: 174820K->175057K(175104K)] 204216K->202099K(233472K), [Metaspace: 2673K->2673K(1056768K)], 0.0152035 secs] [Times: user=0.13 sys=0.00, real=0.01 secs] 
2020-10-26T00:10:19.787-0800: [Full GC (Ergonomics) [PSYoungGen: 29639K->27776K(58368K)] [ParOldGen: 175057K->174910K(175104K)] 204697K->202686K(233472K), [Metaspace: 2673K->2673K(1056768K)], 0.0169916 secs] [Times: user=0.15 sys=0.01, real=0.02 secs] 
2020-10-26T00:10:19.804-0800: [Full GC (Ergonomics) [PSYoungGen: 29046K->28241K(58368K)] [ParOldGen: 174910K->174802K(175104K)] 203956K->203044K(233472K), [Metaspace: 2673K->2673K(1056768K)], 0.0139112 secs] [Times: user=0.12 sys=0.00, real=0.01 secs] 
2020-10-26T00:10:19.819-0800: [Full GC (Ergonomics) [PSYoungGen: 29555K->29258K(58368K)] [ParOldGen: 174802K->174802K(175104K)] 204357K->204061K(233472K), [Metaspace: 2673K->2673K(1056768K)], 0.0025470 secs] [Times: user=0.01 sys=0.00, real=0.01 secs] 
2020-10-26T00:10:19.821-0800: [Full GC (Ergonomics) [PSYoungGen: 29679K->29178K(58368K)] [ParOldGen: 174802K->174585K(175104K)] 204481K->203763K(233472K), [Metaspace: 2673K->2673K(1056768K)], 0.0030445 secs] [Times: user=0.01 sys=0.00, real=0.00 secs] 
2020-10-26T00:10:19.825-0800: [Full GC (Ergonomics) [PSYoungGen: 29479K->29304K(58368K)] [ParOldGen: 174585K->174344K(175104K)] 204064K->203649K(233472K), [Metaspace: 2673K->2673K(1056768K)], 0.0107527 secs] [Times: user=0.09 sys=0.00, real=0.01 secs] 
2020-10-26T00:10:19.835-0800: [Full GC (Ergonomics) [PSYoungGen: 29304K->29304K(58368K)] [ParOldGen: 174792K->174344K(175104K)] 204097K->203649K(233472K), [Metaspace: 2673K->2673K(1056768K)], 0.0026224 secs] [Times: user=0.01 sys=0.00, real=0.00 secs] 
2020-10-26T00:10:19.838-0800: [Full GC (Ergonomics) [PSYoungGen: 29594K->28929K(58368K)] [ParOldGen: 174980K->174845K(175104K)] 204575K->203774K(233472K), [Metaspace: 2673K->2673K(1056768K)], 0.0028524 secs] [Times: user=0.01 sys=0.00, real=0.01 secs] 
2020-10-26T00:10:19.841-0800: [Full GC (Ergonomics) [PSYoungGen: 29057K->29057K(58368K)] [ParOldGen: 174845K->174845K(175104K)] 203902K->203902K(233472K), [Metaspace: 2673K->2673K(1056768K)], 0.0023769 secs] [Times: user=0.01 sys=0.00, real=0.00 secs] 
2020-10-26T00:10:19.844-0800: [Full GC (Allocation Failure) [PSYoungGen: 29057K->29057K(58368K)] [ParOldGen: 174845K->174826K(175104K)] 203902K->203883K(233472K), [Metaspace: 2673K->2673K(1056768K)], 0.0174606 secs] [Times: user=0.15 sys=0.00, real=0.02 secs] 

Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
	at GCLogAnalysis.generateGarbage(GCLogAnalysis.java:39)
	at GCLogAnalysis.main(GCLogAnalysis.java:18)

Heap
 PSYoungGen      total 58368K, used 29671K [0x00000007bab00000, 0x00000007c0000000, 0x00000007c0000000)
  eden space 29696K, 99% used [0x00000007bab00000,0x00000007bc7f9c80,0x00000007bc800000)
  from space 28672K, 0% used [0x00000007be400000,0x00000007be400000,0x00000007c0000000)
  to   space 28672K, 0% used [0x00000007bc800000,0x00000007bc800000,0x00000007be400000)
 ParOldGen       total 175104K, used 174826K [0x00000007b0000000, 0x00000007bab00000, 0x00000007bab00000)
  object space 175104K, 99% used [0x00000007b0000000,0x00000007baaba888,0x00000007bab00000)
 Metaspace       used 2704K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 295K, capacity 386K, committed 512K, reserved 1048576K
```

#### 现象
OOM

### 512m
```log
start
2020-10-26T00:10:25.126-0800: [GC (Allocation Failure) [PSYoungGen: 131584K->21501K(153088K)] 131584K->43955K(502784K), 0.0190640 secs] [Times: user=0.03 sys=0.13, real=0.02 secs] 
2020-10-26T00:10:25.165-0800: [GC (Allocation Failure) [PSYoungGen: 153054K->21499K(153088K)] 175508K->79508K(502784K), 0.0255126 secs] [Times: user=0.03 sys=0.17, real=0.03 secs] 
2020-10-26T00:10:25.217-0800: [GC (Allocation Failure) [PSYoungGen: 153083K->21501K(153088K)] 211092K->118853K(502784K), 0.0196561 secs] [Times: user=0.04 sys=0.12, real=0.02 secs] 
2020-10-26T00:10:25.256-0800: [GC (Allocation Failure) [PSYoungGen: 153085K->21502K(153088K)] 250437K->160029K(502784K), 0.0200106 secs] [Times: user=0.04 sys=0.12, real=0.02 secs] 
2020-10-26T00:10:25.294-0800: [GC (Allocation Failure) [PSYoungGen: 153027K->21491K(153088K)] 291554K->205820K(502784K), 0.0223667 secs] [Times: user=0.05 sys=0.14, real=0.02 secs] 
2020-10-26T00:10:25.343-0800: [GC (Allocation Failure) [PSYoungGen: 153075K->21498K(80384K)] 337404K->245642K(430080K), 0.0200207 secs] [Times: user=0.04 sys=0.11, real=0.02 secs] 
2020-10-26T00:10:25.376-0800: [GC (Allocation Failure) [PSYoungGen: 80378K->35375K(116736K)] 304522K->263939K(466432K), 0.0041170 secs] [Times: user=0.02 sys=0.01, real=0.01 secs] 
2020-10-26T00:10:25.389-0800: [GC (Allocation Failure) [PSYoungGen: 94206K->46548K(116736K)] 322770K->280330K(466432K), 0.0060960 secs] [Times: user=0.05 sys=0.01, real=0.01 secs] 
2020-10-26T00:10:25.403-0800: [GC (Allocation Failure) [PSYoungGen: 105428K->52714K(116736K)] 339210K->296203K(466432K), 0.0088115 secs] [Times: user=0.05 sys=0.03, real=0.01 secs] 
2020-10-26T00:10:25.422-0800: [GC (Allocation Failure) [PSYoungGen: 111594K->34161K(116736K)] 355083K->312084K(466432K), 0.0157207 secs] [Times: user=0.03 sys=0.09, real=0.01 secs] 
2020-10-26T00:10:25.449-0800: [GC (Allocation Failure) [PSYoungGen: 93041K->19955K(116736K)] 370964K->330042K(466432K), 0.0157028 secs] [Times: user=0.03 sys=0.09, real=0.02 secs] 
2020-10-26T00:10:25.465-0800: [Full GC (Ergonomics) [PSYoungGen: 19955K->0K(116736K)] [ParOldGen: 310086K->232107K(349696K)] 330042K->232107K(466432K), [Metaspace: 2673K->2673K(1056768K)], 0.0296901 secs] [Times: user=0.24 sys=0.01, real=0.03 secs] 
2020-10-26T00:10:25.506-0800: [GC (Allocation Failure) [PSYoungGen: 58462K->17467K(116736K)] 290569K->249574K(466432K), 0.0022675 secs] [Times: user=0.02 sys=0.00, real=0.00 secs] 
2020-10-26T00:10:25.518-0800: [GC (Allocation Failure) [PSYoungGen: 76347K->18756K(116736K)] 308454K->266713K(466432K), 0.0037276 secs] [Times: user=0.03 sys=0.00, real=0.01 secs] 
2020-10-26T00:10:25.532-0800: [GC (Allocation Failure) [PSYoungGen: 77636K->19990K(116736K)] 325593K->285766K(466432K), 0.0039024 secs] [Times: user=0.03 sys=0.00, real=0.00 secs] 
2020-10-26T00:10:25.545-0800: [GC (Allocation Failure) [PSYoungGen: 78870K->21763K(116736K)] 344646K->307294K(466432K), 0.0041947 secs] [Times: user=0.04 sys=0.00, real=0.01 secs] 
2020-10-26T00:10:25.562-0800: [GC (Allocation Failure) [PSYoungGen: 80643K->23498K(116736K)] 366174K->328448K(466432K), 0.0042339 secs] [Times: user=0.04 sys=0.00, real=0.00 secs] 
2020-10-26T00:10:25.567-0800: [Full GC (Ergonomics) [PSYoungGen: 23498K->0K(116736K)] [ParOldGen: 304950K->264270K(349696K)] 328448K->264270K(466432K), [Metaspace: 2673K->2673K(1056768K)], 0.0272544 secs] [Times: user=0.24 sys=0.01, real=0.03 secs] 
2020-10-26T00:10:25.607-0800: [GC (Allocation Failure) [PSYoungGen: 58867K->21052K(116736K)] 323138K->285323K(466432K), 0.0026671 secs] [Times: user=0.02 sys=0.00, real=0.00 secs] 
2020-10-26T00:10:25.622-0800: [GC (Allocation Failure) [PSYoungGen: 79932K->20285K(116736K)] 344203K->305032K(466432K), 0.0044556 secs] [Times: user=0.04 sys=0.00, real=0.00 secs] 
2020-10-26T00:10:25.637-0800: [GC (Allocation Failure) [PSYoungGen: 79165K->18836K(116736K)] 363912K->323171K(466432K), 0.0040566 secs] [Times: user=0.03 sys=0.00, real=0.01 secs] 
2020-10-26T00:10:25.652-0800: [GC (Allocation Failure) [PSYoungGen: 77485K->19683K(116736K)] 381820K->342481K(466432K), 0.0079357 secs] [Times: user=0.02 sys=0.03, real=0.01 secs] 
2020-10-26T00:10:25.660-0800: [Full GC (Ergonomics) [PSYoungGen: 19683K->0K(116736K)] [ParOldGen: 322798K->286517K(349696K)] 342481K->286517K(466432K), [Metaspace: 2673K->2673K(1056768K)], 0.0292988 secs] [Times: user=0.26 sys=0.01, real=0.02 secs] 
2020-10-26T00:10:25.702-0800: [GC (Allocation Failure) [PSYoungGen: 58880K->21743K(116736K)] 345397K->308261K(466432K), 0.0028368 secs] [Times: user=0.02 sys=0.00, real=0.00 secs] 
2020-10-26T00:10:25.717-0800: [GC (Allocation Failure) [PSYoungGen: 80623K->22535K(116736K)] 367141K->328399K(466432K), 0.0043633 secs] [Times: user=0.04 sys=0.00, real=0.01 secs] 
2020-10-26T00:10:25.732-0800: [GC (Allocation Failure) [PSYoungGen: 81010K->18452K(116736K)] 386874K->344725K(466432K), 0.0055534 secs] [Times: user=0.04 sys=0.01, real=0.00 secs] 
2020-10-26T00:10:25.737-0800: [Full GC (Ergonomics) [PSYoungGen: 18452K->0K(116736K)] [ParOldGen: 326273K->294603K(349696K)] 344725K->294603K(466432K), [Metaspace: 2673K->2673K(1056768K)], 0.0303112 secs] [Times: user=0.26 sys=0.00, real=0.03 secs] 
2020-10-26T00:10:25.783-0800: [GC (Allocation Failure) [PSYoungGen: 58880K->21618K(116736K)] 353483K->316222K(466432K), 0.0026972 secs] [Times: user=0.02 sys=0.00, real=0.00 secs] 
2020-10-26T00:10:25.799-0800: [GC (Allocation Failure) [PSYoungGen: 80366K->22512K(116736K)] 374970K->338187K(466432K), 0.0045632 secs] [Times: user=0.04 sys=0.00, real=0.01 secs] 
2020-10-26T00:10:25.814-0800: [GC (Allocation Failure) [PSYoungGen: 81320K->20141K(116736K)] 396995K->357006K(466432K), 0.0077985 secs] [Times: user=0.03 sys=0.03, real=0.01 secs] 
2020-10-26T00:10:25.822-0800: [Full GC (Ergonomics) [PSYoungGen: 20141K->0K(116736K)] [ParOldGen: 336865K->309440K(349696K)] 357006K->309440K(466432K), [Metaspace: 2673K->2673K(1056768K)], 0.0305720 secs] [Times: user=0.27 sys=0.00, real=0.03 secs] 
2020-10-26T00:10:25.869-0800: [GC (Allocation Failure) [PSYoungGen: 58564K->20397K(116736K)] 368004K->329837K(466432K), 0.0026617 secs] [Times: user=0.02 sys=0.01, real=0.01 secs] 
2020-10-26T00:10:25.883-0800: [GC (Allocation Failure) [PSYoungGen: 79277K->45338K(115712K)] 388717K->354778K(465408K), 0.0048281 secs] [Times: user=0.04 sys=0.00, real=0.00 secs] 
2020-10-26T00:10:25.898-0800: [GC (Allocation Failure) --[PSYoungGen: 104218K->104218K(115712K)] 413658K->453738K(465408K), 0.0114574 secs] [Times: user=0.05 sys=0.04, real=0.02 secs] 
2020-10-26T00:10:25.910-0800: [Full GC (Ergonomics) [PSYoungGen: 104218K->0K(115712K)] [ParOldGen: 349519K->318778K(349696K)] 453738K->318778K(465408K), [Metaspace: 2673K->2673K(1056768K)], 0.0366123 secs] [Times: user=0.31 sys=0.00, real=0.03 secs] 
2020-10-26T00:10:25.959-0800: [GC (Allocation Failure) [PSYoungGen: 58830K->22916K(116736K)] 377608K->341694K(466432K), 0.0027987 secs] [Times: user=0.02 sys=0.00, real=0.01 secs] 
2020-10-26T00:10:25.975-0800: [GC (Allocation Failure) [PSYoungGen: 81796K->22756K(118272K)] 400574K->363019K(467968K), 0.0045438 secs] [Times: user=0.03 sys=0.00, real=0.01 secs] 
2020-10-26T00:10:25.980-0800: [Full GC (Ergonomics) [PSYoungGen: 22756K->0K(118272K)] [ParOldGen: 340262K->327176K(349696K)] 363019K->327176K(467968K), [Metaspace: 2673K->2673K(1056768K)], 0.0386479 secs] [Times: user=0.33 sys=0.01, real=0.03 secs] 
2020-10-26T00:10:26.033-0800: [Full GC (Ergonomics) [PSYoungGen: 60416K->0K(118272K)] [ParOldGen: 327176K->331977K(349696K)] 387592K->331977K(467968K), [Metaspace: 2673K->2673K(1056768K)], 0.0379004 secs] [Times: user=0.33 sys=0.00, real=0.04 secs] 
creat: 8657
Heap
 PSYoungGen      total 118272K, used 2693K [0x00000007b5580000, 0x00000007c0000000, 0x00000007c0000000)
  eden space 60416K, 4% used [0x00000007b5580000,0x00000007b58215f8,0x00000007b9080000)
  from space 57856K, 0% used [0x00000007bc780000,0x00000007bc780000,0x00000007c0000000)
  to   space 56320K, 0% used [0x00000007b9080000,0x00000007b9080000,0x00000007bc780000)
 ParOldGen       total 349696K, used 331977K [0x00000007a0000000, 0x00000007b5580000, 0x00000007b5580000)
  object space 349696K, 94% used [0x00000007a0000000,0x00000007b44324b8,0x00000007b5580000)
 Metaspace       used 2680K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 292K, capacity 386K, committed 512K, reserved 1048576K
```

### 1g
```log
start
2020-10-26T00:10:31.436-0800: [GC (Allocation Failure) [PSYoungGen: 262144K->43512K(305664K)] 262144K->82312K(1005056K), 0.0357746 secs] [Times: user=0.04 sys=0.23, real=0.04 secs] 
2020-10-26T00:10:31.510-0800: [GC (Allocation Failure) [PSYoungGen: 305656K->43515K(305664K)] 344456K->156985K(1005056K), 0.0519883 secs] [Times: user=0.06 sys=0.33, real=0.05 secs] 
2020-10-26T00:10:31.597-0800: [GC (Allocation Failure) [PSYoungGen: 305526K->43517K(305664K)] 418997K->227681K(1005056K), 0.0362261 secs] [Times: user=0.07 sys=0.21, real=0.04 secs] 
2020-10-26T00:10:31.670-0800: [GC (Allocation Failure) [PSYoungGen: 305661K->43518K(305664K)] 489825K->302645K(1005056K), 0.0385713 secs] [Times: user=0.08 sys=0.22, real=0.03 secs] 
2020-10-26T00:10:31.747-0800: [GC (Allocation Failure) [PSYoungGen: 305662K->43518K(305664K)] 564789K->370797K(1005056K), 0.0349441 secs] [Times: user=0.07 sys=0.20, real=0.04 secs] 
2020-10-26T00:10:31.828-0800: [GC (Allocation Failure) [PSYoungGen: 305662K->43507K(160256K)] 632941K->442804K(859648K), 0.0356986 secs] [Times: user=0.07 sys=0.22, real=0.04 secs] 
2020-10-26T00:10:31.881-0800: [GC (Allocation Failure) [PSYoungGen: 160243K->70962K(232960K)] 559540K->477866K(932352K), 0.0076764 secs] [Times: user=0.05 sys=0.02, real=0.00 secs] 
2020-10-26T00:10:31.904-0800: [GC (Allocation Failure) [PSYoungGen: 187698K->99068K(232960K)] 594602K->513165K(932352K), 0.0108356 secs] [Times: user=0.08 sys=0.02, real=0.01 secs] 
2020-10-26T00:10:31.931-0800: [GC (Allocation Failure) [PSYoungGen: 215804K->115371K(232960K)] 629901K->546510K(932352K), 0.0165542 secs] [Times: user=0.09 sys=0.05, real=0.01 secs] 
2020-10-26T00:10:31.971-0800: [GC (Allocation Failure) [PSYoungGen: 231610K->74920K(232960K)] 662749K->572335K(932352K), 0.0329829 secs] [Times: user=0.05 sys=0.20, real=0.03 secs] 
2020-10-26T00:10:32.018-0800: [GC (Allocation Failure) [PSYoungGen: 191585K->45800K(232960K)] 688999K->610886K(932352K), 0.0315242 secs] [Times: user=0.04 sys=0.19, real=0.03 secs] 
2020-10-26T00:10:32.065-0800: [GC (Allocation Failure) [PSYoungGen: 162536K->33955K(232960K)] 727622K->638810K(932352K), 0.0194913 secs] [Times: user=0.03 sys=0.11, real=0.02 secs] 
2020-10-26T00:10:32.085-0800: [Full GC (Ergonomics) [PSYoungGen: 33955K->0K(232960K)] [ParOldGen: 604855K->327626K(699392K)] 638810K->327626K(932352K), [Metaspace: 2673K->2673K(1056768K)], 0.0410464 secs] [Times: user=0.32 sys=0.02, real=0.04 secs] 
2020-10-26T00:10:32.144-0800: [GC (Allocation Failure) [PSYoungGen: 116736K->43246K(232960K)] 444362K->370873K(932352K), 0.0043877 secs] [Times: user=0.04 sys=0.00, real=0.00 secs] 
2020-10-26T00:10:32.173-0800: [GC (Allocation Failure) [PSYoungGen: 159838K->35984K(232960K)] 487464K->401490K(932352K), 0.0069986 secs] [Times: user=0.07 sys=0.00, real=0.01 secs] 
2020-10-26T00:10:32.196-0800: [GC (Allocation Failure) [PSYoungGen: 152720K->39652K(232960K)] 518226K->436036K(932352K), 0.0066875 secs] [Times: user=0.06 sys=0.00, real=0.01 secs] 
2020-10-26T00:10:32.225-0800: [GC (Allocation Failure) [PSYoungGen: 156363K->42595K(232960K)] 552747K->474179K(932352K), 0.0073314 secs] [Times: user=0.07 sys=0.00, real=0.01 secs] 
2020-10-26T00:10:32.257-0800: [GC (Allocation Failure) [PSYoungGen: 159331K->39665K(232960K)] 590915K->510135K(932352K), 0.0076375 secs] [Times: user=0.07 sys=0.00, real=0.01 secs] 
creat: 11328
Heap
 PSYoungGen      total 232960K, used 154368K [0x00000007aab00000, 0x00000007c0000000, 0x00000007c0000000)
  eden space 116736K, 98% used [0x00000007aab00000,0x00000007b1b03db0,0x00000007b1d00000)
  from space 116224K, 34% used [0x00000007b1d00000,0x00000007b43bc460,0x00000007b8e80000)
  to   space 116224K, 0% used [0x00000007b8e80000,0x00000007b8e80000,0x00000007c0000000)
 ParOldGen       total 699392K, used 470470K [0x0000000780000000, 0x00000007aab00000, 0x00000007aab00000)
  object space 699392K, 67% used [0x0000000780000000,0x000000079cb71800,0x00000007aab00000)
 Metaspace       used 2680K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 292K, capacity 386K, committed 512K, reserved 1048576K
```

### 2g
```log
start
2020-10-26T00:10:37.801-0800: [GC (Allocation Failure) [PSYoungGen: 524800K->87037K(611840K)] 524800K->149409K(2010112K), 0.0669364 secs] [Times: user=0.08 sys=0.43, real=0.06 secs] 
2020-10-26T00:10:37.949-0800: [GC (Allocation Failure) [PSYoungGen: 611837K->87039K(611840K)] 674209K->259978K(2010112K), 0.0918029 secs] [Times: user=0.11 sys=0.60, real=0.10 secs] 
2020-10-26T00:10:38.130-0800: [GC (Allocation Failure) [PSYoungGen: 611839K->87037K(611840K)] 784778K->365141K(2010112K), 0.0561019 secs] [Times: user=0.13 sys=0.31, real=0.05 secs] 
2020-10-26T00:10:38.276-0800: [GC (Allocation Failure) [PSYoungGen: 611837K->87023K(611840K)] 889941K->477121K(2010112K), 0.0630464 secs] [Times: user=0.15 sys=0.35, real=0.06 secs] 
2020-10-26T00:10:38.412-0800: [GC (Allocation Failure) [PSYoungGen: 611823K->87036K(611840K)] 1001921K->597136K(2010112K), 0.0669770 secs] [Times: user=0.14 sys=0.37, real=0.06 secs] 
creat: 10231
Heap
 PSYoungGen      total 611840K, used 208026K [0x0000000795580000, 0x00000007c0000000, 0x00000007c0000000)
  eden space 524800K, 23% used [0x0000000795580000,0x000000079cba7548,0x00000007b5600000)
  from space 87040K, 99% used [0x00000007b5600000,0x00000007baaff320,0x00000007bab00000)
  to   space 87040K, 0% used [0x00000007bab00000,0x00000007bab00000,0x00000007c0000000)
 ParOldGen       total 1398272K, used 510099K [0x0000000740000000, 0x0000000795580000, 0x0000000795580000)
  object space 1398272K, 36% used [0x0000000740000000,0x000000075f224ed0,0x0000000795580000)
 Metaspace       used 2680K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 292K, capacity 386K, committed 512K, reserved 1048576K
```

### 4g
```log
start
2020-10-26T00:10:44.337-0800: [GC (Allocation Failure) [PSYoungGen: 1048576K->174581K(1223168K)] 1048576K->248899K(4019712K), 0.1097308 secs] [Times: user=0.13 sys=0.72, real=0.11 secs] 
2020-10-26T00:10:44.620-0800: [GC (Allocation Failure) [PSYoungGen: 1223157K->174585K(1223168K)] 1297475K->373774K(4019712K), 0.1313499 secs] [Times: user=0.15 sys=0.86, real=0.13 secs] 
creat: 7865
Heap
 PSYoungGen      total 1223168K, used 216755K [0x000000076ab00000, 0x00000007c0000000, 0x00000007c0000000)
  eden space 1048576K, 4% used [0x000000076ab00000,0x000000076d42ea68,0x00000007aab00000)
  from space 174592K, 99% used [0x00000007b5580000,0x00000007bfffe4c0,0x00000007c0000000)
  to   space 174592K, 0% used [0x00000007aab00000,0x00000007aab00000,0x00000007b5580000)
 ParOldGen       total 2796544K, used 199189K [0x00000006c0000000, 0x000000076ab00000, 0x000000076ab00000)
  object space 2796544K, 7% used [0x00000006c0000000,0x00000006cc2856a8,0x000000076ab00000)
 Metaspace       used 2680K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 292K, capacity 386K, committed 512K, reserved 1048576K
```

### 总结
以下结论为 ParallelGC 在上面声明的环境下测量得出
1. 随着内存达到 512m 后, 应用已经不出现OOM了, 说明增大内存可以防止在内存过小时大量生成存活对象导致的OOM;
2. 在内存达到2g之后, 已经不再出现 Full GC , 说明增大内存可以减少 Full GC 的频率;
3. 随着内存的增大, 生成对象数没有增加, 说明不是内存越大性能越好; 但是可以降低 GC 的频率, 但是单次 GC 时间会变长
4. 与 SerialGC 对比, 在 512m 时 GC 时间没有明显优势, 超过 512m 后 GC 时间相对减少, 体现了多线程的优势

## CMS

### 128m
```log
start
2020-10-26T00:11:26.623-0800: [GC (Allocation Failure) 2020-10-26T00:11:26.623-0800: [ParNew: 34919K->4351K(39296K), 0.0050883 secs] 34919K->11875K(126720K), 0.0051781 secs] [Times: user=0.02 sys=0.03, real=0.00 secs] 
2020-10-26T00:11:26.637-0800: [GC (Allocation Failure) 2020-10-26T00:11:26.637-0800: [ParNew: 39021K->4350K(39296K), 0.0063367 secs] 46545K->23413K(126720K), 0.0064101 secs] [Times: user=0.02 sys=0.03, real=0.01 secs] 
2020-10-26T00:11:26.650-0800: [GC (Allocation Failure) 2020-10-26T00:11:26.650-0800: [ParNew: 39135K->4348K(39296K), 0.0089580 secs] 58198K->37543K(126720K), 0.0090319 secs] [Times: user=0.08 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:26.665-0800: [GC (Allocation Failure) 2020-10-26T00:11:26.665-0800: [ParNew: 38998K->4337K(39296K), 0.0064806 secs] 72194K->47541K(126720K), 0.0065553 secs] [Times: user=0.06 sys=0.01, real=0.01 secs] 
2020-10-26T00:11:26.678-0800: [GC (Allocation Failure) 2020-10-26T00:11:26.678-0800: [ParNew: 39281K->4344K(39296K), 0.0082396 secs] 82485K->60242K(126720K), 0.0083142 secs] [Times: user=0.07 sys=0.00, real=0.01 secs] 
2020-10-26T00:11:26.686-0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 55898K(87424K)] 60530K(126720K), 0.0002740 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:26.687-0800: [CMS-concurrent-mark-start]
2020-10-26T00:11:26.687-0800: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:26.687-0800: [CMS-concurrent-preclean-start]
2020-10-26T00:11:26.687-0800: [CMS-concurrent-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:26.688-0800: [CMS-concurrent-abortable-preclean-start]
2020-10-26T00:11:26.692-0800: [GC (Allocation Failure) 2020-10-26T00:11:26.692-0800: [ParNew: 39265K->4348K(39296K), 0.0073385 secs] 95163K->71607K(126720K), 0.0073998 secs] [Times: user=0.07 sys=0.00, real=0.01 secs] 
2020-10-26T00:11:26.707-0800: [GC (Allocation Failure) 2020-10-26T00:11:26.707-0800: [ParNew: 38942K->4347K(39296K), 0.0083003 secs] 106201K->84319K(126720K), 0.0083820 secs] [Times: user=0.08 sys=0.00, real=0.01 secs] 
2020-10-26T00:11:26.720-0800: [GC (Allocation Failure) 2020-10-26T00:11:26.720-0800: [ParNew: 39284K->39284K(39296K), 0.0000447 secs]2020-10-26T00:11:26.720-0800: [CMS2020-10-26T00:11:26.721-0800: [CMS-concurrent-abortable-preclean: 0.001/0.033 secs] [Times: user=0.16 sys=0.01, real=0.04 secs] 
 (concurrent mode failure): 79972K->87306K(87424K), 0.0149979 secs] 119256K->88414K(126720K), [Metaspace: 2673K->2673K(1056768K)], 0.0151466 secs] [Times: user=0.02 sys=0.00, real=0.01 secs] 
2020-10-26T00:11:26.742-0800: [Full GC (Allocation Failure) 2020-10-26T00:11:26.742-0800: [CMS: 87306K->87253K(87424K), 0.0102383 secs] 126284K->95695K(126720K), [Metaspace: 2673K->2673K(1056768K)], 0.0103334 secs] [Times: user=0.01 sys=0.00, real=0.01 secs] 
2020-10-26T00:11:26.752-0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 87253K(87424K)] 96048K(126720K), 0.0002542 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:26.753-0800: [CMS-concurrent-mark-start]
2020-10-26T00:11:26.753-0800: [CMS-concurrent-mark: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:26.753-0800: [CMS-concurrent-preclean-start]
2020-10-26T00:11:26.754-0800: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.01 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:26.754-0800: [CMS-concurrent-abortable-preclean-start]
2020-10-26T00:11:26.754-0800: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:26.754-0800: [GC (CMS Final Remark) [YG occupancy: 14900 K (39296 K)]2020-10-26T00:11:26.754-0800: [Rescan (parallel) , 0.0002324 secs]2020-10-26T00:11:26.754-0800: [weak refs processing, 0.0000297 secs]2020-10-26T00:11:26.754-0800: [class unloading, 0.0002163 secs]2020-10-26T00:11:26.754-0800: [scrub symbol table, 0.0003028 secs]2020-10-26T00:11:26.755-0800: [scrub string table, 0.0002080 secs][1 CMS-remark: 87253K(87424K)] 102153K(126720K), 0.0011020 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:26.755-0800: [CMS-concurrent-sweep-start]
2020-10-26T00:11:26.755-0800: [CMS-concurrent-sweep: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:26.755-0800: [CMS-concurrent-reset-start]
2020-10-26T00:11:26.755-0800: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:26.759-0800: [GC (Allocation Failure) 2020-10-26T00:11:26.759-0800: [ParNew: 39042K->39042K(39296K), 0.0000300 secs]2020-10-26T00:11:26.759-0800: [CMS: 87253K->87276K(87424K), 0.0106420 secs] 126295K->104175K(126720K), [Metaspace: 2673K->2673K(1056768K)], 0.0107429 secs] [Times: user=0.01 sys=0.00, real=0.02 secs] 
2020-10-26T00:11:26.770-0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 87276K(87424K)] 104867K(126720K), 0.0002184 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:26.770-0800: [CMS-concurrent-mark-start]
2020-10-26T00:11:26.770-0800: [CMS-concurrent-mark: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:26.770-0800: [CMS-concurrent-preclean-start]
2020-10-26T00:11:26.771-0800: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:26.771-0800: [CMS-concurrent-abortable-preclean-start]
2020-10-26T00:11:26.771-0800: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:26.771-0800: [GC (CMS Final Remark) [YG occupancy: 24494 K (39296 K)]2020-10-26T00:11:26.771-0800: [Rescan (parallel) , 0.0002413 secs]2020-10-26T00:11:26.771-0800: [weak refs processing, 0.0000216 secs]2020-10-26T00:11:26.771-0800: [class unloading, 0.0001978 secs]2020-10-26T00:11:26.772-0800: [scrub symbol table, 0.0003020 secs]2020-10-26T00:11:26.772-0800: [scrub string table, 0.0002062 secs][1 CMS-remark: 87276K(87424K)] 111771K(126720K), 0.0010477 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:26.772-0800: [CMS-concurrent-sweep-start]
2020-10-26T00:11:26.772-0800: [CMS-concurrent-sweep: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:26.773-0800: [CMS-concurrent-reset-start]
2020-10-26T00:11:26.773-0800: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:26.775-0800: [GC (Allocation Failure) 2020-10-26T00:11:26.775-0800: [ParNew: 39222K->39222K(39296K), 0.0000308 secs]2020-10-26T00:11:26.775-0800: [CMS: 87261K->87366K(87424K), 0.0113464 secs] 126484K->110597K(126720K), [Metaspace: 2673K->2673K(1056768K)], 0.0114485 secs] [Times: user=0.01 sys=0.00, real=0.01 secs] 
2020-10-26T00:11:26.787-0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 87366K(87424K)] 111967K(126720K), 0.0002426 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:26.787-0800: [CMS-concurrent-mark-start]
2020-10-26T00:11:26.788-0800: [CMS-concurrent-mark: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:26.788-0800: [CMS-concurrent-preclean-start]
2020-10-26T00:11:26.788-0800: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:26.788-0800: [CMS-concurrent-abortable-preclean-start]
2020-10-26T00:11:26.788-0800: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:26.788-0800: [GC (CMS Final Remark) [YG occupancy: 32405 K (39296 K)]2020-10-26T00:11:26.788-0800: [Rescan (parallel) , 0.0004217 secs]2020-10-26T00:11:26.789-0800: [weak refs processing, 0.0000232 secs]2020-10-26T00:11:26.789-0800: [class unloading, 0.0002028 secs]2020-10-26T00:11:26.789-0800: [scrub symbol table, 0.0003135 secs]2020-10-26T00:11:26.789-0800: [scrub string table, 0.0002289 secs][1 CMS-remark: 87366K(87424K)] 119771K(126720K), 0.0012732 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
2020-10-26T00:11:26.790-0800: [CMS-concurrent-sweep-start]
2020-10-26T00:11:26.790-0800: [CMS-concurrent-sweep: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:26.790-0800: [CMS-concurrent-reset-start]
2020-10-26T00:11:26.790-0800: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:26.791-0800: [GC (Allocation Failure) 2020-10-26T00:11:26.791-0800: [ParNew: 39257K->39257K(39296K), 0.0000310 secs]2020-10-26T00:11:26.791-0800: [CMS: 87366K->87227K(87424K), 0.0120802 secs] 126623K->113910K(126720K), [Metaspace: 2673K->2673K(1056768K)], 0.0121774 secs] [Times: user=0.01 sys=0.01, real=0.01 secs] 
2020-10-26T00:11:26.804-0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 87227K(87424K)] 114054K(126720K), 0.0002663 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:26.804-0800: [CMS-concurrent-mark-start]
2020-10-26T00:11:26.804-0800: [CMS-concurrent-mark: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:26.804-0800: [CMS-concurrent-preclean-start]
2020-10-26T00:11:26.805-0800: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:26.805-0800: [CMS-concurrent-abortable-preclean-start]
2020-10-26T00:11:26.805-0800: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:26.805-0800: [GC (CMS Final Remark) [YG occupancy: 33823 K (39296 K)]2020-10-26T00:11:26.805-0800: [Rescan (parallel) , 0.0003181 secs]2020-10-26T00:11:26.806-0800: [weak refs processing, 0.0000213 secs]2020-10-26T00:11:26.806-0800: [class unloading, 0.0002142 secs]2020-10-26T00:11:26.806-0800: [scrub symbol table, 0.0003188 secs]2020-10-26T00:11:26.806-0800: [scrub string table, 0.0002221 secs][1 CMS-remark: 87227K(87424K)] 121050K(126720K), 0.0011795 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:26.806-0800: [CMS-concurrent-sweep-start]
2020-10-26T00:11:26.807-0800: [CMS-concurrent-sweep: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:26.807-0800: [CMS-concurrent-reset-start]
2020-10-26T00:11:26.807-0800: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:26.807-0800: [GC (Allocation Failure) 2020-10-26T00:11:26.807-0800: [ParNew: 39154K->39154K(39296K), 0.0000320 secs]2020-10-26T00:11:26.807-0800: [CMS: 87227K->87417K(87424K), 0.0114176 secs] 126381K->116617K(126720K), [Metaspace: 2673K->2673K(1056768K)], 0.0115177 secs] [Times: user=0.01 sys=0.00, real=0.01 secs] 
2020-10-26T00:11:26.819-0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 87417K(87424K)] 117434K(126720K), 0.0002717 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:26.819-0800: [CMS-concurrent-mark-start]
2020-10-26T00:11:26.820-0800: [CMS-concurrent-mark: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
2020-10-26T00:11:26.820-0800: [CMS-concurrent-preclean-start]
2020-10-26T00:11:26.821-0800: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:26.821-0800: [CMS-concurrent-abortable-preclean-start]
2020-10-26T00:11:26.821-0800: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:26.821-0800: [GC (CMS Final Remark) [YG occupancy: 36389 K (39296 K)]2020-10-26T00:11:26.821-0800: [Rescan (parallel) , 0.0002383 secs]2020-10-26T00:11:26.821-0800: [weak refs processing, 0.0000230 secs]2020-10-26T00:11:26.821-0800: [class unloading, 0.0001980 secs]2020-10-26T00:11:26.821-0800: [scrub symbol table, 0.0003129 secs]2020-10-26T00:11:26.822-0800: [scrub string table, 0.0002218 secs][1 CMS-remark: 87417K(87424K)] 123806K(126720K), 0.0010799 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:26.822-0800: [CMS-concurrent-sweep-start]
2020-10-26T00:11:26.822-0800: [CMS-concurrent-sweep: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:26.822-0800: [CMS-concurrent-reset-start]
2020-10-26T00:11:26.822-0800: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:26.823-0800: [GC (Allocation Failure) 2020-10-26T00:11:26.823-0800: [ParNew: 39043K->39043K(39296K), 0.0000533 secs]2020-10-26T00:11:26.823-0800: [CMS: 87417K->87023K(87424K), 0.0097256 secs] 126460K->118073K(126720K), [Metaspace: 2673K->2673K(1056768K)], 0.0098470 secs] [Times: user=0.01 sys=0.00, real=0.01 secs] 
2020-10-26T00:11:26.833-0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 87023K(87424K)] 118626K(126720K), 0.0002751 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:26.833-0800: [CMS-concurrent-mark-start]
2020-10-26T00:11:26.833-0800: [CMS-concurrent-mark: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:26.833-0800: [CMS-concurrent-preclean-start]
2020-10-26T00:11:26.834-0800: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:26.834-0800: [CMS-concurrent-abortable-preclean-start]
2020-10-26T00:11:26.834-0800: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:26.834-0800: [Full GC (Allocation Failure) 2020-10-26T00:11:26.834-0800: [CMS (concurrent mode failure): 87158K->87392K(87424K), 0.0132467 secs] 126422K->120753K(126720K), [Metaspace: 2673K->2673K(1056768K)], 0.0133134 secs] [Times: user=0.01 sys=0.00, real=0.01 secs] 
2020-10-26T00:11:26.849-0800: [Full GC (Allocation Failure) 2020-10-26T00:11:26.849-0800: [CMS: 87392K->87377K(87424K), 0.0084784 secs] 126595K->121721K(126720K), [Metaspace: 2673K->2673K(1056768K)], 0.0085546 secs] [Times: user=0.01 sys=0.00, real=0.01 secs] 
2020-10-26T00:11:26.857-0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 87377K(87424K)] 122218K(126720K), 0.0002721 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:26.858-0800: [CMS-concurrent-mark-start]
2020-10-26T00:11:26.858-0800: [CMS-concurrent-mark: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:26.858-0800: [CMS-concurrent-preclean-start]
2020-10-26T00:11:26.859-0800: [Full GC (Allocation Failure) 2020-10-26T00:11:26.859-0800: [CMS2020-10-26T00:11:26.859-0800: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.01 sys=0.00, real=0.00 secs] 
 (concurrent mode failure): 87377K->87358K(87424K), 0.0097624 secs] 126633K->123466K(126720K), [Metaspace: 2673K->2673K(1056768K)], 0.0098281 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
2020-10-26T00:11:26.870-0800: [Full GC (Allocation Failure) 2020-10-26T00:11:26.870-0800: [CMS: 87358K->87195K(87424K), 0.0028782 secs] 126630K->124091K(126720K), [Metaspace: 2673K->2673K(1056768K)], 0.0029412 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:26.873-0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 87195K(87424K)] 124379K(126720K), 0.0002691 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:26.873-0800: [CMS-concurrent-mark-start]
2020-10-26T00:11:26.873-0800: [Full GC (Allocation Failure) 2020-10-26T00:11:26.873-0800: [CMS2020-10-26T00:11:26.875-0800: [CMS-concurrent-mark: 0.001/0.002 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
 (concurrent mode failure): 87195K->87101K(87424K), 0.0065537 secs] 126213K->124270K(126720K), [Metaspace: 2673K->2673K(1056768K)], 0.0066219 secs] [Times: user=0.01 sys=0.00, real=0.01 secs] 
2020-10-26T00:11:26.880-0800: [Full GC (Allocation Failure) 2020-10-26T00:11:26.881-0800: [CMS: 87101K->87101K(87424K), 0.0020476 secs] 125936K->124681K(126720K), [Metaspace: 2673K->2673K(1056768K)], 0.0021036 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:26.883-0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 87101K(87424K)] 125469K(126720K), 0.0002218 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:26.883-0800: [CMS-concurrent-mark-start]
2020-10-26T00:11:26.883-0800: [Full GC (Allocation Failure) 2020-10-26T00:11:26.883-0800: [CMS2020-10-26T00:11:26.885-0800: [CMS-concurrent-mark: 0.000/0.002 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
 (concurrent mode failure): 87320K->87115K(87424K), 0.0111723 secs] 126615K->125297K(126720K), [Metaspace: 2673K->2673K(1056768K)], 0.0112307 secs] [Times: user=0.01 sys=0.00, real=0.01 secs] 
2020-10-26T00:11:26.895-0800: [Full GC (Allocation Failure) 2020-10-26T00:11:26.895-0800: [CMS: 87115K->87414K(87424K), 0.0054965 secs] 126134K->125298K(126720K), [Metaspace: 2673K->2673K(1056768K)], 0.0055606 secs] [Times: user=0.01 sys=0.00, real=0.01 secs] 
2020-10-26T00:11:26.901-0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 87414K(87424K)] 125715K(126720K), 0.0003162 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:26.901-0800: [CMS-concurrent-mark-start]
2020-10-26T00:11:26.901-0800: [Full GC (Allocation Failure) 2020-10-26T00:11:26.901-0800: [CMS2020-10-26T00:11:26.903-0800: [CMS-concurrent-mark: 0.001/0.002 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
 (concurrent mode failure): 87414K->87103K(87424K), 0.0192863 secs] 126579K->124872K(126720K), [Metaspace: 2673K->2673K(1056768K)], 0.0193523 secs] [Times: user=0.01 sys=0.00, real=0.02 secs] 
2020-10-26T00:11:26.921-0800: [Full GC (Allocation Failure) 2020-10-26T00:11:26.921-0800: [CMS: 87103K->87035K(87424K), 0.0121269 secs] 126133K->125670K(126720K), [Metaspace: 2673K->2673K(1056768K)], 0.0121850 secs] [Times: user=0.01 sys=0.00, real=0.01 secs] 
2020-10-26T00:11:26.933-0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 87035K(87424K)] 125958K(126720K), 0.0002214 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:26.934-0800: [CMS-concurrent-mark-start]
2020-10-26T00:11:26.934-0800: [Full GC (Allocation Failure) 2020-10-26T00:11:26.934-0800: [CMS2020-10-26T00:11:26.935-0800: [CMS-concurrent-mark: 0.000/0.002 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
 (concurrent mode failure): 87251K->86879K(87424K), 0.0047075 secs] 126449K->125556K(126720K), [Metaspace: 2673K->2673K(1056768K)], 0.0047673 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:26.939-0800: [Full GC (Allocation Failure) 2020-10-26T00:11:26.939-0800: [CMS: 87239K->87095K(87424K), 0.0017619 secs] 126472K->125854K(126720K), [Metaspace: 2673K->2673K(1056768K)], 0.0018126 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
2020-10-26T00:11:26.941-0800: [Full GC (Allocation Failure) 2020-10-26T00:11:26.941-0800: [CMS: 87095K->87076K(87424K), 0.0074692 secs] 125854K->125835K(126720K), [Metaspace: 2673K->2673K(1056768K)], 0.0075112 secs] [Times: user=0.01 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:26.948-0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 87076K(87424K)] 125835K(126720K), 0.0002656 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:26.949-0800: [CMS-concurrent-mark-start]
2020-10-26T00:11:26.949-0800: [CMS-concurrent-mark: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:26.949-0800: [CMS-concurrent-preclean-start]
2020-10-26T00:11:26.950-0800: [CMS-concurrent-preclean: 0.000/0.001 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
2020-10-26T00:11:26.950-0800: [CMS-concurrent-abortable-preclean-start]
2020-10-26T00:11:26.950-0800: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:26.950-0800: [GC (CMS Final Remark) [YG occupancy: 38807 K (39296 K)]2020-10-26T00:11:26.950-0800: [Rescan (parallel) , 0.0002461 secs]2020-10-26T00:11:26.950-0800: [weak refs processing, 0.0000221 secs]2020-10-26T00:11:26.950-0800: [class unloading, 0.0001530 secs]2020-10-26T00:11:26.951-0800: [scrub symbol table, 0.0002380 secs]2020-10-26T00:11:26.951-0800: [scrub string table, 0.0002133 secs][1 CMS-remark: 87076K(87424K)] 125883K(126720K), 0.0009510 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 

Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
	at GCLogAnalysis.generateGarbage(GCLogAnalysis.java:39)
	at GCLogAnalysis.main(GCLogAnalysis.java:18)

Heap
 par new generation   total 39296K, used 38807K [0x00000007b8000000, 0x00000007baaa0000, 0x00000007baaa0000)
  eden space 34944K, 100% used [0x00000007b8000000, 0x00000007ba220000, 0x00000007ba220000)
  from space 4352K,  88% used [0x00000007ba660000, 0x00000007baa25de0, 0x00000007baaa0000)
  to   space 4352K,   0% used [0x00000007ba220000, 0x00000007ba220000, 0x00000007ba660000)
 concurrent mark-sweep generation total 87424K, used 87076K [0x00000007baaa0000, 0x00000007c0000000, 0x00000007c0000000)
 Metaspace       used 2704K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 295K, capacity 386K, committed 512K, reserved 1048576K
```
#### 现象
OOM

### 256m
```log
start
2020-10-26T00:11:32.179-0800: [GC (Allocation Failure) 2020-10-26T00:11:32.179-0800: [ParNew: 69952K->8697K(78656K), 0.0111805 secs] 69952K->26773K(253440K), 0.0112718 secs] [Times: user=0.03 sys=0.06, real=0.02 secs] 
2020-10-26T00:11:32.202-0800: [GC (Allocation Failure) 2020-10-26T00:11:32.202-0800: [ParNew: 78649K->8704K(78656K), 0.0123767 secs] 96725K->52371K(253440K), 0.0124582 secs] [Times: user=0.03 sys=0.07, real=0.01 secs] 
2020-10-26T00:11:32.226-0800: [GC (Allocation Failure) 2020-10-26T00:11:32.226-0800: [ParNew: 78656K->8703K(78656K), 0.0154906 secs] 122323K->77308K(253440K), 0.0155739 secs] [Times: user=0.14 sys=0.01, real=0.02 secs] 
2020-10-26T00:11:32.255-0800: [GC (Allocation Failure) 2020-10-26T00:11:32.256-0800: [ParNew: 78655K->8701K(78656K), 0.0148457 secs] 147260K->100265K(253440K), 0.0149170 secs] [Times: user=0.14 sys=0.01, real=0.02 secs] 
2020-10-26T00:11:32.271-0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 91564K(174784K)] 100991K(253440K), 0.0002521 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.271-0800: [CMS-concurrent-mark-start]
2020-10-26T00:11:32.272-0800: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.272-0800: [CMS-concurrent-preclean-start]
2020-10-26T00:11:32.272-0800: [CMS-concurrent-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.272-0800: [CMS-concurrent-abortable-preclean-start]
2020-10-26T00:11:32.282-0800: [GC (Allocation Failure) 2020-10-26T00:11:32.282-0800: [ParNew: 78556K->8702K(78656K), 0.0166704 secs] 170120K->122463K(253440K), 0.0167544 secs] [Times: user=0.15 sys=0.01, real=0.01 secs] 
2020-10-26T00:11:32.310-0800: [GC (Allocation Failure) 2020-10-26T00:11:32.310-0800: [ParNew: 78559K->8699K(78656K), 0.0117548 secs] 192319K->141087K(253440K), 0.0118384 secs] [Times: user=0.11 sys=0.00, real=0.01 secs] 
2020-10-26T00:11:32.333-0800: [GC (Allocation Failure) 2020-10-26T00:11:32.333-0800: [ParNew: 78651K->8703K(78656K), 0.0146973 secs] 211039K->164723K(253440K), 0.0147753 secs] [Times: user=0.13 sys=0.01, real=0.01 secs] 
2020-10-26T00:11:32.358-0800: [GC (Allocation Failure) 2020-10-26T00:11:32.358-0800: [ParNew: 78655K->78655K(78656K), 0.0000491 secs]2020-10-26T00:11:32.358-0800: [CMS2020-10-26T00:11:32.358-0800: [CMS-concurrent-abortable-preclean: 0.003/0.086 secs] [Times: user=0.44 sys=0.02, real=0.08 secs] 
 (concurrent mode failure): 156020K->155241K(174784K), 0.0214907 secs] 234675K->155241K(253440K), [Metaspace: 2673K->2673K(1056768K)], 0.0216476 secs] [Times: user=0.02 sys=0.00, real=0.02 secs] 
2020-10-26T00:11:32.389-0800: [GC (Allocation Failure) 2020-10-26T00:11:32.389-0800: [ParNew (promotion failed): 69952K->78651K(78656K), 0.0123589 secs]2020-10-26T00:11:32.401-0800: [CMS: 174085K->174764K(174784K), 0.0273701 secs] 225193K->175335K(253440K), [Metaspace: 2673K->2673K(1056768K)], 0.0398406 secs] [Times: user=0.14 sys=0.01, real=0.04 secs] 
2020-10-26T00:11:32.429-0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 174764K(174784K)] 176739K(253440K), 0.0002445 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.429-0800: [CMS-concurrent-mark-start]
2020-10-26T00:11:32.430-0800: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
2020-10-26T00:11:32.430-0800: [CMS-concurrent-preclean-start]
2020-10-26T00:11:32.431-0800: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.01 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.431-0800: [CMS-concurrent-abortable-preclean-start]
2020-10-26T00:11:32.431-0800: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.431-0800: [GC (CMS Final Remark) [YG occupancy: 12001 K (78656 K)]2020-10-26T00:11:32.431-0800: [Rescan (parallel) , 0.0002369 secs]2020-10-26T00:11:32.431-0800: [weak refs processing, 0.0000431 secs]2020-10-26T00:11:32.432-0800: [class unloading, 0.0002379 secs]2020-10-26T00:11:32.432-0800: [scrub symbol table, 0.0003668 secs]2020-10-26T00:11:32.432-0800: [scrub string table, 0.0002282 secs][1 CMS-remark: 174764K(174784K)] 186765K(253440K), 0.0012436 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.432-0800: [CMS-concurrent-sweep-start]
2020-10-26T00:11:32.433-0800: [CMS-concurrent-sweep: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.433-0800: [CMS-concurrent-reset-start]
2020-10-26T00:11:32.433-0800: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.442-0800: [GC (Allocation Failure) 2020-10-26T00:11:32.442-0800: [ParNew: 78616K->78616K(78656K), 0.0000330 secs]2020-10-26T00:11:32.442-0800: [CMS: 174764K->174723K(174784K), 0.0221262 secs] 253381K->189089K(253440K), [Metaspace: 2673K->2673K(1056768K)], 0.0222450 secs] [Times: user=0.02 sys=0.00, real=0.02 secs] 
2020-10-26T00:11:32.465-0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 174723K(174784K)] 189767K(253440K), 0.0002732 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.465-0800: [CMS-concurrent-mark-start]
2020-10-26T00:11:32.466-0800: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.466-0800: [CMS-concurrent-preclean-start]
2020-10-26T00:11:32.467-0800: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.01 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.467-0800: [CMS-concurrent-abortable-preclean-start]
2020-10-26T00:11:32.467-0800: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.467-0800: [GC (CMS Final Remark) [YG occupancy: 23197 K (78656 K)]2020-10-26T00:11:32.467-0800: [Rescan (parallel) , 0.0002920 secs]2020-10-26T00:11:32.467-0800: [weak refs processing, 0.0000227 secs]2020-10-26T00:11:32.467-0800: [class unloading, 0.0002033 secs]2020-10-26T00:11:32.468-0800: [scrub symbol table, 0.0003380 secs]2020-10-26T00:11:32.468-0800: [scrub string table, 0.0002206 secs][1 CMS-remark: 174723K(174784K)] 197920K(253440K), 0.0011694 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.468-0800: [CMS-concurrent-sweep-start]
2020-10-26T00:11:32.468-0800: [CMS-concurrent-sweep: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.469-0800: [CMS-concurrent-reset-start]
2020-10-26T00:11:32.469-0800: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.478-0800: [GC (Allocation Failure) 2020-10-26T00:11:32.478-0800: [ParNew: 78608K->78608K(78656K), 0.0000340 secs]2020-10-26T00:11:32.478-0800: [CMS: 174723K->174721K(174784K), 0.0262691 secs] 253331K->198300K(253440K), [Metaspace: 2673K->2673K(1056768K)], 0.0263960 secs] [Times: user=0.03 sys=0.00, real=0.03 secs] 
2020-10-26T00:11:32.504-0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 174721K(174784K)] 198669K(253440K), 0.0002754 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.505-0800: [CMS-concurrent-mark-start]
2020-10-26T00:11:32.505-0800: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.505-0800: [CMS-concurrent-preclean-start]
2020-10-26T00:11:32.506-0800: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.506-0800: [CMS-concurrent-abortable-preclean-start]
2020-10-26T00:11:32.506-0800: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.506-0800: [GC (CMS Final Remark) [YG occupancy: 33489 K (78656 K)]2020-10-26T00:11:32.506-0800: [Rescan (parallel) , 0.0002288 secs]2020-10-26T00:11:32.507-0800: [weak refs processing, 0.0000246 secs]2020-10-26T00:11:32.507-0800: [class unloading, 0.0002031 secs]2020-10-26T00:11:32.507-0800: [scrub symbol table, 0.0003401 secs]2020-10-26T00:11:32.507-0800: [scrub string table, 0.0002232 secs][1 CMS-remark: 174721K(174784K)] 208211K(253440K), 0.0011101 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.508-0800: [CMS-concurrent-sweep-start]
2020-10-26T00:11:32.508-0800: [CMS-concurrent-sweep: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.508-0800: [CMS-concurrent-reset-start]
2020-10-26T00:11:32.508-0800: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.515-0800: [GC (Allocation Failure) 2020-10-26T00:11:32.515-0800: [ParNew: 78429K->78429K(78656K), 0.0000314 secs]2020-10-26T00:11:32.515-0800: [CMS: 174356K->174705K(174784K), 0.0251832 secs] 252785K->205677K(253440K), [Metaspace: 2673K->2673K(1056768K)], 0.0253003 secs] [Times: user=0.03 sys=0.00, real=0.03 secs] 
2020-10-26T00:11:32.540-0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 174705K(174784K)] 206198K(253440K), 0.0002783 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.541-0800: [CMS-concurrent-mark-start]
2020-10-26T00:11:32.541-0800: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.541-0800: [CMS-concurrent-preclean-start]
2020-10-26T00:11:32.542-0800: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.542-0800: [CMS-concurrent-abortable-preclean-start]
2020-10-26T00:11:32.542-0800: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.542-0800: [GC (CMS Final Remark) [YG occupancy: 37947 K (78656 K)]2020-10-26T00:11:32.542-0800: [Rescan (parallel) , 0.0002703 secs]2020-10-26T00:11:32.543-0800: [weak refs processing, 0.0000255 secs]2020-10-26T00:11:32.543-0800: [class unloading, 0.0002032 secs]2020-10-26T00:11:32.543-0800: [scrub symbol table, 0.0003371 secs]2020-10-26T00:11:32.543-0800: [scrub string table, 0.0002417 secs][1 CMS-remark: 174705K(174784K)] 212653K(253440K), 0.0011778 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.544-0800: [CMS-concurrent-sweep-start]
2020-10-26T00:11:32.544-0800: [CMS-concurrent-sweep: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.544-0800: [CMS-concurrent-reset-start]
2020-10-26T00:11:32.544-0800: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.550-0800: [GC (Allocation Failure) 2020-10-26T00:11:32.550-0800: [ParNew: 78584K->78584K(78656K), 0.0000338 secs]2020-10-26T00:11:32.550-0800: [CMS: 174705K->174625K(174784K), 0.0257138 secs] 253290K->213365K(253440K), [Metaspace: 2673K->2673K(1056768K)], 0.0258338 secs] [Times: user=0.03 sys=0.00, real=0.02 secs] 
2020-10-26T00:11:32.576-0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 174625K(174784K)] 214617K(253440K), 0.0002918 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.576-0800: [CMS-concurrent-mark-start]
2020-10-26T00:11:32.577-0800: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.577-0800: [CMS-concurrent-preclean-start]
2020-10-26T00:11:32.578-0800: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.578-0800: [CMS-concurrent-abortable-preclean-start]
2020-10-26T00:11:32.578-0800: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.578-0800: [GC (CMS Final Remark) [YG occupancy: 51528 K (78656 K)]2020-10-26T00:11:32.578-0800: [Rescan (parallel) , 0.0003829 secs]2020-10-26T00:11:32.579-0800: [weak refs processing, 0.0000256 secs]2020-10-26T00:11:32.579-0800: [class unloading, 0.0002050 secs]2020-10-26T00:11:32.579-0800: [scrub symbol table, 0.0003370 secs]2020-10-26T00:11:32.579-0800: [scrub string table, 0.0002457 secs][1 CMS-remark: 174625K(174784K)] 226154K(253440K), 0.0012923 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
2020-10-26T00:11:32.580-0800: [CMS-concurrent-sweep-start]
2020-10-26T00:11:32.580-0800: [CMS-concurrent-sweep: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.580-0800: [CMS-concurrent-reset-start]
2020-10-26T00:11:32.580-0800: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.587-0800: [GC (Allocation Failure) 2020-10-26T00:11:32.587-0800: [ParNew: 78517K->78517K(78656K), 0.0000341 secs]2020-10-26T00:11:32.587-0800: [CMS: 174442K->174321K(174784K), 0.0294482 secs] 252959K->218360K(253440K), [Metaspace: 2673K->2673K(1056768K)], 0.0295623 secs] [Times: user=0.03 sys=0.00, real=0.03 secs] 
2020-10-26T00:11:32.616-0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 174321K(174784K)] 218504K(253440K), 0.0002933 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.617-0800: [CMS-concurrent-mark-start]
2020-10-26T00:11:32.617-0800: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.617-0800: [CMS-concurrent-preclean-start]
2020-10-26T00:11:32.618-0800: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.618-0800: [CMS-concurrent-abortable-preclean-start]
2020-10-26T00:11:32.618-0800: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.619-0800: [GC (CMS Final Remark) [YG occupancy: 56027 K (78656 K)]2020-10-26T00:11:32.619-0800: [Rescan (parallel) , 0.0002112 secs]2020-10-26T00:11:32.619-0800: [weak refs processing, 0.0000249 secs]2020-10-26T00:11:32.619-0800: [class unloading, 0.0002041 secs]2020-10-26T00:11:32.619-0800: [scrub symbol table, 0.0003374 secs]2020-10-26T00:11:32.619-0800: [scrub string table, 0.0002380 secs][1 CMS-remark: 174321K(174784K)] 230349K(253440K), 0.0011177 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
2020-10-26T00:11:32.620-0800: [CMS-concurrent-sweep-start]
2020-10-26T00:11:32.620-0800: [CMS-concurrent-sweep: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.620-0800: [CMS-concurrent-reset-start]
2020-10-26T00:11:32.620-0800: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.624-0800: [GC (Allocation Failure) 2020-10-26T00:11:32.624-0800: [ParNew: 78559K->78559K(78656K), 0.0000330 secs]2020-10-26T00:11:32.624-0800: [CMS: 173937K->174636K(174784K), 0.0251484 secs] 252497K->224577K(253440K), [Metaspace: 2673K->2673K(1056768K)], 0.0252564 secs] [Times: user=0.03 sys=0.00, real=0.02 secs] 
2020-10-26T00:11:32.649-0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 174636K(174784K)] 225366K(253440K), 0.0002718 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.649-0800: [CMS-concurrent-mark-start]
2020-10-26T00:11:32.650-0800: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
2020-10-26T00:11:32.650-0800: [CMS-concurrent-preclean-start]
2020-10-26T00:11:32.651-0800: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.651-0800: [CMS-concurrent-abortable-preclean-start]
2020-10-26T00:11:32.651-0800: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.651-0800: [GC (CMS Final Remark) [YG occupancy: 60098 K (78656 K)]2020-10-26T00:11:32.651-0800: [Rescan (parallel) , 0.0002767 secs]2020-10-26T00:11:32.652-0800: [weak refs processing, 0.0000359 secs]2020-10-26T00:11:32.652-0800: [class unloading, 0.0002098 secs]2020-10-26T00:11:32.652-0800: [scrub symbol table, 0.0003506 secs]2020-10-26T00:11:32.652-0800: [scrub string table, 0.0002380 secs][1 CMS-remark: 174636K(174784K)] 234735K(253440K), 0.0012092 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.653-0800: [CMS-concurrent-sweep-start]
2020-10-26T00:11:32.653-0800: [CMS-concurrent-sweep: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.653-0800: [CMS-concurrent-reset-start]
2020-10-26T00:11:32.653-0800: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.01 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.656-0800: [GC (Allocation Failure) 2020-10-26T00:11:32.657-0800: [ParNew: 78441K->78441K(78656K), 0.0000360 secs]2020-10-26T00:11:32.657-0800: [CMS: 174636K->174636K(174784K), 0.0288229 secs] 253077K->226167K(253440K), [Metaspace: 2673K->2673K(1056768K)], 0.0289334 secs] [Times: user=0.03 sys=0.00, real=0.03 secs] 
2020-10-26T00:11:32.686-0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 174636K(174784K)] 226707K(253440K), 0.0002661 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.686-0800: [CMS-concurrent-mark-start]
2020-10-26T00:11:32.687-0800: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.687-0800: [CMS-concurrent-preclean-start]
2020-10-26T00:11:32.688-0800: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.688-0800: [CMS-concurrent-abortable-preclean-start]
2020-10-26T00:11:32.688-0800: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.688-0800: [GC (CMS Final Remark) [YG occupancy: 62191 K (78656 K)]2020-10-26T00:11:32.688-0800: [Rescan (parallel) , 0.0002400 secs]2020-10-26T00:11:32.688-0800: [weak refs processing, 0.0000278 secs]2020-10-26T00:11:32.688-0800: [class unloading, 0.0002075 secs]2020-10-26T00:11:32.688-0800: [scrub symbol table, 0.0003367 secs]2020-10-26T00:11:32.689-0800: [scrub string table, 0.0002409 secs][1 CMS-remark: 174636K(174784K)] 236828K(253440K), 0.0011459 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.689-0800: [CMS-concurrent-sweep-start]
2020-10-26T00:11:32.689-0800: [CMS-concurrent-sweep: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.689-0800: [CMS-concurrent-reset-start]
2020-10-26T00:11:32.690-0800: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
2020-10-26T00:11:32.692-0800: [GC (Allocation Failure) 2020-10-26T00:11:32.692-0800: [ParNew: 78594K->78594K(78656K), 0.0000322 secs]2020-10-26T00:11:32.692-0800: [CMS: 174217K->174439K(174784K), 0.0307047 secs] 252811K->228953K(253440K), [Metaspace: 2673K->2673K(1056768K)], 0.0308089 secs] [Times: user=0.03 sys=0.00, real=0.03 secs] 
2020-10-26T00:11:32.723-0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 174439K(174784K)] 229919K(253440K), 0.0002899 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.723-0800: [CMS-concurrent-mark-start]
2020-10-26T00:11:32.724-0800: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.724-0800: [CMS-concurrent-preclean-start]
2020-10-26T00:11:32.725-0800: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.725-0800: [CMS-concurrent-abortable-preclean-start]
2020-10-26T00:11:32.725-0800: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.725-0800: [GC (CMS Final Remark) [YG occupancy: 64563 K (78656 K)]2020-10-26T00:11:32.725-0800: [Rescan (parallel) , 0.0001986 secs]2020-10-26T00:11:32.725-0800: [weak refs processing, 0.0000201 secs]2020-10-26T00:11:32.725-0800: [class unloading, 0.0001908 secs]2020-10-26T00:11:32.726-0800: [scrub symbol table, 0.0003114 secs]2020-10-26T00:11:32.726-0800: [scrub string table, 0.0002205 secs][1 CMS-remark: 174439K(174784K)] 239002K(253440K), 0.0010192 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.726-0800: [CMS-concurrent-sweep-start]
2020-10-26T00:11:32.727-0800: [CMS-concurrent-sweep: 0.000/0.000 secs] [Times: user=0.01 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.727-0800: [CMS-concurrent-reset-start]
2020-10-26T00:11:32.727-0800: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.728-0800: [GC (Allocation Failure) 2020-10-26T00:11:32.728-0800: [ParNew: 78054K->78054K(78656K), 0.0000304 secs]2020-10-26T00:11:32.728-0800: [CMS: 173901K->174325K(174784K), 0.0263023 secs] 251955K->233980K(253440K), [Metaspace: 2673K->2673K(1056768K)], 0.0264009 secs] [Times: user=0.02 sys=0.00, real=0.03 secs] 
2020-10-26T00:11:32.755-0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 174325K(174784K)] 234779K(253440K), 0.0002549 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.755-0800: [CMS-concurrent-mark-start]
2020-10-26T00:11:32.756-0800: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.01 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.756-0800: [CMS-concurrent-preclean-start]
2020-10-26T00:11:32.757-0800: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.757-0800: [CMS-concurrent-abortable-preclean-start]
2020-10-26T00:11:32.757-0800: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.757-0800: [GC (CMS Final Remark) [YG occupancy: 71955 K (78656 K)]2020-10-26T00:11:32.757-0800: [Rescan (parallel) , 0.0003931 secs]2020-10-26T00:11:32.758-0800: [weak refs processing, 0.0000247 secs]2020-10-26T00:11:32.758-0800: [class unloading, 0.0002040 secs]2020-10-26T00:11:32.758-0800: [scrub symbol table, 0.0003368 secs]2020-10-26T00:11:32.758-0800: [scrub string table, 0.0002235 secs][1 CMS-remark: 174325K(174784K)] 246281K(253440K), 0.0012713 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.758-0800: [CMS-concurrent-sweep-start]
2020-10-26T00:11:32.759-0800: [CMS-concurrent-sweep: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.759-0800: [CMS-concurrent-reset-start]
2020-10-26T00:11:32.759-0800: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.760-0800: [GC (Allocation Failure) 2020-10-26T00:11:32.760-0800: [ParNew: 78651K->78651K(78656K), 0.0000328 secs]2020-10-26T00:11:32.760-0800: [CMS: 174325K->174360K(174784K), 0.0235999 secs] 252977K->238201K(253440K), [Metaspace: 2673K->2673K(1056768K)], 0.0237087 secs] [Times: user=0.03 sys=0.00, real=0.02 secs] 
2020-10-26T00:11:32.784-0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 174360K(174784K)] 238751K(253440K), 0.0002595 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.784-0800: [CMS-concurrent-mark-start]
2020-10-26T00:11:32.785-0800: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.785-0800: [CMS-concurrent-preclean-start]
2020-10-26T00:11:32.786-0800: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.786-0800: [CMS-concurrent-abortable-preclean-start]
2020-10-26T00:11:32.786-0800: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.786-0800: [GC (CMS Final Remark) [YG occupancy: 73937 K (78656 K)]2020-10-26T00:11:32.786-0800: [Rescan (parallel) , 0.0002658 secs]2020-10-26T00:11:32.786-0800: [weak refs processing, 0.0000243 secs]2020-10-26T00:11:32.786-0800: [class unloading, 0.0002204 secs]2020-10-26T00:11:32.786-0800: [scrub symbol table, 0.0003248 secs]2020-10-26T00:11:32.787-0800: [scrub string table, 0.0002288 secs][1 CMS-remark: 174360K(174784K)] 248298K(253440K), 0.0011563 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.787-0800: [CMS-concurrent-sweep-start]
2020-10-26T00:11:32.787-0800: [CMS-concurrent-sweep: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.787-0800: [CMS-concurrent-reset-start]
2020-10-26T00:11:32.787-0800: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.788-0800: [GC (Allocation Failure) 2020-10-26T00:11:32.788-0800: [ParNew: 78544K->78544K(78656K), 0.0000322 secs]2020-10-26T00:11:32.788-0800: [CMS: 174360K->174288K(174784K), 0.0246960 secs] 252905K->240824K(253440K), [Metaspace: 2673K->2673K(1056768K)], 0.0248039 secs] [Times: user=0.03 sys=0.00, real=0.03 secs] 
2020-10-26T00:11:32.813-0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 174288K(174784K)] 240982K(253440K), 0.0002871 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.813-0800: [CMS-concurrent-mark-start]
2020-10-26T00:11:32.814-0800: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.814-0800: [CMS-concurrent-preclean-start]
2020-10-26T00:11:32.815-0800: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.815-0800: [CMS-concurrent-abortable-preclean-start]
2020-10-26T00:11:32.815-0800: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.815-0800: [GC (CMS Final Remark) [YG occupancy: 78655 K (78656 K)]2020-10-26T00:11:32.815-0800: [Rescan (parallel) , 0.0002734 secs]2020-10-26T00:11:32.816-0800: [weak refs processing, 0.0000263 secs]2020-10-26T00:11:32.816-0800: [class unloading, 0.0002036 secs]2020-10-26T00:11:32.816-0800: [scrub symbol table, 0.0003347 secs]2020-10-26T00:11:32.816-0800: [scrub string table, 0.0002396 secs][1 CMS-remark: 174288K(174784K)] 252943K(253440K), 0.0011815 secs] [Times: user=0.01 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.817-0800: [CMS-concurrent-sweep-start]
2020-10-26T00:11:32.817-0800: [Full GC (Allocation Failure) 2020-10-26T00:11:32.817-0800: [CMS2020-10-26T00:11:32.817-0800: [CMS-concurrent-sweep: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
 (concurrent mode failure): 174654K->174753K(174784K), 0.0350982 secs] 253309K->244367K(253440K), [Metaspace: 2673K->2673K(1056768K)], 0.0351629 secs] [Times: user=0.03 sys=0.00, real=0.04 secs] 
2020-10-26T00:11:32.854-0800: [Full GC (Allocation Failure) 2020-10-26T00:11:32.854-0800: [CMS: 174753K->174347K(174784K), 0.0292159 secs] 253322K->245884K(253440K), [Metaspace: 2673K->2673K(1056768K)], 0.0292836 secs] [Times: user=0.03 sys=0.00, real=0.03 secs] 
2020-10-26T00:11:32.883-0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 174347K(174784K)] 246484K(253440K), 0.0002796 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.883-0800: [CMS-concurrent-mark-start]
2020-10-26T00:11:32.884-0800: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.884-0800: [CMS-concurrent-preclean-start]
2020-10-26T00:11:32.885-0800: [Full GC (Allocation Failure) 2020-10-26T00:11:32.885-0800: [CMS2020-10-26T00:11:32.885-0800: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.01 sys=0.00, real=0.00 secs] 
 (concurrent mode failure): 174563K->174664K(174784K), 0.0242813 secs] 253188K->245399K(253440K), [Metaspace: 2673K->2673K(1056768K)], 0.0243416 secs] [Times: user=0.02 sys=0.00, real=0.02 secs] 
2020-10-26T00:11:32.910-0800: [Full GC (Allocation Failure) 2020-10-26T00:11:32.910-0800: [CMS: 174664K->174470K(174784K), 0.0268357 secs] 253223K->245249K(253440K), [Metaspace: 2673K->2673K(1056768K)], 0.0269039 secs] [Times: user=0.03 sys=0.00, real=0.02 secs] 
2020-10-26T00:11:32.938-0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 174470K(174784K)] 245560K(253440K), 0.0002853 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.938-0800: [CMS-concurrent-mark-start]
2020-10-26T00:11:32.939-0800: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:32.939-0800: [CMS-concurrent-preclean-start]
2020-10-26T00:11:32.939-0800: [Full GC (Allocation Failure) 2020-10-26T00:11:32.939-0800: [CMS2020-10-26T00:11:32.940-0800: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
 (concurrent mode failure): 174470K->174622K(174784K), 0.0224544 secs] 252974K->244194K(253440K), [Metaspace: 2673K->2673K(1056768K)], 0.0225219 secs] [Times: user=0.03 sys=0.00, real=0.03 secs] 
2020-10-26T00:11:32.964-0800: [Full GC (Allocation Failure) 2020-10-26T00:11:32.964-0800: [CMS: 174622K->174294K(174784K), 0.0352534 secs] 252941K->245783K(253440K), [Metaspace: 2673K->2673K(1056768K)], 0.0353370 secs] [Times: user=0.03 sys=0.00, real=0.03 secs] 
2020-10-26T00:11:32.999-0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 174294K(174784K)] 246172K(253440K), 0.0002755 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
2020-10-26T00:11:33.000-0800: [CMS-concurrent-mark-start]
2020-10-26T00:11:33.000-0800: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:33.000-0800: [CMS-concurrent-preclean-start]
2020-10-26T00:11:33.001-0800: [Full GC (Allocation Failure) 2020-10-26T00:11:33.001-0800: [CMS2020-10-26T00:11:33.002-0800: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.01 sys=0.00, real=0.00 secs] 
 (concurrent mode failure): 174294K->174722K(174784K), 0.0260712 secs] 252640K->245879K(253440K), [Metaspace: 2673K->2673K(1056768K)], 0.0261452 secs] [Times: user=0.02 sys=0.00, real=0.02 secs] 
2020-10-26T00:11:33.029-0800: [Full GC (Allocation Failure) 2020-10-26T00:11:33.029-0800: [CMS: 174722K->174777K(174784K), 0.0285025 secs] 252930K->246728K(253440K), [Metaspace: 2673K->2673K(1056768K)], 0.0285763 secs] [Times: user=0.03 sys=0.00, real=0.03 secs] 
2020-10-26T00:11:33.057-0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 174777K(174784K)] 247313K(253440K), 0.0002773 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:33.058-0800: [CMS-concurrent-mark-start]
2020-10-26T00:11:33.059-0800: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.01 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:33.059-0800: [CMS-concurrent-preclean-start]
2020-10-26T00:11:33.059-0800: [Full GC (Allocation Failure) 2020-10-26T00:11:33.059-0800: [CMS2020-10-26T00:11:33.060-0800: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
 (concurrent mode failure): 174777K->174526K(174784K), 0.0283739 secs] 253066K->247729K(253440K), [Metaspace: 2673K->2673K(1056768K)], 0.0284442 secs] [Times: user=0.02 sys=0.00, real=0.03 secs] 
2020-10-26T00:11:33.089-0800: [Full GC (Allocation Failure) 2020-10-26T00:11:33.089-0800: [CMS: 174756K->174755K(174784K), 0.0273386 secs] 253412K->248914K(253440K), [Metaspace: 2673K->2673K(1056768K)], 0.0274132 secs] [Times: user=0.02 sys=0.00, real=0.03 secs] 
2020-10-26T00:11:33.117-0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 174755K(174784K)] 248950K(253440K), 0.0003341 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:33.117-0800: [CMS-concurrent-mark-start]
2020-10-26T00:11:33.118-0800: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.01 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:33.118-0800: [CMS-concurrent-preclean-start]
2020-10-26T00:11:33.118-0800: [Full GC (Allocation Failure) 2020-10-26T00:11:33.118-0800: [CMS2020-10-26T00:11:33.119-0800: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
 (concurrent mode failure): 174755K->174715K(174784K), 0.0130675 secs] 252913K->249931K(253440K), [Metaspace: 2673K->2673K(1056768K)], 0.0131349 secs] [Times: user=0.01 sys=0.00, real=0.02 secs] 
creat: 4366
Heap
 par new generation   total 78656K, used 75988K [0x00000007b0000000, 0x00000007b5550000, 0x00000007b5550000)
  eden space 69952K, 100% used [0x00000007b0000000, 0x00000007b4450000, 0x00000007b4450000)
  from space 8704K,  69% used [0x00000007b4450000, 0x00000007b4a35138, 0x00000007b4cd0000)
  to   space 8704K,   0% used [0x00000007b4cd0000, 0x00000007b4cd0000, 0x00000007b5550000)
 concurrent mark-sweep generation total 174784K, used 174715K [0x00000007b5550000, 0x00000007c0000000, 0x00000007c0000000)
 Metaspace       used 2680K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 292K, capacity 386K, committed 512K, reserved 1048576K
```

### 512m
```log
start
2020-10-26T00:11:38.429-0800: [GC (Allocation Failure) 2020-10-26T00:11:38.430-0800: [ParNew: 139776K->17471K(157248K), 0.0217952 secs] 139776K->47588K(506816K), 0.0218877 secs] [Times: user=0.04 sys=0.14, real=0.03 secs] 
2020-10-26T00:11:38.475-0800: [GC (Allocation Failure) 2020-10-26T00:11:38.475-0800: [ParNew: 157247K->17472K(157248K), 0.0236039 secs] 187364K->91633K(506816K), 0.0236881 secs] [Times: user=0.05 sys=0.14, real=0.02 secs] 
2020-10-26T00:11:38.518-0800: [GC (Allocation Failure) 2020-10-26T00:11:38.518-0800: [ParNew: 157248K->17470K(157248K), 0.0274028 secs] 231409K->136444K(506816K), 0.0274815 secs] [Times: user=0.25 sys=0.02, real=0.03 secs] 
2020-10-26T00:11:38.565-0800: [GC (Allocation Failure) 2020-10-26T00:11:38.565-0800: [ParNew: 157246K->17471K(157248K), 0.0261388 secs] 276220K->178136K(506816K), 0.0262191 secs] [Times: user=0.25 sys=0.01, real=0.03 secs] 
2020-10-26T00:11:38.611-0800: [GC (Allocation Failure) 2020-10-26T00:11:38.611-0800: [ParNew: 156574K->17471K(157248K), 0.0266251 secs] 317238K->222108K(506816K), 0.0267035 secs] [Times: user=0.24 sys=0.02, real=0.02 secs] 
2020-10-26T00:11:38.638-0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 204637K(349568K)] 222900K(506816K), 0.0002575 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:38.638-0800: [CMS-concurrent-mark-start]
2020-10-26T00:11:38.640-0800: [CMS-concurrent-mark: 0.002/0.002 secs] [Times: user=0.01 sys=0.00, real=0.01 secs] 
2020-10-26T00:11:38.640-0800: [CMS-concurrent-preclean-start]
2020-10-26T00:11:38.641-0800: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:38.641-0800: [CMS-concurrent-abortable-preclean-start]
2020-10-26T00:11:38.657-0800: [GC (Allocation Failure) 2020-10-26T00:11:38.657-0800: [ParNew: 157247K->17471K(157248K), 0.0309043 secs] 361884K->271624K(506816K), 0.0309781 secs] [Times: user=0.28 sys=0.02, real=0.03 secs] 
2020-10-26T00:11:38.707-0800: [GC (Allocation Failure) 2020-10-26T00:11:38.708-0800: [ParNew: 157247K->17470K(157248K), 0.0239963 secs] 411400K->309029K(506816K), 0.0240992 secs] [Times: user=0.21 sys=0.01, real=0.03 secs] 
2020-10-26T00:11:38.750-0800: [GC (Allocation Failure) 2020-10-26T00:11:38.750-0800: [ParNew: 157246K->17471K(157248K), 0.0267876 secs] 448805K->351532K(506816K), 0.0268722 secs] [Times: user=0.25 sys=0.02, real=0.02 secs] 
2020-10-26T00:11:38.777-0800: [CMS-concurrent-abortable-preclean: 0.004/0.136 secs] [Times: user=0.81 sys=0.05, real=0.13 secs] 
2020-10-26T00:11:38.777-0800: [GC (CMS Final Remark) [YG occupancy: 17615 K (157248 K)]2020-10-26T00:11:38.777-0800: [Rescan (parallel) , 0.0003147 secs]2020-10-26T00:11:38.777-0800: [weak refs processing, 0.0000361 secs]2020-10-26T00:11:38.777-0800: [class unloading, 0.0002094 secs]2020-10-26T00:11:38.777-0800: [scrub symbol table, 0.0003011 secs]2020-10-26T00:11:38.778-0800: [scrub string table, 0.0002076 secs][1 CMS-remark: 334060K(349568K)] 351676K(506816K), 0.0011929 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:38.778-0800: [CMS-concurrent-sweep-start]
2020-10-26T00:11:38.779-0800: [CMS-concurrent-sweep: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:38.779-0800: [CMS-concurrent-reset-start]
2020-10-26T00:11:38.780-0800: [CMS-concurrent-reset: 0.001/0.001 secs] [Times: user=0.01 sys=0.00, real=0.01 secs] 
2020-10-26T00:11:38.805-0800: [GC (Allocation Failure) 2020-10-26T00:11:38.805-0800: [ParNew: 157247K->17471K(157248K), 0.0098042 secs] 448773K->353170K(506816K), 0.0098805 secs] [Times: user=0.09 sys=0.00, real=0.01 secs] 
2020-10-26T00:11:38.815-0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 335698K(349568K)] 353314K(506816K), 0.0002291 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:38.815-0800: [CMS-concurrent-mark-start]
2020-10-26T00:11:38.816-0800: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.01 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:38.816-0800: [CMS-concurrent-preclean-start]
2020-10-26T00:11:38.817-0800: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:38.817-0800: [CMS-concurrent-abortable-preclean-start]
2020-10-26T00:11:38.817-0800: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:38.817-0800: [GC (CMS Final Remark) [YG occupancy: 33012 K (157248 K)]2020-10-26T00:11:38.817-0800: [Rescan (parallel) , 0.0002683 secs]2020-10-26T00:11:38.817-0800: [weak refs processing, 0.0000291 secs]2020-10-26T00:11:38.817-0800: [class unloading, 0.0001961 secs]2020-10-26T00:11:38.818-0800: [scrub symbol table, 0.0002898 secs]2020-10-26T00:11:38.818-0800: [scrub string table, 0.0001978 secs][1 CMS-remark: 335698K(349568K)] 368711K(506816K), 0.0010671 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:38.818-0800: [CMS-concurrent-sweep-start]
2020-10-26T00:11:38.819-0800: [CMS-concurrent-sweep: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:38.819-0800: [CMS-concurrent-reset-start]
2020-10-26T00:11:38.819-0800: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:38.835-0800: [GC (Allocation Failure) 2020-10-26T00:11:38.835-0800: [ParNew: 157240K->17470K(157248K), 0.0087690 secs] 398308K->298587K(506816K), 0.0088279 secs] [Times: user=0.08 sys=0.00, real=0.01 secs] 
2020-10-26T00:11:38.844-0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 281116K(349568K)] 301526K(506816K), 0.0002412 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:38.844-0800: [CMS-concurrent-mark-start]
2020-10-26T00:11:38.845-0800: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:38.845-0800: [CMS-concurrent-preclean-start]
2020-10-26T00:11:38.846-0800: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:38.846-0800: [CMS-concurrent-abortable-preclean-start]
2020-10-26T00:11:38.864-0800: [GC (Allocation Failure) 2020-10-26T00:11:38.864-0800: [ParNew: 157166K->17471K(157248K), 0.0099852 secs] 438283K->341130K(506816K), 0.0100466 secs] [Times: user=0.10 sys=0.00, real=0.01 secs] 
2020-10-26T00:11:38.903-0800: [GC (Allocation Failure) 2020-10-26T00:11:38.903-0800: [ParNew: 157143K->157143K(157248K), 0.0000340 secs]2020-10-26T00:11:38.903-0800: [CMS2020-10-26T00:11:38.903-0800: [CMS-concurrent-abortable-preclean: 0.002/0.057 secs] [Times: user=0.15 sys=0.00, real=0.06 secs] 
 (concurrent mode failure): 323659K->296185K(349568K), 0.0526194 secs] 480802K->296185K(506816K), [Metaspace: 2673K->2673K(1056768K)], 0.0527355 secs] [Times: user=0.05 sys=0.00, real=0.05 secs] 
2020-10-26T00:11:38.974-0800: [GC (Allocation Failure) 2020-10-26T00:11:38.974-0800: [ParNew: 139776K->17471K(157248K), 0.0055723 secs] 435961K->340157K(506816K), 0.0056393 secs] [Times: user=0.05 sys=0.00, real=0.01 secs] 
2020-10-26T00:11:38.980-0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 322686K(349568K)] 340652K(506816K), 0.0002177 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:38.980-0800: [CMS-concurrent-mark-start]
2020-10-26T00:11:38.981-0800: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:38.981-0800: [CMS-concurrent-preclean-start]
2020-10-26T00:11:38.982-0800: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:38.982-0800: [CMS-concurrent-abortable-preclean-start]
2020-10-26T00:11:38.982-0800: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:38.982-0800: [GC (CMS Final Remark) [YG occupancy: 35958 K (157248 K)]2020-10-26T00:11:38.982-0800: [Rescan (parallel) , 0.0003416 secs]2020-10-26T00:11:38.982-0800: [weak refs processing, 0.0000261 secs]2020-10-26T00:11:38.982-0800: [class unloading, 0.0001892 secs]2020-10-26T00:11:38.982-0800: [scrub symbol table, 0.0002890 secs]2020-10-26T00:11:38.983-0800: [scrub string table, 0.0001981 secs][1 CMS-remark: 322686K(349568K)] 358644K(506816K), 0.0011284 secs] [Times: user=0.01 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:38.983-0800: [CMS-concurrent-sweep-start]
2020-10-26T00:11:38.983-0800: [CMS-concurrent-sweep: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:38.983-0800: [CMS-concurrent-reset-start]
2020-10-26T00:11:38.984-0800: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:38.998-0800: [GC (Allocation Failure) 2020-10-26T00:11:38.998-0800: [ParNew: 157247K->17471K(157248K), 0.0071842 secs] 444125K->345548K(506816K), 0.0072460 secs] [Times: user=0.07 sys=0.00, real=0.01 secs] 
2020-10-26T00:11:39.006-0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 328077K(349568K)] 346202K(506816K), 0.0002180 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:39.006-0800: [CMS-concurrent-mark-start]
2020-10-26T00:11:39.007-0800: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:39.007-0800: [CMS-concurrent-preclean-start]
2020-10-26T00:11:39.007-0800: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:39.007-0800: [CMS-concurrent-abortable-preclean-start]
2020-10-26T00:11:39.007-0800: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:39.008-0800: [GC (CMS Final Remark) [YG occupancy: 31446 K (157248 K)]2020-10-26T00:11:39.008-0800: [Rescan (parallel) , 0.0002429 secs]2020-10-26T00:11:39.008-0800: [weak refs processing, 0.0000181 secs]2020-10-26T00:11:39.008-0800: [class unloading, 0.0001854 secs]2020-10-26T00:11:39.008-0800: [scrub symbol table, 0.0002900 secs]2020-10-26T00:11:39.008-0800: [scrub string table, 0.0002001 secs][1 CMS-remark: 328077K(349568K)] 359523K(506816K), 0.0010096 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:39.009-0800: [CMS-concurrent-sweep-start]
2020-10-26T00:11:39.009-0800: [CMS-concurrent-sweep: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:39.009-0800: [CMS-concurrent-reset-start]
2020-10-26T00:11:39.010-0800: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
2020-10-26T00:11:39.034-0800: [GC (Allocation Failure) 2020-10-26T00:11:39.034-0800: [ParNew: 157240K->17471K(157248K), 0.0112853 secs] 450612K->358745K(506816K), 0.0113432 secs] [Times: user=0.11 sys=0.00, real=0.01 secs] 
2020-10-26T00:11:39.045-0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 341273K(349568K)] 361797K(506816K), 0.0002225 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:39.045-0800: [CMS-concurrent-mark-start]
2020-10-26T00:11:39.046-0800: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:39.046-0800: [CMS-concurrent-preclean-start]
2020-10-26T00:11:39.047-0800: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:39.047-0800: [CMS-concurrent-abortable-preclean-start]
2020-10-26T00:11:39.047-0800: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:39.047-0800: [GC (CMS Final Remark) [YG occupancy: 29824 K (157248 K)]2020-10-26T00:11:39.047-0800: [Rescan (parallel) , 0.0002769 secs]2020-10-26T00:11:39.047-0800: [weak refs processing, 0.0000208 secs]2020-10-26T00:11:39.047-0800: [class unloading, 0.0001935 secs]2020-10-26T00:11:39.048-0800: [scrub symbol table, 0.0002923 secs]2020-10-26T00:11:39.048-0800: [scrub string table, 0.0002006 secs][1 CMS-remark: 341273K(349568K)] 371097K(506816K), 0.0010645 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:39.048-0800: [CMS-concurrent-sweep-start]
2020-10-26T00:11:39.049-0800: [CMS-concurrent-sweep: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:39.049-0800: [CMS-concurrent-reset-start]
2020-10-26T00:11:39.049-0800: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:39.065-0800: [GC (Allocation Failure) 2020-10-26T00:11:39.065-0800: [ParNew: 156997K->156997K(157248K), 0.0000349 secs]2020-10-26T00:11:39.065-0800: [CMS: 300691K->320615K(349568K), 0.0514651 secs] 457688K->320615K(506816K), [Metaspace: 2673K->2673K(1056768K)], 0.0516067 secs] [Times: user=0.06 sys=0.00, real=0.05 secs] 
2020-10-26T00:11:39.117-0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 320615K(349568K)] 323668K(506816K), 0.0002094 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:39.117-0800: [CMS-concurrent-mark-start]
2020-10-26T00:11:39.118-0800: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:39.118-0800: [CMS-concurrent-preclean-start]
2020-10-26T00:11:39.118-0800: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:39.119-0800: [CMS-concurrent-abortable-preclean-start]
2020-10-26T00:11:39.143-0800: [GC (Allocation Failure) 2020-10-26T00:11:39.143-0800: [ParNew: 139693K->139693K(157248K), 0.0000333 secs]2020-10-26T00:11:39.144-0800: [CMS2020-10-26T00:11:39.144-0800: [CMS-concurrent-abortable-preclean: 0.001/0.025 secs] [Times: user=0.03 sys=0.00, real=0.03 secs] 
 (concurrent mode failure): 320615K->329712K(349568K), 0.0497501 secs] 460308K->329712K(506816K), [Metaspace: 2673K->2673K(1056768K)], 0.0498681 secs] [Times: user=0.05 sys=0.00, real=0.05 secs] 
2020-10-26T00:11:39.213-0800: [GC (Allocation Failure) 2020-10-26T00:11:39.213-0800: [ParNew: 139776K->139776K(157248K), 0.0000331 secs]2020-10-26T00:11:39.213-0800: [CMS: 329712K->338708K(349568K), 0.0484860 secs] 469488K->338708K(506816K), [Metaspace: 2673K->2673K(1056768K)], 0.0486067 secs] [Times: user=0.04 sys=0.00, real=0.05 secs] 
2020-10-26T00:11:39.261-0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 338708K(349568K)] 338875K(506816K), 0.0002459 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:39.262-0800: [CMS-concurrent-mark-start]
2020-10-26T00:11:39.263-0800: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.01 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:39.263-0800: [CMS-concurrent-preclean-start]
2020-10-26T00:11:39.263-0800: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:39.264-0800: [CMS-concurrent-abortable-preclean-start]
2020-10-26T00:11:39.264-0800: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:39.264-0800: [GC (CMS Final Remark) [YG occupancy: 13991 K (157248 K)]2020-10-26T00:11:39.264-0800: [Rescan (parallel) , 0.0002777 secs]2020-10-26T00:11:39.264-0800: [weak refs processing, 0.0000231 secs]2020-10-26T00:11:39.264-0800: [class unloading, 0.0001974 secs]2020-10-26T00:11:39.264-0800: [scrub symbol table, 0.0003093 secs]2020-10-26T00:11:39.265-0800: [scrub string table, 0.0002130 secs][1 CMS-remark: 338708K(349568K)] 352700K(506816K), 0.0011075 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:39.265-0800: [CMS-concurrent-sweep-start]
2020-10-26T00:11:39.265-0800: [CMS-concurrent-sweep: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:39.265-0800: [CMS-concurrent-reset-start]
2020-10-26T00:11:39.266-0800: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:39.283-0800: [GC (Allocation Failure) 2020-10-26T00:11:39.283-0800: [ParNew: 139776K->139776K(157248K), 0.0000339 secs]2020-10-26T00:11:39.283-0800: [CMS: 337622K->349387K(349568K), 0.0500378 secs] 477398K->350693K(506816K), [Metaspace: 2673K->2673K(1056768K)], 0.0501582 secs] [Times: user=0.05 sys=0.00, real=0.05 secs] 
2020-10-26T00:11:39.334-0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 349387K(349568K)] 351311K(506816K), 0.0002769 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:39.334-0800: [CMS-concurrent-mark-start]
2020-10-26T00:11:39.335-0800: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:39.335-0800: [CMS-concurrent-preclean-start]
creat: 10092
2020-10-26T00:11:39.337-0800: [CMS-concurrent-preclean: 0.002/0.002 secs] [Times: user=0.01 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:39.337-0800: [CMS-concurrent-abortable-preclean-start]
2020-10-26T00:11:39.337-0800: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:39.337-0800: [GC (CMS Final Remark) [YG occupancy: 19958 K (157248 K)]2020-10-26T00:11:39.337-0800: [Rescan (parallel) , 0.0003840 secs]2020-10-26T00:11:39.337-0800: [weak refs processing, 0.0000246 secs]2020-10-26T00:11:39.337-0800: [class unloading, 0.0002321 secs]2020-10-26T00:11:39.338-0800: [scrub symbol table, 0.0003657 secs]2020-10-26T00:11:39.338-0800: [scrub string table, 0.0002549 secs][1 CMS-remark: 349387K(349568K)] 369346K(506816K), 0.0014016 secs] [Times: user=0.00 sys=0.01, real=0.00 secs] 
Heap
 par new generation   total 157248K, used 19958K [0x00000007a0000000, 0x00000007aaaa0000, 0x00000007aaaa0000)
  eden space 139776K,  14% used [0x00000007a0000000, 0x00000007a137dbc0, 0x00000007a8880000)
2020-10-26T00:11:39.339-0800: [CMS-concurrent-sweep-start]
  from space 17472K,   0% used [0x00000007a8880000, 0x00000007a8880000, 0x00000007a9990000)
  to   space 17472K,   0% used [0x00000007a9990000, 0x00000007a9990000, 0x00000007aaaa0000)
 concurrent mark-sweep generation total 349568K, used 349387K [0x00000007aaaa0000, 0x00000007c0000000, 0x00000007c0000000)
 Metaspace       used 2680K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 292K, capacity 386K, committed 512K, reserved 1048576K
```

### 1g
```log
start
2020-10-26T00:11:44.702-0800: [GC (Allocation Failure) 2020-10-26T00:11:44.702-0800: [ParNew: 279616K->34943K(314560K), 0.0376791 secs] 279616K->82888K(1013632K), 0.0377729 secs] [Times: user=0.07 sys=0.22, real=0.04 secs] 
2020-10-26T00:11:44.795-0800: [GC (Allocation Failure) 2020-10-26T00:11:44.795-0800: [ParNew: 314548K->34944K(314560K), 0.0411898 secs] 362494K->158731K(1013632K), 0.0412712 secs] [Times: user=0.08 sys=0.25, real=0.04 secs] 
2020-10-26T00:11:44.878-0800: [GC (Allocation Failure) 2020-10-26T00:11:44.878-0800: [ParNew: 314560K->34944K(314560K), 0.0450164 secs] 438347K->229988K(1013632K), 0.0450996 secs] [Times: user=0.42 sys=0.03, real=0.05 secs] 
2020-10-26T00:11:44.973-0800: [GC (Allocation Failure) 2020-10-26T00:11:44.973-0800: [ParNew: 314560K->34943K(314560K), 0.0518335 secs] 509604K->315356K(1013632K), 0.0519718 secs] [Times: user=0.49 sys=0.02, real=0.05 secs] 
2020-10-26T00:11:45.060-0800: [GC (Allocation Failure) 2020-10-26T00:11:45.060-0800: [ParNew: 314559K->34942K(314560K), 0.0468419 secs] 594972K->392104K(1013632K), 0.0469212 secs] [Times: user=0.43 sys=0.03, real=0.04 secs] 
2020-10-26T00:11:45.107-0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 357161K(699072K)] 397802K(1013632K), 0.0002677 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:45.107-0800: [CMS-concurrent-mark-start]
2020-10-26T00:11:45.110-0800: [CMS-concurrent-mark: 0.002/0.002 secs] [Times: user=0.01 sys=0.00, real=0.01 secs] 
2020-10-26T00:11:45.110-0800: [CMS-concurrent-preclean-start]
2020-10-26T00:11:45.111-0800: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:45.111-0800: [CMS-concurrent-abortable-preclean-start]
2020-10-26T00:11:45.144-0800: [GC (Allocation Failure) 2020-10-26T00:11:45.144-0800: [ParNew: 314558K->34943K(314560K), 0.0483775 secs] 671720K->470831K(1013632K), 0.0484585 secs] [Times: user=0.45 sys=0.03, real=0.05 secs] 
2020-10-26T00:11:45.232-0800: [GC (Allocation Failure) 2020-10-26T00:11:45.232-0800: [ParNew: 314559K->34942K(314560K), 0.0470540 secs] 750447K->543673K(1013632K), 0.0471372 secs] [Times: user=0.44 sys=0.03, real=0.04 secs] 
2020-10-26T00:11:45.334-0800: [GC (Allocation Failure) 2020-10-26T00:11:45.334-0800: [ParNew2020-10-26T00:11:45.387-0800: [CMS-concurrent-abortable-preclean: 0.007/0.276 secs] [Times: user=1.52 sys=0.09, real=0.27 secs] 
: 314558K->34943K(314560K), 0.0545129 secs] 823289K->631531K(1013632K), 0.0545959 secs] [Times: user=0.51 sys=0.03, real=0.05 secs] 
2020-10-26T00:11:45.389-0800: [GC (CMS Final Remark) [YG occupancy: 40680 K (314560 K)]2020-10-26T00:11:45.389-0800: [Rescan (parallel) , 0.0003806 secs]2020-10-26T00:11:45.389-0800: [weak refs processing, 0.0000347 secs]2020-10-26T00:11:45.390-0800: [class unloading, 0.0002181 secs]2020-10-26T00:11:45.390-0800: [scrub symbol table, 0.0002982 secs]2020-10-26T00:11:45.390-0800: [scrub string table, 0.0002072 secs][1 CMS-remark: 596587K(699072K)] 637268K(1013632K), 0.0012689 secs] [Times: user=0.00 sys=0.00, real=0.01 secs] 
2020-10-26T00:11:45.390-0800: [CMS-concurrent-sweep-start]
2020-10-26T00:11:45.392-0800: [CMS-concurrent-sweep: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:45.392-0800: [CMS-concurrent-reset-start]
2020-10-26T00:11:45.394-0800: [CMS-concurrent-reset: 0.002/0.002 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:45.426-0800: [GC (Allocation Failure) 2020-10-26T00:11:45.426-0800: [ParNew: 314559K->34943K(314560K), 0.0156079 secs] 778688K->580306K(1013632K), 0.0156913 secs] [Times: user=0.15 sys=0.00, real=0.02 secs] 
2020-10-26T00:11:45.442-0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 545362K(699072K)] 585887K(1013632K), 0.0002621 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:45.442-0800: [CMS-concurrent-mark-start]
2020-10-26T00:11:45.443-0800: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:45.443-0800: [CMS-concurrent-preclean-start]
2020-10-26T00:11:45.445-0800: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.01 sys=0.00, real=0.00 secs] 
2020-10-26T00:11:45.445-0800: [CMS-concurrent-abortable-preclean-start]
2020-10-26T00:11:45.480-0800: [GC (Allocation Failure) 2020-10-26T00:11:45.480-0800: [ParNew: 314559K->34943K(314560K), 0.0269907 secs] 859922K->656726K(1013632K), 0.0270965 secs] [Times: user=0.26 sys=0.01, real=0.02 secs] 
creat: 11464
Heap
 par new generation   total 314560K, used 278110K [0x0000000780000000, 0x0000000795550000, 0x0000000795550000)
  eden space 279616K,  86% used [0x0000000780000000, 0x000000078ed77dc8, 0x0000000791110000)
  from space 34944K,  99% used [0x0000000791110000, 0x000000079332fc70, 0x0000000793330000)
  to   space 34944K,   0% used [0x0000000793330000, 0x0000000793330000, 0x0000000795550000)
 concurrent mark-sweep generation total 699072K, used 621783K [0x0000000795550000, 0x00000007c0000000, 0x00000007c0000000)
 Metaspace       used 2680K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 292K, capacity 386K, committed 512K, reserved 1048576K
```

### 2g
```log
start
2020-10-26T00:11:51.092-0800: [GC (Allocation Failure) 2020-10-26T00:11:51.092-0800: [ParNew: 559232K->69887K(629120K), 0.0680514 secs] 559232K->153283K(2027264K), 0.0681496 secs] [Times: user=0.11 sys=0.42, real=0.07 secs] 
2020-10-26T00:11:51.253-0800: [GC (Allocation Failure) 2020-10-26T00:11:51.253-0800: [ParNew: 629119K->69888K(629120K), 0.0659237 secs] 712515K->266179K(2027264K), 0.0660093 secs] [Times: user=0.14 sys=0.39, real=0.06 secs] 
2020-10-26T00:11:51.403-0800: [GC (Allocation Failure) 2020-10-26T00:11:51.403-0800: [ParNew: 629120K->69888K(629120K), 0.0817989 secs] 825411K->392288K(2027264K), 0.0818941 secs] [Times: user=0.76 sys=0.04, real=0.08 secs] 
2020-10-26T00:11:51.558-0800: [GC (Allocation Failure) 2020-10-26T00:11:51.558-0800: [ParNew: 629120K->69887K(629120K), 0.0882125 secs] 951520K->528579K(2027264K), 0.0882937 secs] [Times: user=0.82 sys=0.05, real=0.09 secs] 
2020-10-26T00:11:51.724-0800: [GC (Allocation Failure) 2020-10-26T00:11:51.724-0800: [ParNew: 629119K->69887K(629120K), 0.0770460 secs] 1087811K->652386K(2027264K), 0.0771320 secs] [Times: user=0.72 sys=0.04, real=0.08 secs] 
creat: 10512
Heap
 par new generation   total 629120K, used 92661K [0x0000000740000000, 0x000000076aaa0000, 0x000000076aaa0000)
  eden space 559232K,   4% used [0x0000000740000000, 0x000000074163d570, 0x0000000762220000)
  from space 69888K,  99% used [0x0000000766660000, 0x000000076aa9ffa0, 0x000000076aaa0000)
  to   space 69888K,   0% used [0x0000000762220000, 0x0000000762220000, 0x0000000766660000)
 concurrent mark-sweep generation total 1398144K, used 582498K [0x000000076aaa0000, 0x00000007c0000000, 0x00000007c0000000)
 Metaspace       used 2680K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 292K, capacity 386K, committed 512K, reserved 1048576K
```

### 4g
```log
start
2020-10-26T00:11:57.446-0800: [GC (Allocation Failure) 2020-10-26T00:11:57.446-0800: [ParNew: 681600K->85184K(766784K), 0.0814891 secs] 681600K->179159K(4109120K), 0.0815848 secs] [Times: user=0.19 sys=0.47, real=0.08 secs] 
2020-10-26T00:11:57.630-0800: [GC (Allocation Failure) 2020-10-26T00:11:57.630-0800: [ParNew: 766784K->85184K(766784K), 0.0823626 secs] 860759K->311138K(4109120K), 0.0824464 secs] [Times: user=0.19 sys=0.48, real=0.08 secs] 
2020-10-26T00:11:57.814-0800: [GC (Allocation Failure) 2020-10-26T00:11:57.814-0800: [ParNew: 766784K->85184K(766784K), 0.0966878 secs] 992738K->450753K(4109120K), 0.0967754 secs] [Times: user=0.91 sys=0.05, real=0.10 secs] 
2020-10-26T00:11:58.011-0800: [GC (Allocation Failure) 2020-10-26T00:11:58.011-0800: [ParNew: 766784K->85184K(766784K), 0.1025032 secs] 1132353K->596154K(4109120K), 0.1025886 secs] [Times: user=0.96 sys=0.05, real=0.10 secs] 
creat: 10290
Heap
 par new generation   total 766784K, used 112737K [0x00000006c0000000, 0x00000006f4000000, 0x00000006f4000000)
  eden space 681600K,   4% used [0x00000006c0000000, 0x00000006c1ae85b8, 0x00000006e99a0000)
  from space 85184K, 100% used [0x00000006e99a0000, 0x00000006eecd0000, 0x00000006eecd0000)
  to   space 85184K,   0% used [0x00000006eecd0000, 0x00000006eecd0000, 0x00000006f4000000)
 concurrent mark-sweep generation total 3342336K, used 510970K [0x00000006f4000000, 0x00000007c0000000, 0x00000007c0000000)
 Metaspace       used 2680K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 292K, capacity 386K, committed 512K, reserved 1048576K
```

### 总结
以下结论为 CMS GC 在上面声明的环境下测量得出
1. 随着内存达到 256m 后, 应用已经不出现OOM了, 说明增大内存可以防止在内存过小时大量生成存活对象导致的OOM;
2. 内存 512m Full GC 次数明细比256m 低, 而且在内存达到2g之后, 不再出现 Full GC (表示 CMS 没有参与 GC), 说明增大内存可以减少 Full GC 的频率;
3. YoungGC(ParNew) 随着内存的增大, 生成对象数没有增加, 说明不是内存越大性能越好; 但是可以降低 GC 的频率, 但是单次 GC 时间会变长; 而 CMS GC 各阶段时间基本为0, 可能这个案例无法对 CMS 进行有效测试;
4. 在 4G 内存下 CMS GC 和 ParallelGC 都只有 YoungGC, 而 GMS 参数下对象创建数明细好于 ParallelGC 参数, 经过笔者在上面环境下的多次测试结果对象创建数和上面所列日志基本相同, 但是 ParallelGC 的总 GC 时间的确少于 ParNew 的总 GC 时间, 符合其吞吐量优先的设定(吞吐量 = 运行用户代代码时间/（运行用户代码时间+垃圾收集时间))

## G1

由于 G1 日志过多 请看 resource/log 下 G1GC 开头的文件
### 128m
```log
```

#### 现象
OOM

### 256m
```log
```

### 512m
```log
```

### 1g
```log
```

### 2g
```log
```

### 4g
```log
```

#### 总结
以下结论为 G1 GC 在上面声明的环境下测量得出
1. 随着内存达到 512m 后, 应用已经不出现OOM了, 说明增大内存可以防止在内存过小时大量生成存活对象导致的OOM;
2. 随着内存的增大, GC 日志越来越少, 说明增大内存可以减少 GC 的频率;
3. 随着内存的增大, 生成对象数没有明显增加, 说明不是内存越大性能越好;
4. 在 4G 内存下, 获得所以 GC 版本创建对象最大值, 在大内存下没有出现性能下降的问题;

# Gateway-server-0.0.1-SNAPSHOT.jar

## wrk 测试

### 并行

### CMS

### G1
