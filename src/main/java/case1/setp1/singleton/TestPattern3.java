package case1.setp1.singleton;

/*************************************
 * 현재 문제점
 * for문이 빠르게돌면서 한번에 여러개를 만들기 때문에 new로 다처리해버려서 싱글톤 의미가 없어진다.
 * 그래서 database3에 syncronized 를 추가하여 해결.. 하지만 문제점이있다 syncronized는 스레드가 실행하기위해
 * 대기를 하기 때문에 속도가 너무느림..
 *************************************/
public class TestPattern3 {


    private static int nNum = 0;

    public static void main(String[] args) {
        Runnable task = () -> {
            try {
                nNum++;
                Database3 database3 = Database3.getInstance(nNum + "번째 Database");
                System.out.println("this is the " + database3.getName() + "!!!");
            } catch (Exception e) {}
        };
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(task);
            t.start();
        }
    }
}
