# Padrao-de-projeto

## Pattern Name and Classification
- Composite, Padrao estrutual

## Intent
- O Composite é um padrão de projeto estrutural que permite compor objetos em uma estrutura semelhante a uma árvore e trabalhar com eles como se fosse um objeto singular.

## Motivation
- O Composite se tornou uma solução bastante popular para a maioria dos problemas que exigem a construção de uma estrutura em árvore. O grande recurso do Composite é a capacidade de executar métodos recursivamente em toda a estrutura da árvore e resumir os resultados.

## Applicability
- Sua aplicação seria interessante para os que tem "filhos"(pois trabalha como arvore-folha) ou composição de varios elementos, por exemplo, em interfaces gráficas, um elemento gráfico pode ser formado pela composição de vários outros elementos. Uma página de internet pode conter um ou mais ícones, além de caixas de texto e vários outros elementos.

## Structure
![alt text](https://github.com/TakumaShimabukuro/Padrao-de-projeto/blob/master/images/StructureComposite.png)

## Participants
1. Component
 - Declara interface para objetos da composição
 - Implementa comportamentos padrao comuns para todas as classes
 - Declara uma interface para acessar e gerenciar componentes filho
 
2. Leaf
 - Representa objetos folha da consição que nao tem filhos
 - Define os objetos para objetos primitivos da composição

3. Composite
 - Define o comportamento para componentes que possuem filhos
 - Armazena componentes filhos
 - Implementa operações relacionadas a filhos e definidas na interface Component
 
4. Client
 - Manipula os objetos da composiçãovia interface Component


## Sample Code

