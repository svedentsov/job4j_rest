package ru.job4j.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.job4j.rest.model.Person;
import ru.job4j.rest.service.PersonService;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    /**
     * Получить всех сотрудников.
     */
    @GetMapping
    public List<Person> findAll() {
        return personService.findAll();
    }

    /**
     * Получить сотрудника по ID.
     */
    @GetMapping("/{id}")
    public ResponseEntity<Person> findById(@PathVariable int id) {
        Person person = this.personService.findById(id);
        return person == null
                ? new ResponseEntity<>(new Person(), HttpStatus.NOT_FOUND)
                : new ResponseEntity<>(person, HttpStatus.OK);
    }

    /**
     * Создать сотрудника.
     */
    @PostMapping
    public ResponseEntity<Person> create(@RequestBody Person person) {
        return new ResponseEntity<>(
                this.personService.save(person),
                HttpStatus.CREATED
        );
    }

    /**
     * Обновить сотрудника.
     */
    @PutMapping
    public ResponseEntity<Void> update(@RequestBody Person person) {
        this.personService.save(person);
        return ResponseEntity.ok().build();
    }

    /**
     * Удалить сотрудника по ID.
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id) {
        this.personService.delete(id);
        return ResponseEntity.ok().build();
    }
}
