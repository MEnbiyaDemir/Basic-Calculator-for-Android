package com.enbiya.demir.basiccalculator10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button bol,carp,topla,cikar,esit;
    ImageView one,two,three,four,five,six,seven,eight,nine,zero;
    EditText screen;
    TextView textsonuc;

    String x;
    String y;
    int calc=0; //1=+ 2=- 3=/ 4=*
    int sonuc;

   // x=Double.parseDouble(String.valueOf(dizi));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textsonuc =(TextView) findViewById(R.id.textsonuc);
        screen = (EditText) findViewById(R.id.screen);
        bol = (Button) findViewById(R.id.bol);
        esit = (Button) findViewById(R.id.esit);
        carp = (Button) findViewById(R.id.carp);
        topla = (Button) findViewById(R.id.topla);
        cikar = (Button) findViewById(R.id.cikar);
        one = (ImageView) findViewById(R.id.one);
        two = (ImageView) findViewById(R.id.two);
        three = (ImageView) findViewById(R.id.three);
        four = (ImageView) findViewById(R.id.four);
        five = (ImageView) findViewById(R.id.five);
        six = (ImageView) findViewById(R.id.six);
        seven = (ImageView) findViewById(R.id.seven);
        eight = (ImageView) findViewById(R.id.eight);
        nine = (ImageView) findViewById(R.id.nine);
        zero = (ImageView) findViewById(R.id.zero);



            one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.append("1");


            }
        });

         two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.append("2");


            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.append("3");

            }
        });

         four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.append("4");


            }
        });

         five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.append("5");



            }
        });

         six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.append("6");



            }
        });

          seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.append("7");

            }
        });

         eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.append("8");


            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.append("9");


            }
        });

         zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.append("0");


            }
        });

              //phase 1


        try {
                topla.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        screen.append("+");
                        x=(screen.getText().toString());
                        screen.setText("");
                        int calc=1;

                    }
                });
        }catch (Exception c){}finally {}

        try {
            cikar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    screen.append("-");
                    x=(screen.getText().toString());
                    screen.setText("");
                    int calc=2;

                }
            });
        }catch(Exception exception){}finally{}

        try {
            bol.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    screen.append("/");
                    x=(screen.getText().toString());
                    screen.setText("");
                    int calc=3;
                }
            });
        }catch (Exception exception){}finally {

        }

       try {
           carp.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   screen.append("*");
                   x=(screen.getText().toString());
                   screen.setText("");
                   int calc=4;
               }
           });
       }catch (Exception exception){}finally {

       }


// esittir fonk

        esit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                y=(screen.getText().toString());

               int first=Integer.valueOf(x);
               int second=Integer.valueOf(y);

               switch (calc){
                   case 1:sonuc=first+second;
                   break;
                   case 2:sonuc=first-second;
                   break;
                   case 3:sonuc=first/second;
                   break;
                   case 4:sonuc=first*second;
                   break;
               }

                textsonuc.setText("="+sonuc);


            }
        });



    }





    @Override
    public void onClick(View view) {

    }
}