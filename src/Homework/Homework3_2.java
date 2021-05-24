package Homework;

import java.util.Scanner;
public class Homework3_2 {
    public static void main (String[] args){
        int x,y,z,max;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入x的值");
        x=sc.nextInt();
        System.out.println("请输入y的值");
        y=sc.nextInt();
        System.out.println("请输入z的值");
        z=sc.nextInt();
        max=(x>y)?x:y;
        System.out.println("x,y中的最大值是："+max);
        max=(x>y)?x:y;
        max=(max<z)?z:max;
        System.out.println("x,y,z中的最大值是："+max);

    }
}