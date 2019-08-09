package com.example.mainactivity;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.LinkedList;

public class WordListAdapter extends RecyclerView.Adapter<WordListAdapter.WordViewHolder> {

    public final LinkedList<String> mWordList ;
    private LayoutInflater mInflater;
    private LinearLayout linearLayout;

    public WordListAdapter(Context context,
                           LinkedList<String> wordList) {
        mInflater = LayoutInflater.from(context);
        this.mWordList = wordList;
    }

    @Override
    public WordViewHolder onCreateViewHolder(ViewGroup parent,
                                             int viewType) {
        View mItemView = mInflater.inflate(R.layout.wordlist_item,
                parent, false);
        return new WordViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(WordViewHolder holder, int position) {

        String mCurrent = mWordList.get(position);
       holder.wordItemView.setText(mCurrent);
        //holder.linearLayout


    }
    @Override
    public int getItemCount() {
        return mWordList.size();
    }


    class WordViewHolder extends RecyclerView.ViewHolder
            implements View.OnClickListener
    {
        public final Button wordItemView;
        final WordListAdapter mAdapter;

        public WordViewHolder(@NonNull View itemView,WordListAdapter madapter) {
            super(itemView);
            wordItemView=itemView.findViewById(R.id.button);
            linearLayout=itemView.findViewById(R.id.linearlayout);
            this.mAdapter=madapter;

            //Connect the onClickListener with the View
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            // Get the position of the item that was clicked.
            int mPosition = getLayoutPosition();
// Use that to access the affected item in mWordList.
            String element = mWordList.get(mPosition);
// Change the word in the mWordList.
            //mWordList.set(mPosition, "Clicked! " + element);
           // Toast.makeText(this,"U clicked on",);
          // Toast.makeText(SecondActivity.this, "some message", Toast.LENGTH_SHORT).show();

            switch (mPosition)
            {

            }

// Notify the adapter, that the data has changed so it can
// update the RecyclerView to display the data.
            mAdapter.notifyDataSetChanged();
        }
    }
}
