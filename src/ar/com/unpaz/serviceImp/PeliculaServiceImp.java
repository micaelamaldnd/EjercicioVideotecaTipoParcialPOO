package ar.com.unpaz.serviceImp;

import java.util.List;

import ar.com.unpaz.model.Pelicula;
import ar.com.unpaz.service.PeliculaService;

public class PeliculaServiceImp implements PeliculaService {

	@Override
	public void agregarPelicula(List<Pelicula> peliculas, Pelicula peliculaNueva) {
		peliculas.add(peliculaNueva);
		System.out.println("\nPelicula agregada exitosamente!");
	}

	@Override
	public void buscarPeliculaCodigo(List<Pelicula> peliculas, String codigoPeliculaBuscada) {
		boolean peliEncontrada = false;
		for (Pelicula peli : peliculas) {
			if (peli.getCodigo().equals(codigoPeliculaBuscada)) {
				peliEncontrada = true;
				System.out.println("\nPelicula encontrada:\n");
				System.out.println(peli);
			}
		}
		if(!peliEncontrada) {
			System.out.println("La pelicula solicitada no fue encontrada...");
		}
	}

	@Override
	public void eliminarPelicula(List<Pelicula> peliculas, String codigo) {
		boolean encontrada = false;
		Pelicula peliculaEliminar = null;
		
		for (Pelicula peli : peliculas) {
			if(peli.getCodigo().equals(codigo)) {
				encontrada = true;
				peliculaEliminar = peli;
				break;
			}
		}
		
		if (!encontrada) {
			System.out.println("No se encontro la cuenta para eliminarla...");
		} else {
			System.out.println("Pelicula a eliminar:\n" +  peliculaEliminar);
			peliculas.remove(peliculaEliminar);
			System.out.println("\nPelicula eliminada exitosamente!");
		}
		
	}

	@Override
	public void listarPeliculas(List<Pelicula> peliculas) {
		if(peliculas.isEmpty()) {
			System.out.println("No hay peliculas cargadas por el momento.");
		} else {
			for (Pelicula peli : peliculas) {
				System.out.println(peli);
			}
		}
	}

	@Override
	public void alquilarPelicula(List<Pelicula> peliculas, String titulo) {
		boolean peliEncontrada = false;
		for (Pelicula peli : peliculas) {
		    if (peli.getTitulo().equals(titulo)) {

		        peliEncontrada = true;

		        if (peli.isDisponible()) {
		            peli.setDisponible(false);
		            System.out.println("\nPelicula alquilada correctamente.\n");
		        } else {
		            System.out.println("\nLa pelicula no esta disponible.\n");
		        }

		        break;
		    }
		}
		if(!peliEncontrada) {
			System.out.println("La pelicula solicitada no fue encontrada...");
		}
	}

	@Override
	public void devolverPelicula(List<Pelicula> peliculas, String titulo) {
		boolean peliEncontrada = false;
		for (Pelicula peli : peliculas) {
			if (peli.getTitulo().equals(titulo)) {
				peliEncontrada = true;
				peli.setDisponible(true);
				System.out.println("\nPelicula devuelta correctamente.\n");
			}
		}
		if(!peliEncontrada) {
			System.out.println("La pelicula solicitada no fue encontrada...");
		}		
	}

	@Override
	public void listarPeliculasAlquiladas(List<Pelicula> peliculas) {
		if(peliculas.isEmpty()) {
			System.out.println("No hay peliculas cargadas por el momento.");
		} else {
			for (Pelicula peli : peliculas) {
				if(peli.isDisponible() == false) {
					System.out.println(peli);
				}
			}
		}
	}		
	

	@Override
	public void cantidadPeliculasAlquilas(List<Pelicula> peliculas) {
		if(peliculas.isEmpty()) {
			System.out.println("No hay peliculas cargadas por el momento.");
			
		} else {
			
			int contador = 0;
			for (Pelicula peli : peliculas) {
				if(peli.isDisponible() == false) {
					contador += 1;
				}
			}
			System.out.println("Hay un total de: " + contador + " peliculas alquiladas.");
		}
	}			
	

	@Override
	public void peliculaMasAntigua(List<Pelicula> peliculas) {
		int anioPeliMasAntigua = 3000;
		Pelicula peliMasAntigua = null; 
		
		if(peliculas.isEmpty()) {
			System.out.println("No hay peliculas cargadas por el momento.");
			
		} else {
			
			for (Pelicula peli : peliculas) {
				if(peli.getAnioEstreno() < anioPeliMasAntigua) {
					anioPeliMasAntigua = peli.getAnioEstreno();
					peliMasAntigua = peli;
				}				
			}
		}
			System.out.println("La pelicula más antigua es: " + peliMasAntigua.getTitulo() + " del año: " + anioPeliMasAntigua);
	}
				
}

