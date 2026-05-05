# Primeiro Exercício - Algoritmos e Estruturas de Dados

Este projeto é uma implementação em Java de várias estruturas de dados, incluindo listas ligadas simples, duplas e circulares, além de um array dinâmico. O projeto demonstra o problema de Josephus usando essas estruturas.

## Estruturas Implementadas

- **SinglyLinkedList**: Lista ligada simples
- **DoublyLinkedList**: Lista ligada dupla
- **CircularlyLinkedList**: Lista ligada circular
- **Arraydinamico**: Array dinâmico
- **No1** e **No2**: Classes de nós para as listas

## Problema de Josephus

O programa principal (`App.java`) implementa o problema de Josephus usando uma lista circular. O problema envolve N pessoas em um círculo, eliminando a cada Mª pessoa até restar apenas uma.

### Análise de Complexidade

- **Tempo**: O(N * M) para ambos os métodos (lista circular e array)
- **Espaço**:
  - Lista circular: Mais memória por elemento (valor + ponteiro), mas dinâmica
  - Array: Menos memória por elemento, mas estática (pode desperdiçar espaço se subutilizado)
### Exemplo de Execução
- M = 3, N = 10
- O programa simula a eliminação e imprime o vencedor.

## Busca Binária

O projeto inclui implementações de busca binária para array e lista duplamente ligada.

### Implementações
- **buscaBinariaArray**: Busca binária em array ordenado
- **buscaBinariaLista**: Busca binária em lista duplamente ligada
### Complexidade
- **Array**: O(log n) - Acesso direto aos elementos via índice
- **Lista**: O(n) - Necessita percorrer os nós para alcançar o meio em cada iteração (n/2 + n/4 + ... passos)

A busca binária em lista não oferece vantagem, pois o custo de acesso aos elementos intermediários torna a operação ineficiente comparada ao array.



## Vantagens das Estruturas

- **Listas Ligadas**: Fácil remoção e adição de elementos
- **Arrays**: Manipulação rápida de dados específicos via índice
