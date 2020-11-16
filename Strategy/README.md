# Padrao-de-projeto

## Pattern Name and Classification
- Padrao Strategy, Padrao comportamental

## Intent
- Delega responsabilidades, aumentando coesão e aprimorando a comunicação entre objetos.

- Strategy permite que o algoritmo varie independentemente dos clientes que o utilizam.


## Motivation
- Permite definir novos algoritmos sem alterar as classes dos elementos sobre os quais opera. Facilitar a escolha dos algoritmos criados para uma determinada função.

## Applicability
- Quando se tem muitas classes que se relacionam e que diferem no modo de atuação.

- Quando há a necessidade de variar (intercambiar) o algoritmo de acordo com as condições da chamada.
## Structure
![alt text](https://github.com/TakumaShimabukuro/Padrao-de-projeto/blob/master/images/strategy.png)

## Participants

1. Context:
   - Define e mantém a referência para um classe Strategy específica.

   
2. Strategy:
   - Interface (ou classe abstrata) comum a todos os algoritmos suportados. 

3. ConcreteStrategy:
   - Um ou mais algoritmos fornecidos para a aplicação.
   
## Sample Code
[Sample code](https://github.com/TakumaShimabukuro/Padrao-de-projeto/tree/master/Strategy/SampleCode)
