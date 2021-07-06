//6. Faça um programa em Java que leia 10 números informados pelo usuário e ao final da leitura escrever a soma total dos 10 números lidos.

import java.util.*; 
public class ExJava6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 

        System.out.print("Informe dez numeros: ");
        
        float soma = 0;

        for (int x = 0 ; x<=9 ; x++){
            float n = sc.nextFloat();
            soma = soma + n;
        }
        
        System.out.print("O resultado da soma dos numesros e:" + soma);
    }
}

