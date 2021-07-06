package onibus;
class onibus{
    int local_atual;
    int quantidade_paradas;
    int capacidade;
    int passageiros;
    int destino;

    //Metodo Construtor

    public onibus(int local_atual, int quantidade_paradas, int capacidade, int passageiros, int destino){
        this.local_atual = local_atual;
        this.quantidade_paradas = quantidade_paradas;
        this.capacidade = capacidade;
        this.passageiros = passageiros;
        this.destino = destino;
    }

    public int returnLocal()  {
        return this.local_atual;
    }

    public int returnParadas()  {
        return this.quantidade_paradas;
    }

    public int returnCapacidade() {
        return this.capacidade;
    }

    public int returnPassageiros() {
        return this.passageiros;
    }

    public int returnDestino(){
        return this.destino;
    }
    
    public void entrar(int entra_passageiros){
        if (entra_passageiros >= 0 && this.passageiros + entra_passageiros <= this.capacidade){
            this.passageiros = this.passageiros + entra_passageiros; 
        }
            else {
                System.out.println("O ônibus está cheio!");
            }
    }

    public void sair(int sai_passageiros){
        if(sai_passageiros <= this.passageiros && sai_passageiros >=0){
            this.passageiros = this.passageiros - sai_passageiros;
        }
            else{
                System.out.println("Número de passageiros inválido.");
            }
    }

    public void andar(){
        this.local_atual = this.local_atual + 1; 
    }

    public void parar(){
        this.quantidade_paradas = this.quantidade_paradas + 1;
    }



}

