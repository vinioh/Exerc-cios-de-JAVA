import java.util.*; 
public class ExJavaCinema {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*variáveis da sala Alpha*/
        int alphaAn = 21;
        int alphaBn = 21;
        int alphaCn = 21;
        int alphaDn = 21;
        int alphaEn = 21;
        int alphaFn = 21;
        int alphaAp = 3;
        int alphaBp = 3;
        int alphaCp = 2;
        int alphaDp = 2;
        int alphaEp = 2;
        int alphaFp = 2;

        int alphaA = alphaAn + alphaAp;
        int alphaB = alphaBn + alphaBp;
        int alphaC = alphaCn + alphaCp;
        int alphaD = alphaDn + alphaDp;
        int alphaE = alphaEn + alphaEp;
        int alphaF = alphaFn + alphaFp;

        /*variáveis da sala Beta*/
        int betaAn=22;
        int betaBn=22;
        int betaCn=22;
        int betaDn=22;
        int betaEn=22;
        int betaAp=2;
        int betaBp=2;
        int betaCp=2;
        int betaDp=2;
        int betaEp=2;

        int betaA = betaAn + betaAp;
        int betaB = betaBn + betaBp;
        int betaC = betaCn + betaCp;
        int betaD = betaDn + betaDp;
        int betaE = betaEn + betaEp;
        

        System.out.println("Compre ingressos para o cinema do Jailson !");

         System.out.println("Primeiro insira seu nome : ");
         String nome = sc.nextLine();

         System.out.println("Escolha a sessão: \n1 - As Branquelas \n2 - A Chegada");
         int sessao = sc.nextInt();

