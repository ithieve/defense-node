package com.mygdx.project4;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.utils.Align;


public class Buttons {
    public Texture texture = new Texture("blue_button04.png");
    public Sprite sprite = new Sprite(texture);
    public BitmapFont font = new BitmapFont();
    ShapeRenderer drend;
    String text;
    float xstart;
    float ystart;



    Buttons(){

    }

    Buttons(String text, float x, float y){
        font.getData().setScale(1.5f);
        font.getRegion().getTexture().setFilter(Texture.TextureFilter.Nearest, Texture.TextureFilter.Nearest);
        sprite.setPosition(x,y);
        this.text = text;
        drend = new ShapeRenderer();
    }

    public void render(SpriteBatch batch){
        checkPressed();

        // draw rectangle
        batch.begin();
        batch.draw(sprite,sprite.getX(),sprite.getY());
        font.draw(batch,
                text,
                sprite.getX()+(sprite.getWidth()/2),
                sprite.getY()+(sprite.getHeight()/2)+10,
                0,
                Align.center,
                false);
        batch.end();


        drend.begin(ShapeRenderer.ShapeType.Line);
        drend.setColor(Color.ROYAL);
        drend.end();

    }

    public void checkPressed(){
        if(Gdx.input.isButtonPressed(Input.Buttons.LEFT)){

            float x = Gdx.input.getX();
            float y = Gdx.graphics.getHeight() - Gdx.input.getY();
            text = Float.toString(x) + " : " + Float.toString(y);
            Gdx.app.log("Buttons","Pressed at "+ x + " : "+ y);




            if(x>sprite.getX() && x< sprite.getX() +sprite.getWidth() ){
                if(y>sprite.getY()  && y< sprite.getY() +sprite.getHeight()){
                    press();
                }

            }


        }
    }
    public void setText(String text){
        this.text = text;
    }

    public void press(){
        //to be implemented.
    }



}
