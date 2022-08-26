package ru.job4j.rest.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Аккаунт сотрудника
 */
@Getter
@Setter
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    /**
     * Имя
     */
    @Column(name = "name")
    private String name;
    /**
     * Фамилия
     */
    @Column(name = "lastname")
    private String lastname;
    /**
     * ИНН
     */
    @Column(name = "inn")
    private String inn;
    /**
     * Дата найма
     */
    @Column(name = "created")
    private Timestamp created;
    /**
     * Список аккаунтов, которыми пользуется сотрудник
     */
    @Transient
    private Set<Person> persons = new HashSet<>();
}
