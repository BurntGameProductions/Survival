package survival.game.scenes.game.terrain.generators;

import survival.game.scenes.game.terrain.objects.GameObject;
import survival.game.scenes.game.GameScene;

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
