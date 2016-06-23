package survival.game.scenes.game.terrain.objects;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import survival.game.scenes.game.GameID;
import survival.game.scenes.game.GameScene;
import survival.game.utills.Textures;

public class Tree extends DestroyableGameObject {

    private Texture texture;
    private GameScene gameScene;

    public Tree(int x, int y, GameScene gameScene) {
        super(x, y, 64, 64, gameScene, GameID.TREE, 20, 30, 20, 0);
        texture = Textures.OBJECT_TREE.getTexture();

        this.gameScene = gameScene;
    }

    @Override
    public Texture getTexture() {
        return texture;
    }

    @Override
    public void update(float dt) {
        super.update(dt);

        if (mouseOver()) {
            if (Gdx.input.isButtonPressed(Input.Buttons.LEFT)) {
                System.out.println("You clicked a tree");
            }
        }
    }
}
