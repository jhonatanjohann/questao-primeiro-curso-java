package br.com.alura.minhasmusicas.modelos;

public class Audio {
    private String Titulo;
    private int reproducoes;
    private int curtidas;
    private int classificacao;


    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String nomeMusica) {
        this.Titulo = nomeMusica;
    }

    public int getReproducoes() {
        return reproducoes;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void curte() {
        this.curtidas++;
    }

    public void reproduzuz() {
        this.reproducoes++;
    }
}