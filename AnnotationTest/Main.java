import Annotation.MyTest;
import User.UserDao;

import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws Exception {
//        加载UserDao.class字节码文件中的方法，判断哪些方法有带自定义的注解@MyTest，如果有，就执行，没有就不执行

//        1. 将UserDao.class字节码文件加载到内存中,下面三种方法均可
//        Class clazz = Class.forName("User.UserDao");
//        Class clazz = UserDao.class;
        Class clazz = new UserDao().getClass();

//2. 获取字节码对象上所有的方法，返回Method数组对象，数组中的每一个元素都代表Methdo对象（相当于字节码上的每一个方法）
        Method[] methods = clazz.getMethods();
//        3. 遍历字节码对象上的所有方法
        for(Method method: methods){
//            System.out.println(method.getName());
            if(method.isAnnotationPresent(MyTest.class)){
                method.invoke(new UserDao());
            }
        }

    }
}
