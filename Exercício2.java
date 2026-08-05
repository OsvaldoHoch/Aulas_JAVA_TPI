import java.util.Scanner;

public class Exercício2 {
    public static void main(String[] args) {
        double mediaFinal, media1, media2, nota1, nota2, nota3, nota4, nota5, nota6;

        Scanner leia = new Scanner(System.in);

        System.out.print("Digite a 1ª nota: ");
        nota1 = leia.nextDouble();
        System.out.print("Digite a 2ª nota: ");
        nota2 = leia.nextDouble();
        System.out.print("Digite a 3ª nota: ");
        nota3 = leia.nextDouble();

        media1 = (nota1 + nota2 + nota3)/3;

        System.out.println("A primeira média é igual a: " + media1);

        System.out.print("Digite a 4ª nota: ");
        nota4 = leia.nextDouble();
        System.out.print("Digite a 5ª nota: ");
        nota5 = leia.nextDouble();
        System.out.print("Digite a 6ª nota: ");
        nota6 = leia.nextDouble();

        media2 = (nota4 + nota5 + nota6)/3;

        System.out.println("A segunda média é igual a: " + media2);

        mediaFinal = (media1 + media2)/2;

        System.out.println("A média final é igual a: " + mediaFinal);

    }
}
