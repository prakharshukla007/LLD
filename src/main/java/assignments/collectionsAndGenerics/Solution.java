package assignments.collectionsAndGenerics;

import java.util.Iterator;

public class Solution {
    static class Node implements Iterable<Integer>{
        private int data;
        private Node next;

        public Node(int data, Node next){
            this.data = data;
            this.next = next;
        }

        @Override
        public Iterator<Integer> iterator() {
            return new NodeIterator(this);
        }
    }

    static class NodeIterator implements Iterator<Integer>{

        static Node current;

        public NodeIterator(Node current){
            this.current = current;
        }
        @Override
        public boolean hasNext() {
            return this.current != null;
        }

        @Override
        public Integer next() {
            Node node = this.current;
            this.current = node.next;
            return node.data;
        }
    }
}
