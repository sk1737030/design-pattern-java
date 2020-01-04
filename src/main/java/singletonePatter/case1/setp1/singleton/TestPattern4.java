package singletonePatter.case1.setp1.singleton;

/*************************************
 * static변수는 jvm이 먼저 생성 시키기 때문에 이것을 이용하여 syncronized를 안쓰고 싱글톤을 구현
 *************************************/
public class TestPattern4 {


    private static int nNum = 0;

    public static void main(String[] args) {
        Runnable task = () -> {
            try {
                nNum++;
                Database4 database4 = Database4.getInstance(nNum + "번째 Database");
                System.out.println("this is the " + database4.getName() + "!!!");
            } catch (Exception e) {}
        };
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(task);
            t.start();
        }
    }
}
