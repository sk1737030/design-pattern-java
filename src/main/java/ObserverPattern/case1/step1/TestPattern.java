package ObserverPattern.case1.step1;

public class TestPattern {

    public static void main(String[] args) {

        PlayController controller = new PlayController();
        MyClassA myClassA = new MyClassA(controller);
        MyClassB myClassB = new MyClassB(controller);

        System.out.println("------모든 클래스일시정지---------");
        controller.setFlag(false);

        System.out.println();

        System.out.println("------모든 클래스 다시 시작-------");
        controller.setFlag(true);

        System.out.println();
    }
}
