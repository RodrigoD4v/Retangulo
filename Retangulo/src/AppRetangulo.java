import java.util.Scanner;
public class AppRetangulo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Retangulo retangulo = new Retangulo(0, 0);
        
        System.out.println("Digete a altura do retângulo:");
        retangulo.heigth = sc.nextDouble();
        System.out.println("Digete a largura do retângulo:");
        retangulo.width = sc.nextDouble();

        System.out.printf("O valor da área desse retângulo é de %.2f\n", retangulo.Area());
        System.out.printf("O valor da perimetro desse retângulo é de %.2f\n", retangulo.Perimeter());
        System.out.printf("O valor da diagonal desse retângulo é de %.2f\n", retangulo.Diagonal());
        sc.close();
    }
}