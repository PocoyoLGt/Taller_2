package Octavo;

public class Usuario_Pasteleria {
    private String Usuario;
   public Usuario_Pasteleria(String Usuario){
       this.Usuario = Usuario;

   }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    @Override
    public String toString() {
        return
                 Usuario + '\''
                ;
    }
}
