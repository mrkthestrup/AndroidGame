package sorenkt.class2017.kea.game;


public class SimpleGame extends GameEngine
{

    @Override
    public Screen createStartScreen()
    {
        return new SimpleScreen(this);
    }
}
