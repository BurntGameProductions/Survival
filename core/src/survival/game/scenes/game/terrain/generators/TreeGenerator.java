package survival.game.scenes.game.terrain.generators;

import survival.game.scenes.game.GameScene;
import survival.game.scenes.game.terrain.objects.Tree;

public class TreeGenerator extends ObjectGenerator {


    public TreeGenerator(GameScene gameScene) {
        super(gameScene);

        /*for (int i = 0; i < 200; i++) {
            gameScene.addGameObject(generate());
        }*/

    }

    @Override
    public Tree generate() {

        /*Random random = new Random();

        ArrayList<Vector2> cellPositions = new ArrayList<>();

        TiledMapTileLayer layer = (TiledMapTileLayer) gameScene.getTerrain().getMap().getLayers().get("treeSpawnArea");

        for (int x = 0; x < layer.getWidth(); x++) {
            for (int y = 0; y < layer.getHeight(); y++) {
                if (layer.getCell(x, y) != null) cellPositions.add(new Vector2(x, y));
            }
        }

        boolean foundProperLocation = true;
        Vector2 pos = cellPositions.get(random.nextInt(cellPositions.size()));

        for (GameObject g : gameScene.getGameObjects()) {

            for (int x = -2; x < 2; x++) {
                for (int y = -2; y < 2; y++) {
                    if (g.getPosition().x == pos.x + x && g.getPosition().y == pos.y + y) {
                        foundProperLocation = false;
                        break;
                    }
                }
            }

            for (GameObject stones : gameScene.getGameObjects()) {

                for (int x = -2; x < 2; x++) {
                    for (int y = -2; y < 2; y++) {

                        if (stones.getPosition().x == pos.x + x && stones.getPosition().y == pos.y + y) {
                            foundProperLocation = false;
                            break;
                        }

                    }
                }

            }

        }

        if(foundProperLocation){
            return new Tree((int) pos.x, (int) pos.y, gameScene);
        } else return generate();
        */

        return null;
    }
}
