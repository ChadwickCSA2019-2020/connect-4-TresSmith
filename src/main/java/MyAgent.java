import java.util.ArrayList;
import java.util.Random;
/**
 * Describe your basic strategy here.
 * Go first
 * go center
 *
 *
 * @author <your Github username>
 *
 */
public class MyAgent extends Agent {
    /**
     * A random number generator to randomly decide where to place a token.
     */
    private Random random;
    private boolean onFirstMove = true;

    /**
     * Constructs a new agent, giving it the game and telling it whether it is Red or Yellow.
     *
     * @param game The game the agent will be playing.
     * @param iAmRed True if the agent is Red, False if the agent is Yellow.
     */
    public MyAgent(Connect4Game game, boolean iAmRed) {
        super(game, iAmRed);
        random = new Random();
    }

    /**
     * The move method is run every time it is this agent's turn in the game. You may assume that
     * when move() is called, the game has at least one open slot for a token, and the game has not
     * already been won.
     *
     * <p>By the end of the move method, the agent should have placed one token into the game at some
     * point.</p>
     *
     * <p>After the move() method is called, the game engine will check to make sure the move was
     * valid. A move might be invalid if:
     * - No token was place into the game.
     * - More than one token was placed into the game.
     * - A previous token was removed from the game.
     * - The color of a previous token was changed.
     * - There are empty spaces below where the token was placed.</p>
     *
     * <p>If an invalid move is made, the game engine will announce it and the game will be ended.</p>
     *
     */





    /**
     * Drops a token into a particular column so that it will fall to the bottom of the column.
     * If the column is already full, nothing will change.
     *
     * @param columnNumber The column into which to drop the token.
     */
    public void moveOnColumn(int columnNumber)
    {
        // Find the top empty slot in the column
        // If the column is full, lowestEmptySlot will be -1
        int lowestEmptySlotIndex = getLowestEmptyIndex(myGame.getColumn(columnNumber));
        // if the column is not full
        if (lowestEmptySlotIndex > -1)
        {
            // get the slot in this column at this index
            Connect4Slot lowestEmptySlot = myGame.getColumn(columnNumber).getSlot(lowestEmptySlotIndex);
            // If the current agent is the Red player...
            if (iAmRed)
            {
                lowestEmptySlot.addRed(); // Place a red token into the empty slot
            }
            else
            {
                lowestEmptySlot.addYellow(); // Place a yellow token into the empty slot
            }
        }
    }

    public void moveOnColumnEnemy(int columnNumber, Connect4Game copyGame)
    {
        // Find the top empty slot in the column
        // If the column is full, lowestEmptySlot will be -1
        int lowestEmptySlotIndex = getLowestEmptyIndex(copyGame.getColumn(columnNumber));
        // if the column is not full
        if (lowestEmptySlotIndex > -1)
        {
            // get the slot in this column at this index
            Connect4Slot lowestEmptySlot = copyGame.getColumn(columnNumber).getSlot(lowestEmptySlotIndex);
            // If the current agent is the Red player...
            if (iAmRed)
            {
                lowestEmptySlot.addYellow(); // Place a yellow token into the empty slot
            }
            else
            {
                lowestEmptySlot.addRed(); // Place a red token into the empty slot
            }
        }
    }

    /**
     * Returns the index of the top empty slot in a particular column.
     *
     * @param column The column to check.
     * @return
     *      the index of the top empty slot in a particular column;
     *      -1 if the column is already full.
     */
    public int getLowestEmptyIndex(Connect4Column column)
    {
        int lowestEmptySlot = -1;
        for  (int i = 0; i < column.getRowCount(); i++)
        {
            if (!column.getSlot(i).getIsFilled())
            {
                lowestEmptySlot = i;
            }
        }
        return lowestEmptySlot;
    }

    /**
     * Returns a random valid move. If your agent doesn't know what to do, making a random move
     * can allow the game to go on anyway.
     *
     * @return a random valid move.
     */
    public int randomMove()
    {
        int i = random.nextInt(myGame.getColumnCount());
        while (getLowestEmptyIndex(myGame.getColumn(i)) == -1)
        {
            i = random.nextInt(myGame.getColumnCount());
        }
        return i;
    }

