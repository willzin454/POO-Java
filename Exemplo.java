public class Exemplo {
    private String nome;

    public Exemplo(String nome) {
        this.nome = nome; // Referência ao objeto atual
    }

    public Exemplo() {
        this.nome = "Sem nome"; // Referência a um construtor
    }

    public void imprimirNome() {
        System.out.println("Nome: " + this.nome); // Referência ao objeto atual
    }

    public static void main(String[] args) {
        Exemplo objeto1 = new Exemplo("Objeto 1"); // o simples fato de ter parametro o algoritimo vai identificar
                                                        // o que tem parametro.

        objeto1.imprimirNome(); // Imprime "Nome: Objeto 1" // identificou pelo quel não tem parametro.

        Exemplo objeto2 = new Exemplo();
        objeto2.imprimirNome(); // Imprime "Nome: Sem nome"
    }
}
