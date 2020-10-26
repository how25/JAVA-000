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
最后多次 Full GC 几乎没有释放内存 说明没有可用内存和可释放内存了
#### 内存分析
eden 区 100% from 区 97% tenured 区 99%
说明可用内存都满了而 to 区无法容纳剩余对象

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

```

### m
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

## CMS

### 128m
```log
```

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

## G1

### 128m
```log
```

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

# Gateway-server-0.0.1-SNAPSHOT.jar

## wrk 测试

### 并行

### CMS

### G1
