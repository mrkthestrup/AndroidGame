package sorenkt.class2017.kea.game.CarScroller;

import android.graphics.Bitmap;

import sorenkt.class2017.kea.game.GameEngine;
import sorenkt.class2017.kea.game.Screen;

public class GameScreen extends Screen
{
    enum State
    {
        Paused, Running, GameOver
    }

    State state = State.Running;
    Bitmap background;
    World world;
    WorldRenderer worldRenderer;


    public GameScreen(GameEngine game)
    {
        super(game);
        background = game.loadBitmap("xcarbackground.png");
        game.music.play();
        world = new World(game);
        worldRenderer = new WorldRenderer(game, world);

    }

    @Override
    public void update(float deltaTime)
    {
        if (state == State.Running)
        {
            world.update(deltaTime);
        }
        worldRenderer.render();

    }

    @Override
    public void pause()
    {
        game.music.pause();
    }

    @Override
    public void resume()
    {
        game.music.play();
    }

    @Override
    public void dispose()
    {
        game.music.stop();
    }
}
