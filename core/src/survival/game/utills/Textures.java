package survival.game.utills;

import com.badlogic.gdx.graphics.Texture;

public enum Textures {
    OBJECT_STONE(new Texture("images/objects/stone.png")),
    OBJECT_TREE(new Texture("images/objects/tree.png")),
   
    //TODO: here it is...
    OBJECT_IRON(new Texture("images/objects/iron.png")),

    ENTITY_PLAYER(new Texture("images/entities/player/naked.png")),

    INVENTORY_SLOT(new Texture("images/ui/toolbarBackground.png")),
    INVENTORY_SLOT_SELECTED(new Texture("images/ui/toolbarBackgroundSelected.png")),

    TILE_GRASS(new Texture("images/tiles/grass.png")),
    TILE_DIRT(new Texture("images/tiles/dirt.png"));

    private Texture texture;

    Textures(Texture texture) {
        this.texture = texture;
    }

    public Texture getTexture() {
        return texture;
    }
}
