package com.example.navigation;

import android.app.AppComponentFactory;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.app.Activity;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Calculadora.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Calculadora#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Calculadora extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    Button n1,n2,n3,n4,n5,n6,n7,n8,n9,n0;
    EditText tResultado;
    Button punto,suma,resta,multiplicacion,division,limpiar,igual;
    Double numero1,numero2,resultadoT;
    int operacion;

    private OnFragmentInteractionListener mListener;

    public Calculadora() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Calculadora.
     */
    // TODO: Rename and change types and number of parameters
    public static Calculadora newInstance(String param1, String param2) {
        Calculadora fragment = new Calculadora();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
        //return inflater.inflate(R.layout.fragment_calculadora, container, false);

        tResultado=(EditText)getView().findViewById(R.id.Resultado);

        n1=(Button)getView().findViewById(R.id.btn1);
        n2=(Button)getView().findViewById(R.id.btn2);
        n3=(Button)getView().findViewById(R.id.btn3);
        n4=(Button)getView().findViewById(R.id.btn4);
        n5=(Button)getView().findViewById(R.id.btn5);
        n6=(Button)getView().findViewById(R.id.btn6);
        n7=(Button)getView().findViewById(R.id.btn7);
        n8=(Button)getView().findViewById(R.id.btn8);
        n9=(Button)getView().findViewById(R.id.btn9);
        n0=(Button)getView().findViewById(R.id.btn0);

        punto=(Button)getView().findViewById(R.id.btnPunto);
        suma=(Button)getView().findViewById(R.id.btnSuma);
        resta=(Button)getView().findViewById(R.id.btnResta);
        multiplicacion=(Button)getView().findViewById(R.id.btnMul);
        division=(Button)getView().findViewById(R.id.btnDivision);
        limpiar=(Button)getView().findViewById(R.id.Limpiar);
        igual=(Button)getView().findViewById(R.id.btnIgual);

        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n=tResultado.getText().toString();
                n=n+"1";
                tResultado.setText(n);
            }
        });

        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n=tResultado.getText().toString();
                n=n+"2";
                tResultado.setText(n);
            }
        });

        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n=tResultado.getText().toString();
                n=n+"3";
                tResultado.setText(n);
            }
        });

        n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n=tResultado.getText().toString();
                n=n+"4";
                tResultado.setText(n);
            }
        });

        n5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n=tResultado.getText().toString();
                n=n+"5";
                tResultado.setText(n);
            }
        });

        n6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n=tResultado.getText().toString();
                n=n+"6";
                tResultado.setText(n);
            }
        });

        n7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n=tResultado.getText().toString();
                n=n+"7";
                tResultado.setText(n);
            }
        });

        n8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n=tResultado.getText().toString();
                n=n+"8";
                tResultado.setText(n);
            }
        });

        n9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n=tResultado.getText().toString();
                n=n+"9";
                tResultado.setText(n);
            }
        });

        n0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n=tResultado.getText().toString();
                n=n+"0";
                tResultado.setText(n);
            }
        });

        punto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n=tResultado.getText().toString();
                n=n+".";
                tResultado.setText(n);
                if (tResultado.getText().toString().contains(".")){
                    punto.setEnabled(false);
                }
                else{
                    punto.setEnabled(true);
                }
            }
        });

        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*try {

                }catch (NumberFormatException nfe){

                }*/
                String aux1=tResultado.getText().toString();
                numero1=Double.parseDouble(aux1);
                tResultado.setText("");
                punto.setEnabled(true);
                operacion=1;

            }
        });

        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aux1=tResultado.getText().toString();
                numero1=Double.parseDouble(aux1);
                tResultado.setText("");
                punto.setEnabled(true);
                operacion=2;

            }
        });

        multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aux1=tResultado.getText().toString();
                numero1=Double.parseDouble(aux1);
                tResultado.setText("");
                punto.setEnabled(true);
                operacion=3;

            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aux1=tResultado.getText().toString();
                numero1=Double.parseDouble(aux1);
                tResultado.setText("");
                punto.setEnabled(true);
                operacion=4;

            }
        });

        limpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tResultado.setText("");
                numero1=0.0;
                numero2=0.0;
                resultadoT=0.0;
                punto.setEnabled(true);
            }
        });

        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String aux2=tResultado.getText().toString();
                numero2=Double.parseDouble(aux2);
                tResultado.setText("");
                punto.setEnabled(false);

                if(operacion==1){
                    resultadoT=numero1+numero2;
                }else if(operacion==2){
                    resultadoT=numero1-numero2;
                }else if(operacion==3){
                    resultadoT=numero1*numero2;
                }else if(operacion==4){
                    if(numero2==0.0){
                        tResultado.setText("error");
                    }
                    else{
                        resultadoT=numero1/numero2;
                    }

                }

                tResultado.setText(""+resultadoT);
                numero1=resultadoT;
            }
        });

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_calculadora, container, false);
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }


}
