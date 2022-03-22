package br.com.dio;

import br.com.dio.model.Gato;

import javax.swing.*;

public class PrimeiroPrograma {
    public static void main(String[] args) {

        Gato gato = new Gato();

        System.out.println(gato);



        /*int a = 2;
        int b = 3;

        System.out.println("Hello Mundo" + (a+b));*/

    }

}
 class livro{
    private String nme;
    private Integer numPagina;

     public livro(String nme, Integer numPagina) {
         this.nme = nme;
         this.numPagina = numPagina;
     }

     public String getNme() {
         return nme;
     }

     public void setNme(String nme) {
         this.nme = nme;
     }

     public Integer getNumPagina() {
         return numPagina;
     }

     public void setNumPagina(Integer numPagina) {
         this.numPagina = numPagina;
     }

     @Override
     public String toString() {
         return "livro{" +
                 "nme='" + nme + '\'' +
                 ", numPagina=" + numPagina +
                 '}';
     }
 }