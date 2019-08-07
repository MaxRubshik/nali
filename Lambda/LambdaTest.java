package nali.Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaTest {

    public static void main(String[] args) {


        List<String> myList = new ArrayList<>();
        myList.add("Armani");
        myList.add("Hugo Boss");
        myList.add("Calvin Klein");
        myList.add("Gucci");

        System.out.println(myList);

        Comparator<String> comparator = (s1, s2) -> {
            if (s1.length() > s2.length()) return 1;
            else if (s1.length() < s2.length()) return -1;
            else return 0;
        };
        myList.sort(comparator);
        System.out.println(myList);
    }
}
