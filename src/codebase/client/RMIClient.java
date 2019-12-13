package codebase.client;
import java.rmi.Naming;
import java.rmi.Remote;
import java.util.List;
import java.util.ArrayList;
import codebase.server.ICalc;
import java.io.Serializable;

public class RMIClient implements Serializable{

    public void lookup() throws Exception {
        //远程获取Calc类
        ICalc r = (ICalc) Naming.lookup("rmi://127.0.0.1:1099/refObj");

        //准备Payload
        List<Integer> li = new Payload();
        //添加几个变量
        li.add(3);
        li.add(4);

        //把我们Payload当做参数，并调用远程sum方法
        //远程服务器会通过codebase寻找我们的payload类，并反序列化执行
        System.out.println(r.sum(li));

    }

    public void list() throws Exception {
        String[] ss = Naming.list("rmi://127.0.0.1:1099/");
        for(String s : ss) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) throws Exception {
        //调用lookup方法，执行
        new RMIClient().lookup();
    }
}
