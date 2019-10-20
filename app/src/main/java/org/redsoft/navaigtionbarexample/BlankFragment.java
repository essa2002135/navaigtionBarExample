package org.redsoft.navaigtionbarexample;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {


    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank, container, false);
        ListView listView = (ListView) view.findViewById(R.id.thelestvieww);



        customAdabter theCustomAdabter = new customAdabter();

        listView.setAdapter(theCustomAdabter);


        return  view;

    }





    class customAdabter extends BaseAdapter
    {

        @Override
        public int getCount() {
            //return thetitle.size();

            return 10;

        }
        @Override
        public Object getItem(int position) {


            return null;
        }

        @Override
        public long getItemId(int position) {

            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view = getLayoutInflater().inflate(R.layout.custom_list,null);
            Log.i("ENTERNOW","RUNNNNN");


            return view;
        }

    }

}
