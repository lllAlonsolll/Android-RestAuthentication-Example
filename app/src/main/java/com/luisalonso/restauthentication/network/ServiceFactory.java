package com.luisalonso.restauthentication.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Luis Alonso Paulino Flores <alonsopf1@gmail.com>
 */
public class ServiceFactory {

    public static <T> T retrofitService(final Class<T> tClass) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ApiConstants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(tClass);
    }
}
