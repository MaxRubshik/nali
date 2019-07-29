package nali.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();

        String loloshka = "Hello W,jhfrdxwa`weq`Rorld!";

        myList.add(1);
        myList.add(4);
        myList.add(3);
        myList.add(2);

        Collections.sort(myList);
        System.out.print(myList);
        Collections.sort(myList, new BackwIntegerComparator());
        System.out.println(myList);

        List<String> myStringList = new ArrayList<>();
//        for (Integer i : myList) {
//            System.out.print(" " + i);
//        }
        myStringList.add("Rachel");
        myStringList.add("Jane");
        myStringList.add("Christie");
        myStringList.add("As");
        myStringList.add("Zoe");
        myStringList.add("Emma");

        System.out.println(loloshka.hashCode());

//
//        Collections.sort(myStringList, new StringLengthComparator());
//        //Collections.sort(myStringList, new StringLengthComparator());
//        System.out.println(myStringList);
//
//        List<Person> people = new ArrayList<>();
//        people.add(new Person(12, "Mercedes"));
//        people.add(new Person(11, "Lexus"));
//        people.add(new Person(10, "BMW"));
//        people.add(new Person(14, "Fiat"));
//        people.add(new Person(13, "Infiniti"));
//
//        Collections.sort(people, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return 0;
//            }
//        });



    }

}

class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        if (o1.length() > o2.length()) {
            return 1;
        } else if (o1.length() < o2.length()) {
            return -1;
        } else
            return 0;
    }
}

class BackwIntegerComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 > o2) {
            return -1;
        } else if (o1 < o2) {
            return 1;
        } else
            return 0;
    }
}

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
}