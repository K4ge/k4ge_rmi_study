package codebase.server;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.List;
import java.rmi.Remote;

//服务器
public class RemoteServer {
    private void start() throws Exception {
        //需要开启SecurityManager才能使用codebase
        //检测SecurityManager是否打开
        if(System.getSecurityManager() == null) {
            System.out.println("setup SecurityManager");
            System.setSecurityManager(new SecurityManager());
        }

        //创建一个Calc对象，并进行绑定
        Calc h = new Calc();

        LocateRegistry.createRegistry(1099);
        Naming.rebind("refObj",h);
    }

    public static void main(String[] args) throws Exception {
        new RemoteServer().start();
        System.out.println("server ready...");
    }
}
