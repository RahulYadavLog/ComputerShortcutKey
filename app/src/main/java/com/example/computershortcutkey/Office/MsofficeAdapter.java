package com.example.computershortcutkey.Office;

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

public class MsofficeAdapter extends RecyclerView.Adapter<MsofficeAdapter.MyAdapterView> {


    private Context mcontext;
    private List<Msofficemodel> mdata;

    public MsofficeAdapter(Context mcontext, List<Msofficemodel> mdata) {
        this.mcontext = mcontext;
        this.mdata = mdata;
    }

    @NonNull
    @Override
    public MyAdapterView onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view;
        LayoutInflater inflater=LayoutInflater.from(mcontext);
        view=inflater.inflate(R.layout.msoffice_list,viewGroup,false);

        return new MsofficeAdapter.MyAdapterView(view);
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
                    case "MS Dos":
                        intent = new Intent(mcontext, MsDosActivity.class);
                        intent.putExtra("Title", mdata.get(i).getTitle());
                        intent.putExtra("Thumbnail", mdata.get(i).getThumbnail());
                        mcontext.startActivity(intent);
                        break;

                    case "MS Excel":
                        intent = new Intent(mcontext, MsExcelActivity.class);
                        intent.putExtra("Title", mdata.get(i).getTitle());
                        intent.putExtra("Thumbnail", mdata.get(i).getThumbnail());
                        mcontext.startActivity(intent);
                        break;

                    case "MS Word":
                        intent = new Intent(mcontext, MsWordActivity.class);
                        intent.putExtra("Title", mdata.get(i).getTitle());
                        intent.putExtra("Thumbnail", mdata.get(i).getThumbnail());
                        mcontext.startActivity(intent);
                        break;


                    case "MS Paint":
                        intent = new Intent(mcontext, MsPaintActivity.class);
                        intent.putExtra("Title", mdata.get(i).getTitle());
                        intent.putExtra("Thumbnail", mdata.get(i).getThumbnail());
                        mcontext.startActivity(intent);
                        break;

                    case "MS Access":
                        intent = new Intent(mcontext, MsAccessActivity.class);
                        intent.putExtra("Title", mdata.get(i).getTitle());
                        intent.putExtra("Thumbnail", mdata.get(i).getThumbnail());
                        mcontext.startActivity(intent);
                        break;

                    case "MS Power Point":
                        intent = new Intent(mcontext, MsPowerPointActivity.class);
                        intent.putExtra("Title", mdata.get(i).getTitle());
                        intent.putExtra("Thumbnail", mdata.get(i).getThumbnail());
                        mcontext.startActivity(intent);
                        break;

                    case "MS Outlook":
                        intent = new Intent(mcontext, MsOutLookActivity.class);
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
