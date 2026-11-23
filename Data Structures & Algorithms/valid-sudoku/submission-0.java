class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] cols = new HashSet[9];
        Set<Character>[][] squares = new HashSet[3][3];

        for (int i = 0; i < 9; i++) {
            if (rows[i] == null) {
                rows[i] = new HashSet<>();
            }
            for (int j = 0; j < 9; j++) {
                char val = board[i][j];
                if (val == '.') continue;
                if (cols[j] == null) {
                    cols[j] = new HashSet<>();
                }
                int sqI = i / 3;
                int sqJ = j / 3;

                if (squares[sqI][sqJ] == null) {
                    squares[sqI][sqJ] = new HashSet<>();
                }

                if (!rows[i].add(val)) {
                    return false;
                }
                if (!cols[j].add(val)) {
                    return false;
                }
                if (!squares[sqI][sqJ].add(val)) {
                    return false;
                }
            }

        }
        return true;
        
    }
}
