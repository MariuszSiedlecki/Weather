package view;

import models.dto.WeatherDto;

import java.util.Scanner;

public class MenuView {

    private Scanner scanner;

    public MenuView() {
        scanner = new Scanner(System.in);
    }

    public String getCity() {
        printString("Give the name city :");
        return scanner.nextLine();
    }

    private void printString(String s) {
        System.out.println(s);
    }

    public void printWeather(WeatherDto weatherDto) {
        printString(weatherDto.getTempDto().getTemp() + "" + weatherDto.getCloudDto().getCloud() + "");
    }
}
