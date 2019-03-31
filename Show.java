package SearchForGrade;

import static SearchForGrade.Initscore.*;

//展示表格
public class Show {
    static int[][] score = new int[Student_num][Course_num];
    public static void show(){
        //输出第一排学科
        initscore();
        System.out.print("\t\t");
        for (int i=0;i<courses.length;i++){
                System.out.print(courses[i]+"\t");
            }
        System.out.println("");
        for (int i=0;i<students.length;i++){
                //输出人名
            System.out.print(students[i]+"\t");
            for (int j=0;j<courses.length;j++){
                    //输出成绩
                  //先调用初始化方法给数组赋值   你是傻逼吗？为什么要在for循环里面给一个赋值的方法初始化？？？？
                //initscore(); //无限赋值。。。。。无语的错误
                score = Initscore.scores;    //再把init的全局变量score调用到show中
                System.out.print(score[i][j]+"\t");     //再把全局变量score以show里面的i，j的形式输出
            }
            System.out.println("");
            }
        }
    }

