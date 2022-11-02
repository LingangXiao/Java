package CollectionList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo2 {
    public static void main(String[] args) {
        LinkedList<String> stack = new LinkedList<>();
        stack.addFirst("Sean");
        stack.addFirst("1");
        stack.addFirst("2");
        stack.addFirst("3");

        //删除全部java信息
        stack.remove(3);

        Iterator<String> it = stack.iterator();
        while (it.hasNext()) {
            String ele = it.next();
            System.out.println(ele);

        }
    }
}
