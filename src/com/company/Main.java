package com.company;

public class Main {

    public static void main(String[] args) {
    condition(27, 25);
    condition(30,15);
    condition(25,18);
    condition(5, -20);
    condition(35, -13);
    }

    public static String condition ( int age, int temperature){
       String result1= "Можно идти гулять";
       String result2= "Оставайтесь дома";

        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30){
         return result1;
        }
     else if ( age <= 20 && temperature >= 0 && temperature <= 28 ) {

         return result1;
        }
     else if ( age >= 45 && temperature >= 10 && temperature <= 25){

         return result1;
        }

     else {

         return result2;

        }

    }
}
