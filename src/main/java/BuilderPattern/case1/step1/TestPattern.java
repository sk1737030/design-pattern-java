package BuilderPattern.case1.step1;

import BuilderPattern.case1.step2.Person;

public class TestPattern {
    public static void main(String[] args) {
        Person p1 = createPersonForTesting();
        System.out.println(p1.getFirstName());
    }

    public static Person createPersonForTesting() {
        Person person = new Person();
        person.setFirstName("First Name");
        person.setLastName("LastName");
        person.setAddressOne("Address1");
        person.setAddressTwo("address2");
        person.setSex("Man");
        person.setDriverLicence(false);
        person.setMarried(true);
        //.... 멤버 변수가 많드면 변수에 값 세팅이 어려워진다.
        return person;
    }
}
