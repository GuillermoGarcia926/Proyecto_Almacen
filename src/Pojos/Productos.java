package Pojos;


public class Productos {

    int Codigo;
    String nombre;
    String TipoProducto;
    int NumStock;
    int Precio; 

    public Productos() {
    }

    public Productos(int Codigo, String nombre, String TipoProducto, int NumStock, int Precio) {
        this.Codigo = Codigo;
        this.nombre = nombre;
        this.TipoProducto = TipoProducto;
        this.NumStock = NumStock;
        this.Precio = Precio;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoProducto() {
        return TipoProducto;
    }

    public void setTipoProducto(String TipoProducto) {
        this.TipoProducto = TipoProducto;
    }

    public int getNumStock() {
        return NumStock;
    }

    public void setNumStock(int NumStock) {
        this.NumStock = NumStock;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }
    
    
    
    
}
