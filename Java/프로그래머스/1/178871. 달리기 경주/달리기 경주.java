import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> playerRank = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            playerRank.put(players[i], i + 1);
        }
        for (String calling : callings) {
            int idx = playerRank.get(calling) - 1;
            if (idx > 0) {
                playerRank.put(players[idx], idx);
                playerRank.put(players[idx - 1], idx + 1);
                String temp = players[idx];
                players[idx] = players[idx - 1];
                players[idx - 1] = temp;
            }
        }
        
        return players;
    }
}