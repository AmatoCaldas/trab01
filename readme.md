# Projeto Trab01

# João Vitor Amato Caldas Tavares - 202376032

Este projeto é uma aplicação de gerenciamento de horários e alocação de recursos, como salas e professores, utilizando conceitos de orientação a objetos.

Tive como motivação para o projeto meu irmão, que como professor e coordenador em uma escola particular, tem todo ano grande dificuldade em montar grandes horárias. O programa funciona bem e foi bem útil e teve bons resultados, conseguimos resolver um problema que ele costumava gastar horas em minutos. Apesar disso ainda não descobri como deixar a entrada e a vizualização de dados eficiente, pretendo voltar a mecher nesse código e quem sabe até transformar em um produto futuramente.

## Estrutura do Projeto

- **Sala.java**: Representa uma sala com identificação e horários disponíveis.
- **Professor.java**: Representa um professor com informações de horários agendados e disponibilidades.
- **Pessoa.java**: Classe abstrata base para representar pessoas.
- **Horario.java**: Representa um horário com dia da semana, hora de início e sala associada.
- **GeradorDeGrade.java**: Classe responsável por gerar uma grade horária com base nas disponibilidades dos professores.
- **Departamento.java**: Representa um departamento com uma lista de professores.
- **ColecaoGenerica.java**: Classe genérica para armazenar e manipular itens de qualquer tipo.
- **Agendavel.java**: Interface que define um contrato para objetos que podem ser agendados.
- **DiaSemana.java**: Enumeração que representa os dias da semana.
- **Main.java**: Classe principal para testar as funcionalidades do projeto.

## Funcionalidades

1. **Gerenciamento de Salas**:

   - Adicionar horários disponíveis para uma sala.
   - Consultar horários disponíveis.

2. **Gerenciamento de Professores**:

   - Adicionar disponibilidades e horários agendados.
   - Exibir informações dos professores.

3. **Geração de Grade Horária**:

   - Alocar horários para professores com base em suas disponibilidades, evitando conflitos.

4. **Coleção Genérica**:

   - Manipular coleções de objetos genéricos, como salas.

5. **Interface Agendável**:
   - Implementar o contrato para agendamento de horários.

## Como Executar

1. Compile todos os arquivos `.java` no diretório `trab01`.
2. Execute a classe `Main` para testar as funcionalidades.

## Exemplo de Saída

O programa exibe informações sobre salas, professores, horários disponíveis, e a grade horária gerada. Além disso, demonstra o uso de coleções genéricas e a interface `Agendavel`.

## Dependências

- Nenhuma dependência externa é necessária. O projeto utiliza apenas bibliotecas padrão do Java.

## Autor

Desenvolvido como parte do trabalho prático da disciplina de Orientação a Objetos.
