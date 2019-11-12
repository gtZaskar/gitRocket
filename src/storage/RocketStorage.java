package storage;

import com.company.OptionalRocket;
import com.company.Rocket;

public interface RocketStorage {

    Rocket get(int index) throws RocketNotFoundException;

    OptionalRocket tryToGet(int index);
}
