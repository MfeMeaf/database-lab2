package main.java.se.iths.felix.lab2;

import main.java.se.iths.felix.lab2.model.Employee;
import main.java.se.iths.felix.lab2.model.Passcard;
import main.java.se.iths.felix.lab2.model.Section;

import java.time.LocalDate;
import java.util.List;

class Main {
    static void main() {
        // Create sections
        Section deimos = new Section("Deimos", "Örebro");
        Section proteus = new Section("Proteus", "Stockholm");
        Section phobos = new Section("Phobos", "Örebro");
        Section triton = new Section("Triton", "Stockholm");
        Section nereid = new Section("Nerieid", "Stockholm");

        // Create employees
        Employee felix = new Employee("Felix", "lamu", "felix.lamu@kebab.se", LocalDate.of(2026,11,26), deimos);
        Employee richard = new Employee("Richard", "Ivarsson", "richard.ivarsson@kebab.se", LocalDate.of(2026,11,26), proteus.getName());

        felix.setPassCard(new Passcard(1,LocalDate.of(2026,11,26), LocalDate.of(2027,11,26)));

        List<Section> sectionList = List.of(deimos,proteus,phobos,triton,nereid);
        List<Employee> employees = List.of(felix,richard);

        IO.println("Section(s):");
        for(Section s: sectionList){
            IO.println(s.toString());
        }

        IO.println("Employee(s)");
        for (Employee e : employees){
            IO.println(e.toString());
        }
    }
}