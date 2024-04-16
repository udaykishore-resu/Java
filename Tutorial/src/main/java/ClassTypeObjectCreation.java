// A Java program to demonstrate working of a Class type object created by JVM to represent .class file in memory.
import java.lang.reflect.Method;
import java.lang.reflect.Field;
public class ClassTypeObjectCreation {
    public static void main(String[] args) {
        Student s = new Student();

        // Getting hold of Class object created by JVM.
        Class c = s.getClass();

        // Printing type of object using class object.
        System.out.println("Class name : " + c.getName());

        // getting all methods in an array
        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods)
            System.out.println("Method name : " + method.getName());

        // getting all fields in an array
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields)
            System.out.println("Field name : " + field.getName());
    }
}

// A sample class whose information is fetched above using its Class object.
class Student {
    private String name;
    private int roll_no;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

}
