public class No2 {
    public int valor;
    public No2 next;
    public No2 prev;

    public No2(int novoValor, No2 anterior, No2 proximo) {
        this.valor = novoValor;
        this.prev = anterior;
        this.next = proximo;
    }
}
