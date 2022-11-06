package SPRING.Repositorios.Publicacion;

import domain.models.entities.publicaciones.MedioDePago;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RepoMedios {
    private List<MedioDePago> medios;

    public RepoMedios(){
        medios = new ArrayList<>();
    }

    public List<MedioDePago> all(){
        return this.medios;
    }
}
