package com.mygdx.project4;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class TestButton extends Buttons{
    TestButton(String text, float x, float y){
        super(text,x,y);
    }

    @Override
    public void press(){
        setText("Button pressed");
//        maingame change = new maingame();
//        TestWindow w = new TestWindow();
//        change.setScreen(w);
    }

    @Override
    public void render(SpriteBatch batch) {
        super.checkPressed();
        super.render(batch);
    }
}
