package demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Created by zcy on 2017/6/4.、
 * 获取方法
 */
public class ReflectDemo4 {
    public static void main(String[] args) throws Exception {
        getMethodDemo_3();

    }

    private static void getMethodDemo_3() throws Exception {
        Class clazz =Class.forName("bean.Person");

        //获取"show"方法，无参数
        Method method=clazz.getMethod("paramMethod", String.class, int.class);//获取空参数方法

        Object obj=clazz.newInstance();
        method.invoke(obj,"小强",37);
    }

    private static void getMethodDemo_2() throws Exception{
        Class clazz =Class.forName("bean.Person");

        //获取"show"方法，无参数
        Method method=clazz.getMethod("show",null);//获取空参数方法
        //先创建一个对象
        //Object obj=clazz.newInstance();
        Constructor constructor=clazz.getConstructor(int.class,String.class);
        Object obj=constructor.newInstance(37,"小明");
        //实现show方法
        method.invoke(obj,null);

        //输出方法名
        System.out.println(method.toString());
    }

    /*
     * 获取指定class中所有的公共函数
     * */
    public static void getMethodDemo() throws Exception{
        Class clazz =Class.forName("bean.Person");

        Method[] methods=clazz.getMethods();//获取的都是公有的方法
        methods=clazz.getDeclaredMethods();//获取本类中所有方法，包含私有
        System.out.println(methods.toString());
    }
}
