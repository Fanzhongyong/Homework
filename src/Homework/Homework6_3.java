package Homework;

class student{  //定义学生类
    private String name;   //为学生类设置三个属性，名字、身高、年龄
    private int tall;
   private static int year;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public student(String a,int b,int c){//定义student类的构造函数
        this.name=a;
        this.tall=b;
        this.year=c;
    }
    public void call(){//为学生类定义两个方法，因为不知道具体方法，暂时空着
    }
    public void show(){System.out.println(this.name+" "+this.tall+" "+this.year);}//为学生类定义方法，show来输出数据
    public void eat(){}
}
public class Homework6_3 {
    public static void main (String[] args) {
        student s = new student("邱一帆",180, 20);//使用有参构造函数来为对象s赋值
       s.show();//在赋值后 使用show方法来输出为 邱一帆 179 20
        s.setName("qiuyifan");
        s.show();
        s.getName();//使用了getXxx函数
        s.show();
        s.call();//调用学生类的两个方法
        s.eat();



    }
}
