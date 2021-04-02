package com.boot.spring.springbootudemy.entity;


import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "people")
public class PeopleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "people_id")
    private int peopleId;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "department")
    private String department;
    @Column(name = "salary")
    private int salary;

    public PeopleEntity() { }

    public PeopleEntity(String name, String surname, String department, int salary) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PeopleEntity)) return false;
        PeopleEntity peopleEntity = (PeopleEntity) o;
        return salary == peopleEntity.salary && name.equals(peopleEntity.name) && surname.equals(peopleEntity.surname) && Objects.equals(department, peopleEntity.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, department, salary);
    }

    @Override
    public String toString() {
        return "People{" +
                "peopleId=" + peopleId +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

    public int getPeopleId() {
        return peopleId;
    }

    public void setPeopleId(int peopleId) {
        this.peopleId = peopleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}
