package Homework;

class tudent{  //定义学生类
    String name;   //为学生类设置三个属性，名字、身高、年龄
    int tall;
    int year;
    public void call(){//为学生类定义两个方法，因为不知道具体方法，暂时空着
    }
    public void eat(String a){}
}
public class Homework6_1 {
    public static void main (String[] args) {
        tudent s = new tudent();
        System.out.println(s.name+" "+s.tall+" "+s.year);//输出为 null 0 0
        s.name="邱一帆";//为学生类对象，s赋值
        s.year=20;
        s.tall=179;
        System.out.println(s.name+" "+s.tall+" "+s.year);//在赋值后 输出为 邱一帆 179 20
        s.call();//调用学生类的两个方法
        s.eat("food");



    }
}
