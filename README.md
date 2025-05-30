# Projeto Lutador - Programação Orientada a Objetos (Java)

Este projeto contém a classe `Lutador`, que modela um lutador com atributos como nome, nacionalidade, idade, altura, peso, categoria e histórico de vitórias, derrotas e empates. A classe também possui métodos para apresentar o lutador, mostrar seu status e atualizar seu histórico de lutas.

---

## Descrição da Classe `Lutador`

A classe `Lutador` encapsula as seguintes informações:

- **Nome:** nome do lutador
- **Nacionalidade:** país de origem
- **Idade:** idade em anos
- **Altura:** altura em metros
- **Peso:** peso em kg
- **Categoria:** categoria de peso calculada automaticamente com base no peso
- **Vitórias:** número de vitórias
- **Derrotas:** número de derrotas
- **Empates:** número de empates

### Funcionalidades principais:

- Método `apresentar()`: retorna uma string com todas as informações do lutador.
- Método `status()`: retorna um resumo do desempenho do lutador.
- Métodos para registrar vitórias, derrotas e empates (`ganharLuta()`, `perderLuta()`, `empatarLuta()`).
- Atualização automática da categoria de peso ao alterar o peso.

---

## Como usar

1. Instancie um objeto da classe `Lutador`:

```java
Lutador lutador1 = new Lutador("Anderson Silva", "Brasil", 45, 1.88f, 84, 34, 11, 1);
Utilize os métodos para obter informações ou atualizar o lutador:

java
Copiar
Editar
System.out.println(lutador1.apresentar());
lutador1.ganharLuta();
System.out.println(lutador1.status());
