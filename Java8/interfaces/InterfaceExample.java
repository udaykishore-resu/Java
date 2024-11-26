
import java.util.*;

public interface InterfaceExample{

    //constant variable
    String str = "Name";

    //abstract method
    int getAge();

    static  boolean isGender(String strparam){
        if(strparam.equals(str)){
            return true;
        }
        return false;
    }

    default void printFun(){
        System.out.println("This is InterfaceExample");
    }
}

class Person implements InterfaceExample{
    @Override
    public int getAge() {
        return 33;
    }
}

class Main{
    public static void main(String[] args){
        boolean gender = InterfaceExample.isGender(InterfaceExample.str);
        System.out.println("is he male ?"+gender);
        Person p = new Person();
        System.out.println(" his age is : " +p.getAge());
        p.printFun();
    }
}