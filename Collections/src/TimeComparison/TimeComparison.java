package TimeComparison;

import java.util.ArrayList;
import java.util.LinkedList;

public class TimeComparison {
    public static void beginComparison() {

        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();

        //ADDITION
        //Add at beginning
        System.out.println("Add elements at beginning: ");

        long start = System.nanoTime();
        arrayList.add(0, "Lorem");
        long stop = System.nanoTime();
        long duration = getDuration(start, stop);
        System.out.println("ArrayList: " + duration + " ms");

        start = System.nanoTime();
        linkedList.add(0, "Lorem");
        stop = System.nanoTime();
        duration = getDuration(start, stop);
        System.out.println("LinkedList: " + duration + " ms");

        arrayList.clear();
        linkedList.clear();

        //Add to middle
        System.out.println("Add elements to middle: ");

        start = System.nanoTime();
        arrayList.add(arrayList.size() / 2, "Lorem");
        stop = System.nanoTime();
        duration = getDuration(start, stop);
        System.out.println("ArrayList: " + duration + " ms");

        start = System.nanoTime();
        linkedList.add(linkedList.size() / 2, "Lorem");
        stop = System.nanoTime();
        duration = getDuration(start, stop);
        System.out.println("LinkedList: " + duration + " ms");

        arrayList.clear();
        linkedList.clear();
        //Add to End
        System.out.println("add elements to end: ");

        start = System.nanoTime();
        arrayList.add("Lorem");
        stop = System.nanoTime();
        duration = getDuration(start, stop);
        System.out.println("ArrayList: " + duration + " ms");

        start = System.nanoTime();
        linkedList.add("Lorem");
        stop = System.nanoTime();
        duration = getDuration(start, stop);
        System.out.println("LinkedList: " + duration + " ms");

        arrayList.clear();
        linkedList.clear();

        //REMOVAL
        //Remove from beginning
        System.out.println("Remove elements from beginning: ");

        arrayList.add("Lorem");
        linkedList.add("Lorem");

        start = System.nanoTime();
        arrayList.remove(0);
        stop = System.nanoTime();
        duration = getDuration(start, stop);
        System.out.println("ArrayList: " + duration + " ms");

        start = System.nanoTime();
        linkedList.remove(0);
        stop = System.nanoTime();
        duration = getDuration(start, stop);
        System.out.println("LinkedList: " + duration + " ms");

        arrayList.clear();
        linkedList.clear();
        //Remove from middle
        System.out.println("Remove elements from middle: ");

        arrayList.add("Lorem");
        linkedList.add("Lorem");

        start = System.nanoTime();
        arrayList.remove(arrayList.size()/2);
        stop = System.nanoTime();
        duration = getDuration(start, stop);
        System.out.println("ArrayList: " + duration + " ms");

        start = System.nanoTime();
        linkedList.remove(linkedList.size()/2);
        stop = System.nanoTime();
        duration = getDuration(start, stop);
        System.out.println("LinkedList: " + duration + " ms");

        arrayList.clear();
        linkedList.clear();
        //Remove from end
        System.out.println("Remove elements from end: ");

        arrayList.add("Lorem");
        linkedList.add("Lorem");

        start = System.nanoTime();
        arrayList.remove(arrayList.size()-1);
        stop = System.nanoTime();
        duration = getDuration(start, stop);
        System.out.println("ArrayList: " + duration + " ms");

        start = System.nanoTime();
        linkedList.remove(linkedList.size()-1);
        stop = System.nanoTime();
        duration = getDuration(start, stop);
        System.out.println("LinkedList: " + duration + " ms");

        arrayList.clear();
        linkedList.clear();

        //GET
        //Get from beginning
        System.out.println("get elements from end: ");

        arrayList.add("Lorem");
        linkedList.add("Lorem");

        start = System.nanoTime();
        arrayList.get(0);
        stop = System.nanoTime();
        duration = getDuration(start, stop);
        System.out.println("ArrayList: " + duration + " ms");

        start = System.nanoTime();
        linkedList.get(0);
        stop = System.nanoTime();
        duration = getDuration(start, stop);
        System.out.println("LinkedList: " + duration + " ms");

        arrayList.clear();
        linkedList.clear();

        //Get from middle
        System.out.println("get elements from middle: ");

        arrayList.add("Lorem");
        linkedList.add("Lorem");

        start = System.nanoTime();
        arrayList.get(arrayList.size() / 2);
        stop = System.nanoTime();
        duration = getDuration(start, stop);
        System.out.println("ArrayList: " + duration + " ms");

        start = System.nanoTime();
        linkedList.get(linkedList.size()/2);
        stop = System.nanoTime();
        duration = getDuration(start, stop);
        System.out.println("LinkedList: " + duration + " ms");

        arrayList.clear();
        linkedList.clear();

        //Get from end
        System.out.println("get elements from end: ");

        arrayList.add("Lorem");
        linkedList.add("Lorem");

        start = System.nanoTime();
        arrayList.get(arrayList.size()-1);
        stop = System.nanoTime();
        duration = getDuration(start, stop);
        System.out.println("ArrayList: " + duration + " ms");

        start = System.nanoTime();
        linkedList.get(linkedList.size()-1);
        stop = System.nanoTime();
        duration = getDuration(start, stop);
        System.out.println("LinkedList: " + duration + " ms");

        arrayList.clear();
        linkedList.clear();
    }

    private static long getDuration(long start, long stop) {
        return (stop - start) / 1000000;
    }
}
