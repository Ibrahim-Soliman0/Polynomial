public class Main {
    public static void main(String[] args) {
        Polynomial p1 = new Polynomial();
        p1.addTerm(3,4);
        p1.addTerm(4,3);
        p1.addTerm(3,2);
        p1.addTerm(3,1);
        p1.addTerm(1,0);
        Polynomial p2 = new Polynomial();
        p2.addTerm(3,4);
        p2.addTerm(5,2);
        p2.addTerm(3,1);
        p2.addTerm(1,0);
        System.out.println("Function one: ");
        Polynomial.print(p1);
        System.out.println("Function Two: ");
        Polynomial.print(p2);
        System.out.println("Subtraction: ");
        Polynomial p3 = Polynomial.subtractPolynomial(p1, p2);
        Polynomial.print(p3);
        Polynomial.evaluate(p1, 3);
    }
}
