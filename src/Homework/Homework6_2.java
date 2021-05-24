package Homework;

class Phone{//定义Phone类
    String name;//为Phone类定义属性
    int price;
    String color;
    public void call(String name){}//定义Phone类的方法
    public void playgame(String name){}
    public void sendMessage(String name){}
}
public class Homework6_2 {
    public static void main(String[] args){
        Phone p=new Phone();
        System.out.println(p.name+" "+p.price+" "+p.color);//输出为 null 0 null
        p.name="苹果";//为Phone类对象p赋值
        p.price=7999;
        p.color="黑色";
        System.out.println(p.name+" "+p.price+" "+p.color);//再为对象p赋值后，输出为 苹果 7999 黑色
        p.call("邱一帆");//调用对象p的方法
        p.playgame("英雄联盟");
        p.sendMessage("邱一帆");

    }
}
