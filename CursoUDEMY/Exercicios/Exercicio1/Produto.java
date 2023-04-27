package CursoUDEMY.Exercicios.Exercicio1;

public class Produto {

    double preco;
    String nome;

    public Produto(Double preco, String nome) {
        this.preco = preco;
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }
}