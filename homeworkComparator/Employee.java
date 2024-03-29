package de.telran.homeworkComparator;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {
    private String name;
    private String surname;
    private int age;
    private int workingHoursInMonth;

    public Employee(String name, String surname, int age, int workingHoursInMonth) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.workingHoursInMonth = workingHoursInMonth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", workingHoursInMonth=" + workingHoursInMonth +
                '}';
    }

    @Override
    public int compareTo(@NotNull Employee another) {
        // c) - natural order by name, surname, age, workingHoursInMonth - Comparable
        int result = this.name.compareTo(another.name);
        if (result == 0) {
            result = this.surname.compareTo(another.surname);
        }
        if (result == 0) {
            result = this.age - another.age;
        }
        if (result == 0) {
            result = this.workingHoursInMonth - another.workingHoursInMonth;
        }
        return result;
    }


    public static class SortByAgeComparator implements Comparator<Employee> {

        @Override
        public int compare(Employee employee1, Employee employee2) {
            return Integer.compare(employee1.age, employee2.age);
        }
    }

    public static class SortByworkingHoursComparator implements Comparator<Employee> {

        @Override
        public int compare(Employee employee1, Employee employee2) {
            return Integer.compare(employee1.workingHoursInMonth, employee2.workingHoursInMonth);
        }
    }


    public static class SortByNameComparator implements Comparator<Employee> {

        @Override
        public int compare(Employee employee1, Employee employee2) {
            return employee1.name.compareTo(employee2.name);
        }
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getWorkingHoursInMonth() {
        return workingHoursInMonth;
    }
}
