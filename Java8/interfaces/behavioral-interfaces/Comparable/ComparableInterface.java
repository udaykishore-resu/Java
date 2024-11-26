import java.util.Arrays;

class Person implements Comparable<Person>{
    private String name;
    private int age;
    private String city;
    
    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.age, o.age);
    }

    @Override
    public String toString(){
        return "Person [name = " +name +", age = "+age +", city = "+city +"]";
    }

}

public class ComparableInterface{
    public static void main(String[] args) {
        Person[] persons = {
            new Person("Nani",33, "Atlanta"),
            new Person("Vanshu", 06, "Cleveland"),
            new Person("Anshu", 30, "Hyderabad")
        };

        Arrays.sort(persons);
        for(Person p : persons){
            System.err.println(p);
        }
    }
}

