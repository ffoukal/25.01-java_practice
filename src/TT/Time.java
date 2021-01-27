package TT;

import java.util.Date;

public class Time {

    private long start;
    private long end;


    public void start(){
        this.start = System.nanoTime();
        System.out.println(this.start);
    }

    public void stop(){
        this.end = System.nanoTime();
        System.out.println(this.end);
    }

    public long elapsedTime(){
        return (this.end - this.start) / 1000000;
    }
}
