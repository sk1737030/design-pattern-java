package DecoratorPattern.case1.step1.base;

public class IceCreamCone extends IceCream {

    public IceCreamCone() {
        this.description = "아이스크림 zhs";
    }

    @Override
    public int price() {
        return 1200;
    }
}
