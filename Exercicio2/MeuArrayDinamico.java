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

        // TODO 1: desloca cada elemento uma posição para a esquerda
        for (int i = indice; i < tamanho - 1; i++)
            dados[i] = dados[i + 1];

        // TODO 2: decrementa tamanho
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
        MeuArrayDinamico arr = new MeuArrayDinamico(2);
        arr.add(10);
        arr.add(20);
        arr.imprimir();                               
        arr.add(30);                                  
        arr.add(40);
        arr.imprimir();                               
        System.out.println("Tamanho: " + arr.size()); 

        
        arr.remove(1);                                
        arr.imprimir();                               
        arr.remove(0);                                
        arr.imprimir();                               
        System.out.println("Tamanho: " + arr.size()); 
    }
}
