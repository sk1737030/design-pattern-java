package BridgePattern.case1.step2;

public class RobotModel2 implements IRobot {
    @Override
    public void powerOn() {
        System.out.println("Type1 : power on");
    }

    @Override
    public void powerOff() {
        System.out.println("type1 : power off");
    }

    @Override
    public void doCook() {
        System.out.println("강제로 요리추가..");
    }
}
