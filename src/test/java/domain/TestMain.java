package domain;

import domain.productos.AreaDePersonalizacion;
import domain.productos.Producto;
import domain.productos.TipoDePersonalizacion;
import domain.usuario.GestorDeUsuarios;
import domain.usuario.Gestor;
import domain.usuario.TipoDeUsuario;
import domain.usuario.Usuario;

public class TestMain {
    public static void main(String[] args) {

        Usuario uno = new Gestor("Carlos", "125adsfas",  TipoDeUsuario.GESTOR);
        GestorDeUsuarios autenticador = new GestorDeUsuarios();
        autenticador.agregarNuevoUsuario(uno);
        uno.setId("Luciano");
        uno.setTipoDeUsuario(TipoDeUsuario.GESTOR);

        Producto remera = new Producto(autenticador);
        Producto gorra = new Producto(autenticador);

        Producto zapatillas = new Producto(autenticador);
        Producto otros = new Producto(autenticador);

        remera.setUser("Luciano");


        remera.setNombre("Remera");
        remera.setDescripcion("ropa para llevar arriba de la cintura");
        remera.setPrecioBase(500);
        remera.setTiempoDeFabricacion(4);

        AreaDePersonalizacion pecho = new AreaDePersonalizacion();
        pecho.setNombre("pecho");

        TipoDePersonalizacion pintura = new TipoDePersonalizacion();
        pintura.setNombre("pintura:");
        pintura.setDescripcion("pintura sublimada");
        pecho.agregarTipoDePersonalizacion(pintura);

        TipoDePersonalizacion stencil = new TipoDePersonalizacion();
        stencil.setNombre("stencil:");
        stencil.setDescripcion("aerografo");
        pecho.agregarTipoDePersonalizacion(stencil);

        AreaDePersonalizacion espalda = new AreaDePersonalizacion();
        espalda.setNombre("espalda");

        remera.agregarAreaDePersonalizacion(pecho);
        remera.agregarAreaDePersonalizacion(espalda);

        remera.printProducto();

        AreaDePersonalizacion areaDePersonalizacion = new AreaDePersonalizacion();
        //String inputDelUsuario = lee del usuario el nombre del producto
//        areaDePersonalizacion.setNombre(inputDelUsuario);
    }
    }

//
//    public static void main(String[] args) {
//        List<Producto> productos = new ArrayList<>();
//        Scanner scanner = new Scanner(System.in);
//        boolean continuar = true;
//        while (continuar) {
//            Producto producto = cargarProducto(scanner);
//            productos.add(producto);
//            System.out.println("Desea seguir cargando productos? (si/no)");
//            String inputContinuar = scanner.nextLine();
//            if (inputContinuar.equalsIgnoreCase("si")) {
//                continuar = false;
//            }
//        }
//
//        for (Producto producto : productos) {
//            producto.verProducto();
//        }
//
////        Producto producto = cargarProducto(scanner);
////        Producto producto = cargarProducto(scanner);
////        Producto producto = cargarProducto(scanner);
////        producto.verProducto();
//
//    }
//
//    private static Producto cargarProducto(Scanner scanner) {
//        System.out.println("Ingrese el nombre del producto:");
//        String nombreDelProducto = scanner.nextLine();
//        Producto producto = new Producto();
//        producto.setNombre(nombreDelProducto);
//        System.out.println("Ingrese descripcion:");
//        String descripcion = scanner.nextLine();
//        producto.setDescripcion(descripcion);
//        return producto;
//    }
//}
