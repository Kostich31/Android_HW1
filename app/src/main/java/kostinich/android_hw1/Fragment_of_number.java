package kostinich.android_hw1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class Fragment_of_number extends Fragment {

    private String num;
    private int color;

    public Fragment_of_number(){}

    public void SetArguments(String num, int color) {
        this.num = num;
        this.color = color;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

            View view = inflater.inflate(R.layout.fragment_of_number, container, false);
            TextView number_from_rv = view.findViewById(R.id.number);
            number_from_rv.setText(num);
            number_from_rv.setTextColor(color);
            return view;

    }
}