         switch (sessao) {
             case 1:{
             System.out.println("Escolha a fileira:");
             System.out.println("Fileira 1 = " + alphaA +" assentos disponiveis \nFileira 2 = " + alphaB +" assentos disponiveis \nFileira 3 = " + alphaC +" assentos disponiveis \nFileira 4 = " + alphaD +" assentos disponiveis \nFileira 5 = " + alphaE +" assentos disponíveis \nFileira 6 = "+alphaF+" assentos disponíveis");
             int fileira = sc.nextInt();
                switch (fileira){

                    case 1: {
                    System.out.println("Assentos normais ou preferenciais? \n1- Normal "+alphaAn+ " disponíveis \n2- Preferencial "+alphaAp+" disponíveis");
                    int assento = sc.nextInt();

                    if (assento == 1) {
                        System.out.println("Digite a quantidade de ingressos que deseja comprar:");
                        int ingresso = sc.nextInt();

                        if (ingresso <= alphaAn && ingresso > 0){
                        alphaAn = alphaAn - ingresso;

                        System.out.println("Você comprou "+ingresso+" ingresso(s)."+alphaAn+" assentos disponíveis.");
                        System.out.println(nome+", seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme.");
                        }
                        else {
                            System.out.println("Quantidade de ingressos indisponivel");
                        }
                    }
                    else if(assento == 2){
                        System.out.println("Digite a quantidade de ingressos que deseja comprar:");
                        int ingresso = sc.nextInt();

                        if (ingresso <= alphaAp && ingresso > 0){
                        alphaAp = alphaAp - ingresso;

                        System.out.println("Você comprou "+ingresso+" ingresso(s)."+alphaAp+" assentos disponíveis.");
                        System.out.println(nome+", seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme.");
                        }
                        else {
                            System.out.println("Quantidade de ingressos indisponivel.");
                        }
                    }

                    break; }
                    case 2:{
                     System.out.println("Assentos normais ou preferenciais? \n1- Normal "+alphaBn+ " disponíveis \n2- Preferencial "+alphaBp+" disponíveis");
                    int assento = sc.nextInt();

                    if (assento == 1) {
                        System.out.println("Digite a quantidade de ingressos que deseja comprar:");
                        int ingresso = sc.nextInt();

                        if (ingresso <= alphaBn && ingresso > 0){
                        alphaBn = alphaBn - ingresso;

                        System.out.println("Você comprou "+ingresso+" ingresso(s)."+alphaBn+" assentos disponíveis.");
                        System.out.println(nome+", seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme.");
                        }
                        else {
                            System.out.println("Quantidade de ingressos indisponivel");
                        }
                    }
                    else if(assento == 2){
                        System.out.println("Digite a quantidade de ingressos que deseja comprar:");
                        int ingresso = sc.nextInt();

                        if (ingresso <= alphaBp && ingresso > 0){
                        alphaBp = alphaBp - ingresso;

                        System.out.println("Você comprou "+ingresso+" ingresso(s)."+alphaBp+" assentos disponíveis.");
                        System.out.println(nome+", seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme.");
                        }
                        else {
                            System.out.println("Quantidade de ingressos indisponivel.");
                        }
                    }

                    break;}
                    case 3:{
                     System.out.println("Assentos normais ou preferenciais? \n1- Normal "+alphaCn+ " disponíveis \n2- Preferencial "+alphaCp+" disponíveis");
                    int assento = sc.nextInt();

                    if (assento == 1) {
                        System.out.println("Digite a quantidade de ingressos que deseja comprar:");
                        int ingresso = sc.nextInt();

                        if (ingresso <= alphaCn && ingresso > 0){
                        alphaCn = alphaCn - ingresso;

                        System.out.println("Você comprou "+ingresso+" ingresso(s)."+alphaCn+" assentos disponíveis.");
                        System.out.println(nome+", seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme.");
                        }
                        else {
                            System.out.println("Quantidade de ingressos indisponivel");
                        }
                    }
                    else if(assento == 2){
                        System.out.println("Digite a quantidade de ingressos que deseja comprar:");
                        int ingresso = sc.nextInt();

                        if (ingresso <= alphaCp && ingresso > 0){
                        alphaCp = alphaCp - ingresso;

                        System.out.println("Você comprou "+ingresso+" ingresso(s)."+alphaCp+" assentos disponíveis.");
                        System.out.println(nome+", seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme.");
                        }
                        else {
                            System.out.println("Quantidade de ingressos indisponivel.");
                        }
                    }

                    break;}
                    case 4:{
                     System.out.println("Assentos normais ou preferenciais? \n1- Normal "+alphaDn+ " disponíveis \n2- Preferencial "+alphaDp+" disponíveis");
                    int assento = sc.nextInt();

                    if (assento == 1) {
                        System.out.println("Digite a quantidade de ingressos que deseja comprar:");
                        int ingresso = sc.nextInt();

                        if (ingresso <= alphaDn && ingresso > 0){
                        alphaDn = alphaDn - ingresso;

                        System.out.println("Você comprou "+ingresso+" ingresso(s)."+alphaDn+" assentos disponíveis.");
                        System.out.println(nome+", seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme.");
                        }
                        else {
                            System.out.println("Quantidade de ingressos indisponivel");
                        }
                    }
                    else if(assento == 2){
                        System.out.println("Digite a quantidade de ingressos que deseja comprar:");
                        int ingresso = sc.nextInt();

                        if (ingresso <= alphaDp && ingresso > 0){
                        alphaDp = alphaDp - ingresso;

                        System.out.println("Você comprou "+ingresso+" ingresso(s)."+alphaDp+" assentos disponíveis.");
                        System.out.println(nome+", seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme.");
                        }
                        else {
                            System.out.println("Quantidade de ingressos indisponivel.");
                        }
                    }
                    
                    break;}
                    case 5:{
                     System.out.println("Assentos normais ou preferenciais? \n1- Normal "+alphaEn+ " disponíveis \n2- Preferencial "+alphaEp+" disponíveis");
                    int assento = sc.nextInt();

                    if (assento == 1) {
                        System.out.println("Digite a quantidade de ingressos que deseja comprar:");
                        int ingresso = sc.nextInt();

                        if (ingresso <= alphaEn && ingresso > 0){
                        alphaEn = alphaEn - ingresso;

                        System.out.println("Você comprou "+ingresso+" ingresso(s)."+alphaEn+" assentos disponíveis.");
                        System.out.println(nome+", seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme.");
                        }
                        else {
                            System.out.println("Quantidade de ingressos indisponivel");
                        }
                    }
                    else if(assento == 2){
                        System.out.println("Digite a quantidade de ingressos que deseja comprar:");
                        int ingresso = sc.nextInt();

                        if (ingresso <= alphaEp && ingresso > 0){
                        alphaEp = alphaEp - ingresso;

                        System.out.println("Você comprou "+ingresso+" ingresso(s)."+alphaEp+" assentos disponíveis.");
                        System.out.println(nome+", seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme.");
                        }
                        else {
                            System.out.println("Quantidade de ingressos indisponivel.");
                        }
                    }

                    break;}
                    case 6:{
                    System.out.println("Assentos normais ou preferenciais? \n1- Normal "+alphaFn+ " disponíveis \n2- Preferencial "+alphaFp+" disponíveis");
                    int assento = sc.nextInt();

                    if (assento == 1) {
                        System.out.println("Digite a quantidade de ingressos que deseja comprar:");
                        int ingresso = sc.nextInt();

                        if (ingresso <= alphaFn && ingresso > 0){
                        alphaFn = alphaFn - ingresso;

                        System.out.println("Você comprou "+ingresso+" ingresso(s)."+alphaFn+" assentos disponíveis.");
                        System.out.println(nome+", seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme.");
                        }
                        else {
                            System.out.println("Quantidade de ingressos indisponivel");
                        }
                    }
                    else if(assento == 2){
                        System.out.println("Digite a quantidade de ingressos que deseja comprar:");
                        int ingresso = sc.nextInt();

                        if (ingresso <= alphaFp && ingresso > 0){
                        alphaFp = alphaFp - ingresso;

                        System.out.println("Você comprou "+ingresso+" ingresso(s)."+alphaFp+" assentos disponíveis.");
                        System.out.println(nome+", seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme.");
                        }
                        else {
                            System.out.println("Quantidade de ingressos indisponivel.");
                        }
                    }

                    break;}
                }
            break;}

            case 2:{
            System.out.println("Escolha a fileira:");
             System.out.println("Fileira 1 = " + betaA +" assentos disponiveis \nFileira 2 = " + betaB +" assentos disponiveis \nFileira 3 = " + betaC +" assentos disponiveis \nFileira 4 = " + betaD +" assentos disponiveis \nFileira 5 = " + betaE +" assentos disponíveis");
             int fileira = sc.nextInt();
                switch (fileira){

                    case 1:{
                    System.out.println("Assentos normais ou preferenciais? \n1- Normal "+betaAn+ " disponíveis \n2- Preferencial "+betaAp+" disponíveis");
                    int assento = sc.nextInt();

                    if (assento == 1) {
                        System.out.println("Digite a quantidade de ingressos que deseja comprar:");
                        int ingresso = sc.nextInt();

                        if (ingresso <= betaAn && ingresso > 0){
                        betaAn = betaAn - ingresso;

                        System.out.println("Você comprou "+ingresso+" ingresso(s)."+betaAn+" assentos disponíveis.");
                        System.out.println(nome+", seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme.");
                        }
                        else {
                            System.out.println("Quantidade de ingressos indisponivel");
                        }
                    }
                    else if(assento == 2){
                        System.out.println("Digite a quantidade de ingressos que deseja comprar:");
                        int ingresso = sc.nextInt();

                        if (ingresso <= betaAp && ingresso > 0){
                        betaAp = betaAp - ingresso;

                        System.out.println("Você comprou "+ingresso+" ingresso(s)."+betaAp+" assentos disponíveis.");
                        System.out.println(nome+", seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme.");
                        }
                        else {
                            System.out.println("Quantidade de ingressos indisponivel.");
                        }
                    }

                    break;}
                    case 2:{
                     System.out.println("Assentos normais ou preferenciais? \n1- Normal "+betaBn+ " disponíveis \n2- Preferencial "+betaBp+" disponíveis");
                    int assento = sc.nextInt();

                    if (assento == 1) {
                        System.out.println("Digite a quantidade de ingressos que deseja comprar:");
                        int ingresso = sc.nextInt();

                        if (ingresso <= betaBn && ingresso > 0){
                        betaBn = betaBn - ingresso;

                        System.out.println("Você comprou "+ingresso+" ingresso(s)."+betaBn+" assentos disponíveis.");
                        System.out.println(nome+", seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme.");
                        }
                        else {
                            System.out.println("Quantidade de ingressos indisponivel");
                        }
                    }
                    else if(assento == 2){
                        System.out.println("Digite a quantidade de ingressos que deseja comprar:");
                        int ingresso = sc.nextInt();

                        if (ingresso <= betaBp && ingresso > 0){
                        betaBp = betaBp - ingresso;

                        System.out.println("Você comprou "+ingresso+" ingresso(s)."+betaBp+" assentos disponíveis.");
                        System.out.println(nome+", seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme.");
                        }
                        else {
                            System.out.println("Quantidade de ingressos indisponivel.");
                        }
                    }

                    break;}
                    case 3:{
                     System.out.println("Assentos normais ou preferenciais? \n1- Normal "+betaCn+ " disponíveis \n2- Preferencial "+betaCp+" disponíveis");
                    int assento = sc.nextInt();

                    if (assento == 1) {
                        System.out.println("Digite a quantidade de ingressos que deseja comprar:");
                        int ingresso = sc.nextInt();

                        if (ingresso <= betaCn && ingresso > 0){
                        betaCn = betaCn - ingresso;

                        System.out.println("Você comprou "+ingresso+" ingresso(s)."+betaCn+" assentos disponíveis.");
                        System.out.println(nome+", seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme.");
                        }
                        else {
                            System.out.println("Quantidade de ingressos indisponivel");
                        }
                    }
                    else if(assento == 2){
                        System.out.println("Digite a quantidade de ingressos que deseja comprar:");
                        int ingresso = sc.nextInt();

                        if (ingresso <= betaCp && ingresso > 0){
                        betaCp = betaCp - ingresso;

                        System.out.println("Você comprou "+ingresso+" ingresso(s)."+betaCp+" assentos disponíveis.");
                        System.out.println(nome+", seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme.");
                        }
                        else {
                            System.out.println("Quantidade de ingressos indisponivel.");
                        }
                    }

                    break;}
                    case 4:{
                     System.out.println("Assentos normais ou preferenciais? \n1- Normal "+betaDn+ " disponíveis \n2- Preferencial "+betaDp+" disponíveis");
                    int assento = sc.nextInt();

                    if (assento == 1) {
                        System.out.println("Digite a quantidade de ingressos que deseja comprar:");
                        int ingresso = sc.nextInt();

                        if (ingresso <= betaDn && ingresso > 0){
                        betaDn = betaDn - ingresso;

                        System.out.println("Você comprou "+ingresso+" ingresso(s)."+betaDn+" assentos disponíveis.");
                        System.out.println(nome+", seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme.");
                        }
                        else {
                            System.out.println("Quantidade de ingressos indisponivel");
                        }
                    }
                    else if(assento == 2){
                        System.out.println("Digite a quantidade de ingressos que deseja comprar:");
                        int ingresso = sc.nextInt();

                        if (ingresso <= betaDp && ingresso > 0){
                        betaDp = betaDp - ingresso;

                        System.out.println("Você comprou "+ingresso+" ingresso(s)."+betaDp+" assentos disponíveis.");
                        System.out.println(nome+", seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme.");
                        }
                        else {
                            System.out.println("Quantidade de ingressos indisponivel.");
                        }
                    }
                    
                    break;}
                    case 5:{
                     System.out.println("Assentos normais ou preferenciais? \n1- Normal "+betaEn+ " disponíveis \n2- Preferencial "+betaEp+" disponíveis");
                    int assento = sc.nextInt();

                    if (assento == 1) {
                        System.out.println("Digite a quantidade de ingressos que deseja comprar:");
                        int ingresso = sc.nextInt();

                        if (ingresso <= betaEn && ingresso > 0){
                        betaEn = betaEn - ingresso;

                        System.out.println("Você comprou "+ingresso+" ingresso(s)."+betaEn+" assentos disponíveis.");
                        System.out.println(nome+", seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme.");
                        }
                        else {
                            System.out.println("Quantidade de ingressos indisponivel");
                        }
                    }
                    else if(assento == 2){
                        System.out.println("Digite a quantidade de ingressos que deseja comprar:");
                        int ingresso = sc.nextInt();

                        if (ingresso <= betaEp && ingresso > 0){
                        betaEp = betaEp - ingresso;

                        System.out.println("Você comprou "+ingresso+" ingresso(s)."+betaEp+" assentos disponíveis.");
                        System.out.println(nome+", seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme.");
                        }
                        else {
                            System.out.println("Quantidade de ingressos indisponivel.");
                        }
                    }

                    break;}
        
                }
            break;}
         }
    }
}
