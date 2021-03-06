package ru.Zadanie_8;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;
public class Test {
    public static void fillQueueWithString(ConcurrentLinkedQueue<String> q){
        for(int i = 0; i < 10; i++){
            q.add("String element " + i);
        }
    }

    public static void main(String []args){
        ConcurrentLinkedQueue<String> queue1 = new ConcurrentLinkedQueue<String>();
        fillQueueWithString(queue1);
        System.out.println(queue1);

        //===================================ТЕСТ BoundedWaitList=======================================================
        BoundedWaitList<String> bList= new BoundedWaitList(5);
        System.out.println(bList);
        bList.add("String element 10");
        System.out.println(bList);
        bList.add("String element 11");
        System.out.println(bList);

        bList.remove();
        bList.add("String element 12");
        System.out.println(bList);

        System.out.println(bList.contains("String element 12"));
        System.out.println(bList.contains("String element 13"));


        System.out.println("");
        System.out.println("");
        //===================================ТЕСТ UnfairWaitList========================================================

        UnfairWaitList<String> uList= new UnfairWaitList(queue1);
        System.out.println(uList);
        uList.add("String element 10");
        System.out.println(uList);
        uList.add("String element 11");
        System.out.println(uList);

        uList.remove();
        uList.add("String element 12");
        System.out.println(uList);

        System.out.println(uList.contains("String element 12"));
        System.out.println(uList.contains("String element 13"));

        uList.remove("String element 1");
        uList.remove("String element 3");
        uList.remove("String element 5");
        uList.remove("String element 7");
        uList.remove("String element 9");
        uList.remove("String element 11");

        System.out.println(uList);

    }
}
