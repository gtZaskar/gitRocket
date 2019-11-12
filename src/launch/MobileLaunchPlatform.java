package launch;

import com.company.Coordinates;

public interface MobileLaunchPlatform extends LaunchPlatform {
    void move(Coordinates location);
}
