import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class InitialList {
    private Task Initiallist[];
    private int numValues;
    public InitialList(){
        this.Initiallist= new Task[1000];
        this.numValues = 0;
    }

    public Task[] getinitiallist() {
        return Initiallist;
    }

    public int getNumValues() {
        return numValues;
    }


    public void Iprint() {
        for (int i = 0; i < numValues; i++) {
            System.out.print(Initiallist[i].getPid() + " ");
        }
    }

    public void readFile(String fname){
        try {
            File infile = new File(fname);
            Scanner myReader = new Scanner(infile);
            int x = 0;
            while (myReader.hasNextLine()) {

                String line = myReader.nextLine();
                String[] splitStr = line.split(" ");
                int pid = (int) Double.parseDouble(splitStr[0]);
                int Priority = (int) Double.parseDouble(splitStr[1]);
                int Artime = (int) Double.parseDouble(splitStr[2]);
                int Duration = (int) Double.parseDouble(splitStr[3]);
                //taskList.add(new Task(pid,Priority,Artime,Duration));
                Initiallist[x] = new Task(pid,Priority,Artime,Duration);
                numValues++;
                x++;
                //System.out.println(Initiallist[x].getArriveTime());
/*                for (int i = 0; i < 4; i++) {
                    System.out.print(splitStr[i]);
                }
                System.out.println("");*/
            }

            myReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
