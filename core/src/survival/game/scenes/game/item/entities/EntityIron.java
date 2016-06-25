package survival.game.scenes.game.item.entities;

import survival.game.scenes.game.GameID;
import survival.game.scenes.game.GameScene;
import survival.game.scenes.game.item.EntityItem;
import survival.game.scenes.game.item.Material;
import survival.game.utills.box2D.Box2DTag;
import survival.game.utills.box2D.CustomUserData;

/**
 * Created by daniel on 25/06/16.
 */
public class EntityIron extends EntityItem {

    public EntityIron (GameScene gameScene, Material material)
    {
        super(gameScene, GameID.ENTITY_IRON, material);
    }

    @Override
    protected void setupBody(int width, int height, int x, int y) {
        super.setupBody(width, height, x, y);
        body.setUserData(new CustomUserData(Box2DTag.ITEM, this));
    }
}
