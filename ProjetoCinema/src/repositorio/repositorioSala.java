/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import java.util.ArrayList;
import java.util.List;
import model.Sala;

/**
 *
 * @author Cleber Jr
 */
public class repositorioSala {

    //Cria um Atributo do tipo List
    private List<Sala> listaSalas;

    //Inicializa no contrutor a variavel como uma nova Array
    public repositorioSala() {
        listaSalas = new ArrayList<Sala>();
    }

    //Métodos de manipulação do array
    //adiciona
    public boolean addSalas(Sala sala) {
        return (listaSalas.add(sala));
    }

    //retorna a lista
    public List<Sala> getListaSalas() {
        return listaSalas;
    }

    //Teste para ver se a sala ja existe
    public boolean salaExiste(int numSala) {
        for (Sala s : listaSalas) {
            if (s.getNumeroSala() == numSala) {
                return true;
            }
        }
        return false;
    }

    public Sala buscarSala(int numSala) {
        for (Sala s : listaSalas) {
            if(salaExiste(numSala)){
            if (s.getNumeroSala() == numSala) {
            }   
                System.out.println("sala encontrada");
                return s;
                
            }
        }
        return null;
    }
}//fim da classe
