package models.dto;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ForecastWeatherDto {
    @SerializedName("list")
    private List<WeatherDto> forecastWeatherList;

    public List<WeatherDto> getForecastWeatherList() {
        return forecastWeatherList;
    }
}
