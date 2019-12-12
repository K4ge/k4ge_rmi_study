package common.client;
import common.server.IRemoteHelloWorld; //从服务端获得helloword接口
import java.rmi.Naming;                 //通过rmi的Naming类来远程获得服务

public class RemoteClient {
    public static void main(String[] args) throws Exception {
        //通过rmi远程获得helloword类
        IRemoteHelloWorld hello = (IRemoteHelloWorld) Naming.lookup("rmi://127.0.0.1:1099/Hello");
        //调用hello方法
        String ret = hello.hello();
        //输出返回结果
        System.out.println(ret);
    }
}
