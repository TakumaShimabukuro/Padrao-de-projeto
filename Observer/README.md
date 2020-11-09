# Padrao-de-projeto

## Pattern Name and Classification
- Padrao observer, Padrao Comportamental

## Intent

## Motivation
- Observa as mudanças de estado de um classe e faz a comunicacao entre si.
- Sua aplicacao é bem comum em software de Mensagem (SNS)

## Applicability
- Receber notificações sobre mudanças de estado em outros objetos quando esta mudança for relevante.


## Structure
![alt text](https://github.com/TakumaShimabukuro/Padrao-de-projeto/blob/master/images/Observer.png)

## Participants

1. Subject:
   -  é a classe que possui a informação o estado que se deseja observar.


2. Observer:
   -  Interface que define os métodos de notificação de interesse dos observadores


3. ConcreteObserverA, ConcreteObserverB:
 - Classes concretas que observam a classe Subject.

## Sample Code
[Sample code](https://github.com/TakumaShimabukuro/Padrao-de-projeto/tree/master/Observer/SampleCode)
