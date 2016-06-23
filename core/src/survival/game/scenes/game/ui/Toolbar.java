package survival.game.scenes.game.ui;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import survival.game.scenes.game.GameScene;
import survival.game.scenes.game.Graphic;

public class Toolbar implements Graphic {

    private GameScene gameScene;
    private UIHandler uiHandler;
    private int selected = 0;
    private Inventory inventory;

    public Toolbar(GameScene gameScene, UIHandler uiHandler, Inventory inventory) {
        this.gameScene = gameScene;
        this.uiHandler = uiHandler;
        this.inventory = inventory;
    }

    @Override
    public void render(SpriteBatch spriteBatch) {
        for (int i = 0; i < 9; i++) {
            inventory.getItems()[i].render(spriteBatch);
        }
        for (int i = 0; i < 9; i++) {
            inventory.getItems()[i].renderHoverText(spriteBatch);
        }
    }

    @Override
    public void update(float dt) {
        for (int i = 0; i < 9; i++) {
            inventory.getItems()[i].update(dt);
        }
    }

    public void setSelected(int i) {
        this.selected = i;
    }
}
