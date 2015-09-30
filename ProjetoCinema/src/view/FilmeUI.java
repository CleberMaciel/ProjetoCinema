/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.Filme;
import repositorio.repositorioFilme;
import util.Console;
import view.menu.FilmeMenu;

/**
 *
 * @author 631420226
 */
public class FilmeUI {

    private repositorioFilme lista;

    public FilmeUI(repositorioFilme lista) {
        this.lista = lista;
    }

    public void executar() {
        int op = 0;
        do {
            System.out.println(FilmeMenu.Opcoes());
            op = Console.scanInt("Digite sua opção: ");
            switch (op) {
                case FilmeMenu.OP_CADASTRAR:
                    cadastrarFilme();
                    break;
                case FilmeMenu.OP_LISTAR:
                    mostarFilmes();
                    break;
                case FilmeMenu.OP_VOLTAR:
                    //volta pro menu
                    System.out.println("Retornando pro menu principal");
                    break;
                default:
                    System.out.println("Opção invalida....");
            }
        } while (op != FilmeMenu.OP_VOLTAR);
    }

    public void cadastrarFilme() {

        System.out.println("######################################");
        String filmeNome = Console.scanString("Nome do filme: ");
        String filmeGenero = Console.scanString("Genero: ");
        String filmeSinopse = Console.scanString("Sinopse: ");
        System.out.println("######################################");

        lista.addFilmes(new Filme(filmeNome, filmeGenero, filmeSinopse));
    }

    public void mostarFilmes() {
        System.out.println("#LISTA DE FILMES#");

        for (Filme f : lista.getListaFilmes()) {
            System.out.println("######################################");
            System.out.println(f);
            System.out.println("######################################");

        }
    }
}
