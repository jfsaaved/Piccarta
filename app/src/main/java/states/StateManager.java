package states;

import java.util.Stack;

/**
 * Created by 343076 on 31/01/2016.
 */
public class StateManager {

    private Stack<State> states;

    public StateManager(){
        states = new Stack<State>();
    }

    public void set(State state){
        states.pop();
        states.push(state);
    }

    public void push(State state){
        states.push(state);
    }

    public void pop(){
        states.pop();
    }

    public void update(){
        states.peek().update();
    }

}
