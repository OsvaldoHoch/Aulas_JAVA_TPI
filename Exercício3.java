
import java.util.Scanner;

public class Exercício3 {
    public static void main(String[] args) {
        int idade, total;

        Scanner leia = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        idade = leia.nextInt();

        total = idade*365;

        System.out.println("Você já viveu " + total + " dias");
    }
}
