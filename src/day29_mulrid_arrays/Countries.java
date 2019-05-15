package day29_mulrid_arrays;

import java.util.Arrays;

public class Countries {

    public static void main(String[] args) {
        
        String[][] countriesArray=  { {"USA",     "Washington DC"}, // 0
                                    {"Canada",        "Ottawa"},            // 1
                                    {"Mexico",        "Mexico city"},       // 2
                                    {"Brasil",        "Brasilia"},      // 3
                                    {"Peru",      "Lima"},          // 4
                                    {"Argentina", "Boanes Aeros"},  // 5
                                    {"Bolivia",       "La Paz"},            // 6
                                    {"Macedonia", "Scopia"},            // 7
                                    {"Kazakhstan",    "Nursultan"} };       // 8
        // String[][] c = new String[9][2];
        // c[0][0] = "USA"; c[0][1] = "Washington DC";
        // Print USA with Capital city
        System.out.println(countriesArray[0][0] +"|"+countriesArray[0][1]);
        System.out.println(countriesArray[8][0] +"|"+countriesArray[8][1]);
        System.out.println(Arrays.deepToString(countriesArray));
        
        for(int i = 0; i<countriesArray.length;i++) {
        	System.out.println(countriesArray[i][0]+"|");
        }
        
        for (String[] country : countriesArray) {
        	System.out.println(country[0]+"|");
        }
        
        String[] cities = new String[countriesArray.length];
        
        for(int i = 0; i < countriesArray.length; i++) {
            cities[i] = countriesArray[i][1];
        }
            System.out.println(Arrays.toString(cities));
            
        for(int row = 0; row < countriesArray.length; row++) {
            if(countriesArray[row][0].equals("Bolivia")) {
                //System.out.println(countriesArray[row][1]);
                if(countriesArray[row][1].equals("La paz")) {
                    System.out.println("Bolivia test passed");
                }else {
                    System.out.println("Bolivia test failed");
                }
            }
        }
        
        
    }
}




