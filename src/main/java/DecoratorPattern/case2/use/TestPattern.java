package DecoratorPattern.case2.use;

import DecoratorPattern.case2.decorate.Art;
import DecoratorPattern.case2.decorate.Science;
import DecoratorPattern.case2.step1.AmericanStudent;
import DecoratorPattern.case2.step1.Student;

public class TestPattern {
    public static void main(String[] args) {
        Student g1 = new AmericanStudent();
        System.out.println(g1);

        Student g2 = new Science(g1);

        Art g3 = new Art(g2);
        System.out.println(g3.getDescription());
    }
}
