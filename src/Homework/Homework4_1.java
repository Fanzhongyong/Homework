package Homework;

import java.util.Scanner;
public class Homework4_1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String x;
        int y;
        System.out.println("请输入选项");
        x= sc.nextLine();
        switch(x){
            case "a":
                System.out.println("答案正确");//此处设置的答案是A
                break;
            case "A":
                System.out.println("答案正确");
                break;
            case "b":
                System.out.println("答案错误");
                break;
            case "B":
                System.out.println("答案错误");
                break;
            case "c":
                System.out.println("答案错误");
                break;
            case "C":
                System.out.println("答案错误");
                break;
            case "d":
                System.out.println("答案错误");
                break;
            case "D":
                System.out.println("答案错误");
                break;

            default:
                System.out.println("无效数据: " + x);
        }
        System.out.println("请输入月份");
        y= sc.nextInt();
        switch (y){
            case 1:
                System.out.println("冬季");
                break;
            case 2:
                System.out.println("冬季");
                break;
            case 3:
                System.out.println("春季");
                break;
            case 4:
                System.out.println("春季");
                break;
            case 5:
                System.out.println("春季");
                break;
            case 6:
                System.out.println("夏季");
                break;
            case 7:
                System.out.println("夏季");
                break;
            case 8:
                System.out.println("夏季");
                break;
            case 9:
                System.out.println("秋季");
                break;
            case 10:
                System.out.println("秋季");
                break;
            case 11:
                System.out.println("秋季");
                break;
            case 12:
                System.out.println("冬季");
                break;
            default:
                throw new IllegalStateException("无效数据: " + x);
        }

    }

}
