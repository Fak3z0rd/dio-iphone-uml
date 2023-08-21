import model.*;
import service.*;

import java.util.ArrayList;
import java.util.List;

public class iPhone implements Navegador, ReprodutorMusical, Telefone {
    List<Contato> contatos = new ArrayList<>();
    List<Musica> playlist = new ArrayList<>();

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página de Internet.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no navegador.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página.");
        System.out.println("Página atualizada.");
    }

    @Override
    public void tocar(Musica musica) {
        System.out.println("Tocando " + musica.getNome());

    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada!");

    }

    @Override
    public void selecionarMusica(Musica musica) {
        System.out.printf("%s selecionada. \n", musica.getNome());

    }

    @Override
    public void adicionarMusica(Musica musica) {
        this.playlist.add(musica);
        System.out.println("Música adicionada!");
    }

    @Override
    public void ligar(Contato contato) {
        System.out.println("Ligando para " + contato.getNome());

    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada");

    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void adicionarContato(Contato contato) {
        this.contatos.add(contato);
        System.out.println("Contato adicionado");
    }

    public List<Contato> getContatos() {
        return contatos;
    }
}