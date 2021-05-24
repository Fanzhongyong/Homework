 class HelloWorld {
    public static void main(String[] args){// main 的格式是固定的
        int x=100;
        long l = 1000000000000L;
        System.out.println("HelloWorld");/*输出的格式也是固定的*///"/**/"的注释格式是长文本
        System.out.println(x);
        System.out.println(l);
        byte b1=3,b2=4,b;
        b = (byte) (b1 + b2);//如果不加（byte） 是类型提升，所以有问题
        b=3+4;//常量，先把结果计算出来，然后看是否在byte的范围内，如果在就不报错
        byte a = (byte) 130;
        System.out.println(a);
        byte c = (byte) 300;
        System.out.println(c);
        System.out.println('a'+1);
        System.out.println("5+5="+5+5);//这里的加号是字符串连接
        System.out.println("hello"+'a'+1);

    }
}
/*'A'单引号是字符常量，只能有一个字母*/
 //system.out.println();是固定输出句式
 /*
  整型    字节数   范围
  byte     1      -128——127
  short    2      -2^15——2^15-1
  int      4      -2^31——2^31-1
  long     8      -2^63——2^63-1

  浮点型   字节数   范围
  float    4      -3.403E38~3.403E38
  double   8      -1.798E308~1.798E308

  字符     字节数
  char     2

  布尔     字节数
  boolean  1
  长整型后用L或l进行标记，建议用L
   Long j=100000000L;
  单精度浮点型用F或f，建议用F
   float f = 12.345F;

  变量只作用在一个大括号内
  一行上建议只定义一个变量
  不同类型的数据可以直接运算
  例：byet与long相加，在系统内部先转换为int
   byte a=3;
   int b=4;
   byte c=a+b; //有问题
   int d =a+b; //没问题
  */
