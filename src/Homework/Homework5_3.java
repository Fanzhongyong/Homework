package Homework;

import java.util.Scanner;
public class Homework5_3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
         int a,b;
         short c,d;
         long e,f;
         byte x,y;
         System.out.println("请输入需要对比的两个int数");
         a= sc.nextInt();
         b= sc.nextInt();
         equal(a,b);
        System.out.println("请输入需要对比的两个short数");
        c= sc.nextShort();
        d= sc.nextShort();
        equal(c,d);
        System.out.println("请输入需要对比的两个Long数");
        e= (long)sc.nextLong();
        f= (long)sc.nextLong();
        equal(e,f);
        System.out.println("请输入需要对比的两个byte数");
        x= (byte) sc.nextByte();
        y= (byte) sc.nextByte();
        equal(x,y);

    }
    public static void equal(short a,short b){
        if(a==b){System.out.println("a，b相等");}
        else {System.out.println("a，b不相等");}
        System.out.println("short");
    }
    public static void equal(int a,int b){
        if(a==b){System.out.println("a，b相等");}
        else {System.out.println("a，b不相等");}
        System.out.println("int");
    }
    public static void equal(byte a,byte b){
        if(a==b){System.out.println("a，b相等");}
        else {System.out.println("a，b不相等");}
        System.out.println("byte");
    }
    public static void equal(long a,long b){
        if(a==b){System.out.println("a，b相等");}
        else {System.out.println("a，b不相等");}
        System.out.println("long");
    }

}

