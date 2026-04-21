package ar.com.unpaz.service;

import java.util.List;

import ar.com.unpaz.model.Pelicula;

public interface PeliculaService {
	void agregarPelicula(List<Pelicula> peliculas, Pelicula peliculaNueva);
	void buscarPeliculaCodigo(List<Pelicula> peliculas, String codigoPeliculaBuscada);
	void eliminarPelicula(List<Pelicula> peliculas, String codigo);
	void listarPeliculas(List<Pelicula> peliculas);
	void alquilarPelicula(List<Pelicula> peliculas, String titulo);
	void devolverPelicula(List<Pelicula> peliculas, String titulo);
	void listarPeliculasAlquiladas(List<Pelicula> peliculas);
	void cantidadPeliculasAlquilas(List<Pelicula> peliculas);
	void peliculaMasAntigua(List<Pelicula> peliculas);

}

