/*
   For step-by-step instructions on connecting your Android application to this backend module,
   see "App Engine Java Endpoints Module" template documentation at
   https://github.com/GoogleCloudPlatform/gradle-appengine-templates/tree/master/HelloEndpoints
*/

package com.example.moataz.myapplication.backend;

import com.example.MyJJokes;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import javax.inject.Named;

/** An endpoint class we are exposing */
@Api(
  name = "myApi",
  version = "v1",
  namespace = @ApiNamespace(
    ownerDomain = "backend.myapplication.moataz.example.com",
    ownerName = "backend.myapplication.moataz.example.com",
    packagePath=""
  )
)
public class MyEndpoint {


    @ApiMethod(name = "tellJoke")
    public MyBean tellJoke(){
        MyJJokes jJokes = new MyJJokes();
        MyBean response = new MyBean();
        response.setData(jJokes.getJoke());
        return response;
    }

}
