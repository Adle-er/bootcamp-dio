import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

/**
* <h1>jogoAdivinhacao</h1>
* O jogo escolherá um número aleatório de 0 a 100 e você precisará acertar.
* <p>
*
* @author  Adler Tawan
* @version 1.0
* @since   06/18/2024
*/
public class jogoAdivinhacao {
    /**
   * @param numeroAdivinhacao este é número aleatório que o jogo escolherá.
   * @param tentativa aqui é a quantidade de vezes que o jogador tentou acertar o número.
   * @param palpite aqui é o número que o jogador acredita que seja.   
   */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Random random = new Random ();

        int numeroAdivinhacao = random.nextInt(101);

        System.out.println("Digite o número que você acredite ser:");
        int palpite = scanner.nextInt();
        int tentativa = 0;

        while (palpite != numeroAdivinhacao) {

            if (palpite > numeroAdivinhacao) {
                System.out.println("Muito alto! Tente novamente.");
                palpite = scanner.nextInt();
                 tentativa = tentativa+1;
            } else if (palpite < numeroAdivinhacao) {
                System.out.println("Muito baixo! Tente novamente.");
                palpite = scanner.nextInt();
                tentativa = tentativa+1;
            }
        }

        System.out.println("Muito bem! Você acertou o número.");
        System.out.println("Você acertou em " + tentativa + " tentativas!");

        scanner.close();
    }
}
