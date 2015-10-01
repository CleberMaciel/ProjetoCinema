/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Cleber Maciel e Matheus Souza
 * @version 1.0
 */
public class Sala {
    private static int CODIGO_GERADO = 1;
    private int codigo;
    private int numeroSala;
    private int quantidadeAssento;

    public Sala(int numeroSala, int quantidadeAssento) {
        this.codigo = generateCodigo();
        this.numeroSala = numeroSala;
        this.quantidadeAssento = quantidadeAssento;
    }
     private int generateCodigo(){
        return(CODIGO_GERADO++);
    } 
     
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    public int getQuantidadeAssento() {
        return quantidadeAssento;
    }

    public void setQuantidadeAssento(int quantidadeAssento) {
        this.quantidadeAssento = quantidadeAssento;
    }
    
    public int CalculoAssento(){
        return quantidadeAssento = quantidadeAssento -1;
    }
    
    public String toString(){
        return "\nNúmero da sala: "+numeroSala
                + "\nQuantidade de assento: "+quantidadeAssento;
    }
    
}
