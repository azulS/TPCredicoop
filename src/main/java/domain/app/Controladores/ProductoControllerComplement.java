package domain.app.Controladores;

import domain.app.Repositorios.JPA.RepoProductoJPA;
import domain.models.entities.productos.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@RepositoryRestController
public class ProductoControllerComplement {

    @Autowired
    RepoProductoJPA repo;
    @Transactional
    @DeleteMapping ("/productos/{productoId}")
    public @ResponseBody ResponseEntity<Object> delete (@PathVariable("productoId") Long productoId) {
        Optional<Producto> productoOptional = repo.findById(productoId);

        if (productoOptional.isPresent()) {
            Producto producto = productoOptional.get();
            productoOptional.get().setActivo(false);
            return ResponseEntity.ok("producto borrado ok");
        }
        return ResponseEntity.notFound().build();
    }
}
