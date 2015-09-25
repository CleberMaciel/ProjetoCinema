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
    
    private Sala sala;
    private String horario;
    private Filme filme;

    public Secao(Sala sala, String horario, Filme filme) {
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

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }
    
    public String toString(){
        return "\nSala: "+sala
                + "\nFilme:"+filme
                + "\nHorario:"+horario;
    }
    
    
}
