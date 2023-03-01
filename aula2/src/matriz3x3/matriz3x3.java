package matriz3x3;
public class matriz3x3 {
    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        
        System.out.println("Matriz original:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("Matriz transposta:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println();
        }
    }

    /*O código acima define uma matriz 3x3 e a imprime na tela, primeiro na sua forma original e depois transposta. 
    A transposição da matriz é feita trocando as linhas pelas colunas, ou seja, 
    o elemento na linha i e coluna j passa a ser o elemento na linha j e coluna i. */
}