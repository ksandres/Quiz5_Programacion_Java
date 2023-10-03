//Se importa la biblioteca linkedlist para concatenar los datos en una lista
import java.util.LinkedList;

public class Biblioteca {
    //Atributos
    public LinkedList<Libro>librosDisponibles = new LinkedList<>();

    // Constructor
    public void registarLibro(Libro libro) {
        librosDisponibles.add(libro);
    }

    /**
     * Método para registrar un libro
     * Explicación: Este método busca un libro en la lista de libros disponibles por su título.
     * @param titulo Una cadena de caracteres que representa el título del libro que se desea buscar.
     * @return
     * Complejidad temporal: O(N) - Tiempo lineal.
     */
    public Libro buscarLibro(String titulo) {
        for (Libro libro : librosDisponibles) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        /**
         * No se encontro el libro ingresado
         */
        return null;
    }

    /**
     * Método para mostrar los libros disponibles
     */

    public  LinkedList<Libro> mostrarLibrosDisponibles() {
        return librosDisponibles;
    }


}






