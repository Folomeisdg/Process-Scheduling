import java.util.Random;

public class FCFS {
    private float taTimeAvg;
    private float responTimeAvg;
    private  float waiTimeAvg;

    public FCFS(float taTimeAvg, float responTimeAvg, float waiTimeAvg) {
        this.taTimeAvg = taTimeAvg;
        this.responTimeAvg = responTimeAvg;
        this.waiTimeAvg = waiTimeAvg;
    }

    public float getTaTimeAvg() {
        return taTimeAvg;
    }

    public void setTaTimeAvg(float taTimeAvg) {
        this.taTimeAvg = taTimeAvg;
    }

    public float getResponTimeAvg() {
        return responTimeAvg;
    }

    public void setResponTimeAvg(float responTimeAvg) {
        this.responTimeAvg = responTimeAvg;
    }

    public float getWaiTimeAvg() {
        return waiTimeAvg;
    }

    public void setWaiTimeAvg(float waiTimeAvg) {
        this.waiTimeAvg = waiTimeAvg;
    }

    public void schedule(){
        
    }

}