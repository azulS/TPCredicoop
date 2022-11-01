package domain.models.entities.productos;

import domain.Persistente;
import domain.models.entities.usuario.Gestor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Producto")
@Getter
@Setter
public class Producto extends Persistente {

    @Column
    private String nombre;
    @ManyToOne
    @JoinColumn(name="gestor_id", referencedColumnName="id")
    private Gestor user;
    @Column
    private String descripcion;
    @Column
    private int precioBase;
    @Column
    private int tiempoDeFabricacion;
    @OneToMany
    private List<PersonalizacionGestores> posiblesPersonalizaciones;

public Producto(){
    this.posiblesPersonalizaciones= new ArrayList<>();
}

//    public void agregarAreaDePersonalizacion(AreaDePersonalizacion nuevaAreaDisponible){
////        if (autenticador.esGestor(user)) {
//            this.areasBase.add(nuevaAreaDisponible);
////        }
    }
//    public void agregarTiposDePersonalizacion(TipoDePersonalizacion nuevoTipoDePersonalizacion){
////        if (autenticador.esGestor(user)) {
//            this.tiposDePersonalizacion.add(nuevoTipoDePersonalizacion);
////        }
//    }
//    public void setNombre(String nombre) {
////        if (autenticador.esGestor(user)) {
//            this.nombre = nombre;
////        }
//    }
//    public void setPrecioBase(int precioBase) {
////        if (autenticador.esGestor(user)) {
//            this.precioBase = precioBase;
////        }
//    }
//
//    public void setDescripcion(String descripcion) {
////        if (autenticador.esGestor(user)) {
//        this.descripcion = descripcion;
////        }
//    }
//    public void setTiempoDeFabricacion(int tiempoDeFabricacion) {
////        if (autenticador.esGestor(user)) {
//            this.tiempoDeFabricacion = tiempoDeFabricacion;
////        }
//    }
////    public void printAreasDisponibles() {
////        areasBase.forEach(a -> {
////            System.out.println(a.getNombre());
////            });
////    }
////    public void printProducto(){
////        System.out.println(this.getNombre());
////        System.out.println(this.getDescripcion());
////        System.out.println(this.getPrecioBase() + "pesos");
////        System.out.println(this.getTiempoDeFabricacion() + "dias");
////        this.printAreasDisponibles();
////    }
//
//    public void getTiposDePersonalizacion() {
////        tiposDePersonalizacion.forEach(t-> {
////            System.out.println(t.getNombre());
////            System.out.println(t.getDescripcion());
////        });
//    }

