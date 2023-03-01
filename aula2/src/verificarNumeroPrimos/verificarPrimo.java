package verificarNumeroPrimos;

public class verificarPrimo {
   
    public static boolean verificaPrimo(int numero) {
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
        int numero = 17;
        boolean resultado = verificaPrimo(numero);
        System.out.println("O número " + numero + " é primo? " + resultado);
    }

/*    A função verificaPrimo recebe um número inteiro como parâmetro;
    Se o número for menor ou igual a 1, ele não é primo, então a função retorna falso;
    O laço for percorre todos os números de 2 até a raiz quadrada do número, verificando se o número é divisível por algum deles;
    Se o número for divisível por algum número no intervalo, ele não é primo, então a função retorna falso;
    Se o número não for divisível por nenhum número no intervalo, ele é primo, então a função retorna verdadeiro. */





}
