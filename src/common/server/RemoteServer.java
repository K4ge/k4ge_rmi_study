package common.server;
import java.rmi.Naming;                     //用于绑定类
import java.rmi.registry.LocateRegistry;    //用于创建registry


//rmi服务器
public class RemoteServer {
    public static void main(String[] args) throws Exception {
        //本地新建一个hello对象
        RemoteHelloWorld h = new RemoteHelloWorld();
        //创建一个registry服务
        LocateRegistry.createRegistry(1099);
        //将hello对象绑到registry服务中
        Naming.rebind("rmi://0.0.0.0/Hello",h);
        //成功输出server准备中
        System.out.println("server ready...");
    }
}
