# Padrao-de-projeto

## Pattern Name and Classification
- Singleton, Padrao de Criacional

## Intent
- O Padrão Singleton define que uma, e somente uma instância concorrente de uma classe existirá no ciclo de vida da aplicação

## Motivation
- Temos diversas implementações de um algoritmo ou classe que seguem um “esqueleto” comum, mas que variam em alguns pequenos aspectos

## Applicability
- Aplicável para casos em que se precisa controlar a forma como a classe é instanciada.
 - O construtor da classe é protegido
 - Todo o programa usa o Singleton para acessar os comportamentos nele definidos.


## Structure
![alt text](https://github.com/TakumaShimabukuro/Padrao-de-projeto/blob/master/images/Singleton.png)

## Participants

1. Singleton:
   - É a única classe deste padrão.
   - O construtor é privado, não sendo acessível externamente.

2. Client:
   - É quem usa o Singleton.
   - Está interessado na instância, não importa se é uma só no programa todo.

## Sample Code
[Sample code](https://github.com/TakumaShimabukuro)
