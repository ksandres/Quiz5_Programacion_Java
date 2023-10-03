public class Main {
    /**
     * Método main
     * Explicación: Este método es el punto de entrada de la aplicación y se utiliza para crear una instancia de la clase Biblioteca,
     * registrar libros y mostrar información sobre los libros.
     * @param args Argumentos de línea de comandos (no se utilizan en este caso).
     * Complejidad temporal: O(1) - Tiempo constante.
     */
    public static void main(String[] args) {
        Biblioteca bibliotecaKonradLorenz = new Biblioteca();

        // Registrar libros

        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 496);
        Libro libro2 = new Libro("El código Da Vinci", "Dan Brown", 656);
        Libro libro3 = new Libro("1984", "George Orwell", 326);
        Libro libro4 = new Libro("El Hobbit","J.R.R.Tolkien",310);
        Libro libro5 = new Libro("La Odisea","Homero",448);

        // Mostrar los libros disponibles
        libro1.info();
        libro2.info();
        libro3.info();
        libro4.info();
        libro5.info();

    }
}