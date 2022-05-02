package kea.spring2022.sorting;

import java.util.Arrays;

public class SortExperiments {
    public static void main(String[] args) {
        SortExperiments app = new SortExperiments();
        app.sort1();
        //app.sort2();
        //app.sort3();
        //app.sort4();
        //app.sortBalls1();
        //app.sortBalls2();
        //app.sortBalls3();

        //app.sortPersons1();
        //app.sortPersons2();

        //app.sortBalls4();
    }

    public void sort1() {
        // TODO: Skriv koden til sorteringsøvelse 1 her i denne metode!
    }
    public void sort2() {
        // TODO: Skriv koden til sorteringsøvelse 2 her i denne metode!
    }

    public void sortBalls1() {
        // Opret array af Ball objekter (med tilfældig brightness)
        Ball[] ballsarray = new Ball[8];
        for(int i=0; i < ballsarray.length; i++) {
            ballsarray[i] = new Ball();
        }

        // TODO: Skriv koden til sorteringsøvelse ball-sorter1 her:

    }

    public void sort3() {
        // TODO: Skriv koden til sorteringsøvelse 3 (med quicksort) her i denne metode!
    }

    public void sort4() {
        // TODO: Skriv koden til sorteringsøvelse 4 (med quicksort) her i denne metode!
    }

    public void sortBalls2() {
        // Opret array af Ball objekter (med tilfældig brightness)
        Ball[] ballsarray = new Ball[8];
        for(int i=0; i < ballsarray.length; i++) {
            ballsarray[i] = new Ball();
        }

        // TODO: Skriv koden til sorteringsøvelse ball-sorter2 (med quicksort) her:

    }

    public void sortBalls3() {
        // Opret array af Ball objekter (med tilfældig brightness)
        Ball[] ballsarray = new Ball[8];
        for(int i=0; i < ballsarray.length; i++) {
            ballsarray[i] = new Ball();
        }

        // TODO: Skriv koden til sorteringsøvelse ball-sorter3 (med quicksort-sammenlignbar) her:

    }

    public void sortPersons1() {
        Person[] arr = new Person[3];
        arr[0] = new Person("Hermione", "Granger");
        arr[1] = new Person("Ron", "Weasley");
        arr[2] = new Person("Harry", "Potter");

        System.out.println("Før sortering: " + Arrays.toString(arr));
        // TODO: Sorter array af personer med quickSort

        System.out.println("Efter sortering: " + Arrays.toString(arr));

    }

    public void sortPersons2() {
        Person[] arr = new Person[3];
        arr[0] = new Person("Hermione", "Granger");
        arr[1] = new Person("Ron", "Weasley");
        arr[2] = new Person("Harry", "Potter");

        System.out.println("Før sortering: " + Arrays.toString(arr));
        // TODO: Sorter array af personer med Arrays.sort

        System.out.println("Efter sortering: " + Arrays.toString(arr));

    }

    public void sortBalls4() {
        // Opret array af Ball objekter (med tilfældig brightness)
        Ball[] ballsarray = new Ball[8];
        for(int i=0; i < ballsarray.length; i++) {
            ballsarray[i] = new Ball();
        }

        System.out.println("Før sortering: " + Arrays.toString(ballsarray));
        // TODO: Sorter array af balls med Arrays.sort

        System.out.println("Efter sortering: " + Arrays.toString(ballsarray));

    }


}
