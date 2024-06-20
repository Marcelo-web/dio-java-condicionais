public class SistemaMedida {
    public static void main(String[] args) {
        
        String sigla = "M";

        // Compara cada caso com o valor passado no switch.
        switch (sigla) {
            case "P":
                System.out.println("PEQUENO");
                break;
            case "M":
                System.out.println("MÉDIO");
                break;
            case "G":
                System.out.println("GRANDE");
                break;
            default:
                System.out.println("INDEFINIDO");
        }
    }
}
