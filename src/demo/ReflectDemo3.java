package demo;

import java.lang.reflect.Field;

/**
 * Created by zcy on 2017/6/4.
 * 获取字段
 */
public class ReflectDemo3 {
    public static void main(String[] args) throws Exception {
        getFieldDemo();
    }

    /*
    * 获取字节码文件中的字段
    * */
    public static void getFieldDemo()throws Exception{
        Class clazz=Class.forName("bean.Person");
        Field field=null;//clazz.getField("name");//只能获取公有
         field=clazz.getDeclaredField("age");//只能获取本类，但包含私有

        //对私有字段的访问取消权限检查,暴力访问
        field.setAccessible(true);

        //创建该对象的实例
        Object obj=clazz.newInstance();
        //设置值
        field.set(obj,89);

        Object o=field.get(obj);



        System.out.println(o);
    }
}
