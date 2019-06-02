package dmd.registerhours;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class Register {
    //@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startDate;
    //@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endDate;
}
