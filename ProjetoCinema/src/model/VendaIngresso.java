/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Cleber Jr
 */
public class VendaIngresso {
    private Secao secao;
    private int quantidadeAssento;
    
    public VendaIngresso(Secao secao, int quantidadeAssento){
        this.secao = secao;
        this.quantidadeAssento = quantidadeAssento;
    }
}
