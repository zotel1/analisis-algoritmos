
public class Factorial{
public static int factorial(int n){
    if(n <= 1) return 1;
    return n* factorial(n-1);
}

public static void main(String args[]){
    int numero = 5;
    int resultado = factorial(numero);
    System.out.println("El factorial de " + numero + " es: " + resultado);
}

}