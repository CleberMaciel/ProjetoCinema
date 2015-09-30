/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.text.ParseException;
import java.util.Date;
import model.Filme;

import model.Sala;
import model.Secao;
import repositorio.repositorioFilme;

import repositorio.repositorioSala;
import repositorio.repositorioSecao;
import util.Console;
import util.DateUtil;
import view.menu.SecaoMenu;

/**
 *
 * @author 631420226
 */
public class SecaoUI {
    private repositorioSala listaSalas;
    private repositorioFilme listaFilmes;
    private repositorioSecao listaSecao;
    
    
    public SecaoUI(repositorioSala listaSala, repositorioFilme listaFilme,repositorioSecao listaSecao){
        this.listaSalas = listaSala;
        this.listaFilmes = listaFilme;
        this.listaSecao = listaSecao;
       
    }
    
    public void executar() throws ParseException{
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
    
    private void cadastrarSecao() throws ParseException{
        System.out.println("Defina  a Sala:");
        new SalaUI(listaSalas).mostrarSalas();
       
        int id = Console.scanInt("Informa o numero da sala: ");
        if(listaSalas.salaExiste(id)){
        Sala sala = listaSalas.buscarSala(id);
        
        new FilmeUI(listaFilmes).mostarFilmes();
        
        String nomeFilme = Console.scanString("Escolha  o nome do filme: ");
            
        Filme filme = listaFilmes.buscarFilme(nomeFilme);
        
        String horaBusca = Console.scanString("Informe um horario: ");
        Date horario;
        
        horario = DateUtil.stringToHour(horaBusca);
               
        Secao secao = new Secao(sala, horario, filme);
                
        listaSecao.addSecao(secao);
        }else{
            System.out.println("Não existe Sala");
        }
                
    }
    
    public void mostrarSecoes(){
        System.out.println("###Seções###");
        for(Secao s: listaSecao.getListaSecao()){
            System.out.println("##################");
            System.out.println(s);
            System.out.println("##################");
        }
    }
    
    public void venderIngresso(){
        mostrarSecoes();
        int numSala = Console.scanInt("Informa a seção ");
    
    }
    
 
    
}// fim da classe
