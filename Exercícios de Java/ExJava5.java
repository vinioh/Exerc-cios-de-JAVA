//5. Escreva um programa em Java que exiba verdadeiro ou falso se os dois números inseridos pelo usuário são positivos ou negativos.

import java.util.*; 
public class ExJava5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 

        System.out.print("Informe o primeiro numero: ");
        int n1 = sc.nextInt();

        System.out.print("Informe o segundo numero: ");
        int n2 = sc.nextInt();

        boolean verificar1 = n1 > 0 && n2 > 0 || n1 < 0 && n2 < 0 ;
            System.out.println(verificar1);
    }
}