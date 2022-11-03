package techi.springframework.springmicroservicedemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("/api/v1/hello")
@RestController
public class HelloController {
    @GetMapping({"/{hello}"})
    public ResponseEntity getBeer(@PathVariable("hello") String hello){

        return new ResponseEntity("Hi Mr>>"+hello, HttpStatus.OK);
    }

}
