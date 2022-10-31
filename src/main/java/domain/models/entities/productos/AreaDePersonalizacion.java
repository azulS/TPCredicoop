package domain.models.entities.productos;

import domain.models.entities.usuario.GestorDeUsuarios;
import lombok.Getter;

import javax.persistence.*;

//@Entity
//@Table(name="AreaDePersonalizacion")
public class AreaDePersonalizacion {
//    @ManyToOne
//    @JoinColumn(name = "AreaDePersonalizacion_id", referencedColumnName ="Id")
    private Producto producto;
//    @Column
//    @Getter
    private String nombre;

//    @Column
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
