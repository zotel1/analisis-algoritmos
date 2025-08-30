package memorias;

public class NuestrosObjetos {

    public Integer a;
    public static void main(String[] args) {
        NuestrosObjetos mem1 = new NuestrosObjetos();
        NuestrosObjetos mem2 = mem1;
        mem1.a = 1000; 

        System.out.println("Valor de a en mem1: " + mem1.a);
        System.out.println("Valor de a en mem2: " + mem2.a);
        mem2.a = 5000;
        System.out.println("Valor de a en mem1 después de cambiar mem2: " + mem1.a);
    }
}
