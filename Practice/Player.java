public class Player{
    int playerGoals = 0;
    static int teamGoals = 0;
    void goal()
    {
        playerGoals++;
        teamGoals++;
    }

    public static void main(String[] args){
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        // calling function
        player1.goal();
        player2.goal();
        player3.goal();
        System.out.println("Player 1 Goals : "+player1.playerGoals);
        System.out.println("Player 2 Goals : "+player2.playerGoals);
        System.out.println("Player 3 Goals : "+player3.playerGoals);
        System.out.println("Total Score: "+ teamGoals);
        
    }
}