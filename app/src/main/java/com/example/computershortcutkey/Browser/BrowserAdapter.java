package com.example.computershortcutkey.Browser;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.computershortcutkey.R;

import java.util.List;

public class BrowserAdapter extends RecyclerView.Adapter<BrowserAdapter.MyAdapterView> {

    private Context mcontext;
    private List<BrowserModel> mdata;

    public BrowserAdapter(Context mcontext, List<BrowserModel> mdata) {
        this.mcontext = mcontext;
        this.mdata = mdata;
    }

    @NonNull
    @Override
    public MyAdapterView onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view;
        LayoutInflater inflater=LayoutInflater.from(mcontext);
        view=inflater.inflate(R.layout.browser_list,viewGroup,false);

        return new BrowserAdapter.MyAdapterView(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyAdapterView myAdapterView, final int i) {


        myAdapterView.img_book_thumbnail.setAnimation(AnimationUtils.loadAnimation(mcontext,R.anim.fade_transition_animation));

        myAdapterView.cardView.setAnimation(AnimationUtils.loadAnimation(mcontext,R.anim.fade_scale_animation));
        myAdapterView.tv_book_title.setText(mdata.get(i).getTitle());
        myAdapterView.img_book_thumbnail.setImageResource(mdata.get(i).getThumbnail());

        myAdapterView.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent;
                switch (myAdapterView.tv_book_title.getText().toString()) {
                    case "Chrome":
                        intent = new Intent(mcontext, ChromeActivity.class);
                        intent.putExtra("Title", mdata.get(i).getTitle());
                        intent.putExtra("Thumbnail", mdata.get(i).getThumbnail());
                        mcontext.startActivity(intent);
                        break;

                    case "Firefox":
                        intent = new Intent(mcontext, FirefoxActivity.class);
                        intent.putExtra("Title", mdata.get(i).getTitle());
                        intent.putExtra("Thumbnail", mdata.get(i).getThumbnail());
                        mcontext.startActivity(intent);
                        break;

                    case "Internet Explorer":
                        intent = new Intent(mcontext, ExplorerActivity.class);
                        intent.putExtra("Title", mdata.get(i).getTitle());
                        intent.putExtra("Thumbnail", mdata.get(i).getThumbnail());
                        mcontext.startActivity(intent);
                        break;
                }

            }
        });
    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }

    public class MyAdapterView extends RecyclerView.ViewHolder
    {

        TextView tv_book_title;
        ImageView img_book_thumbnail;
        RelativeLayout cardView;

        public MyAdapterView(@NonNull View itemView) {
            super(itemView);
            tv_book_title = itemView.findViewById(R.id.book_title_id);
            img_book_thumbnail = itemView.findViewById(R.id.book_img_id);
            cardView = itemView.findViewById(R.id.cardview_id);

        }
    }
}
