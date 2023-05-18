public class Libro { //la clase la identifico como libro
    
    
    //En esta parte pongo las variables que usare para la construccion del codigo
    
    String autor1;
    String titulo1;
    String autor2;
    String titulo2;    
    int paginas1; 
    int paginas2;
     
    //Aca pongo los metodos
    
    public String getAutor1() {
    return autor1;
    }

    public void setAutor1(String autor1) {
    this.autor1 = autor1;
    }

    public String getTitulo1() {
    return titulo1;
    }

    public void setTitulo1(String titulo1) {
    this.titulo1 = titulo1;
    }

    public String getAutor2() {
    return autor2;
    }

    public void setAutor2(String autor2) {
    this.autor2 = autor2;
    }

    public String getTitulo2() {
    return titulo2;
    }

    public void setTitulo2(String titulo2) {
    this.titulo2 = titulo2;
    }

    public int getPaginas1() {
    return paginas1;
    }

    public void setPaginas1(int paginas1) {
    this.paginas1 = paginas1;
    }

    public int getPaginas2() {
    return paginas2;
    }

    public void setPaginas2(int paginas2) {
    this.paginas2 = paginas2;
    }
    

    //esto de aca es para imprimir la informacion de los libros dependiendo de los datos que le de la persona
    public void informacionLibro() {
    System.out.println("El libro " + titulo1 + ", del autor " + autor1 + ", tiene " + paginas1 + " páginas");
       
    }
    
    // Este es el metodo para comparar la cantidad de páginas de los dos libros
    
    public static void compararLibros(Libro libro1, Libro libro2) {
        if (libro1.paginas1 > libro2.paginas2) {
           
            System.out.println(libro1.titulo1 + " tiene más páginas que " + libro2.titulo2);
        } else if (libro1.paginas1 < libro2.paginas2) {
           
            System.out.println(libro2.titulo1+ " tiene más páginas que " + libro1.titulo2);
        } else {
            System.out.println("Ambos libros tienen la misma cantidad de páginas");
        }
    }

}