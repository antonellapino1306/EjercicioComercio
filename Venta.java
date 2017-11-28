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
public class Venta {
    
    private articulo _articulovendido;
    private int _cantidad;
    
    
    public void MostrarVenta(){
        
        System.out.println("Precio cantidad : "+this._cantidad);
        System.out.println("Producto : ");
        this._articulovendido.MostrarArticulo();
    }
    
    public Venta(articulo vendido,int cantidad){
        this._articulovendido=vendido;
        this._cantidad=cantidad;
       
      
    }
    
    
    public float RetornarGanancia(){
        
        float precioFacturado;
        precioFacturado=this._articulovendido.GetterGanancia()*this._cantidad;
        return precioFacturado;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
//    public Articulo GetVendido(){
//        
//        Articulo retorno=this.vendido;
//        
//        return retorno;
//    }
//    
//    public void SetterProdVendido(Articulo prodvendido){
//        this.vendido=prodvendido;
//    }
//   
//    public int GetCantidad(){
//        
//        int retorno=this.cantidad;
//        
//        return retorno;
//    }
//    
//    public void SetterCantidad(int cantidad){
//        this.cantidad=cantidad;
//    }
    
    
    
}
    
    

