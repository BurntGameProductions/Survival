package survival.game.scenes.game.item.entities;

import survival.game.scenes.game.GameID;
import survival.game.scenes.game.GameScene;
import survival.game.scenes.game.item.EntityItem;
import survival.game.scenes.game.item.Material;
import survival.game.utills.box2D.Box2DTag;
import survival.game.utills.box2D.CustomUserData;

/**
 * Created by viktorstrate on 06/08/2015.
 * A stone entity
 */
public class EntityStone extends EntityItem {

    public EntityStone(int x, int y, GameScene gameScene, boolean hasVelocity){
        super(x, y, gameScene, GameID.ENTITY_STONE, Material.STONE, hasVelocity);
    }

    public EntityStone(int x, int y, GameScene gameScene) {
        this(x, y, gameScene, true);
    }

    public EntityStone(GameScene gameScene, Material material) {
        super(gameScene, GameID.ENTITY_STONE, material);
    }

    @Override
    protected void setupBody(int width, int height, int x, int y) {
        super.setupBody(width, height, x, y);
        body.setUserData(new CustomUserData(Box2DTag.ITEM, this));
    }
}
