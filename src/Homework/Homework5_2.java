package Homework;

import java.util.Scanner;
public class Homework5_2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int k, i;
     System.out.println("请输入*的行数和列数：");
     i= sc.nextInt();
     k= sc.nextInt();
     xing(i,k);
    }
    public static void xing (int a,int b) {
     int i,k;

        for (i=0;i<a;i++){
        for (k=0;k<=b;k++){
        System.out.print("*");
        }
        System.out.println(); }
    }
}

