//4. Faça um programa que receba dois números reais e mostre um menu de opções (Subtrair, Somar, Multiplicar e Dividir), realizando a operação de acordo com a opção escolhida no menu e mostrando o resultado.
import java.util.*; 

public class ExJava4 {
	public static void main(String[] args) {  
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("Informe o primeiro numero: ");  
		float n1 = sc.nextInt();  
		
		System.out.print("Informe o segundo numero: ");  
		float n2 = sc.nextInt(); 

        System.out.println("Adicao (1)");
        System.out.println("Subtracao (2)");
        System.out.println("Multiplicacao (3)");
        System.out.println("Divisao(4)");
        int equacao = sc.nextInt();
        float total;
        

        switch (equacao) {
            case 1:
             total = n1+n2;
             System.out.print("O resultado da operacao entre os dois numeros e: " + total);
                break;
                
            case 2:
             total = n1-n2;
             System.out.print("O resultado da operacao entre os dois numeros e: " + total);
                break;

            case 3:
             total = n1*n2;
             System.out.print("O resultado da operacao entre os dois numeros e: " + total);
                break;

            case 4:
             total = n1/n2;
             System.out.print("O resultado da operacao entre os dois numeros e: " + total);
                break;
        }

        
    }
}