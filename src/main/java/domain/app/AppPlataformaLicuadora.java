package domain.app;

import domain.app.Repositorios.JPA.RepoGestorJPA;
import domain.app.Repositorios.JPA.RepoProductoJPA;
import domain.models.entities.Carrito.CarritoDeCompras;
import domain.models.entities.usuario.Gestor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.stereotype.Component;

import java.util.LinkedList;

@SpringBootApplication
@Component
public class AppPlataformaLicuadora {

    @Autowired
    RepositoryRestConfiguration config;

    @Autowired
    RepoGestorJPA repoGestor;
    public static void main(String[] args){
        SpringApplication.run(AppPlataformaLicuadora.class, args);
    }

    @Bean //le decimos que instancie por nosotros
    public CommandLineRunner init(RepoGestorJPA repoGestor, RepoProductoJPA repoProducto){
        LinkedList<Long> list = new LinkedList<Long>();
        config.exposeIdsFor(Gestor.class); //para que se puedan ver los ids en postman
        return (cosas) ->{
            repoGestor.save(new Gestor());
            System.out.println(cosas.length);
        };
    }
}