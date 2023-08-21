package service;

import model.Musica;

public interface ReprodutorMusical {
    void tocar(Musica musica);

    void pausar();

    void selecionarMusica(Musica musica);

    void adicionarMusica(Musica musica);
}
