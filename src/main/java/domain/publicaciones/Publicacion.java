package domain.publicaciones;

import domain.productos.AreaDePersonalizacion;
import domain.productos.Producto;
import domain.usuario.GestorDeUsuarios;
import domain.usuario.Scanner;
import domain.usuario.Vendedor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Publicacion {
    @Setter
    private String idPublicacion;
    @Setter
    private String user;
    @Setter
    private Vendedor vendedor;
    // TODO: 27/9/2022 arreglar lo de user y sacar esta info del atributo Uruario Vendedor.
    //  Ver como se setea vendedor
    private Producto productoBase;
    private GestorDeUsuarios autenticador;
    private EstadoDePublicacion estadoDePublicacion;
    @Setter
    int precioPersonalizacion;
    @Setter
    String nombreNuevoPersonalizacion;

    private List<MedioDePago> mediosDePago;
    private List<String> frasesDePersonalizacion;
    private List<Imagen> imagenesDePersonalizacion;

    private List<PreciosPorArea> preciosPorPersonalizacion;
    // TODO: 28/9/2022 Esto hay que arreglarlo.
    //  1- por cada area de personalizacion predefinida
    //  2- los vendedores le ponen un nombre
    //  3- los vendedores le ponen un precio
    //  4- calcular el precio del carrito en funcion de las personalizaciones elegidas
    //  5-modificar Carrito
    //  6-modificar comprador

    public Publicacion(GestorDeUsuarios autenticador, Vendedor user) {
        this.frasesDePersonalizacion = new ArrayList<>();
        this.imagenesDePersonalizacion = new ArrayList<>();
        this.mediosDePago = new ArrayList<>();
        this.preciosPorPersonalizacion = new ArrayList<>();

        this.autenticador = autenticador;
        this.user = user.getId();
        user.cargarPublicacion(this);
        //que parametro le pongo a "cargarPublicacion" para que el vendedor cargue a su coleccion de publicaciones
        // esta publicacion nueva?
    }

    // TODO: 27/9/2022 como hacer para oblicar a intanciar el producto Base cuando creo una publicacion:
    //u obligo a instanciar productoBase cuando creo la publicacion
    //o pongo como condicion que exista producto Base asi no crashea

    // TODO: 27/9/2022 publicacion es composicion con producto, acomodar para que conozca al producto base
    public void setNuevoPrecioPorArea(PreciosPorArea precioPorArea, int precio, String nombreNuevo, AreaDePersonalizacion area){
        precioPorArea.setNombre(nombreNuevo);
        precioPorArea.setAreaDePersonalizacion(area);
        precioPorArea.setPrecio(precio);
    }
    public void agregarAreasDePersonalizacion() {
        if (this.productoBase.getAutenticador().esVendedor(this.productoBase.getUser())) {
            //POR CADA AREA DISPONIBLE EN EL PRODUCTO_BASE
            productoBase.getAreasBase().forEach(a-> {
                //SE INSTANCIA UN NUEVO PRECIO_DEL_AREA
                PreciosPorArea nuevoPrecioPorArea = new PreciosPorArea();
                this.setPrecioPersonalizacion(precioPersonalizacion);
                this.setNombreNuevoPersonalizacion(nombreNuevoPersonalizacion);
                setNuevoPrecioPorArea(nuevoPrecioPorArea, precioPersonalizacion, nombreNuevoPersonalizacion,a);
            //SE LO AGREGA A LA COLECCION DE PRECIOS_POR_PERSONALIZACION
                preciosPorPersonalizacion.add(nuevoPrecioPorArea);
            });
        }


        //EN EL CARRITO TENDRIAN QUE SUMAR EL PRECIO BASE
        // A LOS DISTINTOS PRECIOS DE LAS PERSONALZIACIONES SELECCIONADAS
    }

    public void agregarMedioDePago(MedioDePago medioDePagoNuevo) {
        this.mediosDePago.add(medioDePagoNuevo);
    }

    // TODO: 27/9/2022 agregar la condicion de que si ya esta ese medio de pago no tiene que agregarlo otra vez
    public void setEstadoDePublicacion(EstadoDePublicacion estadoDePublicacion) {
        if (this.productoBase.getAutenticador().esVendedor(this.productoBase.getUser())) {
            this.estadoDePublicacion = estadoDePublicacion;
        }
    }

    public void agregarFrases(String fraseNueva) {
        if (this.productoBase.getAutenticador().esVendedor(this.productoBase.getUser())) {
            frasesDePersonalizacion.add(fraseNueva);
        }
    }

    public void agregarImagenes(Imagen imagenNueva) {
        if (this.productoBase.getAutenticador().esVendedor(this.productoBase.getUser())) {
            imagenesDePersonalizacion.add(imagenNueva);
        }
    }

    public void printFrasesDePersonalizacion() {
        this.imagenesDePersonalizacion.forEach(i -> {
            System.out.println(i);
        });
    }

    public void printImagenesDePersonalizacion() {
        this.frasesDePersonalizacion.forEach(f -> {
            System.out.println(f);
        });
    }

    public void printPublicacion() {
        System.out.println(this.productoBase.getNombre());
        System.out.println(this.productoBase.getDescripcion());
        System.out.println(this.productoBase.getTiempoDeFabricacion() + "dias");

        System.out.println(this.getPrecioPersonalizacion() + "pesos");
        this.printAreasDePersonalizacion();
        this.printFrasesDePersonalizacion();
        this.printImagenesDePersonalizacion();
    }

    public void printMediosDePago() {
        this.mediosDePago.forEach(m -> {
            System.out.println(m.getMedioDePago());
        });
    }
}