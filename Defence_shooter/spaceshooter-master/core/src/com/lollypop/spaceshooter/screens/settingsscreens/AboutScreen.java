package com.madrat.spaceshooter.screens.settingsscreens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.Align;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.madrat.spaceshooter.MainGame;
import com.madrat.spaceshooter.utils.Assets;
import com.madrat.spaceshooter.utils.BuildConfig;
import com.madrat.spaceshooter.utils.ScrollingBackground;
import com.madrat.spaceshooter.utils.Strings;

import static com.madrat.spaceshooter.MainGame.SCALE_FACTOR;

public class AboutScreen implements Screen {

    MainGame game;

    private Stage stage;
    private Skin skin;
    private Table menuTable;

    private SpriteBatch batch;
    private ScrollingBackground scrollingBackground;

    private Label devNameLabel, infoLabel, rokib, rokibid, rafee, rafeeid, eshan, eshanid;
    private Label rokibinfo, rafeeinfo, eshaninfo, space;

    private TextButton backBtn;
    private Color nameColor, strColor;

    public AboutScreen(MainGame newGame, ScrollingBackground scrBack) {

        this.game = newGame;
        this.batch = new SpriteBatch();
        this.scrollingBackground = scrBack;

        Assets.unloadFont();
        Assets.loadFont();
        Assets.manager.finishLoading();

        skin = Assets.manager.get(Assets.uiskin, Skin.class);
        stage = new Stage(new ScreenViewport());

        nameColor = Assets.lightBlue_3;
        strColor = Assets.lightGreen_3;


        //About

        infoLabel = new Label(Strings.createdBy, skin, Strings.fontName, strColor);
        infoLabel.setFontScale(SCALE_FACTOR);
        devNameLabel = new Label("LollyPopTroops", skin, Strings.fontName, nameColor);
        devNameLabel.setFontScale(SCALE_FACTOR / 1.5f);


        //rafee
        rafee = new Label("Mustafizur Rahman", skin, Strings.fontName, nameColor);
        rafee.setFontScale(SCALE_FACTOR / 2f);

        rafeeid = new Label("18192103125", skin, Strings.fontName, nameColor);
        rafeeid.setFontScale(SCALE_FACTOR / 2f);

        rafeeinfo = new Label("Lead, Design", skin, Strings.fontName, nameColor);
        rafeeinfo.setFontScale(SCALE_FACTOR / 2f);

        //rokib
        rokib = new Label("Rokibul Islam", skin, Strings.fontName, nameColor);
        rokib.setFontScale(SCALE_FACTOR / 2f);

        rokibid = new Label("18192103110", skin, Strings.fontName, nameColor);
        rokibid.setFontScale(SCALE_FACTOR / 2f);

        rokibinfo = new Label("Programing, template.", skin, Strings.fontName, nameColor);
        rokibinfo.setFontScale(SCALE_FACTOR / 2f);

        //eshan
        eshan = new Label("Touhiduzzaman Eshan", skin, Strings.fontName, nameColor);
        eshan.setFontScale(SCALE_FACTOR / 2f);

        eshanid = new Label("18192103122", skin, Strings.fontName, nameColor);
        eshanid.setFontScale(SCALE_FACTOR / 2f);

        eshaninfo = new Label("Programing, enemy, bullet", skin, Strings.fontName, nameColor);
        eshaninfo.setFontScale(SCALE_FACTOR / 2f);

        space = new Label(" ", skin, Strings.fontName, nameColor);
        space.setFontScale(SCALE_FACTOR / 2f);

        backBtn = new TextButton(Strings.backTxt, skin);
        backBtn.getLabel().setFontScale(SCALE_FACTOR);

        backBtn.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                setSettingsScreen();
            }
        });

        // Create table for button
        menuTable = new Table();
        menuTable.setWidth(stage.getWidth());
        menuTable.align(Align.center | Align.top);
        menuTable.setPosition(0, MainGame.GENERAL_HEIGHT);

        // Setup all relative positions
        menuTable.padTop(120 * SCALE_FACTOR);
        menuTable.add(infoLabel).padBottom(50 * SCALE_FACTOR);
        menuTable.row();
        menuTable.add(devNameLabel).padBottom(50*SCALE_FACTOR);


        menuTable.row();
        menuTable.add(space);


        menuTable.row();
        menuTable.add(rafee);
        menuTable.row();
        menuTable.add(rafeeid);
        menuTable.row();
        menuTable.add(rafeeinfo);

        menuTable.row();
        menuTable.add(space);


        menuTable.row();
        menuTable.add(rokib);
        menuTable.row();
        menuTable.add(rokibid);
        menuTable.row();
        menuTable.add(rokibinfo);

        menuTable.row();
        menuTable.add(space);



        menuTable.row();
        menuTable.add(eshan);
        menuTable.row();
        menuTable.add(eshanid);
        menuTable.row();
        menuTable.add(eshaninfo);

        menuTable.row();
        menuTable.add(space);

        menuTable.row();
        menuTable.add(backBtn).padTop(100 * SCALE_FACTOR);

        if (BuildConfig.UIDEBUG)
            menuTable.debug();

        // Add table to stage (buttons)
        stage.addActor(menuTable);

        stage.addListener(new InputListener() {
            @Override
            public boolean keyDown(InputEvent event, int keycode) {
                if (keycode == Input.Keys.ESCAPE || keycode == Input.Keys.BACK) {
                    setSettingsScreen();
                    return true;
                }
                return false;
            }
        });

        // Set input processor
        Gdx.input.setInputProcessor(stage);
    }

    public void setSettingsScreen() {
        batch.dispose();
        game.setScreen(new SettingsScreen(game, scrollingBackground));
    }

    @Override
    public void show() {
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin();

        // Display background
        scrollingBackground.draw(batch);
        batch.end();

        // Display buttons + update UI
        stage.act(Gdx.graphics.getDeltaTime());
        stage.draw();
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
}
