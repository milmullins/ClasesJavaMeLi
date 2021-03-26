package Ordenamiento;

public class Time {
    private long start;
    private long stop;

    public long getStart() {
        return start;
    }

    public long getStop() {
        return stop;
    }

    public void Start() {
        this.start = System.currentTimeMillis();
    }
    public void Stop() {
        this.stop = System.currentTimeMillis();
    }
    public long elapsedTime(){
        return this.stop - this.start;
    }
}
