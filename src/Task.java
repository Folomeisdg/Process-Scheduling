import java.util.Random;

public class Task {

    private double arriveTime;
    private double duration;
    private double priority;
    private double pid;
    private float taTime;
    private float responTime;
    private  float waiTime;
    private static Random rand;

    public Task(double pid, double priority, double arriveTime, double duration) {
        this.arriveTime = arriveTime;
        this.duration = duration;
        this.priority = priority;
        this.pid = pid;
    }

    public double getArriveTime() {
        return arriveTime;
    }

    public double getDuration() {
        return duration;
    }

    public double getPriority() {
        return priority;
    }

    public double getPid() {
        return pid;
    }

    public void setPid(double pid) {
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
