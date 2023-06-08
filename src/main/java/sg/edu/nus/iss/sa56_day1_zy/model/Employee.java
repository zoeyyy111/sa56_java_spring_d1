package sg.edu.nus.iss.sa56_day1_zy.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//file must start with capital letter and .java
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Employee {
    //variable must start with lower case for JPA, second word Capital
    private String id;
    private String firstName;
    private String lastName;

    //with lombok , not need getter and setter
}
