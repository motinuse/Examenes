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
public class Fabricadedonas {
    
    Donas d;
    private int donapequeña;
    private int donamediana;
    private int donagrande;

    public int getDonapequeña() {
        return donapequeña;
    }

    public void setDonapequeña(int donapequeña) {
        this.donapequeña = donapequeña;
    }

    public int getDonamediana() {
        return donamediana;
    }

    public void setDonamediana(int donamediana) {
        this.donamediana = donamediana;
    }

    public int getDonagrande() {
        return donagrande;
    }

    public void setDonagrande(int donagrande) {
        this.donagrande = donagrande;
    }
    
    public void amasar()
    {
        System.out.println("se esta amazando con leche, masa, vainilla y huevos");
        System.out.println("con una cantidad de " + d.getLeche() + "Lt de Leche, " + d.getHuevos() + " huevos, " + d.getVainilla() + "Lt de vainilla y " + d.getMasa() + "kg de masa");
        System.out.println("se ah terminado el amzado");
    }
    
    public void combinaringredientes()
    {
        System.out.println("se combinan los ingredientes con " + d.getCantidadingrediente() + "Kg de " + d.getIngrediente());
    }
    
    public void hornear()
    {
        System.out.println("se esta horneando la Dona :D");
    }
    
    public Donas creardonas(int leche, int masa, String ingrediente, int vainilla, int cantidading, int huevos)
    {
        d = new Donas ();
        
        d.setCantidadingrediente(cantidading);
        d.setHuevos(huevos);
        d.setIngrediente(ingrediente);
        d.setVainilla(vainilla);
        d.setMasa(masa);
        d.setLeche(leche);
        
        amasar();
        combinaringredientes();
        hornear();
        
        return d;
    }
    
   
    public static void main(String[] args) 
    {
        Fabricadedonas f = new Fabricadedonas();
        f.creardonas(2, 3, "nuez", 1, 1, 5);
        
    }
}
