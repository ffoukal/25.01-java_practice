package TM;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Carlos", 123456);
        Persona p2 = new Persona("Jere", 789456);
        Persona p3 = new Persona("Marco", 456789);

        Persona personas[] = {p1,p2,p3};

        Persona arr[] = SortUtil.ordenar(personas);

        for(Persona p : arr){
            System.out.println(p);
        }

        System.out.println();
        System.out.println();
        System.out.println();


        Celular c1 = new Celular(12345, "Carlo");
        Celular c2 = new Celular(23456, "Marco");
        Celular c3 = new Celular(00002, "Jere");

        Celular arrC[] = {c1, c2, c3};

        Celular celSorted[] = SortUtil.ordenar(arrC);

        for(Celular c : celSorted){
            System.out.println(c);
        }
        System.out.println();
        System.out.println();
        System.out.println();

        Persona arrComp[] = SortUtil.ordenarConComparator(personas, new PersonaDniComparator());

        for(Persona p : arrComp){
            System.out.println(p);
        }

        System.out.println();
        System.out.println();
        System.out.println();

        /**
         * Crear comparator con lambdas
         */

        Comparator<Persona> descendent = (pe1, pe2) ->  pe2.getDni() - pe1.getDni();

        Persona arrComp1[] = SortUtil.ordenarConComparator(personas, descendent);

        for(Persona p : arrComp1){
            System.out.println(p);
        }

    }
}
