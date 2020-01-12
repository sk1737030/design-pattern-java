package DecoratorPattern.case2.decorate;

import DecoratorPattern.case2.step1.Student;

public class Science extends StudentDecorator {
    public Student student;

    public Science(Student student) {
        this.student = student;
    }

    @Override
    public String getDescription() {
        return student.getDescription() + " + Like Science";
    }

    public void calculateStuff() {
        System.out.println("Science  calculation!");
    }
}
