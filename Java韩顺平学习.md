Java韩顺平学习:

CH2

```
java特性:
1.跨平台  test.java->test.class 在多个平台 JVM运行.class文件
2.解释型语言 编译后要解释器运行（类似Lua）

核心机制：
JVM虚拟机 包含在JDK中
不同平台，虚拟机不同

JDK = JRE（java运行环境） + Java的开发工具集
JRE = JVM + Java核心类库
```



CH7

```
类和对象的内存分配机制？
对象： 存在堆中（与C++不同 C++要new才会放到堆中）
方法、字符串、敞亮、类加载信息（实力化对象前用到）: 常量池中



可变参数  type.. val
val.length 长度

作用域

this


CH8的每一个案例都要run一遍？ 
思考一下要怎么才能提高java的变成熟悉度？对比C++的差异？
```



CH8

```
package 包(创建不同的文件夹/划分不同区域 来允许同名类的存在) 理解成C++的namespace
import  导入(导入包中的类或者全部内容) 理解成C++的using namespace？？？/using?

访问修饰符:
public
protected:对子类和同一个包中的类公开（这里与C++不同）
default(不写) 同一个包中的类公开
private 类本身可以访问

PS：修饰符修饰class attribute method，只有public和默认才能修饰类

关键字 extends:继承
1.java 所有类都是 Object 类的子类, Object 是所有类的基类.
2.子类默认调用父类无参构造，如果希望指定去调用父类的某个构造器/或者父类没有无参构造，则显式的调用一下 : super
3.java 中是单继承机制（C++是多继承机制）
4.super() 和 this() 都只能放在构造器第一行，因此这两个方法不能共存在一个构造器

PS：类静态成员允许在继承类中被访问到

super: 从父类开始往上访问非private属性/方法
this: 从当前类开始网上访问非private属性/方法

overload/ovdrride 区别
overload发生范围在本类
override在父子类中 同名同参同返回（类型一样或者有父子类关系） 子类方法不能缩小父类方法的访问范围

多态:
一个对象有编译类型和运行类型（允许不一致）:
Base b = new Son(); 编译类型看等号左边/运行类型看等号右边
多态实现原理: java动态绑定机制？？（调用对象方法时候，方法回合对象内存地址/允许类型进行绑定  FIXME 要细看？）

Object类 FIXME：源码看看？
== equals区别？
==：是运算符 判断基本类型看值是否相等 、 判断引用类型看地址是否一样
euals: 是Object的成员方法，判断引用是否相等，但子类可以重写该方法 FIXME：String/Integer的源码equals方法？
```



CH10

```
类变量、类方法(C++的静态成员变量、方法    属于类不属于对象)

代码块(静态/普通代码块)
类实例化对象时会调用到 

//父类static变量初始化与static代码块->子类static变量初始化与static代码块->父类普通变量初始化与普通代码块->父类构造函数->子类普通变量初始化与普通代码块->子类构造函数
//static变量初始化与static代码块只会被调用一次(构造对象/访问静态成员变量时)

final:不希望被修饰的内容被继承/修改
修饰类/属性（C++中 const）/方法/局部变量（C++中 const）

abstract (C++ virtual) 抽象化（类/方法）
不能被实例化，abstract声明了类的方法就一定要声明类。


interface 接口
给出没有实现的方法（不允许有方法体 C++ virtual type func() = 0 ），封装到一个类中，定义新类implements 接口实现具体的方法。
interface不允许实例化
接口可以继承多个别的接口，但不能继承其他的类(对齐C++ 多继承机制) 代码解耦
实现接口 是 对 java 单继承机制的一种补充

内部类:
定义类在局部位置(方法中/代码块) :(1) 局部内部类 (2) 匿名内部类 
定义在成员位置 (1) 成员内部类 (2) 静态内部类
特点:可以直接访问私有属性

局部内部类: 定义在外部类的局部位置（成员方法）-->对比方法里头的局部变量理解
FIXME: 局部内部类的成员如果和外部类的成员同名了， OutClass.this.成员访问到外部类成员，底层逻辑是什么？？

匿名内部类:
本质是类/内部类/没有名字/也是一个对象
可以基于接口interface/基于类class/基于抽象类abstract
FIXME:基于接口和基于类的内部类的分析？？（看看代码？？）
 
 
--到此
成员内部类: 对比成员变量理解一下??

```

