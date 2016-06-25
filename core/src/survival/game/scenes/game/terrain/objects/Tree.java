package survival.game.scenes.game.terrain.objects;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;

import survival.game.scenes.game.GameID;
import survival.game.scenes.game.GameScene;
import survival.game.scenes.game.item.Material;
//import survival.game.scenes.game.item.entities.EntityTree;
import survival.game.utills.Textures;

import java.util.Random;

public class Tree extends DestroyableGameObject {

   private Texture texture;
   private GameScene gameScene;

   public Tree(int x, int y, GameScene gameScene) {
	super(x, y, 32, 32, gameScene, GameID.STONE, 30, 22);

	this.gameScene = gameScene;

	//texture = Textures.OBJECTS_TREE.getTexture();
	Random rand = new Random();
	int dropnumber = rand.nextInt(5) + 1;

	for (int i = 0; i < dropnumber; i++) {
	 //   drops.add(new EntityTree(gameScene, Material.TREE));
	}
   }

   @Override
   public void update(float dt) {
	super.update(dt);
	
	if (this.mouseOver()) {
	   if (Gdx.input.isButtonPressed(Input.Buttons.LEFT)) {
		this.setHitTime(this.getHitTime() + dt);
	   }
	}

   }

   @Override
   public Texture getTexture() {
	return texture;
   }
}
