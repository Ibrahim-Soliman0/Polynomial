public class Node {
    double coefficient;
    int power;
    Node next;

    public Node() {}
    public Node(double coefficient, int power) {
        this.coefficient = coefficient;
        this.power = power;
        next = null;
    }
}
