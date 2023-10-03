public class Libro {
    private String titulo;
    private String autor;
    private int numPag;
    /**
     * Constructor de la clase Libro
     * Explicación: Crea una instancia de la clase Libro con los atributos proporcionados.
     * @param titulo Una cadena de caracteres que representa el título del libro.
     * @param autor Una cadena de caracteres que representa el autor del libro.
     * @param numPag Un entero que representa el número de páginas del libro.
     * Complejidad temporal: O(1) - Tiempo constante.
     */

    public Libro(String titulo, String autor, int numPag) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPag = numPag;
    }
    /**
     * Explicación: Este método devuelve el título del libro.
     * Método para obtener el título del libro
     * @return titulo
     * Complejidad temporal: O(1) - Tiempo constante.
     */
    public String getTitulo(){
        return titulo;
    }
    /**
     * Explicación: Este método devuelve el título del libro.
     * Explicación: Este método devuelve el autor del libro.
     * @return autor
     *
     * Complejidad temporal: O(1) - Tiempo constante.
     */
    public String getAutor(){
        return autor;
    }
    /**
     *  Método para obtener el número de páginas del libro
     *  Explicación: Este método devuelve el número de páginas del libro.
     * @return numPag
     * Complejidad temporal: O(1) - Tiempo constante.
     */
    public int getNumPag(){
        return numPag;
    }
    /**
     * Método para mostrar la información del libro
     * Explicación: Este método imprime la información del libro, incluyendo el título, el autor y el número de páginas.
     * @info
     * Complejidad temporal: O(1) - Tiempo constante.
     */
    public void info(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Numero De Paginas: " + numPag);
    }

}
