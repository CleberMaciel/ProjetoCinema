/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import java.util.ArrayList;
import java.util.List;
import model.Secao;

/**
 *
 * @author 631420226
 */
public class repositorioSecao {

    private List<Secao> listaSecao;

    public repositorioSecao() {
        listaSecao = new ArrayList<Secao>();
    }

    public boolean addSecao(Secao secao) {
        return (listaSecao.add(secao));
    }

    public List<Secao> getListaSecao() {
        return listaSecao;
    }

    public Secao buscarSecao(int numSala) {
        for (Secao s : listaSecao) {

            if (s.getSala().getNumeroSala() == numSala) {
                return s;
            }
        }
        return null;
    }

}
