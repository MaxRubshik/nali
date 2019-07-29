package nali.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);

        //System.out.println(myList);

        int index = 0;
        Iterator<Integer> myIterator = myList.iterator();
        while (myIterator.hasNext()) {
            System.out.print(myIterator.next() + " ");

            if (index == 1) {
                myIterator.remove();
            }
            index++;
        }

        System.out.println(myList);
    }
}