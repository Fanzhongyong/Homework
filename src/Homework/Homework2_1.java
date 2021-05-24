package Homework;
public class Homework2_1 {
    public static void main(String[] args){
        byte b1=3,b2=4,b;
        b=(byte)(b1+b2);//这一句错误，由于int转换到byte可能会有损失
        System.out.println(b);
        b=3+4;
        System.out.println(b);
    }
}
