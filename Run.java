package SearchForGrade;

import java.util.Scanner;
import static SearchForGrade.Sort.*;
import static SearchForGrade.Max.*;
import static SearchForGrade.Avg.*;
import static SearchForGrade.Get.*;
//import static SearchForGrade.Sort.*;

public class Run {
    public static void run() {
        Scanner scn = new Scanner(System.in);
        while (true){
            System.out.print("请输入命令:");
            String command = scn.next();
            //avg指令
            if (command.equalsIgnoreCase("avg")){
                String parameter = scn.next();
                avg(parameter);
            }
            //get指令
            if (command.equalsIgnoreCase("get")){
                String parameter1 = scn.next();
                String parameter2 = scn.next();
                get(parameter1,parameter2);
            }
            //sort指令
            if (command.equalsIgnoreCase("sort")){
                String parameter = scn.next();
                sort(parameter);
            }
            if (command.equalsIgnoreCase("max")){
                String parameter = scn.next();
                max(parameter);
            }
        }
    }
}