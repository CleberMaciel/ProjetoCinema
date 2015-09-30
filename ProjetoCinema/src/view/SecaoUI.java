/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.Filme;
import model.Sala;
import model.Secao;
import repositorio.repositorioFilme;
import repositorio.repositorioSala;
import repositorio.repositorioSecao;
import util.Console;
import view.menu.SecaoMenu;

/**
 *
 * @author 631420226
 */
public class SecaoUI {
    private repositorioSala listaSalas;
    private repositorioFilme listaFilmes;
    private repositorioSecao listaSecao;
    private String hora;
    
    public SecaoUI(repositorioSala listaSala, repositorioFilme listaFilme,repositorioSecao listaSecao, String hora){
        this.listaSalas = listaSala;
        this.listaFilmes = listaFilme;
        this.listaSecao = listaSecao;
        this.hora = hora;
    }
    
    public void executar(){
        int op = 0;
        do{
            System.out.println(SecaoMenu.getOpcoes());
            op = Console.scanInt("Digite sua opção");
            switch(op){
                case SecaoMenu.OP_CADASTRAR: cadastrarSecao();
                   break;
                case SecaoMenu.OP_LISTAR: mostrarSecoes();
                    break;
            }//frim do switch
                  
        }while(op != SecaoMenu.OP_VOLTAR);
    }
    
    private void cadastrarSecao(){
        System.out.println("Defina  a Sala:");
        new SalaUI(listaSalas).mostrarSalas();
       
        int id = Console.scanInt("Escolha o id da sala:");
        if(listaSalas.salaExiste(id)){
        Sala sala = listaSalas.buscarSala(id);
        
        new FilmeUI(listaFilmes).mostarFilmes();
        
        String nomeFilme = Console.scanString("Escolha  o nome do filme");
            
        Filme filme = listaFilmes.buscarFilme(nomeFilme);
        
        String hora  = Console.scanString("Digite a hora");
        
        Secao secao = new Secao(sala, hora, filme);
                
        listaSecao.addSecao(secao);
        }else{
            System.out.println("Nao existe a sala arigo");
        }
                
    }
    
    public void mostrarSecoes(){
        for(Secao s: listaSecao.getListaSecao()){
            System.out.println(s);
        }
    }
    
    public void venderIngresso(){
        mostrarSecoes();
        int numSala = Console.scanInt("Informa a seção");
      
        
                
        
    }
    
}// fim da classe
