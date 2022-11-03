package SPRING.Controladores;

import domain.models.entities.Carrito.CarritoDeCompras;
import domain.models.entities.usuario.Comprador;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping ("/comprador")
public class CompradorController {

    @GetMapping(path = {"/", " "}) // TODO: 2/11/2022  falta agregar lo del numero de comprador
    public List<CarritoDeCompras> verCarritos() {
        // TODO: 2/11/2022  el comprador no se crea una cuenta pero si tiene una cuenta, como hago?
        List<CarritoDeCompras> carritos = new ArrayList<>(); // TODO: 2/11/2022 tengo que crear una lista nueva?
        return carritos;
        // TODO: 3/11/2022 tendria que ponerle un limite a la cantidad de carritos del usuario
    }

    @PutMapping("/nuevo")
    public List<CarritoDeCompras> nuevoCarritos() {
        CarritoDeCompras carrito= new CarritoDeCompras();
        List<CarritoDeCompras> carritos = new ArrayList<>();// TODO: 2/11/2022 como hago para solo crear un carrito y no la colleccion
        carritos.add(carrito);
        return carritos; // TODO: 2/11/2022 no entiendo porque no me deja poner carrito
    }

    @GetMapping("/{carritoDeComprasId}") // TODO: 2/11/2022 que hacemos con ese id_carrito?
    public CarritoDeCompras verContenido(@PathVariable ("carritoDeComprasId") Integer idCarrito) {
        return idCarrito.getContenidoCarrito().forEach();
    }

    @GetMapping("/{carritoDeComprasId}/estado")
    public CarritoDeCompras verEstado({carritoDeComprasId}) {
        return {carritoDeComprasId}.getPagoCarrito().getEstadoDeCompra();
    }

    @PutMapping("/{carritoDeComprasId}/pagar")


    @PutMapping("/{carritoDeComprasId}/cantidad=3")

    @PutMapping("/{carritoDeComprasId}/medio=3")

}
