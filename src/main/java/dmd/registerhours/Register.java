package dmd.registerhours;

import lombok.Data;

import java.util.Date;

@Data
public class Register {
    private Date startDate;
    private Date endDate;
}
