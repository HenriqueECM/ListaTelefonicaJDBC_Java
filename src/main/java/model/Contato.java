package model;

public class Contato {
    private int id;
    private String nome, telefone;

    public Contato(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }

    public Contato (int id, String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
