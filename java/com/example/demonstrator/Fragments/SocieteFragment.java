package com.example.oi_leprogrammedelavalise.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.oi_leprogrammedelavalise.PopUps.Societe.AccompagnementPopUp;
import com.example.oi_leprogrammedelavalise.PopUps.Societe.CommunicantPopUp;
import com.example.oi_leprogrammedelavalise.PopUps.Societe.EspritIndustrielPopUp;
import com.example.oi_leprogrammedelavalise.PopUps.Societe.FormatModulairePopUp;
import com.example.oi_leprogrammedelavalise.PopUps.Societe.OpenSourcePopUp;
import com.example.oi_leprogrammedelavalise.R;

public class SocieteFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_societe, container, false);

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        View openSourceClickZone = getView().findViewById(R.id.openSourceClickZone);
        openSourceClickZone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), OpenSourcePopUp.class));
            }
        });

        View espIndusTextView = getView().findViewById(R.id.espIndusClickZone);
        espIndusTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), EspritIndustrielPopUp.class));
            }
        });

        View formatModTextView = getView().findViewById(R.id.formatModClickZone);
        formatModTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), FormatModulairePopUp.class));
            }
        });

        View comTextView = getView().findViewById(R.id.communicantClickZone);
        comTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), CommunicantPopUp.class));
            }
        });

        View accTextView = getView().findViewById(R.id.accompagnementClickZone);
        accTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), AccompagnementPopUp.class));
            }
        });

    }
}
