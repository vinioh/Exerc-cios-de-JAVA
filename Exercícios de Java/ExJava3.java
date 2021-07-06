//3. Faça um programa que leia 3 valores (considere que não serão informados valores iguais) e escreva a soma dos 2 maiores.

import java.util.*; 
public class ExJava3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 

        System.out.print("Informe o primeiro numero: ");
        int n1 = sc.nextInt();

        System.out.print("Informe o segundo numero: ");
        int n2 = sc.nextInt();

        System.out.print("Informe o terceiro numero: ");
        int n3 = sc.nextInt();

        if (n1<n2 && n1<n3) {
		int soma = n2+n3;
                System.out.println("O a soma dos maiores numeros e " + soma);
            }

            else if (n2<n1 && n2<n3) {
		int soma = n1+n3;
                System.out.println("O a soma dos maiores numeros e " + soma);
            }

            else if (n3<n1 && n3<n2){
		int soma = n1+n2;
                System.out.println("A soma dos maiores numeros e " + soma);
            }
    }
}