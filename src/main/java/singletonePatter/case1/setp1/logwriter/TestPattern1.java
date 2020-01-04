package singletonePatter.case1.setp1.logwriter;

public class TestPattern1 {
    public static void main(String[] args) {
        LogWriter logger;

        logger = LogWriter.getInstacne();
        logger.log("홍길동");
        logger = LogWriter.getInstacne();
        logger.log("전우치");
    }
}
