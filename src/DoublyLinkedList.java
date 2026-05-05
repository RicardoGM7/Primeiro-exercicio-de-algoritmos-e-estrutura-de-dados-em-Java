public class DoublyLinkedList {

    private No2 header;
    private int tam;
    private No2 trailer;

    public DoublyLinkedList() {
        this.header = new No2(0, null, null);
        this.trailer = new No2(0, this.header, null);
        this.header.next = this.trailer;
        this.tam = 0; 
    }

    public int size() {
        return this.tam;
    }

    public boolean vazia() {
        return this.tam == 0;
    }

    public No2 primeiro() {
        if (vazia()) {
            return null;
        }
        return this.header.next;
    }

    public No2 ultimo() {
        if (vazia()) {
            return null;
        }
        return this.trailer.prev;
    }

    public void insereInicio(int v) {
        insereEntre(v, this.header, this.header.next);
    }

    public void insereFim(int v) {
        insereEntre(v, this.trailer.prev, this.trailer);
    }

    public No2 removeInicio() {
        if (vazia()) {
            return null;
        }
        return remove(this.header.next);
    }

    public No2 removeFim() {
        if (vazia()) {
            return null;
        }
        return remove(this.trailer.prev);
    }

  private void insereEntre(int valor, No2 predecessor, No2 sucessor) {
        No2 novoNo = new No2(valor, predecessor, sucessor);
        predecessor.next = novoNo;
        sucessor.prev = novoNo;
        tam = tam + 1;
    }

    private No2 remove(No2 no) {
        no.prev.next = no.next;
        no.next.prev = no.prev;
        tam = tam - 1;
        return no;
    }
}