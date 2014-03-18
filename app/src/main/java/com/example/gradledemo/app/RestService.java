package com.example.gradledemo.app;

import android.content.Context;

import com.example.gradledemo.app.model.Reddit;

import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

/**
 * Created by miken on 3/18/14.
 */
public class RestService {
    private RestTemplate restTemplate;
    private String url;
    private Context context;

    public Reddit getPosts() {
        url = context.getString(R.string.restURL) + BuildConfig.NUMBER_OF_POSTS;
        return restTemplate.getForObject(url, Reddit.class);
    }


    public void setupRestClient(Context c) {
        context=c;
        restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
    }
}
