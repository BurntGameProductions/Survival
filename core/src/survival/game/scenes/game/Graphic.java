package survival.game.scenes.game;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public interface Graphic {
    void render(SpriteBatch spriteBatch);

    void update(float dt);
}
