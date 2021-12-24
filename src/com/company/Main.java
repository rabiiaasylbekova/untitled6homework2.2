package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(num(67, 20));
    }


    public static String num(int ageOfMe, int temperature) {
        if (ageOfMe <= 20 || ageOfMe >= 45 || temperature <= -20 || temperature <= 45) {
            if (ageOfMe < 20 && temperature > 0 && temperature < 20) {
                return "Можно идти гулять";
            } else if (ageOfMe > 45 && temperature > -10 && temperature < 25) {

                return "Можно идти гулять";

            } else
                return "Оставайтесь дома";
        } else {
            return "Можно идти гулять";
        }


    }


}




