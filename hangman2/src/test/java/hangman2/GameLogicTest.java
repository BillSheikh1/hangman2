package hangman2;

import static org.junit.Assert.*;

import org.junit.Test;

import GameLogic.GameLogic;

public class GameLogicTest {
	
	public GameLogic createSUT() {
		return new GameLogic();
	}

	@Test
	public void test_decreaseLives_livesDecreased() {
		GameLogic logic = createSUT();
		
		int actualLives = 9-1;
		logic.decreaseLives();
		int testLives = logic.getLives();
		
		assertEquals(actualLives, testLives);
		
	}
	
	@Test
	public void test_makeRandomWord_randomWordMade() {
		GameLogic logic = createSUT();
		logic.pickRandomWord();
		String word = logic.getTargetWord();
		
		assertNotNull(word);
	}
	
	@Test
	public void test_gameEnd_gameEnds() {
		GameLogic logic = createSUT();
		for(int i = 0; i<10; i++) {
			logic.decreaseLives();
		}
		
		boolean actualEnd = true;
		boolean testEnd = logic.getGameStatus();
		
		assertEquals(actualEnd, testEnd);
	}

}
