package survival.game;

import survival.game.scenes.game.GameScene;
import survival.game.scenes.Scene;

public class SceneManager extends Scene {


    private Scene activeScene;

    public SceneManager() {
        /**This here tells what scene is the scene to load on start.**/
        //TODO: Make a main menu.
        activeScene = new GameScene();
    }

    @Override
    public void render(){
        activeScene.render();
    }

    @Override
    public void update(float dt){
        activeScene.update(dt);
    }

    @Override
    public void resize(int width, int height) {
        activeScene.resize(width, height);
    }

    @Override
    public void dispose() {
        activeScene.dispose();
    }
}
