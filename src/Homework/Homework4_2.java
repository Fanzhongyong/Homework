package Homework;

public class Homework4_2 {
    public static void main (String[] args){
     int x,y,i,k;
     x=10;
     y=0;
        System.out.println("1——10的值为；");
     for (i=0;i<x;i++){
         System.out.println(i);
     }
        System.out.println("10——1的值为；");
     for (i=10;0<i;i--){
         System.out.println(i);
        }
     for (i=0;i<x;i++){
            y=y+i;
        }
        System.out.println("1——10之和为；"+y);
        for (i=0;i<=100;i+=2){
            y=y+i;
        }
        System.out.println("1——100偶数之和为；"+y);
        for (i=1;i<=100;i+=2){
            y=y+i;
        }
        System.out.println("1——100奇数之和为；"+y);
        for (i=1,y=1;i<6;i++){
            y=y*i;
        }
        System.out.println("5的阶乘；"+y);
        k=0;
        for (i=100;i<1000;i++){
           if((i/100)*(i/100)*(i/100)+(i%100/10)*(i%100/10)*(i%100/10)+(i%10)*(i%10)*(i%10)==i){
               System.out.println(i);
               k=k+1;
           }
        }
        System.out.println("水仙花数的个数为；"+k);
    }
}
