package ie.atu.exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {
    @Autowired
    public CarController(CarController carController,CarService carService) {
        Car car =new Car();

    }
    List<ArrayList> carList = new ArrayList<>();

@GetMapping
  public List<Car> getCar(){

        return getCar();
}
   @PutMapping ("/putcar/{rentalCode}")
    public List<Car> putCar(@RequestBody Car car, @PathVariable String rentalCode ) {

       return carList.add();
   }
   @PostMapping("/postcar")
   public List<Car>  postCar(RequestBody Car ){
        return carList.add();
   }

   @DeleteMapping("/deletecar/rentalCode")
    public ResponseEntity<List> deletecar(@PathVariable String rentalCode){
       return carList.add();
   }
}
