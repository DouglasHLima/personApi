package com.doughlima.personapi.service;

import com.doughlima.personapi.dto.request.PersonDTO;
import com.doughlima.personapi.dto.response.MessageResponseDTO;
import com.doughlima.personapi.entity.Person;
import com.doughlima.personapi.mapper.PersonMapper;
import com.doughlima.personapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PersonService {

    private final PersonMapper personMapper = PersonMapper.INSTANCE;
    private final PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public MessageResponseDTO createPerson(PersonDTO personDTO){
        Person personToSave = personMapper.toModel(personDTO);
        Person savedPerson = personRepository.save(personToSave);
        return MessageResponseDTO
                .builder()
                .message("Created person with ID " + savedPerson.getId())
                .build();
    }
}
