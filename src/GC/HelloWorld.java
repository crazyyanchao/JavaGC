package GC;

/**
 * Created by root on 16-6-20.
 */
public class HelloWorld {
    public static void main(String args[]) throws Exception{
        int i=0;
        while(true){//在while(true)循环中每隔5秒new一个长度为1024的byte数组
            i++;
            Thread.sleep(5000);

            byte tem[]=new byte[1024];
            System.out.println("Hello World :" +i);
        }
    }

}
