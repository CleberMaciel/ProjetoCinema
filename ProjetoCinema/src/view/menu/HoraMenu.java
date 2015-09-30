/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.menu;

/**
 *
 * @author 631420226
 */
public class HoraMenu {
       
    public static final int OP_CADASTRAR = 1;
    public static final int OP_LISTAR = 2;
    public static final int OP_VOLTAR = 0;
    
    public static String Opcoes(){
        return ("\n---------------------------\n"
                +"1 - Cadastrar Hora\n"
                +"2 - Listar Horas\n"
                + "0 - Voltar"
                + "\n---------------------------");
    } 
}
