package singletonePatter.case1.setp1.singleton;

/*************************************
 * 현재 문제점
 * for문이 빠르게돌면서 한번에 여러개를 만들기 때문에 new로 다처리해버려서 싱글톤 의미가 없어진다.
 *************************************/
public class TestPattern2 {


    private static int nNum = 0;

    public static void main(String[] args) {
        Runnable task = () -> {
            try {
                nNum++;
                Database2 database2 = Database2.getInstance(nNum + "번째 Database");
                System.out.println("this is the " + database2.getName() + "!!!");
            } catch (Exception e) {}
        };
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(task);
            t.start();
        }
    }
}
