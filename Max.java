package SearchForGrade;

import static SearchForGrade.Initscore.*;
import java.util.Arrays;

public class Max {

    public static void max(String parameter){
        int index=-1;
        for (int i=0;i<students.length;i++){
            if (parameter.equalsIgnoreCase(students[i])){
                index=i;
            }
        }
        if (index!=-1){
            int[] arr =new int[]{scores[index][0],scores[index][1]
            ,scores[index][2],scores[index][3],scores[index][4]};
            Arrays.sort(arr);
            System.out.println(arr[4]);
        }
    }
}
