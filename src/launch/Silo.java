package launch;

import com.company.Coordinates;
import com.company.Rocket;

import java.util.Date;

public class Silo implements LaunchPlatform {

    private final Coordinates location;

    public Silo(Coordinates location){
        this.location=location;
    }

    @Override
    public Launch launch(Rocket rocket) {
        Date date=new Date();

        Launch launch = new Launch(location,rocket,date);

        Coordinates target = rocket.getTarget();

        System.out.println(rocket.getWarhead()+

                " rocket has been launched from the silo at {" +

                location.getLatitude() + ", " +

                location.getLongitude() + "} at " +

                date + ", targeting coordinates {" +

                target.getLatitude() + ", " +

                target.getLongitude() + "}"

        );
        return launch;
    }
}
