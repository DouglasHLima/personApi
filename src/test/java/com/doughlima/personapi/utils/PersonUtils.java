package com.doughlima.personapi.utils;

import com.doughlima.personapi.dto.request.PersonDTO;
import com.doughlima.personapi.entity.Person;


import java.time.LocalDate;
import java.util.Collections;

public class PersonUtils {

    public static final String FIRST_NAME = "Emanuel";
    public static final String LAST_NAME = "Alves";
    public static final String CPF_NUMBER = "902.369.134-25";
    public static final long PERSON_ID = 1L;
    public static final LocalDate BIRTH_DATE = LocalDate.of(1990, 6,1);

    public static PersonDTO createFakeDTO() {
        return PersonDTO.builder()
                .firstName(FIRST_NAME)
                .lastName(LAST_NAME)
                .cpf(CPF_NUMBER)
                .birthDate("01-06-1990")
                .phones(Collections.singletonList(PhoneUtils.createFakeDTO()))
                .build();
    }

    public static Person createFakeEntity() {
        return Person.builder()
                .id(PERSON_ID)
                .firstName(FIRST_NAME)
                .lastName(LAST_NAME)
                .cpf(CPF_NUMBER)
                .birthDate(BIRTH_DATE)
                .phones(Collections.singletonList(PhoneUtils.createFakeEntity()))
                .build();
    }
}
