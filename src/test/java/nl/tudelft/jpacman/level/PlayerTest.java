package nl.tudelft.jpacman.level;

import nl.tudelft.jpacman.sprite.PacManSprites;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PlayerTest {
    public PacManSprites pacManSprites = new PacManSprites();
    public PlayerFactory playerFactory = new PlayerFactory(pacManSprites);

    @Test
    void testIsAlive() {
        Player pacMan = playerFactory.createPacMan();
        assertThat(pacMan.isAlive()).isEqualTo(true);
    }

    @Test
    void testIsNotAlive() {
        Player pacMan = playerFactory.createPacMan();
        pacMan.setAlive(false);
        assertThat(pacMan.isAlive()).isNotEqualTo(true);
    }

}
