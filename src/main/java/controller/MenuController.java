package controller;

import service.Gerenciamento;

import java.util.Scanner;

public class MenuController {
    Scanner sc = new Scanner(System.in);
    Gerenciamento ger = new Gerenciamento();

    public void menuPrincipal(){
        int opcao;

        do {
            System.out.println("""
                    \n--- MENU LISTA TELEFONICA ---
                    
                    1. LISTAR TODOS OS CONTATOS
                    2. CADASTRAR NOVO CONTATO
                    3. ALTERAR CONTATO POR ID
                    4. DELETAR CONTATO POR ID
                    5. PESQUISAR CONTATO POR NOME
                    6. SAIR
                    
                    ESCOLHA UMA OPERAÇÃO DO SISTEMA:
                    """);
            opcao = sc.nextInt();

            switch (opcao){
                case 1: ger.listarContatos(); break;
                case 2: ger.cadastroContato(sc); break;
                case 3: ger.alterarContato(sc); break;
                case 4: ger.deletarContato(sc); break;
                case 5: ger.buscarContato(sc); break;
                case 6:
                    System.out.println("\nEncerrando Sistema...");
                    break;
                default:
                    System.out.println("\nOpção Inválida! Tente Novamente.");
            }
        } while(opcao != 6);
    }
}
