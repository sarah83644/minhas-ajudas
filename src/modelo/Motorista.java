package src.modelo;

public class Motorista {
    private String nome;
    private Carro carro; // carro -> tipo Carro

    // quando você fizer new Motorista, isso aqui vai ser chamado!
    public Motorista(String nome, Carro carro) {
        this.nome = nome;
        this.carro = carro;
    }

    public void exibir(){
        System.out.println("Motorista: " + nome);
        if (carro == null) {
            System.out.println("Carro: nenhum");
            return;
        }
        System.out.println("Carro: " + carro.getPlaca() + " - " + carro.getMarca());
    }

    public void trocarCarro(Carro novoCarro) {
        this.carro = novoCarro;
    }

    public static void main(String[] args) {
        Carro carro1 = new Carro("H7GR", "Gol", "Estrada", 231);
        Motorista motorista1 = new Motorista("Jõao", carro1);
        Carro carro2 = new Carro("BHKFT", "Fiat", "Sla", 234);
        Motorista motorista2 = new Motorista("Maria", carro2);
        Carro carro3 = null; // eu posso deixar assim?
        Motorista motorista3 = new Motorista("Luiz", carro3);
        
        motorista1.exibir();
        motorista2.exibir();
        motorista3.exibir();
        System.out.println();
        motorista2.exibir();
        motorista2.trocarCarro(carro1);
        System.out.println();
        motorista2.exibir();
    }
}