package SPRING.Controladores;

import SPRING.Repositorios.Publicacion.RepoMedios;
import SPRING.Repositorios.Publicacion.RepoPublicacion;
import SPRING.Repositorios.Publicacion.RepoPublicacionMemoria;
import domain.models.entities.publicaciones.MedioDePago;
import domain.models.entities.publicaciones.PersonalizacionVendedores;
import domain.models.entities.publicaciones.Publicacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/vendedor")
public class VendedorController {
    @Autowired
    RepoPublicacion repoPublicacion;
    @Autowired
    RepoMedios repoMedios;

    @GetMapping(path = {"/", " "})
    public Page<Publicacion> verPublicaciones (Pageable page){
        List<Publicacion> publicaciones = new ArrayList<>();
        return repoPublicacion.page(page);
    }

    @GetMapping(path = {"/medios"})
    public List<MedioDePago> verMedios(){
        return repoMedios.all();
    }

    @GetMapping("/{idPublicacion}")
    public Publicacion verPublicacion(@PathVariable("idPublicacion") Integer id){
        try{
            return repoPublicacion.porId(id);
        }
        catch (Exception e){
            System.out.println("error 404");
            return null;
        }
    }

    @GetMapping("/{idPublicacion}/opciones")
    public List<PersonalizacionVendedores> verOpcionesPublicacion(
            @PathVariable("idPublicacion") Integer id){
        try{
            return repoPublicacion.porId(id).getContenidoPublicacion().getPersonalizacionesVendedores();
        }
        catch(Exception e){
            System.out.println("error 404");
            return null;
        }
    }

}
