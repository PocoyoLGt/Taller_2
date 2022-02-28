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

    @Override
    public String toString() {
        return "Mis_Pedidos{" +
                "Sabor='" + Sabor + '\'' +
                ", Tamaño='" + Tamaño + '\'' +
                ", Decoracion='" + Decoracion + '\'' +
                ", Costo_del_Pedido=" + Costo_del_Pedido +
                '}';
    }
}
