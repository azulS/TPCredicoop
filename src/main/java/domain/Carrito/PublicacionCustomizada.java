package domain.Carrito;

import domain.productos.AreaDePersonalizacion;
import domain.productos.TipoDePersonalizacion;
import domain.publicaciones.Imagen;
import domain.publicaciones.PrecioPorArea;
import domain.publicaciones.Publicacion;
import lombok.Getter;

@Getter
public class PublicacionCustomizada {
    private Publicacion publicacion;
    private PrecioPorArea areaSeleccionada;
    private String fraseSeleccionada;
    private Imagen imagenSeleccionada;
    private TipoDePersonalizacion tipoSeleccionado;
    private CarritoDeCompras carrito;

    public PublicacionCustomizada(Publicacion publicacion, PrecioPorArea areaSeleccionada) {
        this.publicacion = publicacion;
        this.areaSeleccionada = areaSeleccionada;
    }

    public void agregarPublicacionCustomizadaACarrito() {
        carrito.agregarPublicacionACarrito(this);
    }

    public int getPecioPersonalizacion() {
        return this.publicacion.getPrecioPersonalizacion(areaSeleccionada);
    }
    // TODO: 28/9/2022  
    // Hacer todos los setters de manera de que sea una condicion que la publicacion 
    // tenga el area seleccionada que se seleccion

    // TODO: 28/9/2022 hay que setear el medio de pago aca? 

}
