package br.com.dio;

import br.com.dio.model.gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        gato gato = new gato();
        System.out.println(gato);


        Livro livro1 = new Livro("O problema dos 3 corpos",  300);
        System.out.println(livro1);

    }
}

class Livro{
    private String nome;
    private Integer nunPaginas;

    public Livro(String nome, Integer nunPaginas) {
        this.nome = nome;
        this.nunPaginas = nunPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNunPaginas() {
        return nunPaginas;
    }

    public void setNunPaginas(Integer nunPaginas) {
        this.nunPaginas = nunPaginas;
    }


    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", nunPaginas=" + nunPaginas +
                '}';
    }
}
