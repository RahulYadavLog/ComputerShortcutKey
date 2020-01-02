package com.example.computershortcutkey;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.computershortcutkey.Adobe.AdobeActivity;
import com.example.computershortcutkey.Browser.BrowserActivity;
import com.example.computershortcutkey.Office.MsofficeActivity;
import com.example.computershortcutkey.Shortcut.ShortcutKeys;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyAdapterView> {
    private Context mcontext;
    private List<Book> mdata;

    public RecyclerViewAdapter(Context mcontext, List<Book> mdata) {
        this.mcontext = mcontext;
        this.mdata = mdata;
    }

    @NonNull
    @Override
    public MyAdapterView onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view;
        LayoutInflater inflater=LayoutInflater.from(mcontext);
        view=inflater.inflate(R.layout.card_view_item_book,viewGroup,false);

        return new MyAdapterView(view);
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
                    case "Shortcut":
                     intent = new Intent(mcontext, ShortcutKeys.class);
                    intent.putExtra("Title", mdata.get(i).getTitle());
                    intent.putExtra("Thumbnail", mdata.get(i).getThumbnail());
                    mcontext.startActivity(intent);
                        break;

                    case "Browser":
                         intent = new Intent(mcontext, BrowserActivity.class);
                        intent.putExtra("Title", mdata.get(i).getTitle());
                        intent.putExtra("Thumbnail", mdata.get(i).getThumbnail());
                        mcontext.startActivity(intent);
                        break;


                    case "Ms Office":
                        intent = new Intent(mcontext, MsofficeActivity.class);
                        intent.putExtra("Title", mdata.get(i).getTitle());
                        intent.putExtra("Thumbnail", mdata.get(i).getThumbnail());
                        mcontext.startActivity(intent);
                        break;

                    case "Adobe":
                        intent = new Intent(mcontext, AdobeActivity.class);
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
        CardView cardView;

        public MyAdapterView(@NonNull View itemView) {
            super(itemView);
            tv_book_title=itemView.findViewById(R.id.book_title_id);
            img_book_thumbnail=itemView.findViewById(R.id.book_img_id);
            cardView=itemView.findViewById(R.id.cardview_id);


        }
    }
}
