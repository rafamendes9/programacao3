package primosInteiros;

public class imprimePrimos {
    public static void imprimirNumerosPrimos(int limiteInferior, int limiteSuperior) {
        for (int i = limiteInferior; i <= limiteSuperior; i++) {
            if (ehPrimo(i)) {
                System.out.print(i + " ");
            }
        }
    }
    
    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        imprimirNumerosPrimos(1, 20);
    }
    /*A função imprimirNumerosPrimos utiliza um laço for para percorrer todos os números no intervalo definido pelos parâmetros limiteInferior e limiteSuperior. 
    Em cada iteração, a função ehPrimo é chamada para verificar se o número atual é primo. Se o número for primo, ele é impresso no console.
    A função ehPrimo recebe um número como parâmetro e utiliza um laço for para verificar se ele é divisível por algum número entre 2 e a raiz quadrada 
    do número em questão. Se for divisível por algum número nesse intervalo, então não é primo e a função retorna false. Caso contrário, 
    é primo e a função retorna true. */
}
