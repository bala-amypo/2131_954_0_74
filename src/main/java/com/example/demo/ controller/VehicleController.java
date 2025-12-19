@RestController
@RequestMapping("/vehicles")
public class VehicleController {

    private final VehicleService service;

    public VehicleController(VehicleService service) {
        this.service = service;
    }

    @PostMapping("/{userId}")
    public Vehicle add(@PathVariable Long userId,
                       @RequestBody Vehicle v) {
        return service.addVehicle(userId, v);
    }
}
