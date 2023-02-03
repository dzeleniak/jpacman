package nl.tudelft.jpacman.level;

import nl.tudelft.jpacman.board.Board;
import nl.tudelft.jpacman.board.BoardFactory;
import nl.tudelft.jpacman.board.Direction;
import nl.tudelft.jpacman.npc.Ghost;
import nl.tudelft.jpacman.npc.ghost.GhostFactory;
import nl.tudelft.jpacman.points.DefaultPointCalculator;
import nl.tudelft.jpacman.points.PointCalculator;
import nl.tudelft.jpacman.points.PointCalculatorLoader;
import nl.tudelft.jpacman.sprite.PacManSprites;

import java.awt.*;

public class LevelTest {
    public PacManSprites pacManSprites = new PacManSprites();
    public GhostFactory ghostFactory = new GhostFactory(pacManSprites);
    public PointCalculator dpc = new PointCalculatorLoader().load();
    public LevelFactory levelFactory = new LevelFactory(pacManSprites, ghostFactory, dpc);
    public BoardFactory boardFactory = new BoardFactory(pacManSprites);

}
