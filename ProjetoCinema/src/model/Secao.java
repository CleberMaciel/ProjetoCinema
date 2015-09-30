/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Cleber Maciel
 * @version 1.0
 */
public class Secao {
    private int cod;
    private Sala sala;
    private Date horario;
    private Filme filme;

    public Secao(int cod,Sala sala, Date horario, Filme filme) {
        this.cod  =cod;
        this.sala = sala;
        this.horario = horario;
        this.filme = filme;
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
    
    public String toString(){
        return "ID DA SESSAO: "+getCod()
                + "\nInformações Sala:\n "+sala
                + "\nInformações Filme :\n"+filme
                + "\nHorario:"+horario;
    }

    /**
     * @return the cod
     */
    public int getCod() {
        return cod;
    }

    /**
     * @param cod the cod to set
     */
    public void setCod(int cod) {
        this.cod = cod;
    }
    
    
}
