# Padrao-de-projeto

## Pattern Name and Classification
- Template Method, Padrao comportamental

## Intent
- O Padrão Template Method define o esqueleto de um algoritmo dentro de um método, transferindo alguns de seus passos para as subclasses. O Template Method permite que as subclasses redefinam certos passos de um algoritmo sem alterar a estrutura do próprio algoritmo

## Motivation
- Temos diversas implementações de um algoritmo ou classe que seguem um “esqueleto” comum, mas que variam em alguns pequenos aspectos

## Applicability
- Aplicável para casos em que se tem uma hierarquia de classes se tem um algoritmo que deve ser dividido em etapas: Um método na superclasse, chamado template method, invoca os demais métodos que podem ser abstratos.

## Structure
![alt text](https://github.com/TakumaShimabukuro/Padrao-de-projeto/blob/master/images/StructureTemplateMethod.png)

## Participants

1. FrameworkClass:
   - Define o templateMethod que é responsável por chamar os demais métodos.
   - Especifica os métodos abstratos das etapas de execução.
   
2. ApplicationClassOne/ApplicationClassTwo:
   - Redefine, quando necessário, algumas etapas do algoritmo especificado em FrameworkClass


## Sample Code
[Sample code](https://github.com/TakumaShimabukuro/Padrao-de-projeto/tree/master/Template-Method/SampleCode)
