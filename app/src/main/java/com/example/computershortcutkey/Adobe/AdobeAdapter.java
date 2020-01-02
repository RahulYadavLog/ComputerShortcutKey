package com.example.computershortcutkey.Adobe;

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

import com.example.computershortcutkey.Office.MsAccessActivity;
import com.example.computershortcutkey.Office.MsDosActivity;
import com.example.computershortcutkey.Office.MsExcelActivity;
import com.example.computershortcutkey.Office.MsOutLookActivity;
import com.example.computershortcutkey.Office.MsPaintActivity;
import com.example.computershortcutkey.Office.MsPowerPointActivity;
import com.example.computershortcutkey.Office.MsWordActivity;
import com.example.computershortcutkey.R;

import java.util.List;

public class AdobeAdapter extends RecyclerView.Adapter<AdobeAdapter.MyAdapterView> {

    private Context mcontext;
    private List<Adobemodel> mdata;

    public AdobeAdapter(Context mcontext, List<Adobemodel> mdata) {
        this.mcontext = mcontext;
        this.mdata = mdata;
    }

    @NonNull
    @Override
    public MyAdapterView onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view;
        LayoutInflater inflater=LayoutInflater.from(mcontext);
        view=inflater.inflate(R.layout.browser_list,viewGroup,false);

        return new AdobeAdapter.MyAdapterView(view);
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
                    case "Adobe Photoshop":
                        intent = new Intent(mcontext, PhotoshopActivity.class);
                        intent.putExtra("Title", mdata.get(i).getTitle());
                        intent.putExtra("Thumbnail", mdata.get(i).getThumbnail());
                        mcontext.startActivity(intent);
                        break;

                    case "Illustrator MAc OS":
                        intent = new Intent(mcontext, IllustratorMacActivity.class);
                        intent.putExtra("Title", mdata.get(i).getTitle());
                        intent.putExtra("Thumbnail", mdata.get(i).getThumbnail());
                        mcontext.startActivity(intent);
                        break;

                    case "Photoshop MAC OS":
                        intent = new Intent(mcontext, MacPhotoshopActivity.class);
                        intent.putExtra("Title", mdata.get(i).getTitle());
                        intent.putExtra("Thumbnail", mdata.get(i).getThumbnail());
                        mcontext.startActivity(intent);
                        break;


                    case "Illustrator":
                        intent = new Intent(mcontext, IllustratorActivity.class);
                        intent.putExtra("Title", mdata.get(i).getTitle());
                        intent.putExtra("Thumbnail", mdata.get(i).getThumbnail());
                        mcontext.startActivity(intent);
                        break;

                    case "Adobe Dream Weaver":
                        intent = new Intent(mcontext, DreamWeaverActivity.class);
                        intent.putExtra("Title", mdata.get(i).getTitle());
                        intent.putExtra("Thumbnail", mdata.get(i).getThumbnail());
                        mcontext.startActivity(intent);
                        break;

                    case "Adobe Flash":
                        intent = new Intent(mcontext, FlashActivity.class);
                        intent.putExtra("Title", mdata.get(i).getTitle());
                        intent.putExtra("Thumbnail", mdata.get(i).getThumbnail());
                        mcontext.startActivity(intent);
                        break;

                    case "Adobe Corel Draw":
                        intent = new Intent(mcontext, CorelDrawActivity.class);
                        intent.putExtra("Title", mdata.get(i).getTitle());
                        intent.putExtra("Thumbnail", mdata.get(i).getThumbnail());
                        mcontext.startActivity(intent);
                        break;


                    case "Adobe Page Maker":
                        intent = new Intent(mcontext, PageMakerActivity.class);
                        intent.putExtra("Title", mdata.get(i).getTitle());
                        intent.putExtra("Thumbnail", mdata.get(i).getThumbnail());
                        mcontext.startActivity(intent);
                        break;

                    case "Color Code":
                        intent = new Intent(mcontext, ColorCodeActivity.class);
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

    public class MyAdapterView extends RecyclerView.ViewHolder {
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
