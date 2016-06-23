package survival.game;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.graphics.FPSLogger;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		FPSLogger fpsLogger = new FPSLogger();
		config.width = Game.WIDTH;
        config.height = Game.HEIGHT;
		config.title = "Survival + FPS ";

        new LwjglApplication(new Game(), config);
	}
}
