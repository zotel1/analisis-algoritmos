
public class AlgoritmoDeLaMitad {
    public void inprimirMitad(int[] arr){
        for (int i = 0; i < arr.length / 2; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        AlgoritmoDeLaMitad algoritmo = new AlgoritmoDeLaMitad();
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        algoritmo.inprimirMitad(numeros);
    }
}
