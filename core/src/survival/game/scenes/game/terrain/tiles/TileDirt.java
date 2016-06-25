package survival.game.scenes.game.terrain.tiles;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import survival.game.utills.Textures;
public class TileDirt extends Tile {

	public TileDirt() {
		super(TileType.DIRT);
		Texture dirtTexture = Textures.TILE_DIRT.getTexture();
		int textures = dirtTexture.getWidth()/SIZE;
		int x = (int)Math.ceil(Math.random()*textures);
		texture = new TextureRegion(dirtTexture, x*SIZE, 0, SIZE, SIZE);
	}
}
