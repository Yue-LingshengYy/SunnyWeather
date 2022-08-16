package com.example.sunnyweather.logic.network

import com.example.sunnyweather.SunnyWeatherApplication
import com.example.sunnyweather.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PlaceService {
    /*实时天气数据
实时天气数据 API:  https://api.caiyunapp.com/v2.5/{Token}/{经度, 纬度}/realtime.json
示范 URL:  https://api.caiyunapp.com/v2.5/BhJGJ6xjaulmlMea/121.6544,25.1552/realtime.json
定制返回值的实时天气数据 API:  https://api.caiyunapp.com/v2.5/{Token}/{经度, 纬度}/realtime.jsonp?callback=MYCALLBACK
示范 URL:  https://api.caiyunapp.com/v2.5/BhJGJ6xjaulmlMea/121.6544,25.1552/realtime.jsonp?callback=MYCALLBACK
天气预报数据
天气预报数据 API:  https://api.caiyunapp.com/v2.5/{Token}/{经度, 纬度}/weather.json
示范 URL:  https://api.caiyunapp.com/v2.5/BhJGJ6xjaulmlMea/121.6544,25.1552/forecast.json
定制返回值的天气预报数据 API:  https://api.caiyunapp.com/v2.5/{Token}/{经度, 纬度}/weather.jsonp?callback=MYCALLBACK
示范 URL:  https://api.caiyunapp.com/v2.5/BhJGJ6xjaulmlMea/121.6544,25.1552/weather.jsonp?callback=MYCALLBACK*/
    @GET("v2.5/place?token=${SunnyWeatherApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query") query: String): Call<PlaceResponse>
}