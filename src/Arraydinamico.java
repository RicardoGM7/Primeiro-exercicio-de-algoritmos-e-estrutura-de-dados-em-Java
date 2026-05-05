class ArrayDinamico {
    private int[] dados;
    private int tam;

    // Construtor
    public ArrayDinamico(int c) {
        this.dados = new int[c];
        this.tam = 0;
    }

    public void adicionar(int valor, int posicao) {
        // Valida a posição (inclui checagem para números negativos por segurança)
        if (posicao < 0 || posicao > tam) {
            System.out.println("Posição inválida para inserção.");
        }
        
        if (tam == dados.length) {
            expandir();
        }

        int valorAtual = valor;
        for (int i = posicao; i <= tam; i++) {
            int velho = dados[i];
            dados[i] = valorAtual;
            valorAtual = velho;
        }
        tam = tam + 1;
    }

    private void expandir() {
        // Multiplica o tamanho por 2 para expandir o array
        int novoTamanho = 2 * dados.length;
        int[] novo = new int[novoTamanho];
 
        // Copia os dados existentes para o novo array
        for (int i = 0; i < tam; i++) {
            novo[i] = dados[i];
        }
        
        dados = novo;
    }

    public void remover(int posicao) {
        if (posicao < 0 || posicao >= tam) {
            System.out.println("Posição inválida para remoção.");
        }

        for (int i = posicao; i <= tam - 2; i++) {
            dados[i] = dados[i + 1];
        }
        tam = tam - 1;
    }

    public int get(int posicao) {
        if (posicao < 0 || posicao >= tam) {
            System.out.println("Posição inválida.");
        }
        return dados[posicao];
    }

    public void set(int valor, int posicao) {
        if (posicao < 0 || posicao >= tam) {
            System.out.println("Posição inválida.");
        }
        dados[posicao] = valor;
    }

    // Número de elementos inseridos no Array
    public int numel() {
        return tam;
    }

    // Tamanho total alocado na memória para o Array
    public int size() {
        return dados.length;
    }
}