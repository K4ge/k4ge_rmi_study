package codebase.server;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;              //List动态数组操作

/**
 * 整数数组累加求和
 * 输入：List<Interger>动态数组
 * 输出：int求和结果
         */
public interface ICalc extends Remote{
    //接口方法
    public Integer sum(List<Integer> params) throws RemoteException;
}
