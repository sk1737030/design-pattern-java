package DecoratorPattern.case1.step1.base;

public abstract class IceCream {
    protected String description = "";

    public String getDescription() {
        return this.description;
    }

    public abstract int price();
}
