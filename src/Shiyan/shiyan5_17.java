package Shiyan;
//实验5.17实现了，接口继承，以及抽象继承的使用，代码如下

abstract class Animal{//先抽象定义父类动物，有名字和年龄两个变量
    String name;
    int age;
    public abstract void  eat();//定义两个抽象空函数，都使用public abstract 来定义
    public abstract void sleep();
}
class Cat extends Animal{//猫咪类继承自动物类
    public Cat(){}
    public void  eat(){System.out.println("猫吃鱼"); }//为动物类的抽象方法具体化
    public void sleep(){System.out.println("猫睡觉");}
    public void show(){
        System.out.println("猫的名字叫"+this.name+"  它今年"+this.age+"岁");
    }//使用内部方法来输出信息，更加方便
}
class Dog extends Animal{//狗狗的函数与猫猫的基本相似，故不多做说明
    public Dog(){}
    public void  eat(){System.out.println("狗吃肉"); }
    public void sleep(){System.out.println("狗睡觉");}
    public void show(){
        System.out.println("狗的名字叫"+this.name+"  它今年"+this.age+"岁");
    }
}
interface jumpTrain{//创建两个接口函数，可以给超级猫猫和超级狗狗两个类共用
    public abstract void jump();
}
interface eatTrain{
    public abstract void eat();
}
class Supercat extends Cat implements jumpTrain ,eatTrain{//定义超级猫咪类，作为被训练过的猫咪，继承自猫咪类，实现接口，"跳跃"和"吃"
    Supercat(){System.out.println("我们训练了一只猫");}//我使用了一个空参构造函数来显示，成功创建超级猫咪类
    public void jump(){
        System.out.println("猫可以跳高了");
    }
    public void eat(){
        System.out.println("猫超会吃");
    }
    public void sleep(){System.out.println("SuperCat sleep");}
}
class SuperDog extends Dog implements jumpTrain,eatTrain{//狗狗的接口函数与猫猫的基本相似，故不多做说明
    SuperDog(){System.out.println("我们训练了一只狗");}
    public void jump(){
        System.out.println("狗可以跳高了");
    }
    public void eat(){
        System.out.println("狗超会吃");
    }
    public void sleep(){System.out.println("SuperDog sleep");}
}
public class shiyan5_17 {
    public static void main(String[] args) {
        Supercat a = new Supercat();//定义了第一个超级猫猫类
        a.name="爱因斯坦";
        a.age=1;
        a.show();
        a.jump();
        a.eat();
        a.sleep();
        Animal b=new Cat();//重新定义普通猫猫类，使用了多态的形式
        b.name="牛顿";
        b.age=1;
        ((Cat) b).show();//由于show是Cat类的方法，为了使用该方法，使用强制转换，将b向下转型，使用show
        b.eat();
        System.out.println("接下来训练狗狗");
        SuperDog d=new SuperDog();//创建了超级狗狗类
        d.age=1;
        d.name="爱迪生";
        d.show();
        d.jump();
        d.eat();

    }
}
