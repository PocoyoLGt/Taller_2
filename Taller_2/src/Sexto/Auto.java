package Sexto;

public class Auto {
    private String Usuario;
    private String Placa;
    private String Hora_Ingreso;
    private String Hora_Salida;
    private int Valor_factura;
    public Auto(String  Usuario,String Placa, String Hora_Ingreso, String Hora_Salida, int Valor_factura){
    this.Usuario = Usuario;
    this.Placa = Placa;
    this.Hora_Ingreso = Hora_Ingreso;
    this.Hora_Salida = Hora_Salida;
    this.Valor_factura = Valor_factura;


    }

    @Override
    public String toString() {
        return "Auto{" +
                "Usuario='" + Usuario + '\'' +
                ", Placa='" + Placa + '\'' +
                ", Hora_Ingreso='" + Hora_Ingreso + '\'' +
                ", Hora_Salida='" + Hora_Salida + '\'' +
                ", Valor_factura=" + Valor_factura +
                '}';
    }
}
