package Homework;

public class Homework4_3 {
    public static void main (String[] args){
        int k,i;
        System.out.println("满足条件的五位数有：");
        for (i=10000;i<100000;i++){
            if((i%10==i/10000)&&(i%100/10==i%10000/1000)&&((i%10+i/10000+i%100/10+i%10000/1000)==i%1000/100)){
                System.out.println(i);
            }
        }
        k=0;
        for(i=1;i<1001;i++){
            if ((i%3==2)&&((i%5)==3)&&(i%7==2)){
                k=k+1;
            }
        }
        System.out.println("1——1000内满足条件的数字有："+k+"个");
    }
}
