package DecoratorPattern.case1.step1;

import DecoratorPattern.case1.step1.base.IceCream;
import DecoratorPattern.case1.step1.base.IceCreamCake;
import DecoratorPattern.case1.step1.base.IceCreamCone;
import DecoratorPattern.case1.step1.base.IcePop;
import DecoratorPattern.case1.step1.decorate.Melone;
import DecoratorPattern.case1.step1.decorate.Strawberry;

public class TestPattern {
    public static void main(String[] args) {
        IceCream iceCream = new IceCreamCone();
        System.out.println(iceCream.getDescription() + " cost : " + iceCream.price());

        // 아래와 같은 식으로 기본에 첨가물을 wrapping해서 가격과 설명을 추가할 수 있다.
        IceCream iceCream1 = new IceCreamCake();
        iceCream1 = new Strawberry(iceCream1);
        System.out.println(iceCream1.getDescription() + "Cost : " + iceCream1.price());

        IceCream iceCream2 = new Melone(new Strawberry(new IcePop()));
        System.out.println(iceCream2.getDescription() + " Cost : " + iceCream2.price());
    }
}
