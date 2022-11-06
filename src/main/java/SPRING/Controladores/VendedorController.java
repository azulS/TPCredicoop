package SPRING.Controladores;

import SPRING.ERRORES.PubliRepetidaException;
import SPRING.Repositorios.Publicacion.RepoMedios;
import SPRING.Repositorios.Publicacion.RepoPublicacion;
import SPRING.Repositorios.Publicacion.RepoPublicacionMemoria;
import domain.models.entities.publicaciones.MedioDePago;
import domain.models.entities.publicaciones.PersonalizacionVendedores;
import domain.models.entities.publicaciones.Publicacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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

    @PostMapping(params = "/")
    public String altaPublicacion(@RequestBody @Valid Publicacion publicacion,
            BindingResult bindingResult)throws PubliRepetidaException { // TODO: 6/11/2022 3538 1:37 hace una carpeta deexcepciones!
        if (bindingResult.hasErrors()){

            return "not ok";
        } else{
            repoPublicacion.savePublicacion(publicacion);
            return "ok";
        }
    }
}
