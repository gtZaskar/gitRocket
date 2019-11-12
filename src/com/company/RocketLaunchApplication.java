package com.company;

import launch.Launch;
import launch.LaunchPlatform;
import launch.Silo;
import storage.RocketStorage;
import storage.UndergroundRocketStorage;

public class RocketLaunchApplication {

    public static void main(String[] args) {

        Coordinates belfast = new Coordinates(-5.93936, 54.66682);

        Rocket bellfastNuke = new Rocket(Warhead.NUCLEAR, belfast);

        RocketStorage storage = new UndergroundRocketStorage(bellfastNuke);

        LaunchPlatform site000 = new Silo(new Coordinates(0.0, 0.0));

        OptionalRocket r0 = storage.tryToGet(0);

        if (r0.isPresent()) {
            Rocket rocket = r0.get();
            Launch launch = site000.launch(rocket);
            System.out.println("Verifying launch: " + launch);
        }


    }
}
