package com.example.smartresto;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;


//Menu adapter for custom display menu items.
public class MenuAdapter extends ArrayAdapter<Menu> {

    public MenuAdapter(Context context, List<Menu> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.custom_menu, parent, false
            );
        }
        Menu currentMenu = getItem(position);

        TextView baslik = (TextView) listItemView.findViewById(R.id.menu_name);
        baslik.setText(currentMenu.getBaslik());

        RelativeLayout bg = (RelativeLayout) listItemView.findViewById(R.id.label);
        bg.setBackgroundResource(currentMenu.getImage());

        return listItemView;
    }
}
