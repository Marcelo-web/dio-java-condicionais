public class NovoResultadoEscolar {
    public static void main(String[] args) {
         
        int nota = 6;

        // Condicional encadeada (várias condições são avaliadas).
        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Em recuperação");
        } else {
            System.out.println("Reprovado");
        }

        // Representando em estrutura condicional ternária.
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Em recuperação" : "Reprovado";

        System.out.println(resultado);

    }
}
