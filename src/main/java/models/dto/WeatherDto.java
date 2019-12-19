package models.dto;

import com.google.gson.annotations.SerializedName;

public class WeatherDto {
    @SerializedName("main")
    private TempDto tempDto;

    @SerializedName("clouds")
    private CloudDto cloudDto;

    public TempDto getTempDto() {
        return tempDto;
    }

    public CloudDto getCloudDto() {
        return cloudDto;
    }

    public static class TempDto {
        private double temp;

        public double getTemp() {
            return temp;
        }
    }

    public static class CloudDto {
        @SerializedName("all")
        private double cloudy;

        public double getCloud() {
            return cloudy;
        }
    }
}
