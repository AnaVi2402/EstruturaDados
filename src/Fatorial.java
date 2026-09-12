public class Fatorial {
    //implementação ITERATIVA
    public static long fatorialInterativo(int n){
        long res = 1;
        for(int i = n; i > 1; i--){
            res *= i;
        }
        return res;
    }

    public static long fatorialRecursivo(int n){
        if(n <= 1) return 1;
        return n * fatorialRecursivo(n-1);
    }

    public static void main(String[] args) {

        System.out.println("Fatorial de 5 INTERATIVO: " + fatorialInterativo(3));
        System.out.println("Fatorial de 5 RECURSIVO: " + fatorialRecursivo(3));

    }
}
