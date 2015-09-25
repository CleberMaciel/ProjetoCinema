/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.Sala;
import repositorio.repositorioSala;
import util.Console;
import view.menu.SalaMenu;

/**
 *
 * @author Cleber Jr
 */
public class SalaUI {

    private repositorioSala lista;

    public SalaUI(repositorioSala lista) {
        this.lista = lista;
    }
    
    public void cadastrarSala(){
        int cod = Console.scanInt("Codigo: ");
        int numeroSala  = Console.scanInt("Numero da Sala: ");
        int quantidadeAssento = Console.scanInt("Quantidades de Assento");
    
        lista.addSalas(new Sala(cod, numeroSala, quantidadeAssento));
    }
    
    public void mostrarSalas(){
        for(Sala s : lista.getListaSalas()){
            System.out.println(s);
        }
    }
    
    public void executar(){
    int op = 0;
        do{
            System.out.println(SalaMenu.Opcoes());
            op = Console.scanInt("Digite sua opção:");
            switch(op){
                case SalaMenu.OP_CADASTRAR: cadastrarSala();
                    break;
                case SalaMenu.OP_LISTAR:mostrarSalas();
                    break;
                    
                case SalaMenu.OP_VOLTAR:System.out.println("Voltando...");
                    break;
                default:
                    System.out.println("Opção invalida");
            }
        
    }while(op != SalaMenu.OP_VOLTAR);
    }

}//fim da classe
