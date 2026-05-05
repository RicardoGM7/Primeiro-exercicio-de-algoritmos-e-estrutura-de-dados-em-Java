// Ricardo Gomes Miranda 202500021204
public class App {
    public static void main(String[] args) throws Exception {
        circularJosephus(3,10);
    }

    public static void circularJosephus(int M,int N){
        CircularlyLinkedList rodadePessoas = new CircularlyLinkedList();

        for(int i = 0; i < N; ++i){
            rodadePessoas.insereFim(i);
        }
        
        No1 pessoaAtual = rodadePessoas.primeiro();
    
        while (pessoaAtual != pessoaAtual.next) {
        for (int i = 0; i < M - 2; i++) {
            pessoaAtual = pessoaAtual.next;
        }
        System.out.println("Eliminando: " + pessoaAtual.next.valor);
        pessoaAtual.next = pessoaAtual.next.next;
        pessoaAtual = pessoaAtual.next;
            }

        System.out.println("Vencedor = " + pessoaAtual.valor);
        }
        
     public static int arrayJosephus(int M, int N) {
       ArrayDinamico pessoas = new ArrayDinamico(N);
        
        for (int i = 0; i < N; i++) {
            pessoas.adicionar(i + 1, i);
        }

        int indiceAtual = 0;

        while (pessoas.numel() > 1) {
            
            // A fórmula (indiceAtual + M - 1) % tamanho_atual calcula a próxima posição de forma circular
           
            indiceAtual = (indiceAtual + M - 1) % pessoas.numel();
            
            pessoas.remover(indiceAtual);
        }

        return pessoas.get(0);
    }
    


          
    
/* custo de ambos metodos sao: O(N * M). 
 A lista circular gasta mais memoria por elemento, pois cada nó precisa armazenar o valor
 e o ponteiro do proximo item, no entantok, é dinamica, ocupando apenas os espaço dos itens presentes.
O uso do Array garante menos memoria por elemento, mas é estatica, se criar um array muito grande e 
usar pouco, haverá disperdicio de espaço.    
A vantagem do uso da lista é, basicamente, a facil remoçao e adiçao de elementos, 
ja a vantagem do array é a manipulaçao dos dados especificos,
pois podemos chegar neles rapidamente por meio da posiçao */

    
    public static int buscaBinariaArray(int x, int[] C){
       int esquerda = 0;
        int direita = C.length - 1;

        while (esquerda <= direita) {
            int meio = (esquerda + direita) / 2;

            if (C[meio] == x) {
                return meio; 
            } 
            
            if (C[meio] < x) {
                esquerda = meio + 1;
            } else {
                direita = meio - 1; 
            }
        }
        return -1; 
    }

    public static int buscaBinariaLista(int x, DoublyLinkedList C){
        int esquerda = 0;
        int direita = C.size() - 1;
        
        while (esquerda <= direita) {
            No2 numeroAtual = C.primeiro();
            int meio = (direita + esquerda) / 2;
            for(int i = 0; i < meio; i++){
                numeroAtual = numeroAtual.next;
            }
            if(numeroAtual.valor == x) {return meio;}
            else if( numeroAtual.valor < x) {esquerda = meio + 1;}
            else if( numeroAtual.valor > x) {direita = meio - 1;}
        }
            return -1;
    } 
    } 

    // 3.c = Custo buscaBinariaArray = O(log n) Custo buscaBinariaLista = O(n). 
    // Não Ha vantagem, pois percorre os nós varias vezes em todas tentativas de achar o meio,
    // primeiro meio: n/2 passos, segundo meio: n/4 e assim vai...

    


    

 
    




