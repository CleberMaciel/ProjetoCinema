/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Cleber Maciel e Matheus Souza
 * @version 1.0
 */
public class Filme {
    private static int CODIGO_GERADO = 1;
    private int codigo;
    private String filmeNome;
    private String filmeGenero;
    private String filmeSinopse;

    public Filme(String filmeNome, String filmeGenero,
            String filmeSinopse) {
        this.codigo = generateCodigo();
        this.filmeNome = filmeNome;
        this.filmeGenero = filmeGenero;
        this.filmeSinopse = filmeSinopse;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getFilmeNome() {
        return filmeNome;
    }

    public void setFilmeNome(String filmeNome) {
        this.filmeNome = filmeNome;
    }

    public String getFilmeGenero() {
        return filmeGenero;
    }

    public void setFilmeGenero(String filmeGenero) {
        this.filmeGenero = filmeGenero;
    }

    public String getFilmeSinopse() {
        return filmeSinopse;
    }

    public void setFilmeSinopse(String filmeSinopse) {
        this.filmeSinopse = filmeSinopse;
    }
    
     private int generateCodigo(){
        return(CODIGO_GERADO++);
    } 
    
    public String toString(){
        return "\n#Código: "+codigo
                + "\nNome do Video: "+filmeNome
                + "\nGenero: "+filmeGenero
                + "\nSinopse: "+filmeSinopse;
    }
    
}
