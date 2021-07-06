import java.util.*; 

public class Base {
	public static void main(String[] args) {  
	
		Scanner sc = new Scanner(System.in); 
		sc.useLocale(Locale.US);
		
		System.out.println("Caixa Eletronico em JAVA");

		int tentativas = 3;
		double saldo = 999.12;

		System.out.print("Informe seu nome: ");
			String usuario = sc.nextLine();
		
		while (tentativas > 0) {
			
			
			System.out.print("\nInforme sua senha: ");  
			int senha = sc.nextInt();  
			
			if (senha == 1234) { 
			
				System.out.print("Escolha uma das opcoes:\n1. Saldo\n2. Saque\n3. Deposito\n4. Sair");
				try {
					
					System.out.print("\nEscolha uma opcao: ");
						
					int opcao = sc.nextInt(); 	
					if (opcao == 1) { 
						System.out.print("\nSeu saldo é de: R$ " + saldo);
					
					} else if (opcao == 2) { 
						System.out.print("\nSeu saldo e de: R$" + saldo);
						
						System.out.print("\nInforme o valor para retirada: ");
						double retirada = sc.nextDouble();
						
						if (retirada > 0 && retirada <= saldo){
							saldo = saldo - retirada;
							System.out.print("\nSaque realizado com sucesso. \nO saldo na sua conta e de: " + saldo);
							
						} else if (retirada > saldo){

							System.out.print("\nNao ha saldo suficiente na conta.");

						} else {

							System.out.print("\nSua conta nao foi movimentada.");
						}
						
					} else if (opcao == 3) { 
						System.out.print("\nPor favor, informe o valor para deposito: ");
						double deposito = sc.nextDouble(); 

						saldo = saldo + deposito;
						
						System.out.print("\nDeposito realizado com sucesso. \nSeu saldo e de " + saldo);
						
					} else if (opcao == 4) {
						System.out.print("\nObrigado por utilizar o nosso Banco " + usuario);
						System.exit(0); 
						
					} else {
						System.out.print("\nOpcao invalida\nTente Novamente. ");
					}
				
				} catch(Exception e) {
					
				  System.out.print("Houve um erro. Por favor, escolha uma opcao entre 1, 2, 3 e 4");
				  System.out.print("Erro: " + e);
				}
				
			} else {
				System.out.print("Senha invalida\n");
				tentativas -= 1;
					
				if (tentativas > 0){
					System.out.print("\nVoce possui "+ tentativas +" tentativa(s)");
				} else {
					System.out.print("\nSeu acesso foi bloqueado.");
					sc.close();
				}
			}
		}
		
			System.out.print("\nPor favor, contate o seu gerente.");
			sc.close();

		}
	}	
	
/* 0. Há alguns erros no código que impedem a execução ou não informam os valores corretos ao usuário. É hora de pegá-los. 

1. Quando o usuário informar que um valor para saque seja igual ao valor do saldo em conta, não é possível sacar. Qual o erro e como corrigir?

2. Ao usuário informar que um valor para depósito o código não está funcionando corretamente. Qual o erro e como corrigir?

3. Quando houver um saque, é necessário informar "Saque realizado com sucesso". 

4. Quando houver um depósito, é necessário informar "Saque realizado com sucesso". 

5. Altere o código para incluir o nome do usuário no começo da interação (antes mesmo de solicitar a senha). A Mensagem de despedida deve conter o nome do usuário. */