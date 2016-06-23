package survival.game.scenes.game.item;

import com.badlogic.gdx.graphics.Texture;

public enum Material {
    STONE(new Texture("images/items/rock.png"), 50, "Stone"),
    TORCH(new Texture("images/items/torch.png"), 1, "Torch");

    private Texture texture;
    private int maxStackSize;
    private String name;

    Material(Texture texture, int maxStackSize, String name) {
        this.texture = texture;
        this.maxStackSize = maxStackSize;
        this.name = name;
    }

    public Texture getTexture() {
        return texture;
    }

    public int getMaxStackSize() {
        return maxStackSize;
    }

    public String getName() {
        return name;
    }
}
