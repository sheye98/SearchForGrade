package SearchForGrade;

import static SearchForGrade.Initscore.*;

public class Get {
    public static void get(String parameter1, String parameter2) {
        int i_idex = -1;
        int j_idex = -1;
        for(int i=0; i < students.length; i++) {
            if (parameter1.equalsIgnoreCase(students[i])) {
                i_idex = i;
            }
        }
        if (i_idex != -1) {
            for (int j = 0; j < courses.length; j++) {
                if (parameter2.equalsIgnoreCase(courses[j])){
                    j_idex = j;
                }
            }
        }else {
            System.out.println("没有"+parameter1+"这个人");
            return;
        }
        if (j_idex != -1){
            System.out.println(parameter1+"的" +parameter2+"成绩为:"+scores[i_idex][j_idex]);
        }else{
            System.out.println("没有"+parameter2+"这门课程");
        }
    }
}
