public class App {
    private static String teste = "oi";
    public static void main(String[] args) throws Exception {
        App app = new App();
        app.imprimir();
    }
    public static void imprimir(){
        System.out.println(teste);
    }
}

//Se removermos
//a palavra-chave"static"do método"imprimir",
//o compilador
//irá retornar
//um erro
//de compilação.
//Isso ocorre
//porque o método"main"
//é estático e,portanto,
//só pode
//chamar outros
//métodos estáticos
//da classe.
//Se o método"imprimir"não for estático,
//ele não
//pode ser
//chamado diretamente do método"main"
.
