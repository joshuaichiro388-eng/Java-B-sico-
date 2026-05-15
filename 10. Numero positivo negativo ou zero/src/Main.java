import java.util.Scanner;
void main() {
    Scanner s = new Scanner(System.in);
    System.out.println("Digite um numero: ");
    int N = s.nextInt();
    if(N > 0){
        System.out.println("O numero e positivo");
    } else if (N == 0) {
        System.out.println("O numero e zero");
    }else{
        System.out.println("O numero e negativo");
    }
}
