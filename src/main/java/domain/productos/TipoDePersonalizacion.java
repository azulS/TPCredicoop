package domain.productos;

import domain.usuario.GestorDeUsuarios;
import lombok.Getter;

@Getter
public class TipoDePersonalizacion {
    private GestorDeUsuarios autenticador;
    public String nombre;
    public String descripcion;

    public TipoDePersonalizacion(GestorDeUsuarios autenticador){
        this.autenticador = autenticador;
    }

    public void setNombre(String nombre, String user) {
        if (autenticador.esGestor(user)) {
            this.nombre = nombre;
        }
    }
    public void setDescription(String nombre, String user) {
        if (autenticador.esGestor(user)) {
            this.nombre = nombre;
        }
    }

}
