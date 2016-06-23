package survival.game.scenes.game.terrain.generators;

import survival.game.scenes.game.GameScene;
import survival.game.scenes.game.terrain.objects.GameObject;

/**
 * Created by viktorstrate on 05/08/2015.
 * Abstract class for {@link GameObject} generators
 */
public abstract class ObjectGenerator {

    protected GameScene gameScene;


    public ObjectGenerator(GameScene gameScene) {
        this.gameScene = gameScene;
    }

    /**
     * Generates a {@link GameObject}
     *
     * @return the generated {@link GameObject}
     */
    protected abstract GameObject generate();
}
