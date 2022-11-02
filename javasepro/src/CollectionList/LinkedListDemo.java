package CollectionList;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        //linkedList
        //基于双链表
        LinkedList<String> stack = new LinkedList<>();
        stack.addFirst("Sean");
        stack.addFirst("1");
        stack.addFirst("2");
        stack.addFirst("3");
        System.out.println(stack);

        System.out.println(stack.getFirst());


        LinkedList<String> queue = new LinkedList<>();
        queue.addLast("1");
        queue.addLast("2");
        queue.addLast("3");
        queue.addLast("4");

    }
}
