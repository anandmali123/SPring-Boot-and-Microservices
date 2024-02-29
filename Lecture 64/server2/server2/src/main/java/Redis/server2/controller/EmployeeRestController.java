package Redis.server2.controller;

import Redis.server2.binding.Employee;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeRestController {

    private HashOperations<String , Integer, Employee> hashOps;

    public EmployeeRestController(RedisTemplate<String,Employee> redisTemplate){
        hashOps= redisTemplate.opsForHash();
    }

    @PostMapping("/store")
    public String storeData(@RequestBody Employee employee){
        hashOps.put("PERSON",employee.getEmpid(),employee);
        return "success";
    }

    @GetMapping("/data/{uid}")
    public Employee getData(@PathVariable Integer id) {
        return hashOps.get("PERSON", Empid);
    }
}
