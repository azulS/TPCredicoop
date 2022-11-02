package domain.models.entities.publicaciones;

import domain.Persistente;
import domain.models.entities.usuario.GestorDeUsuarios;
import domain.models.entities.usuario.Vendedor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Publicacion")
@Getter
@Setter
@NoArgsConstructor
public class Publicacion extends Persistente {
    @ManyToOne
    @JoinColumn (name = "usuario_id", referencedColumnName = "id")
    private Vendedor usuario;
    @OneToOne
    private ContenidoPublicacion contenidoPublicacion;
    @OneToMany
    private List<EstadoDeLaPublicacion> estadosDePublicacion;

    public Publicacion(GestorDeUsuarios autenticador, Vendedor user) {
        this.estadosDePublicacion = new ArrayList<>();
    user.cargarPublicacion(this);
        //que parametro le pongo a "cargarPublicacion" para que el vendedor cargue a su coleccion de publicaciones
        // esta publicacion nueva?
    }

    // TODO: 27/9/2022 como hacer para oblicar a intanciar el producto Base cuando creo una publicacion:
    //u obligo a instanciar productoBase cuando creo la publicacion
    //o pongo como condicion que exista producto Base asi no crashea

    // TODO: 27/9/2022 publicacion es composicion con producto, acomodar para que conozca al producto base
//    public void setNuevoPrecioPorArea(PrecioPorArea precioPorArea, int precio, String nombreNuevo, AreaDeImpresion area){
//        precioPorArea.setNombre(nombreNuevo);
//        precioPorArea.setAreaDePersonalizacion(area);
//        precioPorArea.setPrecio(precio);
//    }
//    public void agregarAreasDePersonalizacion() {
//        if (this.productoBase.getAutenticador().esVendedor(this.productoBase.getUser())) {
//             productoBase.getAreasBase().forEach(a-> {
//                PrecioPorArea nuevoPrecioPorArea = new PrecioPorArea();
//                personalizacion.getPreciosPorPersonalizacion().add(nuevoPrecioPorArea);
//            });
//        }
//        //EN EL CARRITO TENDRIAN QUE SUMAR EL PRECIO BASE
//        // A LOS DISTINTOS PRECIOS DE LAS PERSONALZIACIONES SELECCIONADAS
//    }

//    public int getPrecioPersonalizacion(PrecioPorArea areaSeleccionada){
//        return areaSeleccionada.getPrecio();
//    }

    // TODO: 27/9/2022 agregar la condicion de que si ya esta ese medio de pago no tiene que agregarlo otra vez


//    public void agregarFrases(String fraseNueva) {
//        if (this.productoBase.getAutenticador().esVendedor(this.productoBase.getUser())) {
//            personalizacion.getFrasesDePersonalizacion().add(fraseNueva);
//        }
//    }
//
//    public void agregarImagenes(Imagen imagenNueva) {
//        if (this.productoBase.getAutenticador().esVendedor(this.productoBase.getUser())) {
//            personalizacion.getImagenesDePersonalizacion().add(imagenNueva);
//        }
//    }

//    public void printFrasesDePersonalizacion() {
//        this.personalizacion.getImagenesDePersonalizacion().forEach(i -> {
//            System.out.println(i);
//        });
//    }
//
//    public void printImagenesDePersonalizacion() {
//        this.personalizacion.getFrasesDePersonalizacion().forEach(f -> {
//            System.out.println(f);
//        });
//    }

//    public void printPublicacion() {
//        System.out.println(this.productoBase.getNombre());
//        System.out.println(this.productoBase.getDescripcion());
//        System.out.println(this.productoBase.getTiempoDeFabricacion() + "dias");

//        System.out.println(this.getPrecioPersonalizacion() + "pesos");
//        this.printFrasesDePersonalizacion();
//        this.printImagenesDePersonalizacion();
//    }

//    public void printMediosDePago() {
//        this.mediosDePago.forEach(m -> {
//            System.out.println(m.getMedioDePago());
//        });
//  }
}