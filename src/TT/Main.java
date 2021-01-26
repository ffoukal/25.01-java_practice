package TT;

import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Integer arr[] = {8, 7, 0, 5,2, 1, 7 ,3, 13, 9, 2};

        Comparator<Integer> c1 = (a, b) -> a-b;

        QuickSortSorterImple<Integer> qs = new QuickSortSorterImple<>();

        qs.quickSort(arr, 0, arr.length-1, c1);

        for(Integer i : arr){
            System.out.println(i);
        }

        String strArr[] = {"aasdg", "sfgñlk", "fa4o", "dfsial", "@9034fasf"};

        Comparator<String> strComp = (a, b) -> a.compareTo(b);

        //QuickSortSorterImple<String> qs2 = new QuickSortSorterImple<>();
        //qs2.quickSort(strArr, 0, strArr.length-1, strComp);

        HeapSortSorterImple<String> hs = new HeapSortSorterImple<>();
        hs.sort(strArr, strComp);

        for(String s : strArr){
            System.out.println(s);
        }

    }
}
