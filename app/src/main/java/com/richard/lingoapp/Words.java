package com.richard.lingoapp;

/**
 * Created by Jaruspace on 12/20/2017.
 */

public class Words {
    private String baseWord;
    private String translation;



    public int getPlay_button() {
        return play_button;
    }

    private int play_button;


    public String getBaseWord() {
        return baseWord;
    }

    public String getTranslation() {
        return translation;
    }

    public Words(String baseWord, String translation, int play_button) {
        this.baseWord = baseWord;
        this.translation = translation;
        this.play_button = play_button;
    }
}
