package nali.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {


        List<Integer> myList = new ArrayList<>();
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.remove(3);

        for (Integer m : myList) {
            System.out.print(m + " ");
        }


//            public static void main(String ... args) {
//                Boolean b = new Boolean("/true");
//                System.out.println(b);
//            }
//
//            public static void main(String args) {
//                Boolean b = new Boolean("/false");
//                System.out.println(b == false);
//            }
//        }

}}

