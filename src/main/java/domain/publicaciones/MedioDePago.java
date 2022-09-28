package domain.publicaciones;

import domain.usuario.GestorDeUsuarios;
import lombok.Getter;

@Getter
public class MedioDePago {
    private GestorDeUsuarios autenticador;
    private String medioDePago;

    public MedioDePago(GestorDeUsuarios autenticador){
        this.autenticador = autenticador;
    }

    public void setMedioDePago(String nombreMedio, String user) {
        if (autenticador.esVendedor(user)) {
            this.medioDePago = nombreMedio;
        }
    }
}
