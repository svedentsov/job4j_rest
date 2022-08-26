package ru.job4j.rest.model;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class Report {
    private int id;
    private String name;
    private Timestamp created;
    private Person person;

    public static Report of(int id, String name, Person person) {
        Report report = new Report();
        report.id = id;
        report.name = name;
        report.person = person;
        report.created = new Timestamp(System.currentTimeMillis());
        return report;
    }
}