package SPRING;

import domain.models.entities.productos.Producto;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AppPlataformaLicuadora {
    public static void main(String[] args){

        SpringApplication.run(AppPlataformaLicuadora.class, args);

//        @Bean
//        public CommandLineRunner ejemplo(){
//            RepoProducto repo= new RepoProducto();
//            repo.save(new Producto("remera"));
//        }
    }
}

/*

SpringApplication.run(AppPlataformaLicuadora.class, args);
    lo que dice es que AppPlataformaLicuadora va a ser mi aplicacion y a partir de aca va a correr todo el chiste
    args: es el punto de entrada, son strings

commandLineRunner: es un commando que hace que se ejecute en ese momento un lambda.
                    Se usa para cosas administrativas
@bean: significa que Spring te lo tiene que instanciar
@Repository: la clase que tenga @Repository es un repositorio, lo va a instanciar String
@Autowired = en el momento en el que ejecute la clase , si tengo un elemento que tiene @Autowired arriba significa que
    cuando ejecute esa clase lo que esta bajo de autowired tiene que estar creado
    estable dependencias
@Value = se usa para buscar valores en el archivo de configuracion (application.properties)
    en la clase aparece @Value("${algo}")
                        private int unNumero;
    en el application properties escribir:
                        algo= $(“numero random”)
@RestController: quien recibe los pedidos web y nos responde algo
@RequestMapping("/requestrandom") = cuando alguien hhaga una request random la clase que este abajo se va a ejecutar
@GetMapping(path={" ", "/"}): para obtener un listado
         es lo que pasa si el request termina en / o " "
@GetMapping ("/{pepe}")
public Materia materia (@PathVariable("pepe") String nombre){
        return repo.porNombre(String nombre)
        aca lo que hace es buscarte en el repo lo que haiga adentro de {..}
}

.stream= son metodos para filtrar colecciones tirandole lambdas (java puro)
application.properties: para repartir configuraciones las tengo que subir a "variables de entorno"
    Enviroment Variable

repo.save(new Materia m) = guardar en el repositorio una nueva materia
repo.all()

APIRest: CON LAS RUTAS ESTABLEZCO COMO ESTRUCTURO MI API
*/