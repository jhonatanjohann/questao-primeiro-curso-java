package br.com.alura.minhasmusicas.modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio){
        if(audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + "é considerado absoluto e preferido por todos.");
        } else {
            System.out.println(audio.getTitulo() + "também é um que todo mundo está curtindo");
        }
    }
}
