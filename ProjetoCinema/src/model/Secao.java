/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Cleber Maciel e Matheus Souza
 * @version 1.0
 */
public class Secao {
   private static int CODIGO_GERADO = 1;
    private int cod;
    private Sala sala;
    private Date horario;
    private Filme filme;

    public Secao(Sala sala, Date horario, Filme filme) {
        this.cod  = generateCodigo();
        this.sala = sala;
        this.horario = horario;
        this.filme = filme;
    }
    
     private int generateCodigo(){
        return(CODIGO_GERADO++);
    } 

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }
    

    public int getCod() {
        return cod;
    }

 
    public void setCod(int cod) {
        this.cod = cod;
    }
    
    public String toString(){
        return 
                 "\nCódigo da seção: : "+getCod()
                + "\nNumero da Sala: "+sala.getNumeroSala()
                + "\nNome do Filme: "+filme.getFilmeNome()
                + "\nHorario:"+horario
                + "\nQuantidade de assento disponiveis: "+sala.getQuantidadeAssento();
    }


    
    
}
