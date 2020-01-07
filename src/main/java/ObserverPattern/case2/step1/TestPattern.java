package ObserverPattern.case2.step1;

public class TestPattern {

    public static void main(String[] args) {

        PlayController pager = new PlayController();
        Observer myClassA = new MyClassA();
        Observer myClassB = new MyClassB();

        // 구독자(옵저버) 등록
        pager.addObserver(myClassA);
        pager.addObserver(myClassB);

        // 메세지 등록
        pager.setFlag(false);

        // 구독 해지
        pager.deleteObserver(myClassB);

        System.out.println("-----------------------------------");

        // 메세지 등록
        pager.setFlag(true);
    }
}
