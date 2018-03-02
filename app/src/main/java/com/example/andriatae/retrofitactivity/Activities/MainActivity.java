package com.example.andriatae.retrofitactivity.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.andriatae.retrofitactivity.R;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

/*
        Retrofit retrofit = new Retrofit.Builder().baseUrl("http://api.icndb.com/jokes/jokenumber").build();


        retrofitInterface service = retrofit.create(retrofitInterface.class);

        Call<ResponseBody> serviceJson = service.getJson();

        serviceJson.enqueue(new Callback<ResponseBody>() {

                @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                if (response.isSuccessful()) {

                    ResponseBody body = response.body();


                    BufferedReader reader = new BufferedReader(new InputStreamReader(body.byteStream()));

                    
                    StringBuffer jsonBuffer = new StringBuffer();


                    String line;



                    try {


                        while ((line = reader.readLine()) != null) {

                            jsonBuffer.append(line);
                        }

                        printMessage(jsonBuffer.toString());

                    } catch (IOException e) {
                        e.printStackTrace();

                    }

                }
                    else {
                    printMessage("unsuccessful");
                }

            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable throwable) {
                printMessage(throwable.getMessage());
            }
        });

    }

    private void printMessage(String message) {
        System.out.println(message);
    }

    */
}
