package BottomNavigation;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.lmh.mytraveldairyjava.R;

import BottomNavigation.PostNewMain;
import PostFolder.PostNew;

/**
 * A simple {@link Fragment} subclass.
 */
public class BottomNavPhoto extends Fragment  {


    public BottomNavPhoto() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        TextView textView = new TextView(getActivity());
        textView.setText(R.string.hello_blank_fragment);
        return textView;
    }


}

