package com.lollypoptroops.defensenode;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.badlogic.gdx.utils.viewport.Viewport;


public class GameScreen implements Screen {

    //screen
    private Camera camera;
    private Viewport viewport;

    //graphics
    private SpriteBatch spBatch;
    private Texture background;

    //timing


    //world params
    private final int WORLD_WIDTH = 128;
    private final int WORLD_HEIGHT = 72;


    GameScreen(){
        camera = new OrthographicCamera();
        viewport = new StretchViewport(WORLD_WIDTH, WORLD_HEIGHT,camera);
    }

    @Override
    public void render(float delta) {

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }

    @Override
    public void show() {

    }


}
