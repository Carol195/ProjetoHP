package com.company;

public abstract class Cliente {
    protected String nome;
    protected int telefone;

    public Cliente(String nome, int telefone){
      setNome(nome);
      setTelefone(telefone);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    @Override
    public String toString() {
        return "Nome: "+nome+" ,Telefone: "+telefone;
    }
}
