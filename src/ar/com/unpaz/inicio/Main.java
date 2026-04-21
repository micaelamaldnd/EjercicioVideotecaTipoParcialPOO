package ar.com.unpaz.inicio;

import java.util.List;
import java.util.Scanner;

import ar.com.unpaz.model.Pelicula;
import ar.com.unpaz.service.LecturaDeArchivoService;
import ar.com.unpaz.service.PeliculaService;
import ar.com.unpaz.serviceImp.LecturaDeArchivoServiceImp;
import ar.com.unpaz.serviceImp.PeliculaServiceImp;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		PeliculaService service = new PeliculaServiceImp();
		LecturaDeArchivoService lectura = new LecturaDeArchivoServiceImp();
		List<Pelicula> peliculas = lectura.listaDeLaLectura();
		
		int opcion;
		
		do {
            System.out.println("\n~~~~~ SISTEMA VIDEOTECA ~~~~~");
            System.out.println("1. Agregar");
            System.out.println("2. Buscar por codigo");
            System.out.println("3. Eliminar");
            System.out.println("4. Listar");
            System.out.println("5. Alquilar");
            System.out.println("6. Devolver");
            System.out.println("7. Listar Peliculas Alquiladas");
            System.out.println("8. Cantidad de Peliculas Alquiladas ");
            System.out.println("9. Pelicula más antigua");
            System.out.println("10.Salir del programa");
            System.out.println("Seleccione una opcion: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
            
            case 1:
            	System.out.println("Agregando nueva pelicula...");
            	
            	System.out.println("Codigo: ");
            	String codigo = scanner.nextLine();
            	            	
            	System.out.println("Titulo: ");
            	String titulo = scanner.nextLine();
            	
            	System.out.println("Genero: ");
            	String genero = scanner.nextLine();
            	
            	System.out.println("Año de estreno: ");
            	int anio = scanner.nextInt();
            	scanner.nextLine();
            	
            	System.out.println("Disponible: ");
            	boolean disponible = scanner.nextBoolean();
            	scanner.nextLine();
            	
            	Pelicula nuevaPeli = new Pelicula(codigo,titulo,genero,anio,disponible);
            	service.agregarPelicula(peliculas, nuevaPeli);
            	
            	
            	break;
            	
            case 2:
            	System.out.println("Buscando pelicula...");
            	
            	System.out.println("Codigo de la pelicula a buscar: ");
            	String cod = scanner.nextLine();
            	
            	service.buscarPeliculaCodigo(peliculas, cod);
            	break;
            	
            case 3 :
            	System.out.println("Ingrese el codigo de la pelicula que desea eliminar: ");
            	String codigoPelicula = scanner.nextLine();
            	
            	System.out.println("\nBuscando pelicula a eliminar...\n");
            	service.eliminarPelicula(peliculas, codigoPelicula);
            	break;
            	
            case 4:
            	System.out.println("Listando todas las peliculas...");
            	service.listarPeliculas(peliculas);
            	break;
            	
            case 5:
            	System.out.println("Alquilando pelicula...");
            	System.out.println("Ingrese el titulo de la pelicula que quiere alquilar: ");
            	String peliAlquilar = scanner.nextLine();
            	service.alquilarPelicula(peliculas, peliAlquilar);
            	break;
            	
            case 6:
            	System.out.println("Devolucion de pelicula...");
            	System.out.println("Ingrese el titulo de la pelicula que quiere devolver: ");
            	String peliDevuelta = scanner.nextLine();
            	service.devolverPelicula(peliculas, peliDevuelta);
            	break;
            	
            case 7:
            	System.out.println("Listando todas las peliculas alquiladas...");
            	service.listarPeliculasAlquiladas(peliculas);
            	break;
            	
            case 8:
            	service.cantidadPeliculasAlquilas(peliculas);
            	break;
            	
            case 9 :
            	System.out.println("Buscando la pelicula más antigua...");
            	service.peliculaMasAntigua(peliculas);            	
            	break;
            	
            case 10 :
            	System.out.println("Saliendo del programa...");
            	break;
          
            }
        
		} while(opcion != 10);
		
		scanner.close();
	
	}

}
