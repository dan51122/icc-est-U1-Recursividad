public class App {
    public static void main(String[] args) throws Exception {

        EjerciciosRecursivos eR = new EjerciciosRecursivos();
        // 1
        int resultadoFinal = eR.fibonacci(5);
        System.out.println("Resultado: " + resultadoFinal);
        // 2
        System.out.println(eR.getPotencia(5, 3));
        // 3
        System.out.println(eR.Sumatoria2(125));

    }

}
