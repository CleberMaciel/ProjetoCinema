/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.VendaIngresso;
import repositorio.repositorioSecao;
import repositorio.repositorioVendaIngresso;
import util.Console;
import view.menu.VendaIngressoMenu;

/**
 *
 * @author Cleber Jr
 */
public class VendaIngressoUI {
    private repositorioVendaIngresso lista;
    private repositorioSecao listaSecao;
    public VendaIngressoUI(repositorioVendaIngresso lista, repositorioSecao listaSecao){
        this.lista = lista;
        this.listaSecao = listaSecao;
    }
    
    public void executar(){
        int op = 0;
        do{
            System.out.println(VendaIngressoMenu.Opcoes());
            op = Console.scanInt("Digite sua Opção: ");
            switch(op){
                case VendaIngressoMenu.OP_VENDER:
                    cadastrarVendaIngresso();
                    break;
                case VendaIngressoMenu.OP_LISTAR:
                    mostrarListaIngressos();
                    break;
                    
                default:
                    System.out.println("Opção invalida");
            }
        }while(op != VendaIngressoMenu.OP_VOLTAR);
    
    }//fim do metodo executar
    
    public void cadastrarVendaIngresso(){
        System.out.println("Escolha uma seção:");
        new SecaoUI(null, null, listaSecao, null).mostrarSecoes();
        
    }
    
    
    public void mostrarListaIngressos(){
        for(VendaIngresso vi: lista.getListaIngressos()){
            System.out.println(vi);
        }
    }//fim do mostrar ingressos;
}
