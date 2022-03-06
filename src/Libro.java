
public class Libro {

    public int ISBN;
    public String titulo;
    public String autor;
    public int n_paginas;
// constructor 

    public Libro() {

    }

    public Libro(int ISBN, String titulo, String autor, int n_paginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.n_paginas = n_paginas;
    }

   public crearLibro(){
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
           
   }
    
    
    
    
    
    
    public String mostrarDatos() {
        return "ISBN: " + ISBN + "\nTitulo: " + titulo + "\nAutor: " + autor + "\nNumero de paginas: " + n_paginas + "\n";
    }
}
