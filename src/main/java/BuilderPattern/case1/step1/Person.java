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
}
