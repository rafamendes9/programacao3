package retornaFatorial;

public class interativaERecursiva {
    public static int fatorialIterativo(int numero) {
        int resultado = 1;
        for (int i = 2; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }
    /*A função fatorialIterativo recebe um número inteiro como parâmetro e utiliza um laço for para calcular o fatorial do número de forma iterativa. 
    A cada iteração, o valor de resultado é multiplicado pelo valor de i. Ao final do laço, o valor de resultado é retornado. */


public static int fatorialRecursivo(int numero) {
    if (numero == 0) {
        return 1;
    } else {
        return numero * fatorialRecursivo(numero - 1);
    }
}
/*A função fatorialRecursivo utiliza a recursão para calcular o fatorial do número. Se o número for igual a 0, a função retorna 1. 
Caso contrário, ela retorna o produto do número pelo fatorial do número - 1, chamando a si mesma recursivamente até chegar ao caso base. */

public static void main(String[] args) {
    int numero = 5;
    int fatorialIterativo = fatorialIterativo(numero);
    int fatorialRecursivo = fatorialRecursivo(numero);
    System.out.println("Fatorial de " + numero + " (iterativo): " + fatorialIterativo);
    System.out.println("Fatorial de " + numero + " (recursivo): " + fatorialRecursivo);
}/* a função main chama as funções fatorialIterativo e fatorialRecursivo com o argumento 5. 
Isso fará com que a função calcule o fatorial de 5 tanto de forma iterativa quanto recursiva. */
}