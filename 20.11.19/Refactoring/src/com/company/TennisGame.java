package com.company;

public class TennisGame {
    public static String getScore(int firstScore, int secondScore) {
        String score = "";
        int tempScore;
        if (firstScore == secondScore) {
            score = checkScore(firstScore);
        } else if (firstScore >= 4 || secondScore >= 4) {
            int minusResult = firstScore - secondScore;
            score = checkWinner(minusResult);
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = firstScore;
                else {
                    score += "-";
                    tempScore = secondScore;
                }
                score += checkTempScore(tempScore);
            }
        }
        return score;
    }
    
    public static String checkScore(int score) {
        switch (score) {
            case 0:
                return "Love-All";
            case 1:
                return "Fifteen-All";
            case 2:
                return "Thirty-All";
            case 3:
                return "Forty-All";
            default:
                return "Deuce";
        }
    }

    public static String checkTempScore(int tempScore) {
        switch (tempScore) {
            case 0:
                return "Love";
            case 1:
                return "Fifteen";
            case 2:
                return "Thirty";
            case 3:
                return "Forty";
        }
        return "";
    }

    public static String checkWinner(int minScore) {
        if (minScore == 1) return "Advantage player1";
        else if (minScore == -1) return "Advantage player2";
        else if (minScore >= 2) return "Win for player1";
        else return "Win for player2";
    }


}
