package survival.game.scenes.game.terrain.objects;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import survival.game.scenes.game.GameID;
import survival.game.scenes.game.GameScene;
import survival.game.scenes.game.item.Material;
import survival.game.scenes.game.item.entities.EntityStone;
import survival.game.utills.Textures;

public class Stone extends DestroyableGameObject {

    private Texture texture;
    private GameScene gameScene;

    public Stone(int x, int y, GameScene gameScene) {
        super(x, y, 32, 32, gameScene, GameID.STONE, 30, 22);

        this.gameScene = gameScene;

        texture = Textures.OBJECT_STONE.getTexture();

        for (int i = 0; i < 5; i++) {
            drops.add(new EntityStone(gameScene, Material.STONE));
        }
    }

    @Override
    public void update(float dt) {
        super.update(dt);

        if (this.mouseOver()) {
            if (Gdx.input.isButtonPressed(Input.Buttons.LEFT)) {
                this.setHitTime(this.getHitTime() + dt);
            }
        }

    }

    @Override
    public Texture getTexture() {
        return texture;
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}
