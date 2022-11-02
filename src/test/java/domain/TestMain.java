package domain;


//public class TestMain {
//    public static void main(String[] args) {

//        Usuario uno = new Gestor("Carlos", "125adsfas",  TipoDeUsuario.GESTOR);
//        GestorDeUsuarios autenticador = new GestorDeUsuarios();
//        autenticador.agregarNuevoUsuario(uno);
//        uno.setId("Luciano");
//        uno.setTipoDeUsuario(TipoDeUsuario.GESTOR);
//
//        Producto remera = new Producto(autenticador);
//        Producto gorra = new Producto(autenticador);
//
//        Producto zapatillas = new Producto(autenticador);
//        Producto otros = new Producto(autenticador);
//
//        remera.setUser("Luciano");
//
//
//        remera.setNombre("Remera");
//        remera.setDescripcion("ropa para llevar arriba de la cintura");
//        remera.setPrecioBase(500);
//        remera.setTiempoDeFabricacion(4);
//
//        AreaDeImpresion pecho = new AreaDeImpresion();
//        pecho.setNombre("pecho");
//
//        TecnicaDeImpresion pintura = new TecnicaDeImpresion();
//        pintura.setNombre("pintura:");
//        pintura.setDescripcion("pintura sublimada");
//        pecho.agregarTipoDePersonalizacion(pintura);
//
//        TecnicaDeImpresion stencil = new TecnicaDeImpresion();
//        stencil.setNombre("stencil:");
//        stencil.setDescripcion("aerografo");
//        pecho.agregarTipoDePersonalizacion(stencil);
//
//        AreaDeImpresion espalda = new AreaDeImpresion();
//        espalda.setNombre("espalda");
//
//        remera.agregarAreaDePersonalizacion(pecho);
//        remera.agregarAreaDePersonalizacion(espalda);
//
//        remera.printProducto();
//
//        AreaDeImpresion areaDePersonalizacion = new AreaDeImpresion();
//        //String inputDelUsuario = lee del usuario el nombre del producto
////        areaDePersonalizacion.setNombre(inputDelUsuario);
//    }


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
