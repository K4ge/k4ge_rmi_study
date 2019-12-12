package common.server;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject; //rmi实现类需要继承自该方法


//helloworld接口的实现类
public class RemoteHelloWorld extends UnicastRemoteObject implements IRemoteHelloWorld{
    //设置一个计数器
    private int number;

    protected RemoteHelloWorld() throws RemoteException {
        super();
        //计数器初始化为0
        number = 0;
    }

    public String hello() throws RemoteException {
        //每调用一次，计数器加1
        number ++;
        //输出调用次数
        System.out.println("number of call = " + number);
        return "Hello world";
    }
}
