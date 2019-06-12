import org.w3c.dom.NodeList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> nodeList = new LinkedList<>();
        nodeList.add(5);
        nodeList.add(4);
        nodeList.add(3);
        nodeList.add(2);
        nodeList.add(1);
        System.out.println(nodeList);
        nodeList.addFirst(3);

        System.out.println(nodeList);
        System.out.println(nodeList.get(0));
    }
}
