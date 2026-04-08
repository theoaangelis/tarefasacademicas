public class MeuArrayDinamico {
    private int[] dados;
    private int tamanho;

    public MeuArrayDinamico(int capacidadeInicial) {
        this.dados = new int[capacidadeInicial];
        this.tamanho = 0;
    }

    private void resize() {
        int[] novo = new int[dados.length * 2];
        for (int i = 0; i < dados.length; i++)
            novo[i] = dados[i];
        dados = novo;
    }

    public void add(int valor) {
        if (tamanho == dados.length) resize();
        dados[tamanho] = valor;
        tamanho++;
    }

    /** Remove o elemento na posicao 'indice'. */
    public void remove(int indice) {
        if (indice < 0 || indice >= tamanho)
            throw new IndexOutOfBoundsException("Indice invalido: " + indice);
        for (int i = indice; i < tamanho - 1; i++)
            dados[i] = dados[i + 1];
        tamanho--;
    }

    public int get(int indice) {
        if (indice < 0 || indice >= tamanho)
            throw new IndexOutOfBoundsException("Indice invalido: " + indice);
        return dados[indice];
    }

    public int size() {
        return tamanho;
    }

    public void imprimir() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < tamanho; i++) {
            sb.append(dados[i]);
            if (i < tamanho - 1) sb.append(", ");
        }
        sb.append("]");
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        // === Exercício 1 ===
        MeuArrayDinamico arr = new MeuArrayDinamico(2);
        arr.add(10);
        arr.add(20);
        arr.imprimir();                               // [10, 20]
        arr.add(30);                                  // resize aqui!
        arr.add(40);
        arr.imprimir();                               // [10, 20, 30, 40]
        System.out.println("Tamanho: " + arr.size()); // 4

        // === Exercício 2 ===
        arr.remove(1);                                // remove o 20
        arr.imprimir();                               // [10, 30, 40]
        arr.remove(0);                                // remove o 10
        arr.imprimir();                               // [30, 40]
        System.out.println("Tamanho: " + arr.size()); // 2
    }
}
