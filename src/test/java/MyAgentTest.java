import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MyAgentTest {

<<<<<<< HEAD
    Connect4Game game; 


    @Before
    public void setUp() throws Exception {
        game = new Connect4Game(7, 6);
=======
  Connect4Game game;


  @Before
  public void setUp() throws Exception {
    game = new Connect4Game(7, 6);
  }

  @Test
  public void testICanWinVerticallySimple() {
    MyAgent redAgent = new MyAgent(game, true);
    MyAgent yellowAgent = new MyAgent(game, false);
    game.clearBoard();
    for (int i = 0; i < 3; i++) {
      redAgent.moveOnColumn(1);
      yellowAgent.moveOnColumn(2);
>>>>>>> lmainvielle
    }

    @Test
    public void testICanWinVerticallySimple() {
        MyAgent redAgent = new MyAgent(game, true);
        MyAgent yellowAgent = new MyAgent(game, false);
        game.clearBoard();
        for (int i = 0; i < 3; i++) {
            redAgent.moveOnColumn(1);
            yellowAgent.moveOnColumn(2);
        }

        assertEquals(redAgent.iCanWin(), 1);


<<<<<<< HEAD
    }    




    @Test
    public void testICanWinVerticallyTop4() {
        MyAgent redAgent = new MyAgent(game, true);
        MyAgent yellowAgent = new MyAgent(game, false);
        game.clearBoard();
        for (int i = 0; i < 2; i++) {
            redAgent.moveOnColumn(1);
            yellowAgent.moveOnColumn(2);
        }

        for (int i = 0; i < 3; i++) {
            redAgent.moveOnColumn(2);
            yellowAgent.moveOnColumn(1);   
        }

        assertEquals(redAgent.iCanWin(), 2);

=======
    for (int i = 0; i < 3; i++) {
      redAgent.moveOnColumn(2);
      yellowAgent.moveOnColumn(1);
>>>>>>> lmainvielle
    }

    // TODO: Write 2 test cases for testICanWinHorizontally
    @Test
    public void testICanWinHorizontally() {
        MyAgent redAgent = new MyAgent(game, true);
        MyAgent yellowAgent = new MyAgent(game, false);
        game.clearBoard();
        {
            
            redAgent.moveOnColumn(0);
            yellowAgent.moveOnColumn(0);
            redAgent.moveOnColumn(1);
            yellowAgent.moveOnColumn(1);
            redAgent.moveOnColumn(2);
            yellowAgent.moveOnColumn(2);
        }


        assertEquals(redAgent.iCanWin(), 3);

        
    }
    
    public void testICanWinHorizontallyTop4() {
        MyAgent redAgent = new MyAgent(game, true);
        MyAgent yellowAgent = new MyAgent(game, false);
        game.clearBoard();
        {
            
            redAgent.moveOnColumn(0);
            yellowAgent.moveOnColumn(2);
            redAgent.moveOnColumn(2);
            yellowAgent.moveOnColumn(1);
            redAgent.moveOnColumn(1);
            yellowAgent.moveOnColumn(2);
            redAgent.moveOnColumn(2);
            
            redAgent.moveOnColumn(1);
            yellowAgent.moveOnColumn(1);
            redAgent.moveOnColumn(1);
            redAgent.moveOnColumn(2);
            yellowAgent.moveOnColumn(2);
            redAgent.moveOnColumn(2);
            yellowAgent.moveOnColumn(2);
            redAgent.moveOnColumn(2);
            yellowAgent.moveOnColumn(2);
        }

<<<<<<< HEAD

        assertEquals(redAgent.iCanWin(), 3);

        
=======
  // TODO: Write 2 test cases for testICanWinHorizontally

  public void testICanWinHorizontally() {
    MyAgent redAgent = new MyAgent(game, true);
    MyAgent yellowAgent = new MyAgent(game, false);
    game.clearBoard();

      redAgent.moveOnColumn(1);
      yellowAgent.moveOnColumn(1);

      redAgent.moveOnColumn(2);
      yellowAgent.moveOnColumn(2);

      redAgent.moveOnColumn(3);
      yellowAgent.moveOnColumn(3);


    assertEquals(redAgent.iCanWin(), 4);

  }
public void testICanWinHorizontallyTop4() {
  MyAgent redAgent = new MyAgent(game, true);
  MyAgent yellowAgent = new MyAgent(game, false);
  game.clearBoard();

  redAgent.moveOnColumn(0);
  yellowAgent.moveOnColumn(1);

  redAgent.moveOnColumn(1);
  yellowAgent.moveOnColumn(0);

  redAgent.moveOnColumn(0);
  yellowAgent.moveOnColumn(1);

  redAgent.moveOnColumn(1);
  yellowAgent.moveOnColumn(0);

  redAgent.moveOnColumn(0);
  yellowAgent.moveOnColumn(1);

  redAgent.moveOnColumn(1);
  yellowAgent.moveOnColumn(2);
  redAgent.moveOnColumn(0);


  yellowAgent.moveOnColumn(2);
  redAgent.moveOnColumn(3);
  yellowAgent.moveOnColumn(3);

  redAgent.moveOnColumn(2);
  yellowAgent.moveOnColumn(3);

  redAgent.moveOnColumn(2);
  yellowAgent.moveOnColumn(3);

  redAgent.moveOnColumn(3);
  yellowAgent.moveOnColumn(2);


  redAgent.moveOnColumn(2);
  yellowAgent.moveOnColumn(5);

assertEquals(redAgent.iCanWin(), 3);

}
  // TODO: Write 2 test cases for testICanWinDiagonally

public void TestICanWinDiagonallyRight() {
  MyAgent redAgent = new MyAgent(game, true);
  MyAgent yellowAgent = new MyAgent(game, false);
  game.clearBoard();

  redAgent.moveOnColumn(0);
  yellowAgent.moveOnColumn(1);
  
  redAgent.moveOnColumn(1);
  yellowAgent.moveOnColumn(2);
  
  redAgent.moveOnColumn(2);
  yellowAgent.moveOnColumn(3);
  
  redAgent.moveOnColumn(2);
  yellowAgent.moveOnColumn(3);
  
  redAgent.moveOnColumn(4);
  yellowAgent.moveOnColumn(3);
  
  assertEquals(redAgent.iCanWin(), 3);
}

public void TestICanWinDiagonallyLeft() {
  MyAgent redAgent = new MyAgent(game, true);
  MyAgent yellowAgent = new MyAgent(game, false);
  game.clearBoard();
  
  redAgent.moveOnColumn(3);
  yellowAgent.moveOnColumn(2);
  
  redAgent.moveOnColumn(2);
  yellowAgent.moveOnColumn(1);
  
  redAgent.moveOnColumn(0);
  yellowAgent.moveOnColumn(1);
  
  redAgent.moveOnColumn(1);
  yellowAgent.moveOnColumn(0);
  
  redAgent.moveOnColumn(4);
  yellowAgent.moveOnColumn(0);
  
  assertEquals(redAgent.iCanWin(), 3);
}
  @Test
  public void testTheyCanWin() {
    MyAgent redAgent = new MyAgent(game, true);
    MyAgent yellowAgent = new MyAgent(game, false);
    game.clearBoard();
    for (int i = 0; i < 3; i++) {
      redAgent.moveOnColumn(1);
      yellowAgent.moveOnColumn(2);
>>>>>>> lmainvielle
    }
    // TODO: Write 2 test cases for testICanWinDiagonally
    @Test
    public void testICanWinDiagonally() {
        MyAgent redAgent = new MyAgent(game, true);
        MyAgent yellowAgent = new MyAgent(game, false);
        game.clearBoard();
        {
            redAgent.moveOnColumn(0);
            yellowAgent.moveOnColumn(1);
            redAgent.moveOnColumn(1);
            yellowAgent.moveOnColumn(2);
            redAgent.moveOnColumn(3);
            yellowAgent.moveOnColumn(2);
            redAgent.moveOnColumn(2);
        }


<<<<<<< HEAD
        assertEquals(redAgent.iCanWin(), 2);

            }



    @Test
    public void testTheyCanWin() {
        MyAgent redAgent = new MyAgent(game, true);
        MyAgent yellowAgent = new MyAgent(game, false);
        game.clearBoard();
        for (int i = 0; i < 3; i++) {
            redAgent.moveOnColumn(1);
            yellowAgent.moveOnColumn(2);
=======
    assertEquals(redAgent.theyCanWin(), 2);
  }

  // TODO: Write testTheyCanWinHorizontally

  public void testTheyCanWinHorizontally() {
    MyAgent redAgent = new MyAgent(game, false);
    MyAgent yellowAgent = new MyAgent(game, true);
    game.clearBoard();

      redAgent.moveOnColumn(1);
      yellowAgent.moveOnColumn(1);

      redAgent.moveOnColumn(2);
      yellowAgent.moveOnColumn(2);

      redAgent.moveOnColumn(3);
      yellowAgent.moveOnColumn(3);


    assertEquals(redAgent.theyCanWin(), 4);

  }

  
  // TODO: Write testTheyCanWinDiagonally

  public void TestTheyCanWinDiagonallyRight() {
    MyAgent redAgent = new MyAgent(game, false);
    MyAgent yellowAgent = new MyAgent(game, true);
    game.clearBoard();

    redAgent.moveOnColumn(0);
    yellowAgent.moveOnColumn(1);
    
    redAgent.moveOnColumn(1);
    yellowAgent.moveOnColumn(2);
    
    redAgent.moveOnColumn(2);
    yellowAgent.moveOnColumn(3);
    
    redAgent.moveOnColumn(2);
    yellowAgent.moveOnColumn(3);
    
    redAgent.moveOnColumn(4);
    yellowAgent.moveOnColumn(3);
    
    assertEquals(redAgent.theyCanWin(), 3);
  }
  
  // Tests you can win against a Beginner agent as Red
  @Test
  public void testRedWinningBeginnerAgent() {
    Agent redAgent = new MyAgent(game, true);
    Agent yellowAgent = new BeginnerAgent(game, false);
    int numberOfWins = 0;
    for (int i = 0; i < 50; i++) {
      game.clearBoard();
      while(!game.boardFull() || game.gameWon() == 'N') {
        redAgent.move();
        if (game.gameWon() != 'R') {
          yellowAgent.move();
>>>>>>> lmainvielle
        }

        assertEquals(redAgent.theyCanWin(), 3);
    }
<<<<<<< HEAD

    // TODO: Write testTheyCanWinHorizontally



    // TODO: Write testTheyCanWinDiagonally

    // Tests you can win against a Beginner agent as Red
    @Test
    public void testRedWinningBeginnerAgent() {
        Agent redAgent = new MyAgent(game, true);
        Agent yellowAgent = new BeginnerAgent(game, false);
        int numberOfWins = 0;
        for (int i = 0; i < 50; i++) {
            game.clearBoard(); 
            while(!game.boardFull() || game.gameWon() == 'N') {
                redAgent.move();
                if (game.gameWon() != 'R') {
                    yellowAgent.move();
                }
            }

            if (game.gameWon() == 'R') {
                numberOfWins++;
            }
=======
    System.out.println("You won: " + numberOfWins + " games as Red against Beginner");
    // Test that you win over 90% of your games
    assertTrue(numberOfWins >= 45);
  }

  // Tests you can win against a Beginner agent as Yellow
  @Test
  public void testYellowWinningBeginnerAgent() {
    Agent redAgent = new BeginnerAgent(game, true);
    Agent yellowAgent = new MyAgent(game, false);
    int numberOfWins = 0;
    for (int i = 0; i < 50; i++) {
      game.clearBoard();
      while(!game.boardFull() || game.gameWon() == 'N') {
        redAgent.move();
        if (game.gameWon() != 'R') {
          yellowAgent.move();
>>>>>>> lmainvielle
        }
        System.out.println("You won: " + numberOfWins + " games as Red against Beginner");
        // Test that you win over 90% of your games
        assertTrue(numberOfWins >= 45);
    }
    public void center() {
        MyAgent redAgent = new MyAgent(game, true);
        MyAgent yellowAgent = new MyAgent(game, false);
        game.clearBoard();

        redAgent.moveOnColumn(1);
        redAgent.moveOnColumn(1);
        redAgent.moveOnColumn(1);

        yellowAgent.moveOnColumn(2);
    }
<<<<<<< HEAD

    //   Tests you can win against a Beginner agent as Yellow
    @Test
    public void testYellowWinningBeginnerAgent() {
        Agent redAgent = new BeginnerAgent(game, true);
        Agent yellowAgent = new MyAgent(game, false);
        int numberOfWins = 0;
        for (int i = 0; i < 50; i++) {
            game.clearBoard(); 
            while(!game.boardFull() || game.gameWon() == 'N') {
                redAgent.move();
                if (game.gameWon() != 'R') {
                    yellowAgent.move();
                }
            }

            if (game.gameWon() == 'Y') {
                numberOfWins++;
            }
=======
    System.out.println("You won: " + numberOfWins + " games as Yellow against Beginner");
    // Test that you win over 90% of your games
    assertTrue(numberOfWins >= 45);
  }

  // Tests you can win against a Random agent as Red
  @Test
  public void testRedWinningRandomAgent() {
    Agent redAgent = new MyAgent(game, true);
    Agent yellowAgent = new RandomAgent(game, false);
    int numberOfWins = 0;
    for (int i = 0; i < 50; i++) {
      game.clearBoard();
      while(!game.boardFull() || game.gameWon() == 'N') {
        redAgent.move();
        if (game.gameWon() != 'R') {
          yellowAgent.move();
>>>>>>> lmainvielle
        }
        System.out.println("You won: " + numberOfWins + " games as Yellow against Beginner");
        // Test that you win over 90% of your games
        assertTrue(numberOfWins >= 45);
    }

    // Tests you can win against a Random agent as Red
    @Test
    public void testRedWinningRandomAgent() {
        Agent redAgent = new MyAgent(game, true);
        Agent yellowAgent = new RandomAgent(game, false);
        int numberOfWins = 0;
        for (int i = 0; i < 50; i++) {
            game.clearBoard(); 
            while(!game.boardFull() || game.gameWon() == 'N') {
                redAgent.move();
                if (game.gameWon() != 'R') {
                    yellowAgent.move();
                }
            }

            if (game.gameWon() == 'R') {
                numberOfWins++;
            }
        }
        System.out.println("You won: " + numberOfWins + " games as Red against Random");
        // Test that you win over 90% of your games
        assertTrue(numberOfWins >= 45);
    }
<<<<<<< HEAD

    //Tests you can win against a Random agent as Red
    @Test
    public void testYellowWinningRandomAgent() {
        Agent redAgent = new RandomAgent(game, true);
        Agent yellowAgent = new MyAgent(game, false);
        int numberOfWins = 0;
        for (int i = 0; i < 50; i++) {
            game.clearBoard(); 
            while(!game.boardFull() || game.gameWon() == 'N') {
                redAgent.move();
                if (game.gameWon() != 'R') {
                    yellowAgent.move();
                }
            }

            if (game.gameWon() == 'Y') {
                numberOfWins++;
            }
=======
    System.out.println("You won: " + numberOfWins + " games as Red against Random");
    // Test that you win over 90% of your games
    assertTrue(numberOfWins >= 45);
  }

  //Tests you can win against a Random agent as Red
  @Test
  public void testYellowWinningRandomAgent() {
    Agent redAgent = new RandomAgent(game, true);
    Agent yellowAgent = new MyAgent(game, false);
    int numberOfWins = 0;
    for (int i = 0; i < 50; i++) {
      game.clearBoard();
      while(!game.boardFull() || game.gameWon() == 'N') {
        redAgent.move();
        if (game.gameWon() != 'R') {
          yellowAgent.move();
>>>>>>> lmainvielle
        }

        System.out.println("You won: " + numberOfWins + " games as Yellow against Random");
        // Test that you win over 90% of your games
        assertTrue(numberOfWins >= 45);
    }

    // BONUS TODO: Write testCases to play against IntermediateAgent

    // SUPER BONUS TODO: Write testCases to playAgainst AdvancedAgent

    // SUPER BONUS TODO: Write testCases to playAgainst BrilliantAgent

}
