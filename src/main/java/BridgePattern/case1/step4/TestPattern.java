package BridgePattern.case1.step4;


/**
 * 기능을 추가하다보니 robot1 에는 필요없는 기능들이 추가될수도 있따..
 * 강제로 구현해야하는 구조임..
 */


public class TestPattern {
    public static void main(String[] args) {
        IRobot robot1 = new RobotModel1();
        Cook work = new Cook(robot1);
        work.powerOn();
        work.doCook();
        work.powerOff();

        System.out.println("-------------------------------");

        IRobot robot2 = new RobotModel1();
        Clean work2 = new Clean(robot2);
        work2.powerOn();
        work2.powerOff();

    }
}
