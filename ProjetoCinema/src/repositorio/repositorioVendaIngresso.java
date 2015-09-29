/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import java.util.ArrayList;
import java.util.List;
import model.VendaIngresso;

/**
 *
 * @author Cleber Jr
 */
public class repositorioVendaIngresso {
    
    private List<VendaIngresso> listaIngresso;
    
    public repositorioVendaIngresso(){
        listaIngresso = new ArrayList<VendaIngresso>();
    }
    
    public boolean addIngresso(VendaIngresso ingresso){
        return (listaIngresso.add(ingresso));
    }
    
    public List<VendaIngresso> getListaIngressos(){
        return listaIngresso;
    }
}
