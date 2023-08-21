package model;

public class Contato {
    private String nome;
    private String numero;
    private String email;

    public Contato(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
