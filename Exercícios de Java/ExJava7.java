//7. Faça um programa que leia 10 números que o usuário vai informar. Todos os números lidos com valor inferior a 40 devem ser somados. Escreva o valor final da soma efetuada.

import java.util.*; 
public class ExJava7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 

        System.out.print("Informe dez numeros: ");
        
        float soma = 0;

        for (int x = 0 ; x<=9 ; x++){
            float n = sc.nextFloat();
            if (n<40){
            soma = soma + n;
            }
        }
        
        System.out.print("O resultado da soma dos numesros menores que 40 e:" + soma);
    }
}