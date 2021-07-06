package onibus;
import java.util.*;
public class ExJavaMainOnibus{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escolha o ônibus que quer embarcar:\nÔnibus 1\nÔnibus 2\nÔnibus 3");
        int onibus = sc.nextInt();
        switch(onibus){
        
        case 1:
        onibus onibus1 = new onibus(0,0,50,0,5);

        System.out.println("\nÔnibus com destino para "+onibus1.returnDestino());
        
        System.out.println("A capacidade máxima do ônibus é de "+ onibus1.returnCapacidade() +" passageiros.");

        System.out.println("Há "+ onibus1.returnPassageiros() +" passageiros a bordo.");

        System.out.println("Estamos no local "+ onibus1.returnLocal() +"\nIremos partir!\n");

        while (onibus1.returnLocal() < onibus1.returnDestino()){
            onibus1.andar();
            onibus1.parar();
        
            System.out.println("Parada número "+onibus1.returnParadas()+".");
            System.out.println("Digite quantas pessoas irão entrar:");
            int pessoas_entrar = sc.nextInt();
            onibus1.entrar(pessoas_entrar);

            System.out.println("Digite quantas pessoas irão sair:");
            int pessoas_sair = sc.nextInt();
            onibus1.sair(pessoas_sair);

            System.out.println("Há "+ onibus1.returnPassageiros() +" passageiros a bordo.");

            System.out.println("Estamos no local "+ onibus1.returnLocal() +"\nIremos partir\n");
        }

        System.out.println("Chegamos ao nosso destino!");

        case 2:
        onibus onibus2 = new onibus(0,0,40,0,3);

        System.out.println("\nÔnibus com destino para "+onibus2.returnDestino());
        
        System.out.println("A capacidade máxima do ônibus é de "+ onibus2.returnCapacidade() +" passageiros.");

        System.out.println("Há "+ onibus2.returnPassageiros() +" passageiros a bordo.");

        System.out.println("Estamos no local "+ onibus2.returnLocal() +"\nIremos partir!\n");

        while (onibus2.returnLocal() < onibus2.returnDestino()){
            onibus2.andar();
            onibus2.parar();
        
            System.out.println("Parada número "+onibus2.returnParadas()+".");
            System.out.println("Digite quantas pessoas irão entrar:");
            int pessoas_entrar = sc.nextInt();
            onibus2.entrar(pessoas_entrar);

            System.out.println("Digite quantas pessoas irão sair:");
            int pessoas_sair = sc.nextInt();
            onibus2.sair(pessoas_sair);

            System.out.println("Há "+ onibus2.returnPassageiros() +" passageiros a bordo.");

            System.out.println("Estamos no local "+ onibus2.returnLocal() +"\nIremos partir!\n");
        }

        System.out.println("Chegamos ao nosso destino!");


        case 3:
        onibus onibus3 = new onibus(0,0,30,0,6);

        System.out.println("\nÔnibus com destino para "+onibus3.returnDestino());
        
        System.out.println("A capacidade máxima do ônibus é de "+ onibus3.returnCapacidade() +" passageiros.");

        System.out.println("Há "+ onibus3.returnPassageiros() +" passageiros a bordo.");

        System.out.println("Estamos no local "+ onibus3.returnLocal() +"\nIremos partir!\n");

        while (onibus3.returnLocal() < onibus3.returnDestino()){
            onibus3.andar();
            onibus3.parar();
        
            System.out.println("Parada número "+onibus3.returnParadas()+".");
            System.out.println("Digite quantas pessoas irão entrar:");
            int pessoas_entrar = sc.nextInt();
            onibus3.entrar(pessoas_entrar);

            System.out.println("Digite quantas pessoas irão sair:");
            int pessoas_sair = sc.nextInt();
            onibus3.sair(pessoas_sair);

            System.out.println("Há "+ onibus3.returnPassageiros() +" passageiros a bordo.");

            System.out.println("Estamos no local "+ onibus3.returnLocal() +"\nIremos partir!\n");
        }

        System.out.println("Chegamos ao nosso destino!");
        }
    }
}