package com.lambdaStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapMethod1 {
    public static void main(String[] args) {

        List<String> vehicle = Arrays.asList("bus","car","bicycle","flight","train");
        List<String> vehicleListinUppercase = new ArrayList<String>();

        //Before java8/without use streams
		/*for(String name : vehicle) {
			vehicleListinUppercase.add(name.toUpperCase());

		}
		System.out.println(vehicleListinUppercase);*/

        // use stream map
        vehicleListinUppercase = vehicle.stream().map(name-> name.toUpperCase()).collect(Collectors.toList());
        System.out.println(vehicleListinUppercase);
    }
}
