import java.util.Scanner;

public class ContaTerminal {
	
	private static Scanner ler;

	public static void main(String[] args) {
		
		ler = new Scanner(System.in);
		
		int numero = 0;
		double saldo = 0;
		String agencia = "";
		String nomecliente = "";
		
		System.out.println("Por favor, digite o numero da conta: ");
		numero = ler.nextInt();
		
		System.out.println("Agora o numero da Agencia: ");
		agencia = ler.next();
		
		System.out.println("Nome: ");
		nomecliente = ler.next();
		
		System.out.println("Efetue um deposito para ativação da conta: R$");
		saldo = ler.nextDouble();
		
		
		System.out.println("Olá " + nomecliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + numero + ""
				+ " e seu saldo R$" + saldo + " já está disponivel para saque.");
		
		
		
		
	}

}
