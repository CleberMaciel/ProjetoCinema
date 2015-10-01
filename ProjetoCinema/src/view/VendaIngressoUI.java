/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Menu;
import model.Secao;
import model.VendaIngresso;

import repositorio.repositorioSala;
import repositorio.repositorioSecao;
import repositorio.repositorioVendaIngresso;
import util.Console;
import view.menu.VendaIngressoMenu;

/**
 *
 * @author Cleber Maciel e Matheus Souza
 */
public class VendaIngressoUI {

    private repositorioVendaIngresso lista;
    private repositorioSecao listaSecao;
    private repositorioSala listaSala;

    public VendaIngressoUI(repositorioVendaIngresso lista, repositorioSecao listaSecao, repositorioSala listaSala) {
        this.lista = lista;
        this.listaSecao = listaSecao;

        this.listaSala = listaSala;
    }

    public void executar() {
        int op = 0;
        do {
            System.out.println(VendaIngressoMenu.Opcoes());
            op = Console.scanInt("Digite sua Opção: ");
            switch (op) {
                case VendaIngressoMenu.OP_VENDER:
                    realizarVenda();
                    break;
                case VendaIngressoMenu.OP_LISTAR:
                    mostrarListaIngressos();
                    break;

                default:
                    System.out.println("Opção invalida");
            }
        } while (op != VendaIngressoMenu.OP_VOLTAR);

    }//fim do metodo executar

    public void realizarVenda() {
        System.out.println("Escolha uma seção: ");
        new SecaoUI(listaSala, null, listaSecao).mostrarSecoes();

        int cod = Console.scanInt("Escolha a seção: ");
        Secao secao = listaSecao.buscarSecaoExistente(cod);

        if (secao.getSala().getQuantidadeAssento() == 0) {
            System.out.println("#######Seção Lotada#######");
            executar();
        } else {

            int qtd2 = secao.getSala().calcularAssento();
            VendaIngresso vi = new VendaIngresso(secao, qtd2);

            lista.addIngresso(vi);
        }

    }

    public void mostrarListaIngressos() {
        for (VendaIngresso vi : lista.getListaIngressos()) {
            System.out.println(vi);
        }
    }//fim do mostrar ingressos;
}
