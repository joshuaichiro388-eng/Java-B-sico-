import java.util.Scanner;
void main() {
    Scanner s = new Scanner(System.in);
    System.out.println("Digite sua idade: ");
    int i = s.nextInt();
    if(i >= 18){
        System.out.println("Maior de idade");
    }else{
        System.out.println("Menor de idade");
    }
}
