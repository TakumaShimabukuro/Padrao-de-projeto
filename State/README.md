# Padrao-de-projeto

## Pattern Name and Classification
- Padrao State, Padrao comportamental

## Intent
- Permite que um objeto altere o seu comportamento quando o seu estado interno muda.

## Motivation
- Permitir ao objeto possuir diferentes estados a partir das suas informações contidas na instância e retornar comportamentos diferentes com base nesse estado

## Applicability
- Quando se tem que gerenciar comportamentos diferentes dependendo de um número de estados diferentes

## Structure
![alt text](https://github.com/TakumaShimabukuro/Padrao-de-projeto/blob/master/images/state.png)

## Participants

1. Context:
   - Define a interface com o cliente e mantém a instância de estado concreto o qual define o estado atual do objeto.

2. State:
 - Interface que permite encapsular as responsabilidades associadas ao estado particular de contexto

3. ConcreteState:
 - Um ou mais estados concretos que implementam a interface estado.


## Sample Code
[Sample code](https://github.com/TakumaShimabukuro/Padrao-de-projeto/tree/master/State/SampleCode)
