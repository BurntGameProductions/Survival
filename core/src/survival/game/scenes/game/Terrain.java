package survival.game.scenes.game;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import survival.game.scenes.game.terrain.generators.StoneGenerator;
import survival.game.scenes.game.terrain.generators.TerrainGenerator;
import survival.game.scenes.game.terrain.generators.TreeGenerator;
import survival.game.scenes.game.terrain.tiles.Tile;

public class Terrain {
    //private TiledMap map;
    private Tile[][] map;
    private OrthogonalTiledMapRenderer renderer;
    private GameScene scene;

    public Terrain(GameScene scene) {
        this.scene = scene;
        /*map = new TmxMapLoader().load("maps/map.tmx");
        renderer = new OrthogonalTiledMapRenderer(map, scene.getSpriteBatch());

        // Animation
        Array<StaticTiledMapTile> frameTiles = new Array<>();

        for (TiledMapTile tile : map.getTileSets().getTileSet("water")) {
            if (tile instanceof StaticTiledMapTile) {
                frameTiles.add((StaticTiledMapTile) tile);
            }
        }

        AnimatedTiledMapTile animatedTile = new AnimatedTiledMapTile(0.75f, frameTiles);
        animatedTile.getProperties().put("ground", "false");

        TiledMapTileLayer layer = (TiledMapTileLayer) map.getLayers().get("mid");
        for(int x = 0; x < layer.getWidth(); x++){
            for(int y = 0; y < layer.getHeight(); y++){
                TiledMapTileLayer.Cell cell = layer.getCell(x,y);
                if(cell==null) continue;
                if(cell.getTile().getProperties().containsKey("animation") && cell.getTile().getProperties().get("animation").equals("water")){
                    cell.setTile(animatedTile);
                }
            }
        }*/

        map = TerrainGenerator.generate();

        // Generate Stones
        for(int i = 0; i < 500; i++){
	  scene.addGameObject(TreeGenerator.generate(map, scene));  
          scene.addGameObject(StoneGenerator.generate(map, scene));
        }:
    }

    public void render(SpriteBatch spriteBatch) {
        //renderer.setView(scene.getGameCamera());
        //renderer.render();

        spriteBatch.begin();
        for(int x = 0; x < map.length; x++){
            for(int y = 0; y < map[0].length; y++){
                map[x][y].render(spriteBatch, x, y);
            }
        }
        spriteBatch.end();

    }

    public void update(float dt) {
    }

    public void dispose(){
        //map.dispose();
        //renderer.dispose();
        map = null;
    }

    /*public TiledMap getMap() {
        return map;
    }*/
}
