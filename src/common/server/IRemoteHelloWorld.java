package common.server;
import java.rmi.Remote;             //rmi接口需要继承自这个类
import java.rmi.RemoteException;    //rmi异常，方法需要进行抛出

//HelloWorld接口
public interface IRemoteHelloWorld extends Remote{
    //hello方法
    public String hello() throws RemoteException;
}
