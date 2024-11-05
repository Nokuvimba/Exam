package ie.atu.exam;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {

    private String rentalCode;
    @NotBlank(message ="carModel cannot be cannot be blank")
    private String carModel;
    @NotBlank(message ="renterName cannot be blank")
    private String renterName;
    @Email(message = "invalid email")
    private String renterEmail;
    @NotBlank(message="renterStartDate cannot be blank")
    private String renterStartDate;
    @NotBlank(message="renterEndDate cannot be blank")
    private String renterEndDate;
    @Min(value=1, message="dailyRate cannot be negative")
    private double dailyRate;

}
