import java.util.Scanner;
import java.util.Random;
public class Jogo {
    private Scanner tecl = new Scanner(System.in);
    private char tabuleiro[][] = new char[6][7];
    private Random random = new Random();
    private int aleatorio = random.nextInt(7);
    private boolean condicao = true;
    private char jogada;
    private char maquina = 'M';
    Jogo() {
        for (int linha = 0; linha < 6; linha++) {
            for (int coluna = 0; coluna < 7; coluna++) {
                tabuleiro[linha][coluna] = 'B';
            }
        }
        String resposta = "";
        System.out.println("Escolha sua cor:V(vermelho) ou A(azul)");
        resposta = tecl.nextLine();
        if (resposta.equalsIgnoreCase("V")) {
            jogada = 'V';
        } else
            jogada = 'A';
        if (jogada == 'A') {
            maquina = 'V';
        } else if (jogada == 'V') {
            maquina = 'A';
        }
        char intermedio;
        char intermedio2;
        intermedio2 = jogada;
        intermedio = maquina;
        maquina = jogada;
        jogada = intermedio;
        while (jogada == 'V' || jogada == 'A') {
            System.out.println("1:Dois jogadores");
            System.out.println("2:Contra máquina");
            resposta = tecl.nextLine();
            switch (resposta) {
                case "1":
                    jogada = intermedio2;
                    while (condicao == true) {
                        for (int linha = 0; linha < 6; linha++) {
                            for (int coluna = 0; coluna < 7; coluna++) {
                                System.out.print("| " + tabuleiro[linha][coluna] + " |");
                            }
                            System.out.println("  ");
                        }
                        int coluna;
                        System.out.println("Informe a coluna que ce quer jogar");
                        coluna = tecl.nextInt();
                        tecl.nextLine();
                        jogar(coluna);
                        empate();
                        vitoria();
                    }
                    System.out.println("jogar novemente?(S ou N)");
                    resposta = tecl.nextLine();
                    if (resposta.equalsIgnoreCase("S")) {
                        condicao = true;
                        for (int linha = 0; linha < 6; linha++) {
                            for (int coluna = 0; coluna < 7; coluna++) {
                                tabuleiro[linha][coluna] = 'B';
                            }
                        }
                    } else
                        return;
                    break;
                case "2":
                    jogada = intermedio2;
                    while (condicao == true) {
                        for (int linha = 0; linha < 6; linha++) {
                            for (int coluna = 0; coluna < 7; coluna++) {
                                System.out.print("| " + tabuleiro[linha][coluna] + " |");
                            }
                            System.out.println("  ");
                        }
                        int coluna;
                        System.out.println("Informe a coluna que ce quer jogar");
                        coluna = tecl.nextInt();
                        tecl.nextLine();
                        jogar(coluna);
                        empate();
                        vitoria();
                        if (jogada != maquina) {
                            aleatorio = random.nextInt(7);
                            coluna = aleatorio;
                            jogar(coluna);
                            empate();
                            vitoria();
                        }
                    }
                    System.out.println("jogar novemente?(S ou N)");
                    resposta = tecl.nextLine();
                    if (resposta.equalsIgnoreCase("S")) {
                        condicao = true;
                        for (int linha = 0; linha < 6; linha++) {
                            for (int coluna = 0; coluna < 7; coluna++) {
                                tabuleiro[linha][coluna] = 'B';
                            }
                        }
                    } else
                        return;
                    break;
                default:
                    break;
            }

        }
    }

    public void jogar(int coluna) {
        if (tabuleiro[0][coluna] == 'V' || tabuleiro[0][coluna] == 'A') {
            System.out.println("Coluna cheia,informe outra");
            return;
        }
        for (int linha = 5; linha >= 0; linha--) {
            if (tabuleiro[linha][coluna] == 'B') {
                tabuleiro[linha][coluna] = jogada;
                if (jogada == 'V') {
                    jogada = 'A';
                } else if (jogada == 'A') {
                    jogada = 'V';
                }
                return;
            }
        }
    }

    public boolean vitoria() {
        // horizontal
        for (int linha = 0; linha < 6; linha++) {
            for (int coluna = 0; coluna < 4; coluna++) {
                if (tabuleiro[linha][coluna] == jogada &&
                        tabuleiro[linha][coluna + 1] == jogada &&
                        tabuleiro[linha][coluna + 2] == jogada &&
                        tabuleiro[linha][coluna + 3] == jogada) {
                    System.out.println("O jogador " + jogada + " é o vencedor");
                    return condicao = false;
                }
            }
        }
        // vertical
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 7; coluna++) {
                if (tabuleiro[linha][coluna] == jogada &&
                        tabuleiro[linha + 1][coluna] == jogada &&
                        tabuleiro[linha + 2][coluna] == jogada &&
                        tabuleiro[linha + 3][coluna] == jogada) {
                    System.out.println("O jogador " + jogada + " é o vencedor");
                    return condicao = false;
                }
            }
        }
        // diagonal ↘
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 4; coluna++) {
                if (tabuleiro[linha][coluna] == jogada &&
                        tabuleiro[linha + 1][coluna + 1] == jogada &&
                        tabuleiro[linha + 2][coluna + 2] == jogada &&
                        tabuleiro[linha + 3][coluna + 3] == jogada) {
                    System.out.println("O jogador " + jogada + " é o vencedor");
                    return condicao = false;
                }
            }
        }
        // diagonal ↗
        for (int linha = 3; linha < 6; linha++) {
            for (int coluna = 0; coluna < 4; coluna++) {
                if (tabuleiro[linha][coluna] == jogada &&
                        tabuleiro[linha - 1][coluna + 1] == jogada &&
                        tabuleiro[linha - 2][coluna + 2] == jogada &&
                        tabuleiro[linha - 3][coluna + 3] == jogada) {
                    System.out.println("O jogador " + jogada + " é o vencedor");
                    return condicao = false;
                }
            }
        }
        return condicao = true;
    }

    public boolean empate() {
        for (int linha = 0; linha < 6; linha++) {
            for (int coluna = 0; coluna < 7; coluna++) {
                if (tabuleiro[linha][coluna] == 'B') {
                    return condicao = true;
                }
            }
        }
        System.out.println("EMPATE");
        return condicao = false;
    }

    public static void main(String[] args) {
        new Jogo();
    }
}