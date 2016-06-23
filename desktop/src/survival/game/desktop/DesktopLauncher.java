package survival.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.graphics.FPSLogger;
import survival.game.Game;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		FPSLogger fpsLogger = new FPSLogger();
		config.width = Game.WIDTH;
        config.height = Game.HEIGHT;
		config.title = "Survivalist + FPS ";

        new LwjglApplication(new Game(), config);
	}
}
