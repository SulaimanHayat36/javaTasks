package org.example.thirdWeek;
import java.util.Scanner;

public class PlayfairCipherBySulaimanTeam6 {
    private char[][] matrix;
    private String keyword;
    public PlayfairCipherBySulaimanTeam6(String theKeyword) {
        this.keyword = theKeyword;
        initializeMatrix();
    }

    private void initializeMatrix() {
        boolean[] usedChars = new boolean[26];
        matrix = new char[5][5];
        int row = 0, col = 0;

        for (char c : keyword.toUpperCase().toCharArray()) {
            if (Character.isLetter(c) && !usedChars[c - 'A']) {
                matrix[row][col] = c;
                usedChars[c - 'A'] = true;
                col++;
                if (col == 5) {
                    col = 0;
                    row++;
                }
            }
        }

        for (char c = 'A'; c <= 'Z'; c++) {
            if (!usedChars[c - 'A'] && c != 'J') {
                matrix[row][col] = c;
                col++;
                if (col == 5) {
                    col = 0;
                    row++;
                }
            }
        }
    }

    private String preprocessText(String text) {
        // This code will replace the spaces to an empty string
        //so basically removes empty stirng
        text = text.replaceAll("\\s", "").toUpperCase();

        // This will replace all the Js with an "I"
        text = text.replace('J', 'I');

        // Add 'X' between repeated characters and ensure text length is even
        StringBuilder processedText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            processedText.append(text.charAt(i));
            if (i < text.length() - 1 && text.charAt(i) == text.charAt(i + 1)) {
                processedText.append('X');
            }
        }
        if (processedText.length() % 2 != 0) {
            processedText.append('X');
        }

        return processedText.toString();
    }

    private String encryptPair(char a, char b) {
        int rowA = -1, colA = -1, rowB = -1, colB = -1;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matrix[i][j] == a) {
                    rowA = i;
                    colA = j;
                }
                if (matrix[i][j] == b) {
                    rowB = i;
                    colB = j;
                }
            }
        }

        if (rowA == rowB) {
            return String.valueOf(matrix[rowA][(colA + 1) % 5]) + matrix[rowB][(colB + 1) % 5];
        } else if (colA == colB) {
            return String.valueOf(matrix[(rowA + 1) % 5][colA]) + matrix[(rowB + 1) % 5][colB];
        } else {
            return String.valueOf(matrix[rowA][colB]) + matrix[rowB][colA];
        }
    }

    public String encrypt(String text) {
        StringBuilder ciphertext = new StringBuilder();
        String processedText = preprocessText(text);

        for (int i = 0; i < processedText.length(); i += 2) {
            char a = processedText.charAt(i);
            char b = processedText.charAt(i + 1);
            ciphertext.append(encryptPair(a, b));
        }

        return ciphertext.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the keyword: ");
        String keyword = scanner.nextLine();
        PlayfairCipherBySulaimanTeam6 cipher = new PlayfairCipherBySulaimanTeam6(keyword);

        System.out.print("Please enter the text to encrypt: ");
        String plaintext = scanner.nextLine();
        String ciphertext = cipher.encrypt(plaintext);

        System.out.println("Cipher text: " + ciphertext);
    }
}


