package survival.game.scenes.game.terrain.generators;

import com.badlogic.gdx.math.Vector2;
import survival.game.scenes.game.GameScene;
import survival.game.scenes.game.terrain.objects.GameObject;
import survival.game.scenes.game.terrain.objects.Tree;
import survival.game.scenes.game.terrain.tiles.Tile;

import java.util.ArrayList;
import java.util.Random;

public class TreeGenerator {
	
	private static final int MAX_TREE_COUNT = 600;

	public static Tree generate(Tile[][] map, GameScene gameScene) {

	int width = map.length;
	int height = map[0].length;

	Tile.TileType[] allowedTiles = {
		Tile.TileType.GRASS,
		Tile.TileType.DIRT
	};

	Random random = new Random();

	int x = random.nextInt(width);
	int y = random.nextInt(height);

	Tile tile = map[x][y];

	for(Tile.TileType t: allowedTiles){
		if (tile.getType().equals(t)){

			ArrayList<GameObject> gameObjects = new ArrayList<GameObject>();
			gameObjects.addAll(gameScene.getGameObjects());
			gameObjects.addAll(gameScene.getGameObjectsToAdd());

			for(GameObject g: gameObjects){
				if(g.getPosition().epsilonEquals(new Vector2(x, y), 1)){
					return generate(map, gameScene);
				}
			}

			return new Tree(x, y, gameScene);
		}
	}
	
	// Try again
	return generate(map, gameScene);

	}
}
