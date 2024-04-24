import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(8);
        list.add(3);
        list.add(4);
        list.add(5);

        List<Integer> list1 = task4(list);

        for (Integer i : list1) {
            System.out.print(i + ",");
        }
    }

    public static List<Integer> task4(List<Integer> list){
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for (Integer i : list) {
            if (i % 2 == 0){
                set.addAll(forEven(i));
            } else {
                set.addAll(forOdd(i));
            }
        }

        return new ArrayList<>(set);
    }

    public static ArrayList<Integer> forEven(int i){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(i);
        while (i % 2 == 0){
            list.add(i / 2);
            i /= 2;
        }

        return list;
    }

    public static ArrayList<Integer> forOdd(int i){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(i);
        while (i % 2 != 0){
            list.add(i * 2);
            i *= 2;
        }

        return list;
    }
 }
