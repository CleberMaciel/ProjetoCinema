/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Cleber Maciel e Matheus Souza
 */
public class VendaIngresso {
    private Secao secao;
    private int quantidadeAssento;
    
    public VendaIngresso(Secao secao, int quantidadeAssento){
        this.secao = secao;
        this.quantidadeAssento = quantidadeAssento;
    }//fim do construtor

    /**
     * @return the secao
     */
    public Secao getSecao() {
        return secao;
    }

    /**
     * @param secao the secao to set
     */
    public void setSecao(Secao secao) {
        this.secao = secao;
    }

    /**
     * @return the quantidadeAssento
     */
    public int getQuantidadeAssento() {
        return quantidadeAssento;
    }

    /**
     * @param quantidadeAssento the quantidadeAssento to set
     */
    public void setQuantidadeAssento(int quantidadeAssento) {
        this.quantidadeAssento = quantidadeAssento;
    }
     
   public String toString(){
       return "\nNome Filme: "+secao.getFilme().getFilmeNome()
               +"\nHorario da Seção: "+secao.getHorario()
               +"\nSala: "+secao.getSala().getNumeroSala();
   }
    
}
