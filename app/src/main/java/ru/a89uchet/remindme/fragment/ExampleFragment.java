package ru.a89uchet.remindme.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ru.a89uchet.remindme.R;

/**
 * Created by aleks on 20.05.17.
 */

public class ExampleFragment extends Fragment{
    private  static final int LAYOUT= R.layout.example_fragment;
    private View view;

    public static ExampleFragment getInstance() {
        Bundle args = new Bundle();
        ExampleFragment exampleFragment = new ExampleFragment();
        exampleFragment.setArguments(args);

        return exampleFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT,container,false);

        return view;
    }
}
