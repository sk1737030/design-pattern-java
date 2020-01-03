package case1.setp1.logwriter;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class LogWriter implements AutoCloseable{
    private static LogWriter singleton = new LogWriter();
    private static BufferedWriter bw;

    private LogWriter() {
        try{
            bw = new BufferedWriter((new FileWriter("log.txt")));
        }catch(Exception e) {}
    }

    public static LogWriter getInstacne(){
        return singleton;
    }

    public synchronized void log(String str) {
        try{
            bw.write(str + "\n");
            bw.flush();
        }catch (Exception e) {

        }
    }

    @Override
    public void close() throws Exception {
        try{
            bw.close();
        }catch(Exception e){}
    }
}
