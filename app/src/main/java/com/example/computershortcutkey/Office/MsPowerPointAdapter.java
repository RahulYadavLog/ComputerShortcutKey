package com.example.computershortcutkey.Office;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.computershortcutkey.R;

import java.util.List;

public class MsPowerPointAdapter extends RecyclerView.Adapter<MsPowerPointAdapter.MyAdapterView> {

    private Context mcontext;
    private List<MsPowerPointModel> mdata;

    public MsPowerPointAdapter(Context mcontext, List<MsPowerPointModel> mdata) {
        this.mcontext = mcontext;
        this.mdata = mdata;
    }

    @NonNull
    @Override
    public MyAdapterView onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view;
        LayoutInflater inflater = LayoutInflater.from(mcontext);
        view = inflater.inflate(R.layout.mspowerpoint_list, viewGroup, false);

        return new MsPowerPointAdapter.MyAdapterView(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapterView myAdapterView, int i) {

        myAdapterView.img_book_thumbnail.setAnimation(AnimationUtils.loadAnimation(mcontext,R.anim.fade_transition_animation));
        myAdapterView.cardView.setAnimation(AnimationUtils.loadAnimation(mcontext,R.anim.fade_scale_animation));
        myAdapterView.tv_book_title.setText(mdata.get(i).getTitle());

        myAdapterView.discription.setText(mdata.get(i).getDiscription());
        myAdapterView.img_book_thumbnail.setImageResource(mdata.get(i).getThumbnail());
    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }

    public class MyAdapterView extends RecyclerView.ViewHolder {
        TextView tv_book_title,discription;
        ImageView img_book_thumbnail;
        CardView cardView;

        public MyAdapterView(@NonNull View itemView) {
            super(itemView);
            tv_book_title=itemView.findViewById(R.id.text1);
            discription=itemView.findViewById(R.id.text2);
            img_book_thumbnail=itemView.findViewById(R.id.book_img);
            cardView=itemView.findViewById(R.id.cardview_id);
        }
    }
}
