public class Livro {
    private String titulo;
    private String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void exibeDetalhes() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
    }
}
