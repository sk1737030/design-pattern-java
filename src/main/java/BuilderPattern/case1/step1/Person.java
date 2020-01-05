package BuilderPattern.case1.step1;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Person {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String addressOne;
    private String addressTwo;
    private String sex;
    private boolean driverLicence;
    private boolean married;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, LocalDate birthDate, String addressOne, String addressTwo, String sex, boolean driverLicence, boolean married) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.addressOne = addressOne;
        this.addressTwo = addressTwo;
        this.sex = sex;
        this.driverLicence = driverLicence;
        this.married = married;
    }


}
