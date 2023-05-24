public class Polynomial {
    LinkedList linkedList = new LinkedList();
    public Polynomial(){}

    public void addTerm(double coff, int pow){
        linkedList.add(coff,pow);
    }
    public static Polynomial addPolynomial(Polynomial p1, Polynomial p2){
        Node firstNode = p1.linkedList.head;
        Node secondNode = p2.linkedList.head;

        Polynomial result = new Polynomial();

        while(firstNode != null && secondNode != null){
            if (firstNode.power > secondNode.power) {
                result.addTerm(firstNode.coefficient, firstNode.power);
                firstNode = firstNode.next;
            } 
            else if (firstNode.power < secondNode.power) {
                result.addTerm(secondNode.coefficient, secondNode.power);
                secondNode = secondNode.next;
            }
            else {
                result.addTerm(firstNode.coefficient + secondNode.coefficient, firstNode.power);
                firstNode = firstNode.next;
                secondNode = secondNode.next;
            }
        }
        return result;
    }
    public static Polynomial subtractPolynomial(Polynomial p1, Polynomial p2){
        Node firstNode = p1.linkedList.head;
        Node secondNode = p2.linkedList.head;

        Polynomial result = new Polynomial();

        while(firstNode != null && secondNode != null){
            if (firstNode.power > secondNode.power) {
                result.addTerm(firstNode.coefficient, firstNode.power);
                firstNode = firstNode.next;
            }
            else if (firstNode.power < secondNode.power) {
                result.addTerm(secondNode.coefficient, secondNode.power);
                secondNode = secondNode.next;
            }
            else {
                if (firstNode.coefficient > secondNode.coefficient) {
                        result.addTerm(-(firstNode.coefficient - secondNode.coefficient), firstNode.power);
                } else if (firstNode.coefficient < secondNode.coefficient) {
                    result.addTerm(-(secondNode.coefficient - firstNode.coefficient), firstNode.power);
                }
                else{
                    result.addTerm(firstNode.coefficient - secondNode.coefficient, firstNode.power);
                }
                firstNode = firstNode.next;
                secondNode = secondNode.next;
            }
        }
        return result;
    }
    public static Polynomial multiplyPolynomial(Polynomial p1, Polynomial p2){
        Node firstNode = p1.linkedList.head;
        Node secondNode = p2.linkedList.head;

        Polynomial result = new Polynomial();

        while (firstNode != null){
            while (secondNode != null){
                result.addTerm(firstNode.coefficient * secondNode.coefficient, firstNode.power + secondNode.power);
                secondNode  = secondNode.next;
            }
            firstNode = firstNode.next;
        }
        return result;
    }
    public static void print(Polynomial p1){
        Node node = p1.linkedList.head;
        boolean firstTerm = true;

        while (node != null) {
            if (firstTerm) {
                System.out.print(node.coefficient + "X^" + node.power);
                firstTerm = false;
            } else {
                if (node.coefficient >= 0) {
                    System.out.print(" + " + node.coefficient + "X^" + node.power);
                } else {
                    System.out.print(" - " + Math.abs(node.coefficient) + "X^" + node.power);
                }
            }

            node = node.next;
        }

        System.out.println();
    }
    public static void evaluate(Polynomial p1, int x){
        Node head = p1.linkedList.head;
        double result = 0;
        while (head != null){
            result += head.coefficient * (Math.pow(x,head.power));
            head = head.next;
        }
        System.out.println("Evaluation at X = " + "\"" + x + "\"" + " is = " + result);
    }
}
