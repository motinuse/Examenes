/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//amasar, combinar ingredientes, hornear
//empacar dona, empacar una docena, entregar dona
//metodo agregar Dona
//crear Dona ejecuta los metodos subrayados y devuelve una dona
//metodo agregar clase almacen 
//1 atributo Dona en fabrica
//1 atributo ARREGLO de Donas en AlmacenDonas
package examen;

/**
 *
 * @author Alumno
 */
public class AlmacenDonas {
    int v = 12;
    int b = 6;
    Fabricadedonas a;
    int n1;
    int n2;

    public void almcanarunadocena()
    {
        System.out.println("se han almacenado: " + n1 + " docenas" );
        
    }
    
    public void almacenamediadocena()
    {
        System.out.println("se han alacenado: " + n2 + " medias docenas" );
    }
    
    public Fabricadedonas alacenardonas(int donap, int donam, int donag)
     {
         a = new Fabricadedonas();
         
         a.setDonagrande(donag);
         a.setDonamediana(donam);
         a.setDonapequeña(donap);
         
         
         
         n1 = (donap + donam + donag) / v; 
         n2 = (donap + donam + donag) / b;
         
         almcanarunadocena();
         almacenamediadocena();
         
         return a;
     }
     
     public static void main(String[] args) {
        AlmacenDonas x = new AlmacenDonas();
        x.alacenardonas(12, 6, 6);
    }
}
