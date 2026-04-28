import Model.Aluguel;
import Model.Cliente;
import Model.Filme;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Milena", "35 99884-7330");
            System.out.println(cliente.getNome());

        Filme filme = new Filme("Tarzan" , "Aventura" , 25);
        filme.detalhes();
        filme.Desconto();

        Aluguel aluguel = new Aluguel(cliente,filme,10);
        aluguel.calculartotal();

    }
}