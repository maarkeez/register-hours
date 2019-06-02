package dmd.registerhours;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@Service
public class RegisterController {

    private List<Register> registerList = new ArrayList<>();

    @GetMapping("api/register")
    public List<Register> readAll(){
        return registerList;
    }

    @PostMapping("api/register")
    public void create(@RequestBody Register register){
        registerList.add(register);
    }
}
