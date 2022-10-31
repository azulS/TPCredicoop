package domain.models.entities.productos;

import domain.models.entities.usuario.GestorDeUsuarios;
import lombok.Getter;

import javax.persistence.*;

//@Entity
//@Table(name="TipoDePersonalizacion")
//@Getter
public class TipoDePersonalizacion {
//
//    @ManyToOne
//    @JoinColumn(name = "TipoDePersonalizacion_id", referencedColumnName ="Id")
    private Producto producto;

//    @Column
    private GestorDeUsuarios autenticador;
//    @Column
    public String nombre;
//    @Column
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
