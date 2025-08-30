package memorias;

public class Strings {
    public static void main(String[] args) {
        
        String a = "Hola Mundo";
        String b = "Hola Mundo";

        String c = new String("Hola Mundo");
        String d = new String("Hola Mundo");

        String e = "Hola Mundo";
        String f = "Hola Mundo";

        if (a == b) {
            System.out.println("a y b son iguales.");
        } else {
            System.out.println("a y b no son iguales.");
        }

        if (c == d) {
            System.out.println("c y d son iguales.");
        } else {
            System.out.println("c y d no son iguales.");
        }

        if (e.equals(f)) {
            System.out.println("e y f son iguales en valor.");
        } else {
            System.out.println("e y f no son iguales en valor.");
            
        }
    }
    
}
