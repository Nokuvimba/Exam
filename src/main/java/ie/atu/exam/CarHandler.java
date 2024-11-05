package ie.atu.exam;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class CarHandler {

    public ResponseEntity<> ErrorHandler(RentalNotFound){
        return new ResponseEntity<>()
    }

}
