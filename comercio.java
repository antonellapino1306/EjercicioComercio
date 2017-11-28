/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploobjetoscompraventa;

import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class comercio {
    
    private String dueño;
    private ArrayList<articulo> _misArticulos;
    private ArrayList<Venta> _MisVentas;
    
    
    public comercio(String nombre){
        
        this.dueño=dueño;
        //instancio los arraylist en el constructor
        this._misArticulos=new ArrayList<articulo>();
        this._MisVentas=new ArrayList<Venta>();
     }
    

    
    
    public void MostrarArticulos(){
        for (articulo aux : _misArticulos) {
            aux.MostrarArticulo();
        }
   
    }
    
    public void MostrarVentas(){
        float gananciaTotal=0;
        for (Venta aux : _MisVentas) {
            gananciaTotal=gananciaTotal+aux.RetornarGanancia();
            aux.MostrarVenta();
            
        }
        System.out.println("gananicia"+gananciaTotal);
    }
    
    public String ComprarArticulo(articulo art,int cantidad){
        
    //buscamos el articulo si está, con un for
        
        for (articulo miart : this._misArticulos) {
         
         if(articulo.SonIguales(miart,art))
        {
            miart.SetterStock(miart.GetterStock()+art.GetterStock());
            return "Se sumó al stock";
        }
        
        
     }
        art.SetterStock(cantidad);
        this._misArticulos.add(art);
        return "se agregó uno nuevo";
        
    
}
    
    public String VendrArticulo(articulo art,int cantidad){
        
         for (articulo miart : this._misArticulos) {
         
         if(articulo.SonIguales(miart,art))
        {
           if (miart.GetterStock()>cantidad){
               //puedo vender
               Venta nuevaVenta=new Venta(art,cantidad);
               this._MisVentas.add(nuevaVenta);
               miart.SetterStock(miart.GetterStock()-cantidad);
               return "pude vender";
           }else{
               return "no hay stock suficiente";
           }
            
        }
        
        
     }
         return "No tengo el producto";
       
        
        
        
    }
    
   
}
//    public void ComprarArticulo(){
//        
//    }
//    
//    public void VenderArticulo(Venta nombre){
//        
//        if ()
//        ven.add(nombre);
//        
//       }
//   public void MostrarVentas(){
//       for (int i = 0; i < ven.size(); i++) {
//            ven.get(i).MostrarVenta();
//    }}
//}
//    public void ComprarArticulo(){
//        
//    }
    
   
    
//    
//    public void VenderArticulo(Articulo nombre,int cantidad ){
//        this.nombre=nombre;
//        this.cantidad=cantidad;
//        
//        al.add("EL articulo es "+this.nombre+" y la cantidad es "+this.cantidad);
//        
//     }
//    
//    public void MostrarVenta(){
//        
//        for (String alo : al) {
//            alo
//        }
//        System.out.println("EL articulo es "+this.nombre+" y la cantidad es "+this.cantidad);
//        
//    }
    

