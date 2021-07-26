package com.mygdx.project4;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;

public class maingame extends Game {


	LoadingScreen loadingScreen;
	@Override
	public void create() {
		loadingScreen = new LoadingScreen();
		setScreen(loadingScreen);
		Gdx.app.setLogLevel(0);
	}

	@Override
	public void dispose() {
		super.dispose();
		loadingScreen.dispose();
	}

	@Override
	public void render() {
		super.render();
	}

	@Override
	public void resize(int width, int height) {
		loadingScreen.resize(width, height);
	}
}
