// CISC 3160 Project

public class Tester {
    public static void main(String[] args) {
        Interpreter interprete = new Interpreter();

        try {
            interprete.interpreter("x = 001;");
        } catch (Exception e) {
            System.out.println("error");
        }
    }
}
