package ProblemsDay_314;

import java.util.List;

public class SnakeMatrix {

    public int finalPositionOfSnake(int n, List<String> commands) {

        int row = 0;
        int col = 0;

        for(String cmd : commands)
        {
            if(cmd.equals("UP"))
            {
                row--;
            }
            else if(cmd.equals("DOWN"))
            {
                row++;
            }
            else if(cmd.equals("LEFT"))
            {
                col--;
            }

            else
            {
                col++;
            }
        }
        return row * n + col;
    }
    public static void main(String[] args) {

    }
}
