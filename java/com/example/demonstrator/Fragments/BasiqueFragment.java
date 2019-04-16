package com.example.oi_leprogrammedelavalise.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.example.oi_leprogrammedelavalise.R;

public class BasiqueFragment extends Fragment {

    private ImageView rightMirror;

    private ImageView ecrou;
    private float x_ecrou;
    private final float X_ECROU_MIN = 468;
    private final float X_ECROU_MAX = 1158;

    private RelativeLayout faisceauTouchZone;
    private ImageView faisceau;
    private float x_faisceau;

    private ImageView bouton_oi;
    private boolean bouton_oi_on = false;
    private ImageView bouton_led;
    private boolean bouton_led_on = false;
    private ImageView led_bleue;
    private boolean led_bleue_on = false;
    private ImageView led_rouge;
    private boolean led_rouge_on = false;
    private ImageView led_verte;
    private boolean led_verte_on = false;
    private ImageView boi11;
    private boolean boi11_on = false;
    private ImageView boi12;
    private boolean boi12_on = false;
    private ImageView boi13;
    private boolean boi13_on = false;
    private ImageView boi23;
    private boolean boi23_on = false;

    private RelativeLayout joystickTouchZone;
    private ImageView joystick;
    private float x_joystick;
    private float y_joystick;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_basique, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        rightMirror = getView().findViewById(R.id.right_mirror);
        rightMirror.setRotation(180);

        //Gestion du toucher et du mouvement du joystick
        joystick = getView().findViewById(R.id.joystick);
        joystickTouchZone = getView().findViewById(R.id.joystick_touch_zone);
        joystickTouchZone.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                x_joystick = event.getX();
                y_joystick = event.getY();

                switch (event.getAction()){
                    case MotionEvent.ACTION_MOVE:

                        if (x_joystick <= 33){
                            if (y_joystick <= 33){
                                joystick.setImageResource(R.drawable.ic_joystick_no);

                                // Whatever needs to happen...

                            } else if (y_joystick <= 67){
                                joystick.setImageResource(R.drawable.ic_joystick_o);

                                // Whatever needs to happen...

                            } else {
                                joystick.setImageResource(R.drawable.ic_joystick_so);

                                // Whatever needs to happen...

                            }
                        } else if (x_joystick <= 67){
                            if (y_joystick <= 33){
                                joystick.setImageResource(R.drawable.ic_joystick_n);

                                // Whatever needs to happen...

                            } else if (y_joystick <= 67){

                                joystick.setImageResource(R.drawable.ic_joystick);

                            } else {
                                joystick.setImageResource(R.drawable.ic_joystick_s);

                                // Whatever needs to happen...

                            }
                        } else {
                            if (y_joystick <= 33){
                                joystick.setImageResource(R.drawable.ic_joystick_ne);

                                // Whatever needs to happen...

                            } else if (y_joystick <= 67){
                                joystick.setImageResource(R.drawable.ic_joystick_e);

                                // Whatever needs to happen...

                            } else {
                                joystick.setImageResource(R.drawable.ic_joystick_se);

                                // Whatever needs to happen...

                            }
                        }

                        break;

                    case MotionEvent.ACTION_UP:
                        joystick.setImageResource(R.drawable.ic_joystick);

                        break;

                }
                return true;
            }
        });

        led_bleue = getView().findViewById(R.id.led_bleue);
        led_bleue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!led_bleue_on){

                    led_bleue.setImageResource(R.drawable.ic_ledbleue_etat2);
                    led_bleue_on = true;
                } else {

                    led_bleue.setImageResource(R.drawable.ic_ledbleue);
                    led_bleue_on = false;
                }
            }
        });

        led_rouge = getView().findViewById(R.id.led_rouge);
        led_rouge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!led_rouge_on){

                    led_rouge.setImageResource(R.drawable.ic_ledrouge_etat2);
                    led_rouge_on = true;
                } else {

                    led_rouge.setImageResource(R.drawable.ic_ledrouge);
                    led_rouge_on = false;
                }
            }
        });

        led_verte = getView().findViewById(R.id.led_verte);
        led_verte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!led_verte_on){

                    led_verte.setImageResource(R.drawable.ic_ledverte_etat2);
                    led_verte_on = true;
                } else {

                    led_verte.setImageResource(R.drawable.ic_ledverte);
                    led_verte_on = false;
                }
            }
        });

        boi11 = getView().findViewById(R.id.boi11);

        boi12 = getView().findViewById(R.id.boi12);

        boi13 = getView().findViewById(R.id.boi13);

        boi23 = getView().findViewById(R.id.boi23);

        //Gestion du toucher et du mouvement du bouton O/I
        bouton_oi = getView().findViewById(R.id.bouton_oi);
        bouton_oi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!bouton_oi_on) {
                    bouton_oi.setImageResource(R.drawable.ic_boutonoi_etat2);
                    bouton_oi_on = true;

                    // Whatever needs to happen...

                } else {
                    bouton_oi.setImageResource(R.drawable.ic_boutonoi);
                    bouton_oi_on = false;

                    // Whatever needs to happen...

                }
            }
        });

        bouton_led = getView().findViewById(R.id.bouton_led);
        bouton_led.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!bouton_led_on) {
                    bouton_led.setImageResource(R.drawable.ic_boutonled_etat2);
                    bouton_led_on = true;

                    // Whatever needs to happen...

                } else {
                    bouton_led.setImageResource(R.drawable.ic_boutonled);
                    bouton_led_on = false;

                    // Whatever needs to happen...

                }
            }
        });

        // Gestion du toucher et du mouvement de l'écrou
        ecrou = getView().findViewById(R.id.ecrou);
        ecrou.setOnTouchListener(new View.OnTouchListener(){

            @Override
            public boolean onTouch(View v, MotionEvent event) {

                x_ecrou = event.getRawX();
                System.out.println(x_ecrou);

                if(event.getAction() == MotionEvent.ACTION_MOVE) {

                    if (x_ecrou <= X_ECROU_MIN) {
                        x_ecrou = X_ECROU_MIN;
                    } else if (x_ecrou >= X_ECROU_MAX) {
                        x_ecrou = X_ECROU_MAX;
                    }

                    ecrou.setX(x_ecrou);
                }
                return true;
            }
        });


        /* Ci-dessous : À adapter avec la valeur renvoyée par le laser réel. Je laisse cette portion de
           code pour pouvoir faire la démo au toucher, et comprendre comment faire varier la taille du
           faisceau sur l'app. Il faudra donc faire varier sa taille non plus à la suite de la détection
           du toucher mais à la réception du paquet. Il faudra tenir compte d'un certain offset. Vous avez
           une heure. */

        faisceau = getView().findViewById(R.id.faisceau);
        final ViewGroup.LayoutParams faisceauLayoutParams = faisceau.getLayoutParams();

        faisceauTouchZone = getView().findViewById(R.id.faisceau_touch_zone);
        faisceauTouchZone.setOnTouchListener(new View.OnTouchListener(){
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                x_faisceau = (event.getX());

                if (x_faisceau >= 45 && x_faisceau <= 1040){


                    /* Les deux lignes ci-dessous permettent de régler ta taille du faisceau avec le paramètre
                       x_faisceau */

                    faisceauLayoutParams.width = ((int) x_faisceau);
                    faisceau.setLayoutParams(faisceauLayoutParams);

                }
                return true;
            }
        });
    }

}
