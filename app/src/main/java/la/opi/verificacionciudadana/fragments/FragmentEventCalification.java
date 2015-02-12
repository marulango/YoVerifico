package la.opi.verificacionciudadana.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import la.opi.verificacionciudadana.R;

/**
 * Created by Jhordan on 10/02/15.
 */
public class FragmentEventCalification extends FragmentModel implements View.OnClickListener {

    public FragmentEventCalification() {
    }

    public static FragmentEventCalification newInstance() {

        FragmentEventCalification fragmentEventCalification = new FragmentEventCalification();
        Bundle extraArguments = new Bundle();
        fragmentEventCalification.setArguments(extraArguments);
        return fragmentEventCalification;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    private TextView btn;


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_event_calification, container, false);

        btn = (TextView) rootView.findViewById(R.id.image);

        btn.setOnClickListener(this);


        return rootView;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


    }


    @Override
    public void onClick(View v) {

        fragmentTransactionReplace(FragmentEventObservations.newInstance(), "observations");
    }

    @Override
    protected void fragmentTransactionReplace(Fragment fragmentInstance, String fragmentName) {
        super.fragmentTransactionReplace(fragmentInstance, fragmentName);
    }

}