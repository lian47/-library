import java.util.*;

public class Livro {
    private String titulo;
    private String autor;


    //Construtor
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.titulo = titulo;
    }

    //getter
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    //@Override é uma anotação (annotation) usada para indicar que um métod está sendo sobrescrito (overridden) de uma superclasse ou de uma interface que a classe está implementando
    //!= verifica se dois valores sao diferetes
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != getClass())return false;
        Livro livro = (Livro) obj;
        return Objects.equals(titulo, livro.titulo) && Objects.equals(autor, livro.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, autor);
    }

    @Override
    public String toString() {
        return titulo + " por " + autor;
    }
}
