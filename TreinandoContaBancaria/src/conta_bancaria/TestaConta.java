package conta_bancaria;

import java.util.Scanner;

public class TestaConta  {
	public static void main(String[] args) {
		/*COLOCANDO VALORES MANUALMENTE
		Conta p1 = new Conta();
		p1.setNumConta(1234);
		p1.setDono("Rubi");
		p1.abrirConta("CC");
		
		p1.depositar(100);

		p1.sacar(150);
		p1.fecharConta();	
			
		Conta p2 = new Conta();
		p2.setNumConta(4321);
		p2.setDono("Jade");
		p2.abrirConta("CP");
		
		p2.depositar(200);
		p2.sacar(80);
		*/	
		
		//PEGANDO VALORES DO CONSOLE
		Scanner leitor = new Scanner(System.in);
		
		Conta p1 = new Conta();
		p1.setNumConta(0001);
		
		System.out.println("Digite seu nome para abrir a conta: ");
		p1.setDono(leitor.next());
		
		System.out.println("\nDigite [CC] para abrir uma Conta Corrente ou [CP] para abrir uma Conta Poupança: ");
		p1.abrirConta(leitor.next());
		
		System.out.println("\nDigite o valor que deseja depositar: ");
		p1.depositar(leitor.nextFloat());
		
		System.out.println("\nDigite o valor que deseja sacar: ");
		p1.sacar(leitor.nextFloat());
		
		
		p1.estadoAtual();
		leitor.close();
	}
}
