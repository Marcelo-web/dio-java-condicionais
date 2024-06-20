public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 8;

        // Estrutura condicional composta ( apresenta fluxo quando a condição for verdadeira e fluxo quando a condição for falsa ).
        if (nota >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        // Representando em estrutura condicional ternária.
        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);
    }
}
