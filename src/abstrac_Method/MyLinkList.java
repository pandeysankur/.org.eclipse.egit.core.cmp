package abstrac_Method;

public class MyLinkList<T> {
    private Node<T> head;
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        MyLinkList<Integer> myLinkList = new MyLinkList<>();
        myLinkList.add(10);
        myLinkList.add(20);
        myLinkList.add(30);
        myLinkList.add(40);

        // myLinkList.addNewNode();
       /* myLinkList.print();
        myLinkList.addFrist(50);
        myLinkList.addFrist(60);
        myLinkList.print();*/
        myLinkList.addBetween(100, 0);
        myLinkList.deleteNode(2);
        myLinkList.print();
    }

    public void add(T t) {
        Node newNode = new Node();
        newNode.setT(t);
        newNode.setNext(null);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    public void print() {
        Node<T> currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.getT());
            currentNode = currentNode.getNext();
        }
    }

    /*public void addNewNode() {
        Node newNode = new Node();
        newNode.setT(50);
        newNode.setNext(null);

        if (head == null) {
            head = newNode.getNext();
        } else {
            Node current = head.getNext();
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }*/

    public void addFrist(int i) {

        Node newNode = new Node();
        newNode.setT(i);
        newNode.setNext(head);
        head = newNode;

    }

    public void addBetween(int value, int index) {
        Node newNode = new Node();
        newNode.setT(value);

        if (head == null) {
            // list is empty, can't add at index
            return;
        }

        int count = 0;
        Node current = head;
        while (current != null) {
            if (count == index) {
                // found the index to add at, update links
                newNode.setNext(current.getNext());
                current.setNext(newNode);
                return;
            }
            count++;
            current = current.getNext();
        }
    }

    public void deleteNode(int index) {
        if (head == null) {
            return;
        }

        if (index == 0) {

            head = head.getNext();
            return;
        }

        int count = 0;
        Node current = head;
        Node prev = null;
        while (current != null) {
            if (count == index) {

                prev.setNext(current.getNext());
                return;
            }
            count++;
            prev = current;
            current = current.getNext();
        }
    }


    public class Node<T> {
        private T t;
        private Node next;

        public T getT() {
            return t;
        }

        public void setT(T t) {
            this.t = t;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
