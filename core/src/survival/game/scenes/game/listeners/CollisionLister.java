package survival.game.scenes.game.listeners;

import com.badlogic.gdx.physics.box2d.*;
import survival.game.scenes.game.entity.Player;
import survival.game.scenes.game.item.EntityItem;
import survival.game.utills.box2D.Box2DTag;
import survival.game.utills.box2D.CustomUserData;

public class CollisionLister implements ContactListener {

    @Override
    public void beginContact(Contact contact) {
        Body[] bodies = new Body[2];
        bodies[0] = contact.getFixtureA().getBody();
        bodies[1] = contact.getFixtureB().getBody();

        for (int i = 0; i < 2; i++) {
            Body b1 = bodies[i];
            Body b2 = bodies[i == 0 ? 1 : 0];


            if (b1.getUserData() != null && b2.getUserData() != null) {

                CustomUserData b1UserData = (CustomUserData) b1.getUserData();
                CustomUserData b2UserData = (CustomUserData) b2.getUserData();

                if (b1UserData.getTag() == Box2DTag.PLAYER) {
                    Player player = (Player) b1UserData.getBodyClass();

                    if (b2UserData.getTag() == Box2DTag.ITEM) {
                        EntityItem entityItem = (EntityItem) b2UserData.getBodyClass();
                        player.pickupItem(entityItem);
                    }
                }

            } else break;
        }
    }

    @Override
    public void endContact(Contact contact) {

    }

    @Override
    public void preSolve(Contact contact, Manifold oldManifold) {

    }

    @Override
    public void postSolve(Contact contact, ContactImpulse impulse) {

    }
}
