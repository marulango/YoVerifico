package la.opi.verificacionciudadana.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import la.opi.verificacionciudadana.R;
import la.opi.verificacionciudadana.util.ConfigurationPreferences;

/**
 * Created by Jhordan on 10/02/15.
 */
public class FragmentEventObservations extends FragmentModel implements View.OnClickListener {

    public FragmentEventObservations() {
    }

    public static FragmentEventObservations newInstance() {

        FragmentEventObservations fragmentEventObservations = new FragmentEventObservations();
        Bundle extraArguments = new Bundle();
        fragmentEventObservations.setArguments(extraArguments);
        return fragmentEventObservations;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    private TextView txtContinue;
    private EditText editTxtObservations;


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_event_observation, container, false);
        ((ActionBarActivity) getActivity()).getSupportActionBar().setTitle("Agregar Observación");


        txtContinue = (TextView) rootView.findViewById(R.id.continue_observations);
        editTxtObservations = (EditText) rootView.findViewById(R.id.edit_txt_observations);

        txtContinue.setOnClickListener(this);


        return rootView;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


    }


    @Override
    public void onClick(View v) {

        ConfigurationPreferences.setObservationPreference(getActivity(), editTxtObservations.getText().toString());
        fragmentTransactionReplace(FragmentEventConfirmation.newInstance(), "confirmaciones");

    }

    @Override
    protected void fragmentTransactionReplace(Fragment fragmentInstance, String fragmentName) {
        super.fragmentTransactionReplace(fragmentInstance, fragmentName);
    }

}
