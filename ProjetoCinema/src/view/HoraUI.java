/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import model.Hora;
import repositorio.repositorioHora;
import util.Console;
import util.DateUtil;
import view.menu.HoraMenu;

/**
 *
 * @author 631420226
 */
public class HoraUI {

    private repositorioHora lista;

    public HoraUI(repositorioHora lista) {
        this.lista = lista;
    }

    public void executar() throws ParseException {
        int op = 0;
        do {

            System.out.println(HoraMenu.Opcoes());
            op = Console.scanInt("Escolha sua opção: ");
            switch (op) {
                case HoraMenu.OP_CADASTRAR:
                    cadastrarHora();
                    break;
                case HoraMenu.OP_LISTAR:mostrarHoras();
                    break;
            }

        } while (op != HoraMenu.OP_VOLTAR);

    }

    public void cadastrarHora() throws ParseException {
        String horaDigitada = Console.scanString("Digite o Horario para registrar: ");
        Date hora;
        hora = DateUtil.stringToHour(horaDigitada);
        lista.addHora(new Hora(hora));
    }

    public void mostrarHoras() {
        for (Hora h : lista.getListaHoras()) {
            System.out.println(h);
        }
    }

}
