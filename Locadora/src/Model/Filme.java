package Model;

public class Filme {

    private String titulo;
    private String genero;
    private double ValorAluguel;

    public Filme(String titulo, String genero, double valorAluguel) {
        this.titulo = titulo;
        this.genero = genero;
        ValorAluguel = valorAluguel;
    }

    public double getValorAluguel() {
        return ValorAluguel;
    }

    public void setValorAluguel(double valorAluguel) {
        ValorAluguel = valorAluguel;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
