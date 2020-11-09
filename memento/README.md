# Padrao-de-projeto

## Pattern Name and Classification
- Memento Pattern, Padrao Comportamental

## Intent

## Motivation
- Sem violar o encapsulamento, permite capturar e externalizar um estado interno de um objeto, de maneiras que o objeto possa ser restaurado para esse estado mais tarde.

## Applicability
 - Quando houver necessidade de registrar o estado interno de um objeto para implementação de mecanismos de checkpoints e para desfazer operações no caso de erros.

 - Porém, objetos normalmente encapsulam parte ou todos os seus estados, tornando-os inacessíveis a outros objetos e impossíveis de serem salvos externamente. Expor este estado violaria o encapsulamento, o que pode comprometer a confiabilidade e a extensibilidade da aplicação.

 - O objetivo do padrão é fornecer um mecanismo para permitir atender esta demanda sem violar o princípio de encapsulamento da Orientação a Objetos.


## Structure
![alt text](https://github.com/TakumaShimabukuro/Padrao-de-projeto/blob/master/images/Memento.png)

## Participants

1. Memento:
   - classe que representa um snapshot, contendo o estado de um objeto a ser restaurado em um Originador. Possui métodos para obter e definir o estado que um Memento encapsula dentro.

2. Originador:
   - classe na qual o estado atual é mantido. Define método que permite criar um Memento com o estado atual do Originador armazenado no Memento retornado. Originator também tem um método que define seu estado atual com o estado de um determinado objeto Memento. Portanto, pode criar um Snapshot  (Memento) ou restaurar o estado do Snapshot fornecido (Memento).


3. Caretaker:
 - Caretaker: classe auxiliar responsável por armazenar e restaurar o estado do Originador por meio do objeto Memento. Um objeto Caretaker mantém os Mementos, mas nunca modifica os Mementos. 

## Sample Code
[Sample code](https://github.com/TakumaShimabukuro/Padrao-de-projeto/tree/master/Memento/SampleCode)
