import java.util.Random;
import java.util.Scanner;

public class JogAdivinhacao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        int numeroGerado = new Random().nextInt(100);
        int tentativas = 0;
        while (tentativas < 5){
            System.out.println("Digite um numero entre 0 e 100 ");
            int numeroDigitado = leitor.nextInt();
            tentativas++;

            if(numeroDigitado == numeroGerado){
                System.out.println("Parabens, vc acertou");
                break;
            } else if (numeroDigitado < numeroGerado) {
                System.out.println("O numero digitado é menor ");
            } else{
                System.out.println("O numero digitado é maior");
            }
        }
        if (tentativas == 5){
            System.out.println("Voce não conseguiu adivinhar");
        }
    }
}
