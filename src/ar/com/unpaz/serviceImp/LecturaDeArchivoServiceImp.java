package ar.com.unpaz.serviceImp;

import java.util.List;

import ar.com.unpaz.model.Pelicula;
import ar.com.unpaz.repositorio.LecturaDeArchivoRepositorio;
import ar.com.unpaz.repositorioImp.LecturaDeArchivoRepositorioImp;
import ar.com.unpaz.service.LecturaDeArchivoService;

public class LecturaDeArchivoServiceImp implements LecturaDeArchivoService{
	private LecturaDeArchivoRepositorio repo = new LecturaDeArchivoRepositorioImp();
	@Override
	public List<Pelicula> listaDeLaLectura() {
		return repo.listaDeLaLectura();
	}

}
