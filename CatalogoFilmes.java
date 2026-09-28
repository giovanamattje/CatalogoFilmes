import java.util.Scanner;

public class CatalogoFilmes {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Arrays de dados dos filmes (Capacidade para 6 filmes)
        String[] filmes = {
            "Coraline",
            "O Despertar do Demônio",
            "O Castelo Animado",
            "A Viagem de Chihiro",
            "O Iluminado",
            "Interstellar"
        };

        String[] BlackCategorias = { // ou simplesmente categorias
            "Fantasia",
            "Terror",
            "Fantasia",
            "Animação/Fantasia",
            "Terror/Suspense",
            "Ficção Científica"
        };

        int[] anos = {
            2009,
            2013,
            2004,
            2001,
            1980,
            2014
        };

        // Array para guardar as notas dadas pelo usuário (tamanho igual ao número de filmes)
        double[] notasUsuario = new double[filmes.length];

        // Inicializa o array de notas com -1 para indicar que o filme ainda não foi avaliado
        for (int i = 0; i < filmes.length; i++) {
            notasUsuario[i] = -1;
        }

        boolean continuar = true;

        while (continuar) {
            System.out.println("\n----- Catálogo de Filmes -----");
            for (int i = 0; i < filmes.length; i++) {
                String notaStr = (notasUsuario[i] == -1) ? "Não avaliado" : String.format("%.1f/10", notasUsuario[i]);
                System.out.println((i + 1) + " - " + filmes[i] + " (" + anos[i] + ") - " + BlackCategorias[i] + " [Sua Nota: " + notaStr + "]");
            }

            System.out.println("0 - Sair do programa");
            System.out.print("Escolha uma opção: ");

            int escolha = leitor.nextInt();

            if (escolha == 0) {
                System.out.println("Obrigado por usar o catálogo! Encerrando o programa...");
                continuar = false;
            } else {
                int indice = escolha - 1;

                if (indice >= 0 && indice < filmes.length) {
                    System.out.println("\nFilme selecionado: " + filmes[indice] + " (" + anos[indice] + ")");
                    System.out.println("Categoria: " + BlackCategorias[indice]);
                    System.out.print("Dê uma nota de 0 a 10 para este filme: ");
                    double nota = leitor.nextDouble();

                    if (nota < 0 || nota > 10) {
                        System.out.println("Erro: Nota inválida! Deve ser entre 0 e 10.");
                    } else {
                        // Salva a nota no array
                        notasUsuario[indice] = nota;

                        // Classificação da nota baseado no valor
                        if (nota >= 9.0) {
                            System.out.println("Classificação: Obra-prima absoluta! 🌟");
                        } else if (nota >= 7.0) {
                            System.out.println("Classificação: Muito divertido, vale a pena assistir! 🎬");
                        } else if (nota >= 5.0) {
                            System.out.println("Classificação: Mediano, bom para passar o tempo. 🍿");
                        } else {
                            System.out.println("Classificação: Não funcionou para mim. 👎");
                        }
                    }
                } else {
                    System.out.println("Opção inválida! Escolha um número do catálogo ou 0 para sair.");
                }
            }
        }

        leitor.close();
    }
}
