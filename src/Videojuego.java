/* AUTOR: Pedro */

import java.util.Date;

/**
 * Clase basada en un videojuego con los métodos básicos para almacenar
 * y gestionar un <strong>videoclub</strong>
 * 
 * @author Tecnoszubia S.L.
 * @version 0.1
 * @see basedatos
 */
public class Videojuego {

	public static String GENERO = "FPS";
	
	/**
	 * El título en formato texto del videojuego (max. 16 letras)
	 */
	public String titulo;
	
	/**
	 * El género de clasificación al que pertenece el videojuego. Ej. FPS, RPG, conducción...
	 */
	public String genero;
	
	/**
	 * Puntuación ponderada sobre páginas de prensa especializada con un peso del 50/50 entre usuarios y prensa
	 */
	public float puntuacionMedia;
	
	/**
	 * La fecha de lanzamiento oficial en nuestra región
	 */
	public Date fechaLanzamiento;

	/**
	 * Método que devuelve el valor del atributo título
	 * @return el titulo del videojuego
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the genero
	 */
	public String getGenero() {
		return genero;
	}

	/**
	 * @param genero the genero to set
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}

	/**
	 * @return the puntuacionMedia
	 */
	public float getPuntuacionMedia() {
		return puntuacionMedia;
	}

	/**
	 * @param puntuacionMedia the puntuacionMedia to set
	 */
	public void setPuntuacionMedia(float puntuacionMedia) {
		this.puntuacionMedia = puntuacionMedia;
	}

	/**
	 * @return the fechaLanzamiento
	 */
	public Date getFechaLanzamiento() {
		return fechaLanzamiento;
	}

	/**
	 * @param fechaLanzamiento the fechaLanzamiento to set
	 */
	public void setFechaLanzamiento(Date fechaLanzamiento) {
		this.fechaLanzamiento = fechaLanzamiento;
	}
	
	
	/**
	 * Incremento la puntuación global en una unidad
	 * @return el valor actualizado de la puntuación media
	 */
	public float incrPuntuacion() {
		puntuacionMedia++;
		return puntuacionMedia;
	}
	
	/**
	 * Comparamos dos juegos en base a su puntuación media y se devuelve
	 * el juego con más puntuación
	 * @param juegoAComparar un videojuego diferente al mío con el que compararlo
	 * @return El juego con mayor calificación
	 */
	public Videojuego comparar(Videojuego juegoAComparar) {
		if(juegoAComparar.puntuacionMedia>this.puntuacionMedia)
			return juegoAComparar;
		else
			return this;
	}
	
	/**
	 * Verifica si el videojuego es reciente basándose en la
	 *  fecha de lanzamiento.
	 * Se considera reciente un videojuego lanzado en 
	 * nuestra región en los últimos 6 meses.
	 * @return true si el videojuego es reciente, false si no lo es.
	 */
	public boolean esReciente() {
		Date fechaActual = new Date();
		long fechaActualConvertida = fechaActual.getTime();
		long fechaLanzamientoConvertida = fechaLanzamiento.getTime();
		long fechaRestada = fechaActualConvertida-fechaLanzamientoConvertida;
		long seisMesesMillis = 6*30*24*60*60*1000;
		if(fechaRestada>seisMesesMillis) {
			return false;
		} else {
			return true;
		}
	}
	
	public boolean esPrimo(int num) {
		if(num==2) 
			return true;
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
}
