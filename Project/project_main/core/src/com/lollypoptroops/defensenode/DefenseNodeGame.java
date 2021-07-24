package com.lollypoptroops.defensenode;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class DefenseNodeGame extends Game {

	GameScreen gameScreen; //the main gamescreen

	@Override
	public void create() {
		gameScreen = new GameScreen(); // make new gamescreen
		setScreen(gameScreen); //set the current screen to gamescreen
	}

	@Override
	public void dispose() {
		gameScreen.dispose();
	}

	@Override
	public void render() {
		super.render();
	}

	@Override
	public void resize(int width, int height) {
		gameScreen.resize(width, height);
	}
}
