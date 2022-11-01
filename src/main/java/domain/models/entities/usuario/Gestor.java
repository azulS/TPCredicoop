package domain.models.entities.usuario;

import domain.models.entities.productos.Producto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@DiscriminatorValue("gestor")
public class Gestor extends Usuario {
    @OneToMany
    private List<Producto> productosCargados;
    public Gestor(){
        this.productosCargados= new ArrayList<>();
    }
//    public void cargarProducto (Producto productoNuevo){
//        productosCargados.add(productoNuevo);
//    }

}
