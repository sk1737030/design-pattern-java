package DecoratorPattern.case1.step1.decorate;

import DecoratorPattern.case1.step1.base.IceCream;

// 첨가물을 나타내는 Abstract 클래스 (decorate 클래스)
// 데코레이트  클래스의 형식은 그 클래스가 감싸고 있는 클래스의 형식을 반영한다.
// 그러므로 , icecream  객체가 들어갈 자리에 들어 가 수있도록 icecream을 상속한다.
public abstract class Decorate extends IceCream {

    // 설명을 추가해야 하므로 서브클래스에서 꼭 구현하도록 강제한다.
    public abstract String getDescription();
    // 비용은 이미 추상메소드이므로 서브클래스에서 꼭 구현해야한다.
}
