package com.game_assignment.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;

public class ResumeScreen extends ScreenAdapter {

    Game_Assignment game;

    public ResumeScreen(Game_Assignment game)
    {
        this.game  = game;
    }

    @Override
    public void show()
    {
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
    public void render(float delta)
    {
        Gdx.gl.glClearColor(.25f, 0, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        game.batch.begin();

        game.font.draw(game.batch , "Select the Saved State : ", 50 , 500);
        game.font.draw(game.batch, "\t 1) Saved State 1" , 100 , 400);
        game.font.draw(game.batch, "\t 2) Saved State 2" , 100 , 300);
        game.font.draw(game.batch, "\t 3) Saved State 3" , 100 , 200);
        game.font.draw(game.batch, "Press Space bar to return", 100, 100);
        game.batch.end();
    }

    @Override
    public void hide()
    {
        Gdx.input.setInputProcessor(null);
    }
}
