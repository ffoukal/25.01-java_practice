package TM;

public class Celular implements Precedable<Celular>{

    private int number;
    private String titular;

    public Celular(int number, String titular) {
        this.number = number;
        this.titular = titular;
    }



    @Override
    public int precedeA(Celular celular) {
        return this.number - celular.number;
    }

    @Override
    public String toString(){
        return this.number + ", "+ this.titular;
    }


    public long getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
}
