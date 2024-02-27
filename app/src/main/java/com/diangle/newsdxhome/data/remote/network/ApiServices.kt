package com.diangle.newsdxhome.data.remote.network

import com.diangle.newsdxhome.data.remote.response.OnBoarding
import retrofit2.http.GET

interface ApiServices {

   @GET("onboarding")
   suspend fun getOnboarding(): OnBoarding
}