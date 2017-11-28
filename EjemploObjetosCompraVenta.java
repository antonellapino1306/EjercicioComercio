/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploobjetoscompraventa;

/**
 *
 * @author alumno
 */
public class EjemploObjetosCompraVenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       articulo miArt= new articulo("fanta", 666, 100, 3);
       articulo miArt2= new articulo("sprite", 666, 80, 5);
       articulo miArt3= new articulo("fanta", 666, 80, 28);
        System.out.println("precio de venta: "+miArt.GetPrecioVenta());
       
       comercio ElBolicheDeTony;
       ElBolicheDeTony=new comercio("tony");
       
       String respuesta;
       respuesta=ElBolicheDeTony.ComprarArticulo(miArt, 3);
        System.out.println(respuesta);
       respuesta=ElBolicheDeTony.ComprarArticulo(miArt2, 8);
        System.out.println(respuesta);
       respuesta=ElBolicheDeTony.ComprarArticulo(miArt3, 8);
        System.out.println(respuesta);
        
        //venta
        respuesta=ElBolicheDeTony.VendrArticulo(miArt, 10);
        System.out.println(respuesta);
       
    }
    
}
