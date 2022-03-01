package com.company.Trivial;

import java.util.ArrayList;
import java.util.Scanner;

public class IveBeenEverywhereMan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tests = scan.nextInt();

        for(int i = 0; i < tests; i++){
            int workTrips = scan.nextInt();

            ArrayList<String> cities = new ArrayList<>();

            for(int j = 0; j < workTrips; j++){
                String city = scan.next();

                boolean found = false;
                for(String cityInList : cities){
                    if (city.equals(cityInList)) {
                        found = true;
                        break;
                    }
                }

                if(!found){
                    cities.add(city);
                }
            }

            System.out.println(cities.size());
        }
    }
}
