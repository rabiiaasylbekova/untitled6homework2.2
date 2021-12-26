package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(generatedRandomAge());
        System.out.println(num(generatedRandomAge(),-25));
        System.out.println(num(generatedRandomAge(),42));
        System.out.println(num(generatedRandomAge(),473));
        System.out.println(num(generatedRandomAge(),73));
        System.out.println(num(generatedRandomAge(),-35));
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

    public static int generatedRandomAge() {
        Random random = new Random();
        int ageOfYou = random.nextInt(200);
        return ageOfYou;
    }
}




