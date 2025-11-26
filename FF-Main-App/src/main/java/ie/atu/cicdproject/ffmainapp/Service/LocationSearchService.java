package ie.atu.cicdproject.ffmainapp.Service;

import ie.atu.cicdproject.ffmainapp.Model.FuelStationInformation;

import java.util.ArrayList;
import java.util.List;

public class LocationSearchService {
    private final List<FuelStationInformation> locations = new ArrayList<>();

    public List<FuelStationInformation> getAll()  {
        return locations;
    }

}
