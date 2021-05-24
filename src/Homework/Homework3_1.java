package Homework;

public class Homework3_1 {
    public static void main(String[] args){
        int a=10,b=10,c=10;
        a = b++;
        c=--a;
        b=++a;
        a=c--;
        System.out.println(a);//输出值为9，因为最后的a=c--，将c的值赋给a，而c=--a，先将a-1，后将值赋给a
        System.out.println(b);//输出值为10，由于前面的c=--a，a等于9，b=++a是先将a的值加一，后赋给b
        System.out.println(c);//输出值为8，最后的a=c--，将c的值赋给a后，c减1，所以c为8
        int x=4;
        int y=(x++)+(++x)+(x*10);
        System.out.println(x);//输出为6，由于x++，x=5，再是++x，x等于6
        System.out.println(y);//输出为70，由于x++是在x完成运算后，再加一，所以第一个括号内的值为4，+6，再加上6*10，等于70

    }
}
