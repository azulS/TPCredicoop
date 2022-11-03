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
    }

    @PutMapping("/nuevo")
    public List<CarritoDeCompras> nuevoCarritos() {
        CarritoDeCompras carrito= new CarritoDeCompras();
        List<CarritoDeCompras> carritos = new ArrayList<>();// TODO: 2/11/2022 como hago para solo crear un carrito y no la colleccion
        carritos.add(carrito);
        return carritos; // TODO: 2/11/2022 no entiendo porque no me deja poner carrito
    }

    @GetMapping("/2") // TODO: 2/11/2022 que hacemos con ese id_carrito?
    public CarritoDeCompras verContenido(2) {
        return dos.getContenidoCarrito().forEach();
    }

    @GetMapping("/2/estado")
    public CarritoDeCompras verEstado(2) {
        return 2.getPagoCarrito().getEstadoDeCompra();
    }

    @PutMapping("/2/pagar")


    @PutMapping("/2/cantidad=3")

    @PutMapping("/2/medio=3")

}
