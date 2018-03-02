package com.example.andriatae.retrofitactivity.ViewModel;

import android.databinding.Bindable;

import com.example.andriatae.retrofitactivity.Activities.CustomisedJoke;
import com.example.andriatae.retrofitactivity.Activities.MainActivity;
import com.example.andriatae.retrofitactivity.POJO.Joke;

/**
 * Created by Andria TAE on 02/03/2018.
 */

public class ViewModel implements View{

    String name;

    CustomisedJoke myActivity;

    MainActivity myActivityMain;


    @Override
    public void displayJokes(Joke joke){


    }

    @Bindable
    @Override
    public void getName(String name) {

        this.name=name;

    }






}
