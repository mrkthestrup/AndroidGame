package sorenkt.class2017.kea.game.CarScroller;

import android.graphics.Bitmap;

import sorenkt.class2017.kea.game.GameEngine;

public class WorldRenderer
{
    GameEngine game;
    World world;
    Bitmap scrBackImage;
    Bitmap carImage;
    Bitmap monsterImage;
    int screenWidth;
    int screenHeight;

    public WorldRenderer(GameEngine game, World world)
    {
        this.game = game;
        this.world = world;
        screenWidth = game.getFrameBufferWidth();
        screenHeight = game.getFrameBufferHeight();
        scrBackImage = game.loadBitmap("xcarbackground.png");
        carImage = game.loadBitmap("xbluecar2.png");
        monsterImage = game.loadBitmap("xyellowmonster.png");
    }

    public void render()
    {
        game.drawBitmap(scrBackImage,
                0,0,
                (int)world.scrollingBackground.scrollx, 0,
                screenWidth, screenHeight);
        game.drawBitmap(carImage, 30, 160);
    }
}
