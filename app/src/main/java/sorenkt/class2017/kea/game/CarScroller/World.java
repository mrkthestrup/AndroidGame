package sorenkt.class2017.kea.game.CarScroller;

import java.util.ArrayList;
import java.util.List;

import sorenkt.class2017.kea.game.GameEngine;

public class World
{

    public static final int MAX_WIDTH = 2699;
    public static final int MIN_WIDTH = 0;
    public static final int MAX_HEIGHT = 290;
    public static final int MIN_HEIGHT = 30;
    int screenWidth;

    GameEngine game;
    boolean gameOver = false;
    ScrollingBackground scrollingBackground;
    Car car;
    List<Monster> monsters = new ArrayList<>();

    public World(GameEngine game)
    {
        this.game = game;
        screenWidth = game.getFrameBufferWidth();
        scrollingBackground = new ScrollingBackground();
        car = new Car();
    }

    public void update(float deltatime)
    {
        scrollingBackground.scrollx = scrollingBackground.scrollx + 500 * deltatime;                 //100 = the bacis speeed
        if (scrollingBackground.scrollx > MAX_WIDTH - screenWidth)                                  //keeps looping, so the background doesnt stop
        {
            scrollingBackground.scrollx = 0;
        }
    }

}
