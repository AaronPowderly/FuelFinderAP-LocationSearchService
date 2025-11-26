package ie.atu.cicdproject.ffmainapp.Controller;


import ie.atu.cicdproject.ffmainapp.Model.FuelStationInformation;
import ie.atu.cicdproject.ffmainapp.Service.LocationSearchService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/Locations")
public class LocationSearchController {

    private final LocationSearchService Lservice;

    public LocationSearchController(LocationSearchService Lservice) { this.Lservice = Lservice; }

    @GetMapping("/search")
    public List<FuelStationInformation> search(@RequestParam String location) {
        return Lservice.search(location);
    }
}
