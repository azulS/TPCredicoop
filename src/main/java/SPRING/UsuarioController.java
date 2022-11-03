package SPRING;

import domain.models.entities.productos.Producto;
import domain.models.entities.usuario.Gestor;
import domain.models.entities.usuario.Usuario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/usuario") // poner entre comillas la entidad que se quiere controlar
public class UsuarioController {

    @PostMapping ("/")// si es GET o POST o lo que sea
    public void crearUsuario(){
        System.out.println("se creo un usuario");
    }


    @GetMapping ("/")// si es GET o POST o lo que sea
    public List<Usuario> listarUsuarios(){
        System.out.println("se creo un usuario");
        Gestor gestor1 = new Gestor();
        gestor1.setId(123456L);
        Producto producto1 = new Producto();
        ArrayList<Producto> productocRgdo = new ArrayList<>();
        productocRgdo.add(producto1);
        gestor1.setProductosCargados(productocRgdo);
        gestor1.setPassword("wsdwefw");
        ArrayList<Usuario> list = new ArrayList<>();
        list.add(gestor1);
        return list;
    }
}
