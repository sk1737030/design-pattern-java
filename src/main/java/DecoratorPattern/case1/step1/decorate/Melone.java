package DecoratorPattern.case1.step1.decorate;

import DecoratorPattern.case1.step1.base.IceCream;

// strawberry는 decorate이기때문에 데코레이트를 상속받는다.
public class Melone extends Decorate {

    // warpping 하고자하는 음료를 지정하기위한 instance 변수
    IceCream iceCream;


    public Melone(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " 멜론  ";
    }

    @Override
    public int price() {
        return 1500 + iceCream.price();
    }
}
