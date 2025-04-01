public class BookGraph {
    public static void main(String[] args) {
        GrafoLivros grafo = new GrafoLivros();

        Livro livro1 = new Livro("Dom Quixote", "Miguel de Cervantes");
        Livro livro2 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        Livro livro3 = new Livro("1984", "George Orwell");
        Livro livro4 = new Livro("Orgulho e Preconceito", "Jane Austen");
        Livro livro5 = new Livro("Moby Dick", "Herman Melville");
        Livro livro6 = new Livro("A Revolução dos Bichos", "George Orwell");
        Livro livro7 = new Livro("O Hobbit", "J.R.R. Tolkien");
        Livro livro8 = new Livro("O Grande Gatsby", "F. Scott Fitzgerald");
        Livro livro9 = new Livro("Guerra e Paz", "Leon Tolstói");
        Livro livro10 = new Livro("O Morro dos Ventos Uivantes", "Emily Brontë");

        grafo.adicionarLivro(livro1);
        grafo.adicionarLivro(livro2);
        grafo.adicionarLivro(livro3);
        grafo.adicionarLivro(livro4);
        grafo.adicionarLivro(livro5);
        grafo.adicionarLivro(livro6);
        grafo.adicionarLivro(livro7);
        grafo.adicionarLivro(livro8);
        grafo.adicionarLivro(livro9);
        grafo.adicionarLivro(livro10);

        grafo.adicionarRelacao(livro1, livro5);
        grafo.adicionarRelacao(livro2, livro7);
        grafo.adicionarRelacao(livro3, livro6);
        grafo.adicionarRelacao(livro4, livro10);
        grafo.adicionarRelacao(livro8, livro9);
        grafo.adicionarRelacao(livro2, livro3);
        grafo.adicionarRelacao(livro4, livro8);
        grafo.adicionarRelacao(livro6, livro9);
        grafo.adicionarRelacao(livro7, livro10);

        grafo.mostrarGrafo();
    }
}