package User;

import Annotation.MyTest;

public class UserDao {
//    static{
//        System.out.println("helloworld");
//    }
    @MyTest
    public void addUser(){
        System.out.println("add user");
    }
    @MyTest
    public void delUser(){
        System.out.println("delete user");

    }
    @MyTest
    public void uptUser(){
        System.out.println("update user");
    }

    public void getUser(){
        System.out.println("get user");
    }

}
