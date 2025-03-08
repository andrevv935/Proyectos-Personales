package exprendedoracongui;

public class Producto{
    private double precio;
    private int cantidad;
    private String nombre, caracteristicas;

    public Producto(){
        
    }
    
    public Producto(double precio){
        setPrecio(precio);
    }
    
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio){
        if (precio >= 0)
            if (getCantidad() == 0)
                this.precio = precio;
            else
                System.out.println("No pudo cambiar el precio ");
        else
            System.out.println("Precio incorrecto. Debe ser mayor que cero");
    }
    
    public int getCantidad() {
        return cantidad;
    }
    
    public void setCantidad(int cant){
        if (cant >= 0)
            cantidad = cant;
        else
            System.out.println("Cantidad debe ser mayor que cero");
    }
    
    public void aumentarCantidad(int cant){
        if (cant > 0){
            setCantidad(getCantidad() + cant);
        }
        else
            System.out.println("Cantidad a aumentar debe ser mayor que cero");
    }
    
    public void disminuirCantidad(int cant){
        int saldo;
        if (cant > 0){
            saldo = getCantidad() - cant;
            if (saldo >= 0)
                setCantidad(saldo);
            else
                System.out.println("Mercancia insuficiente");
        }
        else
            System.out.println("Cantidad a disminuir debe ser mayor que cero");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public double cantidadDinero(){
        return getCantidad() * getPrecio();
    }
    
    public String getCaracteristicas(){
        return caracteristicas;
    }
    
    public void setCaracteristicas(String caracteristicas){
        this.caracteristicas = caracteristicas;
    }
    
}
