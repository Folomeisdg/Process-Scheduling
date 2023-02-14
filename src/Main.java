import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InitialList initialList = new InitialList();
        initialList.readFile("filename.txt");
        /*Task test = initialList.getinitiallist()[1];
        double x = test.getArriveTime();*/
        //System.out.println(x);
        //initialList.Iprint();
        //System.out.println(test.getPid());
        //System.out.println(initialList.getNumValues());
        /*for(int i = 0; i < initialList.getNumValues(); i++){
            System.out.print(initialList.getinitiallist()[i].getPid()+ " ");
        }*/
        FCFS fcfsList = new FCFS();
        fcfsList.setFCFSlist(initialList.getinitiallist());
        //fcfsList.FCFStoString(initialList.getNumValues());
        fcfsList.BubbleSortTime(initialList.getNumValues());
        fcfsList.FCFStoString(initialList.getNumValues());


    }

}

