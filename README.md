# JavaGC
编写一个Java应用，在while(true)循环中每隔5秒new一个长度为1024的byte数组。   1. 用jstat gcutil观察java进程执行时各代的变化情况（答案中贴出过程图片）。   2. 用jmap导出java进程的heap，并用jhat观察内存占用排序（用web访问jhat服务，贴出排序图）。   3. 分别使用parallelOldGC及CMS执行程序，打印gc log。（贴出两种不同的GC log）。
