import java.util.Scanner;

public class ExemploScanner {
    public static void main(String[] args) {
        //Declaração de variáveis
        double soma, num1, num2, resto, sub, multi, div;
        
        //Comando para leitura de dados pelo teclado
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite um número: ");
        num1 = leia.nextDouble();

        System.out.print("Digite outro número: ");
        num2 = leia.nextDouble();

        soma = num1 + num2;
        sub = num1 - num2;
        multi = num1*num2;
        div = num1/num2;
        resto = num1%num2;

        System.out.println("O resultado da soma dos números é " + soma);
        System.out.println("O resultado da subtração dos números é " + sub);
        System.out.println("O resultado da multiplicação dos números é " + multi);
        System.out.println("O resultado da divisão dos números é " + div);
        System.out.println("O resto da divisão dos números é " + resto);
        
    }
}
