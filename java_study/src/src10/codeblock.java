package src10;

public class codeblock {
    public static void main(String[] args) {

        System.out.println(AA.n1);//子类能访问到父类的静态成员
        //AA.n1 static B 代码块
        //AA.a1 static B 代码块 -> static A 代码块
        AA aa = new AA();
        AA aa2 = new AA();
        //父类static变量初始化与static代码块->子类static变量初始化与static代码块->父类普通变量初始化与普通代码块->父类构造函数->子类普通变量初始化与普通代码块->子类构造函数
        //static变量初始化与static代码块只会被调用一次(构造对象/访问静态成员变量时)
        //如果子类构造不声音父类 也会调用父类构造函数 为啥？
        //A:) 当创建子类对象时，不管使用子类的哪个构造器，默认情况下总会去调用父类的无参构造器，如果父类没有提供无参构造器，
        // 则必须在子类的构造器中用 super 去指定使用父类的哪个构造器完成对父类的初始化工作，否则，编译


    }
}

class BB {
    //静态代码块
    public static int n1 = getN1();//静态属性
    public int n2 = getVal02();
    public int getVal02() {
        System.out.println("getVal02");//(6)
        return 10;
    }
    public static int getN1() {
        System.out.println("BB getN1被调用...");
        return 100;
    }
    public BB()
    {
        System.out.println("BB 的构造函数");//1
    }
    static {
        System.out.println("BB 的静态代码1被执行...");//1
    }
    {
        System.out.println("BB 的普通代码1被执行...");//1
    }
}

class AA extends BB {
    public static int a1 = getN2();//静态属性
    public static int getN2() {
        System.out.println("AA getN1被调用...");
        return 1000;
    }
    public AA()
    {
        System.out.println("AA 的构造函数");//1
    }
    //静态代码块
    static {
        System.out.println("AA 的静态代码1被执行...");//2
    }
    {
        System.out.println("AA 的普通代码1被执行...");//1
    }
}
