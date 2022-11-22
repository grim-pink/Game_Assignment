package com.game_assignment.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
// import com.badlogic.gdx.Input;
// import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
// import com.badlogic.gdx.graphics.g2d.BitmapFont;

public class PlayScreen extends ScreenAdapter {

    Game_Assignment game;
    BitmapFont font = new BitmapFont();
    public PlayScreen(Game_Assignment game) {
        this.game = game;
    }

    @Override
    public void show(){
        Gdx.input.setInputProcessor(new InputAdapter() {
            @Override
            public boolean keyDown(int keyCode) {
                if (keyCode == Input.Keys.SPACE) {
                    game.setScreen(new GameScreen(game));
                }
                return true;
            }
        });
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, .25f, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        game.batch.begin();
        // font.draw(game.batch, "MAIN PAGE!", Gdx.graphics.getWidth() * .25f, Gdx.graphics.getHeight() * .75f);
        // font.draw(game.batch, "Resume game", Gdx.graphics.getWidth() * .25f, Gdx.graphics.getHeight() * .5f);
        // font.draw(game.batch, "New game", Gdx.graphics.getWidth() * .25f, Gdx.graphics.getHeight() * .25f);
        font.draw(game.batch, "Exit game", Gdx.graphics.getWidth() * .25f, Gdx.graphics.getHeight() * .10f);
        game.batch.end();
    }

    @Override
    public void hide(){
        Gdx.input.setInputProcessor(null);
    }
}