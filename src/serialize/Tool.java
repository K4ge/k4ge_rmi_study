package serialize;
import java.io.*;

//序列化工具类
public class Tool {
    //序列化对象
    public Object obj;

    //初始化，传入对象
    public Tool(final Object obj) {
        this.obj = obj;
    }

    //序列化方法，将obj转换为byte流
    public byte[] serialize() throws Exception{
        //获取Byte输出流
        ByteArrayOutputStream btout = new ByteArrayOutputStream();
        //利用装饰方法获取obj输出流
        ObjectOutputStream objOut = new ObjectOutputStream(btout);
        //将对象写入obj输出流
        objOut.writeObject(obj);
        //将obj输出流转换为byte字节数组输出
        return btout.toByteArray();
    }

    //序列化方法2，将参数obj转换为byte流
    public byte[] serialize(final Object obj) throws Exception{
        ByteArrayOutputStream btout = new ByteArrayOutputStream();
        ObjectOutputStream objOut = new ObjectOutputStream(btout);
        objOut.writeObject(obj);
        return btout.toByteArray();
    }

    //反序列化方法，将byte流转换为obj对象，调用readObject反序列化方法。
    public Object unserialize(final byte[] serialized) throws Exception {
        //获取byte输入流
        ByteArrayInputStream btin = new ByteArrayInputStream(serialized);
        //利用装饰方法获取obj输入流
        ObjectInputStream objIn = new ObjectInputStream(btin);
        //从obj输入流调用readObject方法获取Object对象
        return objIn.readObject();
    }
}
