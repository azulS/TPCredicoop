package domain.publicaciones;

import domain.productos.AreaDePersonalizacion;
import domain.productos.Producto;
import domain.usuario.GestorDeUsuarios;
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
    private int precio;
    private EstadoDePublicacion estadoDePublicacion;
    private List<MedioDePago> mediosDePago;
    private List<String> frasesDePersonalizacion;
    private List<Imagen> imagenesDePersonalizacion;
    private List<AreaDePersonalizacion> areasDePersonalizacion;
    // TODO: 28/9/2022 Esto hay que arreglarlo.
    //  1- por cada area de personalizacion predefinida
    //  2- los vendedores le ponen un nombre
    //  3- los vendedores le ponen un precio
    //  4- calcular el precio del carrito en funcion de las personalizaciones elegidas
    //  5-modificar Carrito
    //  6-modificar comprador

    public Publicacion(GestorDeUsuarios autenticador, Vendedor user) {
        this.areasDePersonalizacion = new ArrayList<>();
        this.frasesDePersonalizacion = new ArrayList<>();
        this.imagenesDePersonalizacion = new ArrayList<>();
        this.mediosDePago = new ArrayList<>();
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
    public void setPrecio(int aumento) {
        if (this.productoBase.getAutenticador().esVendedor(this.productoBase.getUser())) {
            this.precio = this.productoBase.getPrecioBase() + aumento;
        }
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

    public void agregarAreasDePersonalizacion(AreaDePersonalizacion areaNueva) {
        if (this.productoBase.getAutenticador().esVendedor(this.productoBase.getUser())) {
            for (AreaDePersonalizacion area : productoBase.getAreasBase()) {
                if (area.equals(areaNueva)) {
                    areasDePersonalizacion.add(areaNueva);
                }
            }
        }
    }

    public void printAreasDePersonalizacion() {
        this.areasDePersonalizacion.forEach(a -> {
            System.out.println(a.getNombre());
        });
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

        System.out.println(this.getPrecio() + "pesos");
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