package la.opi.verificacionciudadana.adapters;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import la.opi.verificacionciudadana.R;
import la.opi.verificacionciudadana.models.ImageEvidence;

/**
 * Created by Jhordan on 01/03/15.
 */
public class EvidencesImagesAdapter extends ArrayAdapter<ImageEvidence> {

    ArrayList<ImageEvidence> evidencesArrayList;
    LayoutInflater layoutInflater;

    public EvidencesImagesAdapter(Context context, ArrayList<ImageEvidence> evidencesArrayList) {

        super(context, -1, evidencesArrayList);
        this.evidencesArrayList = evidencesArrayList;
        layoutInflater = LayoutInflater.from(context);

    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final ViewHolder holder;
        final ImageEvidence evidence = getItem(position);
        int layout = R.layout.grid_item;

        if (convertView == null) {

            convertView = layoutInflater.inflate(layout, null);
            holder = new ViewHolder();
            holder.imageEvidencePath = (ImageView) convertView.findViewById(R.id.image_evidence);
            holder.txtTitlePath = (TextView) convertView.findViewById(R.id.text_title);

            convertView.setTag(holder);

        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.txtTitlePath.setText(evidence.getTitle());

       Picasso.with(getContext()).load(evidence.getEvidence())
              .into(holder.imageEvidencePath);
      holder.imageEvidencePath.setImageBitmap(avatarConvertBitmap(evidence.getEvidence()));


        return convertView;
    }

    private Bitmap avatarConvertBitmap(String path) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        Bitmap bitmapAvatar = BitmapFactory.decodeFile(path, options);
        return bitmapAvatar;
    }

    public static class ViewHolder {
        TextView txtTitlePath;
        ImageView imageEvidencePath;
    }
}
