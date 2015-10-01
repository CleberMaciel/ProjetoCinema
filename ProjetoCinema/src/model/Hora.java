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
 */
public class Hora {
    private Date hora;

    public Hora(Date hora) {
        this.hora = hora;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }
    
    public String toString(){
        return "Hora: "+hora;
    }
    
}
