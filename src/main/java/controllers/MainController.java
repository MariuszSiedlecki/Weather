package controllers;

import models.LoadWeather;
import models.dto.WeatherDto;
import view.MenuView;

public class MainController {

    private MenuView menuView;
    private LoadWeather loadWeather;

    public MainController() {
        menuView = new MenuView();
        loadWeather = new LoadWeather();
    }

    public void startApp() {
        do {
            getWeather(menuView.getCity());
        } while ( true );
    }

    private void getWeather(String city) {
        WeatherDto weatherDto = loadWeather.loadWeatherFor(city);
        menuView.printWeather(weatherDto);
    }
}
