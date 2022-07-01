package com.example.diogo.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.content.res.XmlResourceParser;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;



public class LoginActivity extends AppCompatActivity {

    RelativeLayout ccc;

    public  String username;
    public  String password;

    public boolean userCorrect;
    public boolean passwordCorrect;

    private EditText etUsername;
    private EditText etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ccc = (RelativeLayout) findViewById(R.id.RelativeLayout);



        //Files location(in this case only user_1 is opened)
       final XmlResourceParser parser = getResources().getXml(R.xml.user_1);


        userCorrect = false;
        passwordCorrect = false;
        etUsername = (EditText) findViewById(R.id.etUsername);
        etPassword = (EditText) findViewById(R.id.etPassword);

        final Button bLogin = (Button) findViewById(R.id.bLogin);

        final TextView tvRegisterLink = (TextView) findViewById(R.id.tvRegister);


        tvRegisterLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(LoginActivity.this, RegisterActivity.class);
                LoginActivity.this.startActivity(registerIntent);
            }
        });


        //botao login listener
        bLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    processData(parser);
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (XmlPullParserException e) {
                    e.printStackTrace();
                }

            }
        });





    }


    private void processData(XmlResourceParser parser) throws IOException, XmlPullParserException {
        int eventType = -1;



        while(eventType != XmlResourceParser.END_DOCUMENT) {

            if(eventType == XmlResourceParser.START_TAG) {
                String locationValue = parser.getName();


               //Log.e("LocationValue:" , locationValue);

                if(locationValue.equals("username")) {
                    parser.next();
                    username = parser.getText();

                    if(username.equals(etUsername.getText().toString())){
                        userCorrect=true;


                    }
               }

                if(locationValue.equals("password")){

                    parser.next();
                    password = parser.getText();

                    if(password.equals(etPassword.getText().toString())){
                        passwordCorrect=true;

                    }
                }





               if(userCorrect && passwordCorrect ){


                   Intent LoginIntent = new Intent(LoginActivity.this, UserAreaActivity.class);
                   LoginActivity.this.startActivity(LoginIntent);

               }else{

                   //LOGIN INCORRECTO
               }


            }
            eventType = parser.next();

        }
        }


        private boolean isEmpty(EditText etText) {
            if(etText.getText().toString().trim().length()>0) {
                return false;
            }else {
                return true;
            }
        }




  }














