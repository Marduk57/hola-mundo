
import java.util.Scanner;

/*1. Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas.
 */
public class MainLibro {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int isbn, numPag, numLibros;
        String titulo, autor;
        //decimos al usuario que ingrese la cantidad de libros a guardar 
        System.out.print("Digite la cantidad de libros a ingresar: ");
        numLibros = leer.nextInt();
        //creamos un vector con el numero ingresado por el usuario para guardar los libros 
        Libro libros[] = new Libro[numLibros];

        for (int i = 0; i < libros.length; i++) {

            System.out.println("\nDigite los datos del libro" + (i + 1) + ":");//--->para que el indice aparezca en 1 y no en cero
            System.out.print("Ingrese el ISBN del libro: ");
            isbn = leer.nextInt();
            System.out.print("Ingrese el titulo del libro: ");
            titulo = leer.next();
            
            System.out.print("Ingrese el autor del libro: ");
            autor = leer.next();
            System.out.print("Ingrese el numero de paginas del libro: ");
            numPag = leer.nextInt();
            //llamamos al constructor
            libros[i] = new Libro(isbn, titulo, autor, numPag);
        }

    }

}
