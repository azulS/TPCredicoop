package SPRING.Repositorios.Producto;

import SPRING.Repositorios.Publicacion.RepoPublicacionMemoria;
import domain.models.entities.productos.Producto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RepoProductoMemoria implements RepoProductos{
    private List<Producto> productos;

    public RepoProductoMemoria(){
        super();
        productos = new ArrayList<>();
    }

    @Override
    public Page<Producto> page(Pageable pageable) {
       int desde = pageable.getPageNumber()* pageable.getPageSize();
        List<Producto> subList2 =
                this.productos.subList(desde, desde + pageable.getPageSize());
        return new PageImpl<Producto>(subList2, pageable, this.productos.size());
    }

    @Override
    public Producto porId(Integer idProducto) {
        return this.productos.stream().filter(x->x.getId().equals(idProducto)).findFirst().get();
    }
}
