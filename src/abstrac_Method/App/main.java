package abstrac_Method.App;

public class main {
    public static void main(String[] args) {
        Node nodeA = new Node();
        nodeA.data = 3;
        Node nodeB = new Node();
        nodeB.data = 4;
        Node nodeC = new Node();
        nodeC.data = 7;
        Node nodeD = new Node();
        nodeD.data = 8;
        Node nodeE = new Node();
        nodeE.data = 10;

        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;
        nodeD.next = nodeE;

        System.out.println("Node A Length: " + listLength(nodeA));
        System.out.println("Node B Length: " + listLength(nodeB));

    }

    public static int listLength(Node aNode) {
        int length = 0;
        Node currentNode = aNode;
        while (currentNode != null) {
            length++;
            currentNode = currentNode.next;
        }
        return length;
    }

}


