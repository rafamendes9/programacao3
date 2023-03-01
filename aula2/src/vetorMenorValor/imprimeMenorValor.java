package vetorMenorValor;
public class imprimeMenorValor {
public static void imprimeMenorValor(int[] vetor) {
    int menor = vetor[0];
    for (int i = 1; i < vetor.length; i++) {
        if (vetor[i] < menor) {
            menor = vetor[i];
        }
    }
    System.out.println("O menor valor do vetor é: " + menor);
}
public static void main(String[] args) {
    int[] vetor = {5, 2, 8, 1, 9};
    imprimeMenorValor(vetor);
}
/*    A função imprimeMenorValor recebe um vetor de inteiros como parâmetro;
    A variável menor é inicializada com o primeiro elemento do vetor;
    O laço for percorre todos os elementos do vetor a partir do segundo elemento, comparando-os com o valor atual de menor;
    Se o valor de um elemento for menor que o valor atual de menor, ele é armazenado na variável menor;
    Ao final do laço, o valor de menor é o menor valor do vetor, que é impresso na tela. */

}