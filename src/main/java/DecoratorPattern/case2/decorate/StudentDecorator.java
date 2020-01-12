package DecoratorPattern.case2.decorate;

import DecoratorPattern.case2.step1.Student;

public abstract class StudentDecorator extends Student {

    // 설명을 추가해야함으로 꼭 서브클래스에서 꼭 구현하도록 강제한다.
    public abstract String getDescription();
}
