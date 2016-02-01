package states;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by 343076 on 31/01/2016.
 */
public abstract class State{

    private StateManager sm;

    public State(StateManager sm){
        this.sm = sm;
    }

    protected abstract void update();

}
