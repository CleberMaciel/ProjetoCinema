/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.Hora;

/**
 *
 * @author 631420226
 */
public class repositorioHora {

    private List<Hora> listaHoras;

    public repositorioHora() {
        listaHoras = new ArrayList<Hora>();
    }

    public boolean addHora(Hora hora) {
        return (listaHoras.add(hora));
    }

    public List<Hora> getListaHoras() {
        return listaHoras;
    }

    public Hora buscarHora(Date hora) {
        for (Hora h : listaHoras) {
            if (h.getHora().equals(hora)) {
                return h;
            }
        }
        return null;
    }

}
