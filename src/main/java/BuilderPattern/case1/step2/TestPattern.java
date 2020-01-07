package BuilderPattern.case1.step2;


import java.time.LocalDate;
import java.time.Month;

public class TestPattern {
    public static void main(String[] args) {
        Person p1 = Person.builder() // static 메소드라서 따로 선언없이 바로 호출 가능
                .firstName("FirstName") // Personbuilder를 return 한다 그래서 계속 .을 찍을수 있음.
                .lastName("LastName") // 앞에 this로 자기자신을 가르키기 때문에 또 .lastName 가능
                .addressOne("금천구 가산동 월드")
                .addressTwo("AddressTwo")
                .birthDate(LocalDate.of(1995, Month.APRIL, 13))
                .sex("male")
                .driverLicence(true)
                .married(true)
                .build();

        System.out.println(p1.getAddressOne());

        System.out.println(p1.getFirstName());
    }
}
