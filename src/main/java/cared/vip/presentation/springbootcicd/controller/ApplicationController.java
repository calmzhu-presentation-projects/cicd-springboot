package cared.vip.presentation.springbootcicd.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ApplicationController {
    @GetMapping("/")
    public ResponseEntity welcome(){
        return new ResponseEntity("Welcome", HttpStatus.OK);
    }
}
