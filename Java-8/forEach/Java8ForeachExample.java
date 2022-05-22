package java8.foreach;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Java8ForeachExample{
    public static void main(String[] args){
        //creating a list 
        List<Integer> myList = new ArrayList<Integer>();
        for(int i=0;i<10;i++)
            myList.add(i);
        
        //traversing using iterator
        Iterator<Integer> it = myList.iterator();
        while(it.hasNext())
            System.out.println("Iterator Value::"+it.next());
        
        //traversing through foreach method of iterable with anonymous class
        myList.forEach(new Consumer<Integer>(){
            public void accept(Integer t){
                System.out.println("The anonymous class value::"+t);
            }
        });

        //traversing with Consumer interface implementaion
        myConsumer perform = new myConsumer();
        myList.forEach(perform);
    }
}

//consumer implementation that can be resused
class myConsumer implements Consumer<Integer>{
    public void accept(Integer t){
        System.out.println("Consumer Implements value::"+t);
    }
}