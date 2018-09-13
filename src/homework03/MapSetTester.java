package homework03;
import java.util.*;

import java.util.TreeSet;


public class MapSetTester {


    public  MapSetTester(){
        main();
    }
    public  void main(){

        Map<String,TreeSet<String> > networkMap =new HashMap<String,  TreeSet<String>>();


        for(int i=0;i<3;i++)
        {
            System.out.print("Введите телевизионное шоу ");
            Scanner scan = new Scanner(System.in);
            String show = scan.next();
            System.out.print("Введите телевизионного канала ");
            scan = new Scanner(System.in);
            String channel = scan.next();
            if(!networkMap.containsKey(channel)) {
                TreeSet<String> treeshow = new TreeSet<String>();
                treeshow.add(show);
                networkMap.put(channel, treeshow);
            }
            else {
                TreeSet<String> treeshow = new TreeSet<String>();
                treeshow=networkMap.get(channel);
                treeshow.add(show);
                networkMap.put(channel,treeshow );
            }

        }
        System.out.println("networkMap: " + networkMap);



    }
}
