package SPRING.Controladores;

import SPRING.Repositorios.CarritoDeCompras.RepoCarrito;
import domain.models.entities.Carrito.CarritoDeCompras;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping ("/comprador")
public class CompradorController {

    @Autowired
    RepoCarrito repo;
    // TODO: 2/11/2022  falta agregar lo del numero de comprador a todo

    @GetMapping(path = {"/", " "})
    public Page<CarritoDeCompras> verCarritos(Pageable page) {
        List<CarritoDeCompras> carritos = new ArrayList<>();
        return repo.page(page);

        // TODO: 3/11/2022 tendria que ponerle un limite a la cantidad de carritos del usuario
    }

    @PutMapping("/nuevo")
    public List<CarritoDeCompras> nuevoCarritos() {
        CarritoDeCompras carrito= new CarritoDeCompras();
        List<CarritoDeCompras> carritos = new ArrayList<>();// TODO: 2/11/2022 como hago para solo crear un carrito y no la colleccion
        carritos.add(carrito);
        return carritos; // TODO: 2/11/2022 no entiendo porque no me deja poner carrito
    }


    @GetMapping("/{idCarrito}") // TODO: 2/11/2022 que hacemos con ese id_carrito?
    public CarritoDeCompras verContenidoCarrito (@PathVariable ("idCarrito") Integer idCarrito){
        try{
            return repo.porId(idCarrito);
        }
        catch(Exception e){
            System.out.println("error 404");
            return null;
        }
    }
//
//    @GetMapping("/{carritoDeComprasId}/estado")
//    public CarritoDeCompras verEstado({carritoDeComprasId}) {
//        return {carritoDeComprasId}.getPagoCarrito().getEstadoDeCompra();
//    }
//
//    @PutMapping("/{carritoDeComprasId}/pagar")
//
//    @PutMapping("/{carritoDeComprasId}/cantidad=3")
//
//    @PutMapping("/{carritoDeComprasId}/medio=3")
//
}
