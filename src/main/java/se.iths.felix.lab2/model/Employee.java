package main.java.se.iths.felix.lab2.model;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {
    private final String firstName;
    private final String lastName;
    private final String email;
    private final LocalDate hireDate;
    private final String sectionName;
    private Passcard passCard;

    public Employee(String firstName, String lastName, String email, LocalDate hireDate, Section section) {
        this.firstName = Objects.requireNonNull(firstName, "First name can not be null");
        this.lastName = Objects.requireNonNull(lastName, "Last name can not be null");
        this.email = Objects.requireNonNull(email, "Email can not be null");
        this.hireDate = Objects.requireNonNull(hireDate, "hire date can not be null");
        this.sectionName = Objects.requireNonNull(section.getName(), "Section name can not be null");
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public String getSectionName() {
        return sectionName;
    }

    public Passcard getPassCard() {
        return passCard;
    }

    public void setPassCard(Passcard passCard) {
        this.passCard = passCard;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", hireDate=" + hireDate +
                ", sectionName=" + sectionName +
                ", passCard=" + passCard +
                '}';
    }
}
