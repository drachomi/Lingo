package com.richard.lingoapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import com.richard.lingoapp.Utility.WordsAdapter;

import java.util.ArrayList;
import java.util.List;

public class School extends AppCompatActivity {

    List<Words> wordsList = new ArrayList<>();
    RecyclerView recyclerView;
    WordsAdapter wordsAdapter;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_list);
        recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        wordsAdapter = new WordsAdapter(wordsList);
        imageView = (ImageView)findViewById(R.id.word_picture);
        imageView.setImageResource(R.drawable.school);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        recyclerView.setAdapter(wordsAdapter);
        prePareWord();

    }

    public void prePareWord(){
        Words word = new Words("Good Morning","Mesiere",R.drawable.playbutton);
        wordsList.add(word);
        word = new Words("Good Afternoon","AM here",R.drawable.playbutton);
        wordsList.add(word);
        word = new Words("Come here","AM here",R.drawable.playbutton);
        wordsList.add(word);
        word = new Words("Come here","AM here",R.drawable.playbutton);
        wordsList.add(word);
        word = new Words("Come here","AM here",R.drawable.playbutton);
        wordsList.add(word);
        word = new Words("Come here","AM here",R.drawable.playbutton);
        wordsList.add(word);
        word = new Words("Come here","AM here",R.drawable.playbutton);
        wordsList.add(word);
        word = new Words("Come here","AM here",R.drawable.playbutton);
        wordsList.add(word);

        wordsAdapter.notifyDataSetChanged();
    }

}
