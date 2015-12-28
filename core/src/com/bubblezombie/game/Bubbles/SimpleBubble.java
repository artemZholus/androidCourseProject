package com.bubblezombie.game.Bubbles;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.bubblezombie.game.BubbleZombieGame;
import com.bubblezombie.game.Util.Scene2dSprite;

/**
 * Created by artem on 02.12.15.
 */
public class SimpleBubble extends Bubble {
    //amount of SimpleBubble's colors
    public static int COLORS_AMOUNT;
    private static final String texture_path = "game/bubbles/tmp_bubble.png";

    public BubbleColor _color;

    public void setColor(BubbleColor newColor) {}

    public BubbleColor getColor() { return _color; }

    public SimpleBubble() {
        this(BubbleColor.NONE);
    }

    public SimpleBubble(BubbleColor color) {
        super(BubbleType.SIMPLE);
        BubbleZombieGame.INSTANCE.assetManager.load(texture_path, Texture.class);
        BubbleZombieGame.INSTANCE.assetManager.finishLoadingAsset(texture_path);
        setView(new Scene2dSprite(BubbleZombieGame.INSTANCE.assetManager.get(texture_path, Texture.class)));
        if (color == BubbleColor.NONE) {
            _color = BubbleColor.values()[(int)Math.floor(Math.random() * SimpleBubble.COLORS_AMOUNT) + 1];
        } else {
            _color = color;
        }
    }
    @Override
    public void Delete(boolean withPlane) {
        super.Delete();
    }

}
