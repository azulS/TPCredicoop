package domain.models.entities.aplicacion;

import SPRING.Repositorios.CarritoDeCompras.RepoCarritoJPA;
import domain.models.entities.Carrito.CarritoDeCompras;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.LinkedList;

@SpringBootApplication
public class AppPlataformaLicuadora {

    @Autowired
    RepositoryRestConfiguration config;

    @Autowired
    RepoCarritoJPA repo;
    public static void main(String[] args){
        SpringApplication.run(AppPlataformaLicuadora.class, args);
    }

    @Bean //le decimos que instancie por nosotros
    public CommandLineRunner init(RepoCarritoJPA repo){
        LinkedList<Integer> list = new LinkedList<Integer>();
        config.exposeIdsFor(CarritoDeCompras.class);
        return (cosas) ->{
            repo.save(new CarritoDeCompras());
            System.out.println(cosas.length);
        };

    }

}


// TODO: 6/11/2022 cuando ejecuto una aplicacion.
//  primero arranco por un main. Las cosas que le paso al inicio son los contenidos del args
//  Si levantamos el mismo programa con distintos argumentos actua distinto
//  run.configuration es para ponerle argumentos al main.
//
//  lso repositorios son algo comun.
//  Para darse cuenta de que repomateria es un repositorio tenemos que poner @Repository
//
//
//  .
