public class EjerciciosRecursivos {
    
    public int fibonacci(int n){
        if(n==1||n==0){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public int sumaConsecutivos(int n){
        /*if (n==1) return 1;
         * return n + suma Consecutivos(n-1);
         */
        if(n==1){
            return 1;
        }
        int resultadoParcial = sumaConsecutivos(n-1);
        int resultado = resultadoParcial +n ;
        return resultado;
    }
}
