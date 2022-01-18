package srcjni;

public class jni_test {

    //定义一个方法，该方法在C中实现
    public native void testHello();

    public static void main(String[] args){
        //加载C文件
        System.loadLibrary("JNITest");
        jni_test jniDemo = new jni_test();
        jniDemo.testHello();
    }

}