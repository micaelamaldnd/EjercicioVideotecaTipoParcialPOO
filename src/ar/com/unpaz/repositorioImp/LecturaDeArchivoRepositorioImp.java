package ar.com.unpaz.repositorioImp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import ar.com.unpaz.model.Pelicula;
import ar.com.unpaz.repositorio.LecturaDeArchivoRepositorio;

public class LecturaDeArchivoRepositorioImp implements LecturaDeArchivoRepositorio{

	@Override
	public List<Pelicula> listaDeLaLectura() {
		List<Pelicula> peliculas = new ArrayList<>();
		File sFile = new File("peliculas.txt");
		FileReader sFileReader;		
		
		try {
			sFileReader = new FileReader(sFile);
			BufferedReader sBuffer = new BufferedReader(sFileReader);
			String linea = "";
			while ((linea = sBuffer.readLine()) != null) {
				String [] array = linea.split(",");
				Pelicula peli = new Pelicula();
				peli.setCodigo(array [0]);
				peli.setTitulo(array [1]);
				peli.setGenero(array [2]);
				peli.setAnioEstreno(Integer.parseInt(array [3]));
				peli.setDisponible(Boolean.parseBoolean(array [4]));
				peliculas.add(peli);
				
			}
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return peliculas;
	}

}
