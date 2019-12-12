package codebase.server;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import java.rmi.Remote;

//接口实现类
public class Calc extends UnicastRemoteObject implements ICalc{
    //构造函数不需要什么操作
    public Calc() throws RemoteException {}

    public Integer sum(List<Integer> params) throws RemoteException {
        //计数器sum设置为0
        Integer sum = 0;
        //对Interger参数循环累加
        for(Integer param: params) {
            sum += param;
        }
        //返回结果
        return sum;
    }
}
