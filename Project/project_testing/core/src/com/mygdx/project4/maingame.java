package com.mygdx.project4;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.ScreenAdapter;

public class maingame extends Game {

	Screen currentScreen;
	Screen mainMenuScreen;
	ScreenAdapter InputTest;
	TestWindow testWindow;
	InputTest inputTest;
	@Override
	public void create() {
		testWindow = new TestWindow();
		inputTest = new InputTest();


		currentScreen = inputTest;
		setScreen(currentScreen);
		Gdx.app.setLogLevel(0);
	}

	@Override
	public void dispose() {
		super.dispose();
		testWindow.dispose();
		inputTest.dispose();;
	}

	@Override
	public void render() {
		super.render();
	}

	@Override
	public void resize(int width, int height) {
		Gdx.app.log("MainGame","Resize to " + width + " x " +height);
		currentScreen.resize(width, height);
	}
}
