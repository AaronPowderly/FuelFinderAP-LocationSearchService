package ie.atu.cicdproject.ffmainapp.Service;

import ie.atu.cicdproject.ffmainapp.Model.FuelStationInformation;
import ie.atu.cicdproject.ffmainapp.errorHandling.NoStationsFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LocationSearchService {
    private final List<FuelStationInformation> locations = new ArrayList<>();


    public List<FuelStationInformation> searchByLocation(String location){
        List<FuelStationInformation> results = locations.stream()
                .filter(s -> s.getLocation().equalsIgnoreCase(location))
                .toList();

        if (results.isEmpty()) {
            throw new NoStationsFoundException("No fuel stations found in location: " + location);
        }

        return results;
    }


}
