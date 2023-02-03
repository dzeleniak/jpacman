package nl.tudelft.jpacman.npc.ghost;

import nl.tudelft.jpacman.board.Direction;
import nl.tudelft.jpacman.npc.Ghost;
import nl.tudelft.jpacman.sprite.PacManSprites;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GhostTest {
    public PacManSprites sprites = new PacManSprites();
    public GhostFactory factory = new GhostFactory(sprites);
    public Ghost blinky = factory.createBlinky();

    @Test
    public void testGetInterval() {
        assertThat(blinky.getInterval()).isGreaterThan(0);
    }

    @Test
    public void testHasNoSquare() {
        assertThat(blinky.hasSquare()).isEqualTo(false);
    }

    @Test
    public void testCreateClyde() {
        Ghost clyde = factory.createClyde();
        assertThat(clyde).isInstanceOf(Clyde.class);
    }

}
