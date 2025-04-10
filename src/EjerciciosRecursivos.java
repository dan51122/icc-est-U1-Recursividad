public class EjerciciosRecursivos {
    /*
     * Suma de números enteros consecutivos: Escribe una función recursiva que
     * calcule la
     * suma de todos los números enteros consecutivos desde 1 hasta un número dado
     * n. Por
     * ejemplo, si n es igual a 5, la función debe devolver 1 + 2 + 3 + 4+ 5 = 15.
     */
    public int fibonacci(int n) {
        if (n == 1 || n == 0) {
            return n;
        }
        return n + fibonacci(n - 1);

    }

    /*
     * Escribe una función recursiva que calcule la potencia
     * número base elevado a un exponente entero exponente.
     * de un
     * Por ejemplo, si base es 2 y exponente es 3,
     * la función debe devolver 2^3 = 8.
     */
    public int getPotencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        }
        return base * getPotencia(base, exponente - 1);
    }

    /*
     * Suma de digitos de un numero: Si el numero es menor que 10, lo cual significa
     * que
     * solo tiene un digito, se devuelve el número mismo. En caso contrario, se
     * extrae el
     * último dígito utilizando el operador módulo % y se calcula el los digitos
     * menos el
     * ultimo utilizando la división entera /10. Luego, se realiza una llamada
     * recursiva a
     * sumaDigitos con el resto y se suma el último digito.
     */

    public int Sumatoria(int n) {
        if (n <= 10) {
            return n;
        }
        return (n % 10) + Sumatoria(n / 10);
    }

    /*
     * Escribe un método recunsivo que imprima los números desde n hasta 1
     * de forma descendente, separados por espacios
     */
    public int Descendente(int n) {
        if (n == 1)
            return n;
        System.out.print(n + " ");
        return Descendente(n - 1);
    }

    /*
     * Crea una función recursiva llamada reverso que recibo un número
     * entero positvo n y dewuelva su numero invertido,
     * Por ajemplo, si se recibe 1234. la funcion debe devalver 4321
     */
    public int Reverso(int n) {
        if (n <= 0) {
            return n;
        }
        System.out.print(n % 10);
        return Reverso(n / 10);
    }

}