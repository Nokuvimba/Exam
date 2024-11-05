package ie.atu.exam;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    public CarService(CarService carService ) {
        Car car =new Car();

        List <ArrayList>carList()= new ArrayList<>();
    }
    List<>() =carList(Car);

     public ResponseEntity<List> updateCar(@RequestBody Car car, int rentalCode){
        for (Car c: carList){
            if(Object.equals(c.getRentalCode())){
                c.setCarModel(car.getCar);
            }
        }
        return carList;
        ResponseEntity.ok();
     }

     public List<Car> addCar(RequestBody String){
         return carList.add();
     }

     public ResponseEntity<List> deleteCar(@RequestBody Car car, int rentalCode ){
         for(Car c: carList){
             if(Objec.equals(c.getRentalCode())){
                 Remove.Car;
             }
         }
     }
}
