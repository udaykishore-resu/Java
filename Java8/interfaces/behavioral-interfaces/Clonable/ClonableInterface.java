
class Person implements Cloneable, Comparable<Person> {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.name);
    }
}

public class ClonableInterface {
    public static void main(String[] args) {
        try {
            Person original = new Person("Alice", 30);
            Person cloned = (Person) original.clone();
            
            System.out.println("Original: " + original);
            System.out.println("Cloned: " + cloned);
            System.out.println(original.compareTo(cloned));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}