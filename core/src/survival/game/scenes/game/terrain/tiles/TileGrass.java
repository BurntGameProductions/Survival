package survival.game.scenes.game.terrain.tiles;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import survival.game.utills.Textures;

public class TileGrass extends Tile {

    public TileGrass() {
        super(TileType.GRASS);
        Texture grassTexture = Textures.TILE_GRASS.getTexture();
        int textures = grassTexture.getWidth()/SIZE;
        int x = (int)Math.ceil(Math.random()*textures);
        texture = new TextureRegion(grassTexture, x*SIZE, 0, SIZE, SIZE);
    }

}
