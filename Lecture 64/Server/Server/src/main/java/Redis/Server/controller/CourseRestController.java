package Redis.Server.controller;

import Redis.Server.binding.User;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
public class CourseRestController {

    private HashOperations<String, Integer, User> hashOps;

    public CourseRestController(RedisTemplate<String, User> redisTemplate) {
        hashOps = redisTemplate.opsForHash();
    }

    @PostMapping("/store")
    public String storeData(@RequestBody User user) {
        hashOps.put("PERSON", user.getUid(), user);
        return "success";
    }

    @GetMapping("/data/{uid}")
    public User getData(@PathVariable Integer uid) {
        return hashOps.get("PERSON", uid);
    }
}
