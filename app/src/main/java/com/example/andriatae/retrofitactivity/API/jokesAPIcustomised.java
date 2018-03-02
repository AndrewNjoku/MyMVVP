package com.example.andriatae.retrofitactivity.API;

import com.example.andriatae.retrofitactivity.POJO.Joke;

import java.util.Observable;

import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Andria TAE on 02/03/2018.
 */

public interface jokesAPIcustomised {

    @GET("?firstName={firstName}&amp;lastName={lastName}")

    io.reactivex.Observable<Joke> myCustomJoke(@Path("firstName") String userFirst, @Path("lastName")String userLast);
}
