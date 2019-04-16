package com.example.oi_leprogrammedelavalise.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.oi_leprogrammedelavalise.PopUps.Produits.p1PopUp;
import com.example.oi_leprogrammedelavalise.PopUps.Produits.p2PopUp;
import com.example.oi_leprogrammedelavalise.PopUps.Produits.p3PopUp;
import com.example.oi_leprogrammedelavalise.PopUps.Produits.p4PopUp;
import com.example.oi_leprogrammedelavalise.PopUps.Produits.p5PopUp;
import com.example.oi_leprogrammedelavalise.PopUps.Produits.p6PopUp;
import com.example.oi_leprogrammedelavalise.PopUps.Produits.p7PopUp;
import com.example.oi_leprogrammedelavalise.PopUps.Produits.p8PopUp;
import com.example.oi_leprogrammedelavalise.PopUps.Produits.p9PopUp;
import com.example.oi_leprogrammedelavalise.PopUps.Produits.p10PopUp;
import com.example.oi_leprogrammedelavalise.PopUps.Produits.p11PopUp;
import com.example.oi_leprogrammedelavalise.PopUps.Produits.p12PopUp;
import com.example.oi_leprogrammedelavalise.PopUps.Produits.p13PopUp;
import com.example.oi_leprogrammedelavalise.PopUps.Produits.p14PopUp;
import com.example.oi_leprogrammedelavalise.PopUps.Produits.p15PopUp;
import com.example.oi_leprogrammedelavalise.PopUps.Produits.p16PopUp;
import com.example.oi_leprogrammedelavalise.R;

public class ProduitsFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_produits, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        View p1View = getView().findViewById(R.id.p1);
        coreLiteView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), p1.class));
            }
        });

        View p2View = getView().findViewById(R.id.p2);
        p2View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), p2PopUp.class));
            }
        });

        View p3View = getView().findViewById(R.id.p3);
        p3View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), p3PopUp.class));
            }
        });

        View p4View = getView().findViewById(R.id.p4);
        p4View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), p4PopUp.class));
            }
        });

        View p5View = getView().findViewById(R.id.p5);
        p5View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), p5PopUp.class));
            }
        });

        View p6View = getView().findViewById(R.id.p6);
        p6View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), p6PopUp.class));
            }
        });

        View p7View = getView().findViewById(R.id.p7);
        p7View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), p7PopUp.class));
            }
        });

        View p8View = getView().findViewById(R.id.p8);
        p8View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), p8PopUp.class));
            }
        });

        View p9View = getView().findViewById(R.id.p9);
        p9View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), p9PopUp.class));
            }
        });

        View p10View = getView().findViewById(R.id.p10);
        p10View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), p10PopUp.class));
            }
        });

        View p11View = getView().findViewById(R.id.p11);
        p11View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), p11PopUp.class));
            }
        });

        View p12View = getView().findViewById(R.id.p12);
        p12View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), p12PopUp.class));
            }
        });

        View p13View = getView().findViewById(R.id.p13);
        p13View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), p13PopUp.class));
            }
        });

        View p14View = getView().findViewById(R.id.p14);
        p14View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), p14PopUp.class));
            }
        });

        View p15View = getView().findViewById(R.id.p15);
        p15View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), p15PopUp.class));
            }
        });

        View p16View = getView().findViewById(R.id.p16);
        p16View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), p16PopUp.class));
            }
        });
    }
}
