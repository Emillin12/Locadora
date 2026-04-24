package Model;

public class Aluguel {

     private Cliente cliente;
     private Filme filme;
     public int dias;

    public Aluguel(Cliente cliente, Filme filme, int dias) {
        this.cliente = cliente;
        this.filme = filme;
        this.dias = dias;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public Double calculartotal() {


        return 0.0;
    }

    public String getResumo(){


        return "";
    }

}
