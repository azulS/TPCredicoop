package domain.productos;

import domain.productos.TipoDePersonalizacion;
import domain.usuario.GestorDeUsuarios;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
public class AreaDePersonalizacion {
    @Getter
    private String nombre;
    private GestorDeUsuarios autenticador;

    public AreaDePersonalizacion(GestorDeUsuarios autenticador){
        this.autenticador = autenticador;
    }
    public void setNombre(String nombre, String user) {
        if (autenticador.esGestor(user)) {
            this.nombre = nombre;
        }
    }
}
