public class ListaSimples {
    private Node head;

    public ListaSimples() {
        this.head = null;
    }

    public void insertFirst(Object item) {
        Node novo = new Node(item, head);
        head = novo;
    }

    public void imprimir() {
        Node atual = head;
        while (atual != null) {
            System.out.print(atual.item + " -> ");
            atual = atual.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListaSimples lista = new ListaSimples();
        lista.insertFirst("C");
        lista.insertFirst("B");
        lista.insertFirst("A");
        lista.imprimir();
    }
}
