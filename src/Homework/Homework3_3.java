package Homework;

import java.util.Scanner;
public class Homework3_3 {
    public static void main (String[] args) {
        int x,y,z,max;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入x的值");
        x= sc.nextInt();
        System.out.println("请输入y的值");
        y=sc.nextInt();
        System.out.println("请输入z的值");
        z=sc.nextInt();
        System.out.println("两数之和为："+(x+y));
        max=(x>y)?x:y;
        System.out.println("x,y两数中最大数为："+max);
        max=(x>y)?x:y;
        max=(max>z)?max:z;
        System.out.println("x,y,z三数中最大数为："+max);
        if (x == y) System.out.println("x,y相等");
        else System.out.println("x,y不相等");
    }
}
