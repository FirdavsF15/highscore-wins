package com.pluralsight;

import java.util.Scanner;

public class ScoreChecker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the game score: ");
        String userInput = scanner.nextLine();

        String[] inputParts = userInput.split("\\|");
        String[] teams = inputParts[0].split(":");
        String[] scores = inputParts[1].split(":");

        String winner;
        if(Integer.parseInt(scores[0])>Integer.parseInt(scores[1])){
            winner = teams[0];
        }else if(Integer.parseInt(scores[1])>Integer.parseInt(scores[0])){
            winner = teams[1];
        }else{
            winner = "Tie!";
        }

        System.out.println("Winner: " + winner);
    }
}
