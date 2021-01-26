package TM;

public class PrecedableFactory<T>{
    public static Precedable<Persona> createPrecedable(){
        return new Persona();
    }
}
