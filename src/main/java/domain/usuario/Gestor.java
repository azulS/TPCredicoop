package domain.usuario;

import domain.productos.Producto;
import domain.usuario.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Gestor extends Usuario {
    private List<Producto> productosCargados;
    public Gestor(GestorDeUsuarios autenticador, String id, String password, TipoDeUsuario tipoDeUsuario){
        super (id, password, tipoDeUsuario, autenticador);
        this.productosCargados= new ArrayList<>();
    }
    public void cargarProducto (Producto productoNuevo){
        productosCargados.add(productoNuevo);
    }

}