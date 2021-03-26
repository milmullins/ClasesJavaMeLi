package Clase2Java;

public class Libro {

    private String titulo;
    private int isbn;
    private String autor;
    private String cliente;
    private boolean disponible;

    public Libro() {
    }

    public Libro(String titulo, int isbn, String autor) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void prestamo(String nomCliente){
        if(disponible){
            this.cliente = nomCliente;
            this.disponible = false;
        }
    }

    public void devolucion(){
        this.cliente = "";
        this.disponible = true;
    }

    @Override
    public String toString(){
        return this.titulo + "," + this.isbn + "," + this.autor;
    }
}
