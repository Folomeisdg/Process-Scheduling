import java.util.Random;

public class Task {

    private int arriveTime;
    private int duration;
    private int priority;
    private int pid;
    private float taTime;
    private float responTime;
    private  float waiTime;
    private static Random rand;

    public Task(int pid, int priority, int arriveTime, int duration) {
        this.arriveTime = arriveTime;
        this.duration = duration;
        this.priority = priority;
        this.pid = pid;
    }

    public int getArriveTime() {
        return arriveTime;
    }

    public int getDuration() {
        return duration;
    }


    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public float getTaTime() {
        return taTime;
    }

    public void setTaTime(float taTime) {
        this.taTime = taTime;
    }

    public float getResponTime() {
        return responTime;
    }

    public void setResponTime(float responTime) {
        this.responTime = responTime;
    }

    public float getWaiTime() {
        return waiTime;
    }

    public void setWaiTime(float waiTime) {
        this.waiTime = waiTime;
    }
}
