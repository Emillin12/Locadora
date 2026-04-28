package Model;

public class Filme {

    private String titulo;
    private String genero;
    private Double ValorAluguel;

    public Filme(String titulo, String genero, double ValorAluguel) {
        this.titulo = titulo;
        this.genero = genero;
        this.ValorAluguel = ValorAluguel;

    }

    public Filme(Double valorAluguel) {
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

    public void detalhes(){
        System.out.println(getTitulo() + " " + getGenero());
    }
    public void Desconto(){
        double desc = ValorAluguel - 10;
        System.out.println("O desconto é de: " + desc);
    }
}
