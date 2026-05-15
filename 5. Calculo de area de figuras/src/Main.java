import java.util.Scanner;
void main() {
    Scanner s = new Scanner(System.in);
    System.out.println("Digite a altura e a base de um retangulo");
    double retanguloA = s.nextDouble();
    double retanguloB = s.nextDouble();
    System.out.println("Digite a altura e base de um triangulo");
    double trianguloA = s.nextDouble();
    double trianguloB = s.nextDouble();
    System.out.println("Digite o raio de um circulo");
    double circuloR = s.nextDouble();
    double retangulo = retanguloB * retanguloA;
    double triangulo = (trianguloB * trianguloA) / 2;
    double circulo = 3.141 * (circuloR * 2);
    System.out.println("Retangulo: " + retangulo + "\nTriangulo: " + triangulo + "\nCirculo: " + circulo);
}
