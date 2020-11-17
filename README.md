# Atividade desafio do curso Programador de Sistemas do IFRN pelo programa Novos Caminhos. Disciplina de Programação Orientada a Objetos

## Informações

1. Empresa de materiais radioativos que fabrica seus produtos;
2. Para que os produtos não ofereçam riscos aos clientes, a empresa tem o cuidado de reduzir o indice de radioatividade que, de acordo com as normas da empresa, não pode ser superior à 0,2.
3. Indices superiores à 0,2 são reduzidos pela metade a cada 50 segundos após o tratamento do material

## Tarefa 
Dado o índice de radiotividade do material, **calcule o tempo necessário** de tratamento do material **para que o mesmo possa ser utilizado** na fabricação dos produtos da empresa, **de forma que não seja nocivo** ao ser humano.

## Entrada 
A entrada consiste de um valor positivo de ponto flutuante com precisão dupla (double) que representa o **índice de radioatividade**
*R* de um material qualquer.

##  Saída
Seu programa deve imprimir uma única linha contendo o tempo (em
horas, minutos e segundos), que é necessário para que material não
emita mais radiotividade nociva.

## Exemplos
Entrada | Saída
------- | -------
R = 100 | 0h 7min 30seg
R = 0,3 | 0h 0min 50seg
R = 0,2 | 0h 0min 6seg