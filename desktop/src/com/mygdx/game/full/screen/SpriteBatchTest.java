package com.mygdx.game.full.screen;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.GLEmulation;
import com.mygdx.game.Libgdx4M1;

/*
 * if stared will crash jre on mac mini with M1 ship.
 * If you remove setFullscreenMode, it will work.
 * 
 */
public class SpriteBatchTest {
	public static void main(String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setForegroundFPS(60);
		config.setTitle("libgdx4m1");

		config.setOpenGLEmulation(GLEmulation.GL30, 3, 2);

		new Lwjgl3Application(new Libgdx4M1(), config);
	}
}
