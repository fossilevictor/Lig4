# 🎮 Jogo Lig 4 em Java

## 📌 Sobre o projeto

Este projeto consiste em uma implementação do jogo **Lig 4**, desenvolvida em Java, executada pelo terminal. O objetivo é conectar quatro peças da mesma cor em sequência antes do adversário.Esse projeto foi desenvolvido como trablho final da matéria de Introdução à Programação 

O jogo possui um tabuleiro de 6 linhas por 7 colunas e permite jogar contra outra pessoa ou contra o computador.

## 🕹️ Funcionalidades

- Escolha da cor das peças: vermelho (V) ou azul (A).
- Modo para dois jogadores.
- Modo para jogar contra a máquina, que realiza jogadas aleatórias.
- Exibição do tabuleiro no terminal.
- Verificação de vitória nas direções horizontal, vertical e diagonal.
- Verificação de empate quando o tabuleiro está completamente preenchido.
- Opção de iniciar uma nova partida após o término do jogo.

## 🛠️ Tecnologias utilizadas

- **Java** — linguagem de programação.
- **Scanner** — leitura das entradas do usuário pelo terminal.
- **Random** — geração de jogadas aleatórias para a máquina.

## ▶️ Como executar o projeto

### Pré-requisitos

- Ter o Java JDK instalado.
- Ter um terminal ou ambiente de desenvolvimento Java, como o NetBeans ou o VS Code.

### Passos para execução

1. Clone este repositório:

   ```bash
   git clone URL_DO_SEU_REPOSITORIO
   ```

2. Entre na pasta do projeto:

   ```bash
   cd NOME_DA_PASTA
   ```

3. Compile o arquivo Java:

   ```bash
   javac Jogo.java
   ```

4. Execute o jogo:

   ```bash
   java Jogo
   ```

## 📋 Como jogar

1. Escolha sua cor: `V` para vermelho ou `A` para azul.
2. Escolha o modo de jogo:
   - `1` — Dois jogadores.
   - `2` — Contra a máquina.
3. Informe a coluna em que deseja colocar sua peça.
4. Continue jogando até que um jogador conecte quatro peças ou ocorra um empate.
5. Ao final, escolha se deseja jogar novamente.

**Objetivo:** conectar quatro peças da mesma cor na horizontal, vertical ou diagonal.

## 📚 Conceitos de programação aplicados

Durante o desenvolvimento, foram utilizados conceitos como:

- Programação orientada a objetos(Básico).
- Matrizes bidimensionais para representar o tabuleiro.
- Estruturas de repetição (`for` e `while`).
- Estruturas condicionais (`if`, `else` e `switch`).
- Métodos para organizar as funcionalidades do jogo.
- Entrada de dados com `Scanner`.
- Geração de números aleatórios com `Random`.
- Verificação de condições de vitória e empate.

## 👨‍💻 Autor

Desenvolvido como projeto de estudo em Java.
