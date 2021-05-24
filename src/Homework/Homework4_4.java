package Homework;

public class Homework4_4 {
    public static void main (String[] args){
        int k=0;
        double x = 0.01;
        while (x<8848){
            x=x*2;
            k+=1;
        }
        System.out.println("需要折叠的次数： "+k);
    }
}
