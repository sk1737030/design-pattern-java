package BridgePattern.case1.step1;

public class RobotModel2 implements IRobot {
    @Override
    public void powerOn() {
        System.out.println("Type1 : power on");
    }

    @Override
    public void powerOff() {
        System.out.println("type1 : power off");
    }
}
