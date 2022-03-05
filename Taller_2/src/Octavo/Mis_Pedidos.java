package Octavo;

public class Mis_Pedidos {
    private String Sabor;
    private String Tamaño;
    private String Decoracion;
    private int Costo_del_Pedido;

    public Mis_Pedidos(String Sabor,String Tamaño, String Decoracion, int Costo_del_Pedido){
        this.Sabor = Sabor;
        this.Tamaño = Tamaño;
        this.Decoracion = Decoracion;
        this.Costo_del_Pedido = Costo_del_Pedido;

    }

    public String getSabor() {
        return Sabor;
    }

    public void setSabor(String sabor) {
        Sabor = sabor;
    }

    public String getTamaño() {
        return Tamaño;
    }

    public void setTamaño(String tamaño) {
        Tamaño = tamaño;
    }

    public String getDecoracion() {
        return Decoracion;
    }

    public void setDecoracion(String decoracion) {
        Decoracion = decoracion;
    }

    public int getCosto_del_Pedido() {
        return Costo_del_Pedido;
    }

    public void setCosto_del_Pedido(int costo_del_Pedido) {
        Costo_del_Pedido = costo_del_Pedido;
    }

    @Override
    public String toString() {
        return
                "Sabor='" + Sabor + '\'' +
                ", Tamaño='" + Tamaño + '\'' +
                ", Decoracion='" + Decoracion + '\'' +
                ", Costo_del_Pedido=" + Costo_del_Pedido
                ;
    }
}
