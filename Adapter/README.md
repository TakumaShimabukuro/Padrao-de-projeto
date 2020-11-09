# Padrao-de-projeto

## Pattern Name and Classification
- Padrao adapter, Padrao estrutual

## Intent

## Motivation
- Define uma estrutura que permite isolar partes do Software, normalmente quando se tem um código legado a ser integrado a outro código de uma aplicação em particular. Outro exemplo é quando se precisa integrar uma biblioteca mas se deseja criar um meio padronizado de acesso.

## Applicability
- Aplicável para casos em que se precisa integrar duas partes, ou módulos, em um software.
  - Um das partes possui muitas vezes uma estrutura de comunicação obsoleta que precisa ser adaptada para nova solução
  - Geralmente não se tem o código do módulo que precisa ser integrado.



## Structure
![alt text](https://github.com/TakumaShimabukuro/Padrao-de-projeto/blob/master/images/Adapter.png)

## Participants

1. Target:
   - É a única classe deste padrão.
   - O construtor é privado, não sendo acessível externamente.

2. Client:
   - É quem usa o Singleton.
   - Está interessado na instância, não importa se é uma só no programa todo.

3. Adaptee
 - Define uma interface ou contrato existente que precisa ser adaptado.
 
4. Adapter
 - É quem adapta a interface do Adeptee ao Target usado pela aplicação.
 
## Sample Code
[Sample code](https://github.com/TakumaShimabukuro/Padrao-de-projeto/tree/master/Adapter/SampleCode)
