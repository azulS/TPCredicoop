package domain.models.entities.usuario;

import domain.models.entities.productos.Producto;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Gestor extends Usuario {
    public Gestor(String id, TipoDeUsuario tipoDeUsuario, GestorDeUsuarios autenticador) {
        super(id, tipoDeUsuario, autenticador);
    }
//    @OneToMany
//    private List<Producto> productosCargados;
//    public Gestor(GestorDeUsuarios autenticador, String id, String password, TipoDeUsuario tipoDeUsuario){
//        super (id, password, tipoDeUsuario, autenticador);
//        this.productosCargados= new ArrayList<>();
//    }
//    public void cargarProducto (Producto productoNuevo){
//        productosCargados.add(productoNuevo);
//    }

}
