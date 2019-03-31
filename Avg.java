package SearchForGrade;

import static SearchForGrade.Initscore.*;
import static SearchForGrade.Show.*;

public class Avg {
    //计算平均分的方法

    public static void avg(String paramater) {
        int i_idex = -1;
        int j_idex = -1;
        float sum = 0;
        //如果avg+人名，计算平均值
        for (int i = 0; i < students.length; i++) {
            if (paramater.equalsIgnoreCase(students[i])) {
                i_idex = i;
            }
        }
        if (i_idex != -1) {
            for (int j = 0; j < courses.length; j++) {
                sum += scores[i_idex][j];
            }
            System.out.println(paramater + "的平均成绩是:" + sum/courses.length);
        }
        else {
            System.out.println("没有" + paramater + "这个人");
//            for (int j = 0; j < courses.length; j++) {
//                if (paramater.equalsIgnoreCase(courses[j])) {
//                    j_idex = j;
//                }
//            }
            return;
        }

//        如果是avg+课程

            for (int j = 0; j < courses.length; j++) {
                if (paramater.equalsIgnoreCase(courses[j])) {
                    j_idex = j;
                }
            }

        if (j_idex != -1) {
            for (int i = 0; i < students.length; i++) {     //score[6][5]
                sum += scores[i][j_idex];    //score[5][6]
            }
            System.out.println(paramater + "的平均成绩是" + sum/students.length);
        }
        else {
            System.out.println("没有" + paramater + "这个学科");
        }

    }
}
