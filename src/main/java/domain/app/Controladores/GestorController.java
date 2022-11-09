package domain.app.Controladores;

import domain.app.Repositorios.JPA.RepoGestorJPA;
import domain.models.entities.productos.PersonalizacionGestores;
import domain.models.entities.productos.Producto;
import domain.models.entities.usuario.Gestor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/gestor")
public class GestorController {
//    @Autowired
//    RepoProductos repoProductos;
    @Autowired
    RepoGestorJPA repoGestores;

//    @GetMapping(path = {"/", " "})
//    public Page<Gestor> verGestorId(Pageable page,
//            @RequestParam(value = "id", required = false)Long id) {
//        if (id != null) {
//            return repoGestores.findById(id, page);
//        } else {
//            return repoGestores.findAll(page);
//        }
//    } BORRA ESTO PORQUE DICE QUE NO TIENE MUCHO SENTIDO


//    @GetMapping(path = {"/", " "})
//    public Page<Producto> verProductos(Pageable page){
//        List<Producto> productos = new ArrayList<>();
//        return repoGestores.findAll(page);
////    }
//
//    @GetMapping("/{idProducto}")
//    public Producto verProducto(@PathVariable("idProducto") Integer id){
//        try{
//            return repoProductos.porId(id);
//        }
//        catch(Exception e){
//            System.out.println("error 404");
//            return null;
//        }
//    }
//
//    @GetMapping("/{idProducto}/opciones")
//    public List<PersonalizacionGestores> verOpcionesProducto(@PathVariable("idProducto") Integer id){
//        try{
//            return repoProductos.porId(id).getPersonalizacionGestores();
//        }
//        catch(Exception e){
//            System.out.println("error 404");
//            return null;
//        }
//    }
}
