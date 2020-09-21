# Padrao-de-projeto

## Pattern Name and Classification
- Template Method, Padrao comportamental

## Intent
- O Padrão Template Method define o esqueleto de um algoritmo dentro de um método, transferindo alguns de seus passos para as subclasses. O Template Method permite que as subclasses redefinam certos passos de um algoritmo sem alterar a estrutura do próprio algoritmo

## Motivation
- O Composite se tornou uma solução bastante popular para a maioria dos problemas que exigem a construção de uma estrutura em árvore. O grande recurso do Composite é a capacidade de executar métodos recursivamente em toda a estrutura da árvore e resumir os resultados.

## Applicability
- Sua aplicação seria interessante para os que tem "filhos"(pois trabalha como arvore-folha) ou composição de varios elementos, por exemplo, em interfaces gráficas, um elemento gráfico pode ser formado pela composição de vários outros elementos. Uma página de internet pode conter um ou mais ícones, além de caixas de texto e vários outros elementos.

## Structure
![alt text](https://github.com/TakumaShimabukuro/Padrao-de-projeto/blob/master/images/StructureTemplateMethod.png)

## Participants

1. FrameworkClass:
   - Define o templateMethod que é responsável por chamar os demais métodos.
   - Especifica os métodos abstratos das etapas de execução.
   
2. ApplicationClassOne/ApplicationClassTwo:
   - Redefine, quando necessário, algumas etapas do algoritmo especificado em FrameworkClass


## Sample Code
[Sample code](https://github.com/TakumaShimabukuro)
