//1. Faça um programa que leia um valor informado pelo usuário e diga se o valor informado é positivo, negativo ou zero.

import java.util.*;

public class ExJava1{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n1 = sc.nextInt();

        if (n1>0) {
            System.out.println("O número é positivo.");
        }
        else if (n1<0){
            System.out.println("O número é negativo.");
        }
        else{
            System.out.println("O número é 0.");
        }

    }
}