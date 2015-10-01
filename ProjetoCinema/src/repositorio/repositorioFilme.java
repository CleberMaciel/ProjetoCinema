/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import model.Filme;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Cleber Maciel e Matheus Souza
 */
public class repositorioFilme {
    
    private List<Filme> listaFilmes;
    
    public repositorioFilme(){
    listaFilmes = new ArrayList<Filme>();
    }
    
    public boolean addFilmes(Filme filme){
        return (listaFilmes.add(filme));
    }
    
    public List<Filme> getListaFilmes(){
        return listaFilmes;
    }
    
    public boolean filmeExiste(String filmeNome){
        for(Filme f: listaFilmes){
            if(f.getFilmeNome().equals(filmeNome)){
                return true;
            }
        }
        return false;
    }
    
    public Filme buscarFilme(String filmeNome){
        for(Filme f: listaFilmes){
            if(f.getFilmeNome().equals(filmeNome)){
            return f;
            }
            
        }
         return null; 
    }
          

}
