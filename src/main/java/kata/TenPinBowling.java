/*
Link: https://www.codewars.com/kata/ten-pin-bowling/java
 */

package kata;

import java.util.ArrayList;
import java.util.List;

public class TenPinBowling {
    public static int bowling_Score(String frames) {
        return new BowlingGame(frames).getScore();
    }
}

class BowlingGame {
    private int[] rolls;

    BowlingGame(String frames) {
        String[] strRolls = frames.replaceAll(" ", "").split("");
        rolls = new int[strRolls.length];
        for (int i = 0; i < strRolls.length; i++) {
            try {
                rolls[i] = Integer.parseInt(strRolls[i]);
            } catch (NumberFormatException e) {
                if (strRolls[i].equals("/")) {
                    rolls[i] = 10 - rolls[i - 1];
                } else {
                    rolls[i] = 10;
                }
            }
        }
    }

    int getScore() {
        int frame = 0;
        int score = 0;
        for (int i = 0; i < 10; i++) {
            if (rolls[frame] == 10) {
                score += 10 + rolls[frame + 1] + rolls[frame + 2];
                frame++;
            } else if (rolls[frame] + rolls[frame + 1] == 10) {
                score += 10 + rolls[frame + 2];
                frame += 2;
            } else {
                score += rolls[frame] + rolls[frame + 1];
                frame += 2;
            }
        }
        return score;
    }
}
