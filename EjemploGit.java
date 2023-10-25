public class EjemploGit {
    public static void main(String[] args) {
        System.out.println("Hola Git");
        int numero=0;
        try {
            numero = Integer.parseInt("99999");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(numero);
        System.out.println("Estoy en casa");

    }
}
