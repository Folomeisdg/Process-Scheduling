import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class FCFS {
    private Task FCFSlist[];
    private int time;
    private float  AvgTAtime;
    private float ResTime;
    private float Waitime;

    public FCFS(){
        this.FCFSlist= new Task[1000];
        this.time = 0;
    }

    public Task[] getFCFSlist() {
        return FCFSlist;
    }

    public void setFCFSlist(Task[] list) {
        this.FCFSlist = list.clone();
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public float getAvgTAtime() {
        return AvgTAtime;
    }

    public void setAvgTAtime(float avgTAtime) {

        AvgTAtime = avgTAtime;
    }

    public float getResTime() {
        return ResTime;
    }

    public void setResTime(float resTime) {
        ResTime = resTime;
    }

    public float getWaitime() {
        return Waitime;
    }

    public void setWaitime(float waitime) {
        Waitime = waitime;
    }

    public void FCFStoString(int numValure) {
        for(int i = 0; i < numValure; i++){
            System.out.print(FCFSlist[i].getPid()+ " ");
        }
    }

    public void BubbleSortTime(int numValues){
        int current = 0;
        while (current < numValues - 1)
        {
            BubbleUpTime(FCFSlist, current, numValues-1);
            current++;
        }
    }
    public void BubbleUpTime(Task FCFSlist[], int startIndex, int endIndex){
        for (int index = endIndex; index > startIndex; index--)
            if (FCFSlist[index].getArriveTime() < FCFSlist[index-1].getArriveTime()){
                Task tempItem = FCFSlist[index];
                FCFSlist[index] = FCFSlist[index-1];
                FCFSlist[index-1] = tempItem;
            }
    }


   /* public static void FCFS(ArrayList<Task> list){
        Collections.sort(list, Comparator.comparing(Task::getArriveTime));
    }
    public static void printList(ArrayList<Task> list){
        for(int i=0;i<list.size();i++){
            System.out.println(list[i].getClass());
        }
    }*/
}
