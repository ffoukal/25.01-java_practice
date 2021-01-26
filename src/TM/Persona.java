package TM;

public class Persona implements Precedable<Persona>{

    private String nombre;
    private int dni;

    public Persona(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    public Persona(){}



   @Override
    public int precedeA(Persona persona) {
        int valor = this.dni - persona.dni;
       if(valor < 0){
           return -1;
       } else if(valor == 0){
           return 0;
       } else {
           return 1;
       }
    }

    @Override
    public String toString(){
        return this.dni + ", " + this.nombre;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
}
