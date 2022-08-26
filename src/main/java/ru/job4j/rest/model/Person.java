package ru.job4j.rest.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Сотрудник
 */
@Getter
@Setter
@Entity
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @Column(name = "employee_id")
    private int employeeId;

    public static Person of(int id, String login, String password) {
        Person person = new Person();
        person.setId(id);
        person.setLogin(login);
        person.setPassword(password);
        return person;
    }
}
