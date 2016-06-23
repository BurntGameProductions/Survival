package survival.game.scenes.game.terrain.generators;

import survival.game.scenes.game.terrain.tiles.Tile;
import survival.game.scenes.game.terrain.tiles.TileGrass;

public class TerrainGenerator {
    public static final int WIDTH = 200;
    public static final int HEIGHT = 200;

    public static Tile[][] generate(){

        Tile[][] tiles = new Tile[WIDTH][HEIGHT];

        for(int x = 0; x < WIDTH; x++){
            for(int y = 0; y < HEIGHT; y++){
                tiles[x][y] = new TileGrass();
            }
        }

        return tiles;
    }

}
