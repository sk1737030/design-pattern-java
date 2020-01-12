package DecoratorPattern.case2.decorate;

import DecoratorPattern.case2.step1.Student;

public class Art extends StudentDecorator {

    public Student student;

    public Art(Student student) {
        this.student = student;
    }

    @Override
    public String getDescription() {
        return student.getDescription() + " + Like Science";
    }

    public void calculateStuff() {
        System.out.println("Art calculation!");
    }
}
