package kea.spring2022.sorting;

public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return lastName + " " + firstName;
    }

    // TODO: Gør det muligt at sammenligne (og dermed sortere) to personer

}
