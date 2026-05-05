public class SinglyLinkedList {

    private No1 head;
    private No1 trail;
    private int tam;

    // Construtor
    public SinglyLinkedList() {
        this.head = null;
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
        return this.head;
    }

    public No1 ultimo() {
        if (vazia()) {
            return null;
        }
        return this.trail;
    }

    public No1 busca(int valor) {
        No1 atual = this.head;
        
        while (atual != null) {
            if (atual.valor == valor) {
                return atual;
            }
            atual = atual.next;
        }
        
        return null;
    }

  
    public No1 buscarno(int idx) {
        if (idx < 0 || idx > (this.tam - 1)) {
            System.out.println("Índice fora dos limites da lista."); 
        }
        
        No1 x = this.head;
        
        for (int i = 1; i <= idx; i++) {
            x = x.next;
        }
        
        return x;
    }

   public void insereInicio(int v) {
        head = new No1(v, head);
        if (vazia()) {
            trail = head;
        }
        tam = tam + 1;
    }

    public void insereFim(int v) {
        No1 novoNo = new No1(v, null); 
        
        if (vazia()) {
            this.head = novoNo;
        } else {
            this.trail.next = novoNo;
        }
        
        this.trail = novoNo;
        this.tam = this.tam + 1;
    }

    public void insere(int v, int idx) {
        if (idx < 0 || idx > this.tam) {
            System.out.println("Índice fora dos limites da lista.");
        }
        
        if (idx == 0) {
            insereInicio(v);
        } else if (idx == this.tam) {
            insereFim(v);
        } else {
            No1 prev = buscarno(idx - 1);
            No1 novoNo = new No(v, prev.next);
            prev.next = novoNo;
            this.tam = this.tam + 1;
        }
    }

    public No1 removeInicio() {
        if (vazia()) {
            return null;
        }
        
        No1 first = this.head;
        this.head = this.head.next;
        this.tam = this.tam - 1;
        
        if (vazia()) {
            this.trail = null;
        }
        
        return first;
    }

    public No1 remove(int idx) {
        if (vazia()) {
            return null;
        }
        
        if (idx < 0 || idx > (this.tam - 1)) {
            System.out.println("Índice fora dos limites da lista.");
        }
        
        if (idx == 0) {
            return removeInicio();
        } else {
            No1 prev = no(idx - 1);
            No1 ret = prev.next;
            prev.next = prev.next.next;
            this.tam = this.tam - 1;
            
            return ret;
        }
    }
}







