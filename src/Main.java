import model.Contato;
import model.Musica;

public class Main {

    public static void main(String[] args) {
        iPhone iphone = new iPhone();

        System.out.println("---Telefone---");
        iphone.adicionarContato(new Contato("Vinicius", "123456789"));
        iphone.adicionarContato(new Contato("Vitor", "987654321"));
        iphone.ligar(iphone.contatos.get(0));
        iphone.atender();
        iphone.iniciarCorreioDeVoz();

        System.out.println("---Navegador---");
        iphone.exibirPagina();
        iphone.atualizarPagina();
        iphone.adicionarNovaAba();

        System.out.println("---Reprodutor Musical---");
        iphone.adicionarMusica(new Musica("No Apologies", "Eminem", "Eminem Presents: The Re-Up"));
        iphone.adicionarMusica(new Musica("8 mile", "Eminem", "8 mile"));
        iphone.adicionarMusica(new Musica("R.A.K.I.M", "Rakim", "8 mile"));

        iphone.tocar(iphone.playlist.get(0));
        iphone.tocar(iphone.playlist.get(1));
        iphone.pausar();

        iphone.selecionarMusica(iphone.playlist.get(2));
        iphone.tocar(iphone.playlist.get(2));

    }
}