    /**
     * Returns the column that would allow the agent to win.
     *
     * <p>You might want your agent to check to see if it has a winning move available to it so that
     * it can go ahead and make that move. Implement this method to return what column would
     * allow the agent to win.</p>
     *
     * @return the column that would allow the agent to win.
     */


    /**
     * H
     * @return
     */

    public int iCanWin()
    {
        for(int i=0; i<myGame.getColumnCount(); i++) {



            //copy of the game
            Connect4Game copyGame = new Connect4Game (myGame);
            //copy of MyAgent
            MyAgent copyPlayer = new MyAgent(copyGame, iAmRed);
            //play on column i
            copyPlayer.moveOnColumn(i);
            //check if we won (red)
            if(copyGame.gameWon()=='R' && iAmRed || (copyGame.gameWon()== 'Y' && !iAmRed)) {

                return i;
            }


        }
        //return -1 if we can't win at any column
        return -1;
    }

    /**
     * Returns the column that would allow the opponent to win.
     *
     * <p>You might want your agent to check to see if the opponent would have any winning moves
     * available so your agent can block them. Implement this method to return what column should
     * be blocked to prevent the opponent from winning.</p>
     *
     * @return the column that would allow the opponent to win.
     */


    public int theyCanWin()
    {


        for(int i=0; i<myGame.getColumnCount(); i++) {

            int columnNumber =i;


            //copy of the game
            Connect4Game copyGame = new Connect4Game (myGame);
            //copy of MyAgent
            MyAgent yellowPlayerCopyBot = new MyAgent(copyGame, !iAmRed);
            //play on column i
            yellowPlayerCopyBot.moveOnColumn(i);
            //check if we won (red)
            
            //checked diagonals
           if(iAmRed) {
               if(copyGame.gameWon()=='Y') {
                   return i;
               }
               
           }
           else {
               if(copyGame.gameWon()=='R') {
                   return i;
               }
           }
    }
        return -1;
    }

    public void move() {
        //check where to move
//        boolean isRedFirst = myGame.getRedPlayedFirst();
//            if(!iAmRed&&isRedFirst&&onFirstMove) {
//                //we are yellow and red first
//                moveOnColumn(3);
//                onFirstMove = false;
//            }
//        
//            else if(iAmRed&&!isRedFirst&&onFirstMove) {
//            //we are red and yellow first
//            moveOnColumn(3);
//            onFirstMove = false;
//        }
        
        
        if(iCanWin()>=0) {
            System.out.println("I can win at " + iCanWin());
            moveOnColumn(iCanWin());
        }
        else if (theyCanWin()>=0){
            System.out.println("They can win at " + theyCanWin());
            moveOnColumn(theyCanWin());
        }
        
        else {
            ArrayList<Integer> dontGo = avoidPlacing();
            for(int i=0; i<7; i++) {
                if((dontGo.get(i)!=-1)&&(myGame.boardFull() ==false)) {
                    moveOnColumn(i);
                    return;
           
                }
            }
            moveOnColumn(randomMove());
        }

        //   if(iCanWin()==) {
        //
        //
        //
        //   }



    }
    public ArrayList<Integer> avoidPlacing(){
        ArrayList<Integer> avoid = new ArrayList();
        Connect4Game copyGame2 = new Connect4Game (myGame);
        MyAgent enemyBot = new MyAgent(copyGame2, !iAmRed);
        MyAgent myBot = new MyAgent (copyGame2, iAmRed);
        for(int i=0; i<myGame.getColumnCount(); i++) {
            
            myBot.moveOnColumn(i);
            enemyBot.moveOnColumn(i);
            if(myBot.theyCanWin()>=0) {
                avoid.add(i);
            }
            if(myBot.theyCanWin()==-1) {
                avoid.add(-1);
            }
            
            
        }
    

        return avoid;
        
    }

    /**
     * H
     * @return
     */





    /**
     * Returns the name of this agent.
     *
     * @return the agent's name
     */
    public String getName()
    {
        return "My Agent";
    }

}
