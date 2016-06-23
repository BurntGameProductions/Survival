package survival.game.scenes.game.terrain.objects;

import com.badlogic.gdx.math.Vector2;
import survival.game.scenes.game.GameID;
import survival.game.scenes.game.GameScene;
import survival.game.scenes.game.item.EntityItem;
import survival.game.utills.Constants;

import java.util.ArrayList;

public abstract class DestroyableGameObject extends GameObject {

    protected float destroyTime = 0.2f; // time it takes to destroy in sec
    protected float hitTime = 0; // time it has been hit in sec
    protected ArrayList<EntityItem> drops;

    public DestroyableGameObject(int x, int y, int width, int height, GameScene gameScene, GameID id) {
        super(x, y, width, height, gameScene, id);
        setup();
    }

    public DestroyableGameObject(int x, int y, int width, int height, GameScene gameScene, GameID id,  int collisionWidth, int collisionHeight) {
        super(x, y, width, height, gameScene, id, collisionWidth, collisionHeight);
        setup();
    }

    public DestroyableGameObject(int x, int y, int width, int height, GameScene gameScene, GameID id, int collisionWidth, int collisionHeight, int collisionX, int collisionY) {
        super(x, y, width, height, gameScene, id, collisionWidth, collisionHeight, collisionX, collisionY);
        setup();
    }

    private void setup() {
        drops = new ArrayList<>();
    }

    @Override
    public void update(float dt) {
        super.update(dt);
        if (hitTime >= destroyTime) {
            destroy();
        }
    }

    public ArrayList<EntityItem> getDrops() {
        return drops;
    }

    public float getDestroyTime() {
        return destroyTime;
    }

    public void setDestroyTime(float destroyTime) {
        this.destroyTime = destroyTime;
    }

    public float getHitTime() {
        return hitTime;
    }

    public void setHitTime(float hitTime) {
        this.hitTime = hitTime;
    }

    public void destroy() {
        gameScene.removeGameObject(this);

        for (EntityItem e : drops) {
            e.setPosition(new Vector2(position.x * Constants.TILE_SIZE, position.y * Constants.TILE_SIZE));
            gameScene.addGameObject(e);
        }
    }
}
