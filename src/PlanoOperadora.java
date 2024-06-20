public class PlanoOperadora {
    public static void main(String[] args) {

        /**
         * Imagina que fomos requisitados a criar um sistema de plano telefônico onde:
         * 
         * O sistema terá 03 planos: BASIC, MIDIA , TURBO;
         * 
         * BASIC: 100 minutos de ligação;
         * MÍDIA: 100 minutos de ligação + WhatsApp e Instagram grátis;
         * TURBO: 100 minutos de ligação + WhatsApp e Instagram grátis + 5 GB Youtube.
         */

        String plano = "M";

        if (plano == "B") {
            System.out.println("100 minutos de ligação");
        } else if (plano == "M") {
            System.out.println("100 minutos de ligação");
            System.out.println("WhatsApp e Instagram grátis");
        } else if (plano == "T") {
            System.out.println("100 minutos de ligação");
            System.out.println("WhatsApp e Instagram grátis");
            System.out.println("5Gb Youtube");
        }

        System.out.println();

        // Acima ocorre muita repetição de código entre as condicionais if. Neste caso, pode ser usado a instrução switch, sem o break, de forma que os planos sejam representados por casos de forma decrescente.
        // Sem o break, caso o caso seja atendido, ele executa o bloco daquele caso e dos demais abaixo dele
        // O plano mais caro tem direito a mais recursos. O intermediário, um pouco menos e o último, sendo um plano mais básico, só tem direito a 100 min de ligação.

        switch (plano) {
            case "T":
                System.out.println("5Gb Youtube");
            case "M":
                System.out.println("Whatsapp e Instagram grátis");
            case "B":
                System.out.println("100 minutos de ligação");

        }
    }
}
