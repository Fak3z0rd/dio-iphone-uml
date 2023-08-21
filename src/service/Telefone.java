package service;

import model.Contato;

public interface Telefone {

    void ligar(Contato contato);

    void atender();

    void iniciarCorreioDeVoz();

    void adicionarContato(Contato contato);

}
