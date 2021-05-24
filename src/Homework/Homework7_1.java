package Homework;
class Animal{
    int age;
    public Animal(){}//父类的空参构造方法
     public void  eat(){System.out.println("Animal"); }
}
class Cat extends Animal{
    public Cat(){}
    public void  eat(){System.out.println("Cat"); }
}


public class Homework7_1 {
//子类每一个构造方法的第一条语句默认都是：super（）;
public static void main(String[] args){
  Animal cat = new Cat();//向上转型
    cat.eat();
    Cat cat1=(Cat)cat;//使用强制类型转换，将cat1转换为Cat类
    cat1.eat();//由于运行看右
}
}
//多态 编译看父，运行看子
// Fu f = new Zi(); 向上转型
//Zi z=(Zi)f;  向下转型   强制类型转换
