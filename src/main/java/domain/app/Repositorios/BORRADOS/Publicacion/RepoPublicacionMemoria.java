//package SPRING.Repositorios.Publicacion;
//
//import SPRING.ERRORES.PubliRepetidaException;
//import domain.models.entities.publicaciones.Publicacion;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageImpl;
//import org.springframework.data.domain.Pageable;
//import org.springframework.stereotype.Repository;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Repository
//public class RepoPublicacionMemoria implements RepoPublicacion {
//    private List<Publicacion> publicaciones;
//
//    public RepoPublicacionMemoria(){
//        super();
//        publicaciones = new ArrayList<>();
//    }
//        @Override
//    public Page<Publicacion> page(Pageable pageable) {
//        int desde = pageable.getPageNumber()*pageable.getPageSize();
//        List <Publicacion> subList2 =
//                this.publicaciones.subList(desde, desde + pageable.getPageSize());
//        return new PageImpl<Publicacion>(subList2, pageable, this.publicaciones.size());
//    }
//    @Override
//    public Publicacion porId(Integer idPublicacion) {
//        return this.publicaciones.stream().filter(x->x.getId().equals(idPublicacion)).findFirst().get();
//    }
//
//    @Override
//    public void savePublicacion(Publicacion publicacion) {
//        if (this.existePublicacion(publicacion.getContenidoPublicacion().getNombre())) {
//            try {
//                throw new PubliRepetidaException(publicacion);
//            } catch (PubliRepetidaException e) {
//                throw new RuntimeException(e);
//            }
//
//        } else{
//            publicaciones.add(publicacion);
//            System.out.println(publicacion);
//        }
//    }
//
//    @Override
//    public boolean existePublicacion(String nombre){
//        long count = this.publicaciones.stream().filter(publicacion -> publicacion.getContenidoPublicacion().getNombre().equals(nombre)).count();
//        return count >0;
//    }
//}
