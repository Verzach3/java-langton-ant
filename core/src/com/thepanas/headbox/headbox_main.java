package com.thepanas.headbox;

import java.security.Key;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
// import com.badlogic.gdx.audio.Music;
// import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.TimeUtils;

public class headbox_main extends ApplicationAdapter {

	private SpriteBatch batch;
	Texture white_cube;
	private OrthographicCamera camera;
	private Rectangle player;
	private float maxspeed = 200;
	private Vector2 player_speed;
	
	
	@Override
	public void create () {

		player = new Rectangle();
		player.x = 800 / 2 - 64 / 2;
		player.y = 20;
		player.width = 64;
		player.height = 64;

		batch = new SpriteBatch();
		white_cube = new Texture("cube.png");
		camera = new OrthographicCamera();
		camera.setToOrtho(false, 800, 480);
	 
		


	}

	@Override
	public void render () {
		
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		camera.update();

		batch.setProjectionMatrix(camera.combined);

		batch.begin();
		batch.draw(white_cube, player.x, player.y);
		batch.end();
		if(Gdx.input.isKeyPressed(Keys.LEFT)) player.x -= 200 * Gdx.graphics.getDeltaTime();
		if(Gdx.input.isKeyPressed(Keys.RIGHT)) player.x += 200 * Gdx.graphics.getDeltaTime();
		if(Gdx.input.isKeyPressed(Keys.UP)) player.y +=200 * Gdx.graphics.getDeltaTime();
		if(Gdx.input.isKeyPressed(Keys.DOWN)) player.y -=200 * Gdx.graphics.getDeltaTime();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		white_cube.dispose();
	}

	public static void bullet(){
		Vector2 position;
		int maxspeed = 500;
		int lifespan = 10;




	}

}
