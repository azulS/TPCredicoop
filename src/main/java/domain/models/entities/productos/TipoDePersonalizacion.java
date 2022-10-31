package domain.models.entities.productos;

import domain.Persistente;
import domain.models.entities.usuario.GestorDeUsuarios;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="TipoDePersonalizacion")
@Getter
@Setter
public class TipoDePersonalizacion extends Persistente {

    @Column
    public String nombre;
    @Column
    public String descripcion;

//    public void setNombre(String nombre, String user) {
//        if (autenticador.esGestor(user)) {
//            this.nombre = nombre;
//        }
//    }
//    public void setDescription(String nombre, String user) {
//        if (autenticador.esGestor(user)) {
//            this.nombre = nombre;
//        }
//    }

}
