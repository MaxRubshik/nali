package nali.Lambda;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class LambdaTwo {
    public static void main(String[] args) {
        int[] arr1 = new int[8];
        List<Integer> list1 = new ArrayList<>();

        fillArr(arr1);
        fillList(list1);

        System.out.println(list1);
        System.out.println(Arrays.toString(arr1));

//        for (int i = 0; i < 8; i++) {
//            arr1[i] = arr1[i] * 2;
//            list1.set(i, list1.get(i) * 2);
//        }
        //map method
        arr1 = stream(arr1).map(q -> q * 2).toArray();
        list1 = list1.stream().map(q -> q * 2).collect(Collectors.toList());

        arr1 = stream(arr1).map(q -> 3).toArray();
        arr1 = stream(arr1).map(q -> q + 1).toArray();

        System.out.println(list1);
        System.out.println(Arrays.toString(arr1));

        // Filter method
        int[] arr2 = new int[8];
        List<Integer> list2 = new ArrayList<>();

        fillList(list2);
        fillArr(arr2);

        arr2 = stream(arr2).filter(a -> a % 2 == 0).toArray();
        list2 = list2.stream().filter(a -> a % 2 == 0).collect(Collectors.toList());

        System.out.println(Arrays.toString(arr2));
        System.out.println(list2);

        stream(arr2).forEach(System.out::println);
        list2.stream().forEach(System.out::println);

        int[] arr3 = new int[8];
        List<Integer> list3 = new ArrayList<>();

        fillArr(arr3);
        fillList(list3);

        int sum1 = stream(arr3).reduce((acc, a) -> acc + a).getAsInt();
        int product = list3.stream().reduce((acc, a) -> acc * a).get();

        System.out.println(sum1);
        System.out.println(product);

        int[] arr4 = new int[8];
        fillArr(arr4);

        int[] newArr = Arrays.stream(arr4).filter(a -> a % 2 != 0).map(a -> a * 2).toArray();
        System.out.println(Arrays.toString(newArr));

        Set<Integer> mySet = new HashSet<>();
        mySet.add(1);
        mySet.add(2);
        mySet.add(3);
        System.out.println(mySet);
        mySet = mySet.stream().map(a -> a * 3).collect(Collectors.toSet());
        System.out.println(mySet);

    }

    private static void fillList(List<Integer> list) {
        for (int i = 0; i < 8; i++) {
            list.add(i + 1);
        }
    }

    private static void fillArr(int[] arr) {
        for (int i = 0; i < 8; i++) {
            arr[i] = i + 1;
        }
    }
}
