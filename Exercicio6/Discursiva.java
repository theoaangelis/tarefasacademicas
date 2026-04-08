/*
 Exercício 6 – Reflexão Comparativa
  
 a) Custo da inserção no meio
 Porque depois de encontrar a posição desejada, temos que deslocar todos os elementos para uma posição à direita para
 abrir espaço. Sendo assim, no pior caso, inserir na posição 0 desloca N elementos custando O(n).
 Já na lista encadeada, como temos referência do nó anterior, a inserção será somente para ajustar os ponteiros
 — novo.next = x.next e x.next = novo — custando O(1). E não precisamos mover os outros nós.

 
 b) Custo de acesso por índice
 O array é muito mais rápido para acesso por índice: basta calcular o endereço de memória (base + índice) e acessar diretamente — O(1).
 Na lista encadeada não temos como fazer acesso direto, então para chegar ao k-ésimo elemento
 é preciso partir do head e seguir os ponteiros next até a posição k, custando O(n) no pior caso.
 
 
 c) Circularidade e o Problema de Josephus
 Sim. Cada vez que uma pessoa é eliminada, todos os elementos posteriores precisariam ser deslocados uma posição para a esquerda para
 fechar o "buraco" — O(n) por eliminação. Com N eliminações no total, o custo seria O(n²) no pior caso.
 
 Para simular a circularidade no array, o índice da contagem precisaria usar a função mod (%) em relação ao tamanho atual: 
 proximoIndice = (atual + M) % tamanho. Deixaria o código mais lento, mas no fim das contas funciona.
 */

public class Discursiva {
    // Arquivo criado para escrever a resposta do exercicio 6.
}
