/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.menu;

/**
 *
 * @author Cleber Jr
 */
public class MainMenu {

    public static final int OP_FILMES = 1;
    public static final int OP_SALAS = 2;
    public static final int OP_SECAO = 3;
    public static final int OP_VENDER = 4;
    public static final int OP_HORA = 5;
    public static final int OP_SAIR = 0;

    public static String getOpcoes() {
        return ("1 - Menu Filmes"
                + "\n2 - Menu Salas"
                + "\n3 - Seção"
                + "\n4 - Venda Ingresso"
                + "\n5 - Horario");
    }
}
