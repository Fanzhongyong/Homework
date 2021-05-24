package Homework;

import java.util.Scanner;
public class Homework3_5 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int x,y=0,z,max;
        int month;
        System.out.println("请输入x的值");
        x= sc.nextInt();
        if(x>=3)y=2*x+1;
        else if(-1<x&&x<3) y=2*x;
        else if(x<=-1) y=2*x-1;
        System.out.println("y的值是："+y);
        System.out.println("请输入月份");
        month= sc.nextInt();
        if(x==3|x==4|x==5) System.out.println("春天");
        else if(x<=8&&x>=6) System.out.println("夏天");
        else if (x<=11&&x>=9)System.out.println("秋天");
        System.out.println("请输入x的值");
        x= sc.nextInt();
        System.out.println("请输入y的值");
        y= sc.nextInt();
        System.out.println("请输入z的值");
        z= sc.nextInt();
        max=(x>y)?x:y;
        max=(max>z)?max:z;
        System.out.println("x,y,z中的最大值是："+max);

    }
}
