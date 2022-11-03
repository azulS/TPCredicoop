package domain.models.entities.usuario;

import domain.models.entities.Carrito.CarritoDeCompras;
import domain.models.entities.publicaciones.MedioDePago;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.Entity;

@Entity
@Table(name="Usuario")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn (discriminatorType = DiscriminatorType.STRING,
        name="tipoDeUsuario")
@Setter
@Getter

public abstract class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id" , nullable = false)
    private Long id;
    @Column
    private String password;
    @Enumerated(EnumType.STRING)

    public void setId(Long id) {
                 this.id = id;
             }

    public Usuario() {
    }


    // TODO: 16/9/2022 hacer excepciones try...catch por si se confundio la contrasenia al entrar

}
