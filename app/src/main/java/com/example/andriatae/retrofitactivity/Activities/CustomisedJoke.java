package com.example.andriatae.retrofitactivity.Activities;

import android.databinding.DataBindingUtil;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.andriatae.retrofitactivity.API.jokesAPIcustomised;
import com.example.andriatae.retrofitactivity.POJO.Joke;
import com.example.andriatae.retrofitactivity.R;
import com.example.andriatae.retrofitactivity.databinding.ActivityListJokesBinding;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class CustomisedJoke extends AppCompatActivity implements ActionCallback{


    jokesAPIcustomised myService;
    ActivityListJokesBinding customisedBinding;
    Retrofit retrofit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_jokes);


        //Bindings

        customisedBinding= DataBindingUtil.setContentView(this,R.layout.activity_list_jokes);
        customisedBinding.setName(new Joke("john doe", "enter name"));
        customisedBinding.setCallback(this);
        customisedBinding.

        retrofit = new Retrofit.Builder().baseUrl("http://api.icndb.com/jokes/random")
.addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();



    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);



       // System.out.println("this is my crested joke"+myTest.getName()+myTest.getNameHint());


    }

    @Override
    public void onClick(View view){

        System.out.println("button was clicked ");
        customisedCall();







    }


    public void customisedCall(String first, String last)
    {






        myService= retrofit.create(jokesAPIcustomised.class);

        Observable<Joke>customService = myService.myCustomJoke(first,last);

        customService.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<Joke>() {
            @Override
            public void accept(Joke joke) throws Exception {

                displayJoke(joke);



            }
        });


    }
}
