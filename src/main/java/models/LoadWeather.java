package models;

import com.google.gson.Gson;
import config.Config;
import models.dto.WeatherDto;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class LoadWeather {
    private Gson gson;

    public LoadWeather() {
        gson = new Gson();
    }

    public WeatherDto loadWeatherFor(String cityName) {
        WeatherDto weatherDto = convertJsonToCurrentWeather(readWebSite("http://api.openweathermap.org/data/2.5/weather?q="
                + cityName
                + "&appid="
                + Config.API_KEY));
        return weatherDto;
    }

    private String readWebSite(String url) {
        StringBuilder content = new StringBuilder();

        try {
            HttpURLConnection http = (HttpURLConnection) new URL(url).openConnection();
            InputStream inputStream = http.getInputStream();

            int data;
            while ( (data = inputStream.read()) != -1 ) {
                content.append((char) data);
            }
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }

    private WeatherDto convertJsonToCurrentWeather(String json) {
        return gson.fromJson(json, WeatherDto.class);
    }
}
