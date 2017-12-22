package com.richard.lingoapp.Utility;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.richard.lingoapp.R;
import com.richard.lingoapp.Words;

import java.util.List;

/**
 * Created by Jaruspace on 12/20/2017.
 */

public class WordsAdapter extends RecyclerView.Adapter<WordsAdapter.WordsViewHolder> {
    List<Words> wordsList;


    public WordsAdapter(List<Words> wordsString) {
        this.wordsList = wordsString;
    }

    @Override
    public WordsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
     View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);


        return new WordsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(WordsViewHolder holder, int position) {
        Words words = wordsList.get(position);
        holder.mBaseWordView.setText(words.getBaseWord());
        holder.mTranslatedWordView.setText(words.getTranslation());
        holder.play_button.setImageResource(words.getPlay_button());



    }

    @Override
    public int getItemCount() {
       return wordsList.size();
    }

    public class WordsViewHolder extends RecyclerView.ViewHolder {

        TextView mBaseWordView,mTranslatedWordView;
        ImageView play_button;
        public WordsViewHolder(View itemView) {
            super(itemView);
            mBaseWordView = (TextView)itemView.findViewById(R.id.textview_baselang);
            mTranslatedWordView =(TextView)itemView.findViewById(R.id.textview_translation);
            play_button = (ImageView)itemView.findViewById(R.id.play_button);


        }
    }
}
