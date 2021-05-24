package Homework;

import java.util.Scanner;
public class Homework3_4 {
    public static void main (String[] args){
        int x,y,max;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入x的值");
        x= sc.nextInt();
        System.out.println("请输入y的值");
        y=sc.nextInt();
        if (x>y) {max=x;System.out.println("x>y");}
        else {max=y;System.out.println("x<y");}
        if(x % 2 == 1)System.out.println("x为奇数");
        else System.out.println("x为偶数");

    }
}
