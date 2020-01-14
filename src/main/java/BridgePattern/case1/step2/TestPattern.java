package BridgePattern.case1.step2;


/**
 * 기능을 추가하다보니 robot1 에는 필요없는 기능들이 추가될수도 있따..
 * 강제로 구현해야하는 구조임..
 */


public class TestPattern {
    public static void main(String[] args) {
        IRobot robot1 = new RobotModel1();
        robot1.powerOn();
        robot1.powerOff();
        robot1.doCook();
        System.out.println("-------------------------------------");

        IRobot robot2 = new RobotModel2();
        robot2.powerOn();
        robot2.powerOff();
    }
}
