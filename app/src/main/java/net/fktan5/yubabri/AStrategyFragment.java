package net.fktan5.yubabri;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by tan5 on 14/11/05.
 */
public class AStrategyFragment extends Fragment implements View.OnClickListener {
    public AStrategyFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_astrategy, container, false);
        view.setOnClickListener(this);
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onClick(View v) {
        Log.d("DEBUG", "ID" + v.getId());
    }
}
