import java.util.*;

public class GrafoLivros {
   private Map<Livro, Set<Livro>> grafo;

   public GrafoLivros(){
       this.grafo = new HashMap<>();
   }

   public void adicionarLivro(Livro livro) {
       grafo.putIfAbsent(livro, new HashSet<>());
   }

    public void adicionarRelacao(Livro livro1, Livro livro2) {
        grafo.get(livro1).add(livro2);
        grafo.get(livro2).add(livro1);
    }

    public Set<Livro> obterRecomendacoes(Livro livro) {
       return grafo.getOrDefault(livro, Collections.emptySet());
    }

    public void mostrarGrafo() {
        for (Map.Entry<Livro, Set<Livro>> entry : grafo.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
