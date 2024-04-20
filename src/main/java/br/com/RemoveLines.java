package br.com;

import java.io.*;

public class RemoveLines {
    public static void main(String[] args) {
        String inputFile = "meuarquivo.txt";
        String outputFile = "meuarquivo_sem_excluir.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
            String line;

            // Lendo o arquivo linha por linha
            while ((line = reader.readLine()) != null) {
                // Verificando se a linha contém a palavra "excluir"
                if (!line.contains("excluir")) {
                    // Se não contiver, escreva a linha no arquivo de saída
                    writer.write(line);
                    writer.newLine();
                }
            }

            reader.close();
            writer.close();

            System.out.println("Linhas contendo 'excluir' removidas com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

