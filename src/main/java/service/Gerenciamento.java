package service;

import dao.ContatoDAO;
import model.Contato;

import java.util.List;
import java.util.Scanner;

public class Gerenciamento {

    ContatoDAO listaContatos = new ContatoDAO();

    public void listarContatos(){
        List<Contato> lista = ContatoDAO.listar();
        for (Contato contato : lista){
            System.out.println("ID: " + contato.getId() + " | NOME: " + contato.getNome() + " | TELEFONE: " + contato.getTelefone());
        }
    }

    public void cadastroContato (Scanner sc){
        sc.nextLine();

        System.out.println("Digite nome do contato: ");
        String nome = sc.nextLine();

        System.out.println("Digite número de telfone: ");
        String telefone = sc.nextLine();

        Contato contatos = new Contato(nome, telefone);
        listaContatos.cadastrar(contatos); // pegando da lista de contatos diretamente do DAO e adicionando nela
    }

    public void alterarContato(Scanner sc){
        sc.nextLine();

        System.out.println("LISTA DE CONTATOS PARA ATUALIZAR: ");
        listarContatos();

        System.out.println("\nDigite ID do contato que deseja alterar: ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.println("Digite novo telefone: ");
        String telefone = sc.nextLine();

        Contato contatos = new Contato(id, "", telefone);
        listaContatos.alterar(contatos);
    }

    public void deletarContato(Scanner sc){
        sc.nextLine();

        System.out.println("LISTA DE CONTATOS PARA DELETAR: ");
        listarContatos();

        System.out.println("\nDigite ID do contato que deseja deletar da sua lista: ");
        int id = sc.nextInt();

        Contato contatos = new Contato(id, "", "");
        listaContatos.deletar(contatos);
    }

    public void buscarContato(Scanner sc){
        sc.nextLine();

        System.out.println("Digite nome do contato que deseja buscar: ");
        String nome = sc.nextLine();

        Contato contatos = ContatoDAO.buscarPorNome(nome);

        System.out.println("\nID: " + contatos.getId() + " | NOME: " + contatos.getNome() + " | TELEFONE: " + contatos.getTelefone());
    }
}
