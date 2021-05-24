package Homework;/*为了上交作业方便，将5-1的三个题目放在了一个文件中输出
不同问题的输入前，加上了具体的提示文字
 */
import java.util.Scanner;
public class Homework5_1 {
    public static void main (String[] args){
     int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("比较较大值；请输入a,b的值");
        a= sc.nextInt();
        b= sc.nextInt();
       int bigger=bigger(a,b);
       System.out.println(bigger);
       System.out.println("检验是否相等；请输入a,b的值");
        a= sc.nextInt();
        b= sc.nextInt();
        equal(a,b);
        System.out.println("求三个数中的最大值；请输入a,b,c的值");
        a= sc.nextInt();
        b= sc.nextInt();
        c= sc.nextInt();
       int max= max(a,b,c);
       System.out.println("最大值为："+max);
    }
    public static int bigger (int a,int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
    public static void equal (int a, int b) {
        if(a==b){System.out.println("a，b相等");}
        else {System.out.println("a，b不相等");}

    }
    public static int max (int a, int b,int c) {
        int max;
        if (a>b){max=a;}
        else{max=b;}
        if(max>c){}
        else {max=c;}
        return max;
    }
}
