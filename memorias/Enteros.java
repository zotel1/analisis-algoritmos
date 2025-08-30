package memorias;

public class Enteros {
    
    public static void main(String[] args) {
        int a = 500;
        int b = 500;
        if (a == b) {
            System.out.println("a y b son iguales en valor.");
        } else {
            System.out.println("a y b no son iguales en valor.");
        }

        Integer c = 500;
        Integer d = 500;
        if (c == d) {
            System.out.println("c y d son iguales.");
        } else {
            System.out.println("c y d no son iguales.");
        }

        Integer e = new Integer(100);
        Integer f = new Integer(100);
        if (e == f) {
            System.out.println("e y f son iguales.");
        } else {
            System.out.println("e y f no son iguales.");
        }
    }
}
