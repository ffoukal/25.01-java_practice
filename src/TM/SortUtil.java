package TM;

import java.util.Comparator;

public class SortUtil<T> {

    public static <T> T[] ordenar(Precedable<T> original[]){
        Precedable<T> arr[] = original.clone();
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length-1; j++){
                if(arr[j].precedeA((T) arr[j+1]) > 0){
                    Precedable<T> buffer = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = buffer;
                }
            }
        }
        return (T[]) arr;
    }

    public static <T> T[] ordenarConComparator(T arr[], Comparator<T> c){
        T[] clone = arr.clone();

        for(int i = 0; i < clone.length; i++){
            for(int j = 0; j < clone.length-1; j++){
                if(c.compare(clone[j], clone[j+1]) > 0){
                    T buffer = clone[j];
                    clone[j] = clone[j+1];
                    clone[j+1] = buffer;
                }
            }
        }
        return clone;
    }

}
