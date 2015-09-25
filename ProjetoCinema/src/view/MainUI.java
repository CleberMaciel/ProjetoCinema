/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import repositorio.repositorioFilme;
import repositorio.repositorioSala;
import repositorio.repositorioSecao;
import util.Console;
import view.menu.MainMenu;

/**
 *
 * @author Cleber Jr
 */
public class MainUI {

    private repositorioFilme listaFilmes;
    private repositorioSala listaSalas;
    private repositorioSecao listaSecao;

    public MainUI() {
        listaFilmes = new repositorioFilme();
        listaSalas = new repositorioSala();
        listaSecao = new repositorioSecao();
        

    }

    public void executar() {
        int opcao = 0;
        do {
            System.out.println(MainMenu.getOpcoes());
            opcao = Console.scanInt("Digite sua opção");
            switch (opcao) {
                case MainMenu.OP_FILMES:
                    new FilmeUI(listaFilmes).executar();
                    break;
                case MainMenu.OP_SALAS:
                    new SalaUI(listaSalas).executar();
                   break;
                case MainMenu.OP_SECAO: new SecaoUI(listaSalas, listaFilmes, listaSecao, null).executar();
                    
            }
        } while (opcao != MainMenu.OP_SAIR);

    }
}