package main.java.se.iths.felix.lab2.model;

import java.util.Objects;

public class Section {
    private final String name;
    private final String city;

    public Section(String name, String city) {
        this.name = Objects.requireNonNull(name, "Section name can not be null");
        this.city = Objects.requireNonNull(city, "Section city can not be null");
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Section{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
