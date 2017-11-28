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
public class articulo {
private String _nombre;
    private int _codigo;
    private float _precioCosto;
    private float _precioVenta;
    private int _stock;
    
    
    //constructor
    
    public articulo(String _nombre, int _codigo, float _precioCosto, int _stock) {
        this._nombre = _nombre;
        this._codigo = _codigo;
        this._precioCosto = _precioCosto;
        this._stock = _stock;
        this._precioVenta=this._precioCosto*(float)1.25;
    }
    
  //getters
    
    public float GetterGanancia(){
        
        return this._precioVenta-this._precioCosto;
    }
    
    
    public int GetterStock(){
        
        int retorno=this._stock;
        
        return retorno;
    }
    public float GetPrecioVenta(){
       
        return this._precioVenta;
    }
    
    
 public String GetNombreCodigo(){
        
        String retorno="";
        
        retorno=this._nombre+this._codigo;
        
        return retorno;
    }
    
    //setter
    
    public void SetterStock(int stock){
        this._stock=stock;
    }
    
   
    
    public void SetterPrecioCosto(float precioCosto){
        this._precioCosto=precioCosto;
    }
    
    public Boolean HayStock(){
       
        if (1>this._stock){
            return false;
        }
   return true;
   }
    
    
    
    public static boolean SonIguales(articulo art1,articulo art2){
       
     
       if (art1.GetNombreCodigo().equals(art2.GetNombreCodigo())){
           return true;
       }
       
       return false;
   }
    
    
    public void MostrarArticulo(){
        System.out.println("Producto : "+this._nombre);
        System.out.println("Codigo : "+this._codigo);
        System.out.println("Precio costo : "+this._precioCosto);
        System.out.println("Precio venta : "+this._precioVenta);
        System.out.println("Stock : "+this._stock);
    }
    
   
    //constructor con todos los atributos
//    public Articulo(String nombre,Integer codigo,float costo,int stock){
//        
//        this._nombre=nombre;
//        this._codigo=codigo;
//        this._precioCosto=costo;
//        this._stock=stock;
////        this._precioVenta=this._precioCosto*(float)1.25;
//    }
    //setter y getter de cada atributo
//    public float GetStock(){
//        
//        int retorno=this._stock;
//        
//        return retorno;
//    }
//    

//    
//    public float GetPrecioCosto(){
//        
//        float retorno=this._precioCosto;
//        
//        return retorno;
//    }
//    

    
    
    
    
    
//    public void SetterNombreCodigo(String nombre,Integer codigo){
//        
//        this._nombre=nombre;
//        this._codigo=codigo;
//     }
    
    
    
    
    
    

   

    
    

    
    
    
}
