package Homework;

public class Homework4_5 {
    public static void main (String[] args){
        int k,i;
        for (i=0;i<4;i++){
            System.out.println("*****");
        }
        for (i=0;i<5;i++){
            for (k=0;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (i=0;i<10;i++){
            for(k=0;k<10;k++){
                System.out.print(i+"*"+k+"="+i*k+"  ");
            }
            System.out.println();
        }
    }
}
