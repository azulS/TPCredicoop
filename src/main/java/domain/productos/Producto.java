package domain.productos;

import domain.usuario.Gestor;
import domain.usuario.GestorDeUsuarios;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Producto {
    private String nombre;
    private int precioBase;
    private String descripcion;
    @Setter
    private String user;
    private int tiempoDeFabricacion;
    private GestorDeUsuarios autenticador;

    private List<AreaDePersonalizacion> areasBase;
    private List<TipoDePersonalizacion> tiposDePersonalizacion;

    public Producto(GestorDeUsuarios autenticador, Gestor usuario){
        this.autenticador = autenticador;
        this.areasBase= new ArrayList<>();
        this.tiposDePersonalizacion = new ArrayList<>();
        this.user= usuario.getId();
        usuario.cargarProducto(this);
        //que parametro le pongo a "cargarProducto" para que el Gestor cargue a su coleccion de productos
        // este producto nuevo?
    }

    public void agregarAreaDePersonalizacion(AreaDePersonalizacion nuevaAreaDisponible){
        if (autenticador.esGestor(user)) {
            this.areasBase.add(nuevaAreaDisponible);
        }
    }
    public void agregarTiposDePersonalizacion(TipoDePersonalizacion nuevoTipoDePersonalizacion){
        if (autenticador.esGestor(user)) {
            this.tiposDePersonalizacion.add(nuevoTipoDePersonalizacion);
        }
    }
    public void setNombre(String nombre) {
        if (autenticador.esGestor(user)) {
            this.nombre = nombre;
        }
    }
    public void setPrecioBase(int precioBase) {
        if (autenticador.esGestor(user)) {
            this.precioBase = precioBase;
        }
    }

    public void setDescripcion(String descripcion) {
        if (autenticador.esGestor(user)) {
        this.descripcion = descripcion;
        }
    }
    public void setTiempoDeFabricacion(int tiempoDeFabricacion) {
        if (autenticador.esGestor(user)) {
            this.tiempoDeFabricacion = tiempoDeFabricacion;
        }
    }
    public void printAreasDisponibles() {
        areasBase.forEach(a -> {
            System.out.println(a.getNombre());
            });
    }
    public void printProducto(){
        System.out.println(this.getNombre());
        System.out.println(this.getDescripcion());
        System.out.println(this.getPrecioBase() + "pesos");
        System.out.println(this.getTiempoDeFabricacion() + "dias");
        this.printAreasDisponibles();
    }

    public void getTiposDePersonalizacion() {
        tiposDePersonalizacion.forEach(t-> {
            System.out.println(t.getNombre());
            System.out.println(t.getDescripcion());
        });
    }

}