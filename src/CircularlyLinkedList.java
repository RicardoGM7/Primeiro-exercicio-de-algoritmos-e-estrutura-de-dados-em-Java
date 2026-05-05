public class CircularlyLinkedList {

    private No1 trail;
    private int tam;

    public CircularlyLinkedList() {
        this.trail = null;
        this.tam = 0;
    }

    public int size() {
        return this.tam;
    }

    public boolean vazia() {
        return this.tam == 0;
    }

    public No1 primeiro() {
        if (vazia()) {
            return null;
        }
        return this.trail.next;
    }

    public No1 ultimo() {
        if (vazia()) {
            return null;
        }
        return this.trail;
    }

    public void girar() {
        if (!vazia()) {
            this.trail = this.trail.next;
        }
    }

    public void insereInicio(int v) {
        if (vazia()) {
            this.trail = new No1(v, null);
            this.trail.next = this.trail;
        } else {
            No1 novoNo = new No1(v, this.trail.next); 
            this.trail.next = novoNo;
        }
        this.tam = this.tam + 1;
    }

    public void insereFim(int v) {
        insereInicio(v);
        girar();
    }

    public No1 removeInicio() {
        if (vazia()) {
            return null;
        }
        
        No1 head = this.trail.next; 
        
        if (head == this.trail) {
            this.trail = null;
        } else {
            this.trail.next = head.next;
        }
        
        this.tam = this.tam - 1;
        return head;
    }
}


