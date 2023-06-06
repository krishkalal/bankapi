
package com.boa.customerapi.dtos;

import com.boa.customerapi.models.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IndividualInput {

    private long accountNo;

    private FullNameInput name;

    private String email;

    private String password;

    private long contactNo;

    private Gender gender;

    private LocalDate dob;
}