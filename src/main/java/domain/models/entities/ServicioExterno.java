package domain.models.entities;

import domain.models.entities.Carrito.CarritoDeCompras;
import domain.models.entities.publicaciones.MedioDePago;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class ServicioExterno {
    Integer id= Integer.valueOf("123546");
    public String generarFacturaElectronica(CarritoDeCompras carrito){
        
        return "Factura numero="+ this.getId();

    }
}

// TODO: 4/11/2022 habria que hacer que las id sean numeros random o ver que es una factura asi es mas cheto 