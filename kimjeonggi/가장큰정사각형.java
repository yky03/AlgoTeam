class Solution
{
    int getMin(int... args) {
        int ret = 11111111;
        for(int i=0; i<args.length; i++){
            if(ret > args[i]) ret = args[i];
        }
        return ret;
    }
    
    public int solution(int [][]board)
    {
        int answer = 0;
      
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                if(i == 0 || j == 0) {
                    if(answer < board[i][j]) answer = board[i][j];    
                    continue;
                }
                if(board[i][j] == 0 || board[i-1][j-1] == 0 || board[i-1][j] == 0 || board[i][j-1] == 0) continue;
                board[i][j] = getMin(board[i-1][j-1], board[i-1][j], board[i][j-1]) + 1;
                if(answer < board[i][j]) answer = board[i][j];
            }
        }
        return answer * answer;
    }
}
