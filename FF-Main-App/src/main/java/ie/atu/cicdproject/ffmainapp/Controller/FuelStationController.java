package ie.atu.cicdproject.ffmainapp.Controller;

import ie.atu.cicdproject.ffmainapp.Model.FuelStationInformation;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import ie.atu.cicdproject.ffmainapp.Service.LocationSearchService;

import java.util.List;

@RestController
@RequestMapping("/api/stations")
public class FuelStationController {

    private final LocationSearchService locationSearchService;

    public FuelStationController( LocationSearchService locationSearchService) {
        this.locationSearchService = locationSearchService;
    }





    // Search stations by location name
    @GetMapping("/searchByLocation")
    public List<FuelStationInformation> searchByLocation(@RequestParam String location) {

        return locationSearchService.searchByLocation(location);
    }

    // Count total stations
   // @GetMapping("/count")
    //public int countStations() {
      //  return locationSearchService.count();
   // }
}
