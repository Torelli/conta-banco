import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("Digite o número da conta");
		int numero = scanner.nextInt();

		System.out.println("Digite a Agência");
		String agencia = scanner.next();

		scanner.nextLine(); // Consome o /n dos scanners anteriores

		System.out.println("Digite seu nome");
		String nome = scanner.nextLine();

		System.out.println("Digite o saldo");
		float saldo = scanner.nextFloat();

		System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é "
				+ agencia + ", conta " + numero + " e seu sado " + saldo
				+ " já está disponível para saque");
	}
}
