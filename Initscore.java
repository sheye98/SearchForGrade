package SearchForGrade;



public class Initscore {
    //学生数和课程数用常量方式存储
    static final int Student_num = 6;
    static final int Course_num=5;
    //学生的姓名和课程分别存储在一维数组
    static String[] students={"zhang","wang","ling","zhaog","liung","song"};
    static String[] courses={"C","JAVA","MYSQL","LINUX","HTML"};
    static int [][] scores = new int[Student_num][Course_num];
    public static void initscore(){
        //为所有学生的成绩赋予初值
        scores = new int[Student_num][Course_num];
        //为学生成绩赋予随机数初值
        for (int i=0;i<scores.length;i++){
            for (int j=0;j<scores[Course_num].length;j++){
                scores[i][j] = (int)(Math.random()*101);
            }
        }
    }
}
