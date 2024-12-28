package MultipleInheritance;
class A{
    public void display(){
        System.err.println("Iam A");
    }
}

class B extends A{
    @Override
    public void display(){
        System.err.println("I am B");
    }
}

class C extends A{
    @Override
    public void display1(){
        System.out.println("I am C");
    }
}

class D extends B {
    @Override
    public void display(){

    }
}
public class MIWithOutInterface {
    
}
