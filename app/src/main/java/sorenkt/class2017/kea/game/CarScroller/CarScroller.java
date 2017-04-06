package sorenkt.class2017.kea.game.CarScroller;


import sorenkt.class2017.kea.game.GameEngine;
import sorenkt.class2017.kea.game.Screen;

public class CarScroller extends GameEngine
{
    @Override
    public Screen createStartScreen()
    {
        music = this.loadMusic("music.ogg");
        music.setLooping(true);
        return new MainMenuScreen(this);
    }

    public void onPause()
    {
        super.onPause();
        music.pause();
    }


    public void onResume()
    {
        super.onResume();
        music.play();
    }

    public void onDestroy()
    {
        super.onDestroy();
        music.stop();
        music.dispose();
    }
}
