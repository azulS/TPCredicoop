package SPRING.Controladores;

import SPRING.Repositorios.Producto.RepoProductos;
import domain.models.entities.productos.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/gestor")
public class GestorController {
    @Autowired
    RepoProductos repoProductos;

    @GetMapping(path = {"/", " "})
    public Page<Producto> verProductos(Pageable page){
        List<Producto> productos = new ArrayList<>();
        return repoProductos.page(page);
    }
}
