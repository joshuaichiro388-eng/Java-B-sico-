import java.util.Scanner;
public class Main {
    public static void main(String[] gets) {
        Scanner s = new Scanner(System.in);
        int numeros[] = new int[10];
        numeros = preencherVetor(numeros, s);
        int quantidadePar = ParouImpar(numeros);
        Mostrar(quantidadePar);
        s.close();
    }
    public static int[] preencherVetor(int numeros[], Scanner s){
        System.out.println("Digite 10 numeros:");
        for(int i = 0; i < 10; i++){
            numeros[i] = s.nextInt();
        }
        return numeros;
    }
    public static int ParouImpar(int numeros[]){
        int par = 0;
        for(int i = 0; i < 10; i++){
            if(numeros[i] % 2 == 0){
                par++;
            }
        }
        return par;
    }
    public static void Mostrar(int par){
        System.out.println("Existem " + par + " numeros pares");
    }
}
