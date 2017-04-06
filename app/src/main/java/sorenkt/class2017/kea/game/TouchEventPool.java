package sorenkt.class2017.kea.game;

public class TouchEventPool extends Pool<TouchEvent>
{

    @Override
    protected TouchEvent newItem()
    {
        return new TouchEvent();
    }
}
