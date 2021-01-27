package TT;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Comparator;
import java.util.Properties;

public class Main {

    public static void main(String[] args) {
        Integer intArrTest[] = {8, 7, 0, 5,2, 1, 7 ,3, 13, 9, 2};
        String strArrTest[] = {"aasdg", "sfgñlk", "fa4o", "dfsial", "@9034fasf"};

        Comparator<String> strComp = (a, b) -> a.compareTo(b);
        Comparator<Integer> c1 = (a, b) -> a-b;


        Integer intArr[] = new Integer[100000];

        Time t = new Time();

        for (int i = 0; i < 100000; i++){
            intArr[i] = (int) (Math.random() * (100000 - 1 + 1) + 1);
        }


        try{
            Properties properties= new Properties();
            properties.load(new FileInputStream(new File("src/TT/MiFactory.properties")));
            String className = (String) properties.get("sorter");

            System.out.println("Empieza ordenamiento");
            t.start();
            Sorter<Integer> sorter2 = (Sorter<Integer>) MiFactory.getInstance(className);
            sorter2.sort(intArrTest, c1);
            t.stop();

            System.out.println("El tiempo de ordenamiento del algoritmo " + sorter2.getClass().getName() + " es de: " + t.elapsedTime() + "ms");


        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("No se pudo abrir el archivo");
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("No se pudo cargar el archivo");
        }


        for (int i = 0; i < 20; i++){
            System.out.println(intArr[i] + " - " + intArr[intArr.length-(i+1)]);
        }

    }
}
