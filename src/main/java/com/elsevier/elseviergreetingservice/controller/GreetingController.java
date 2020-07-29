package com.elsevier.elseviergreetingservice.controller;

import com.elsevier.elseviergreetingservice.dto.GreetingDto;
import com.elsevier.elseviergreetingservice.service.GreetingService;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/greetings")
public class GreetingController {

  private final GreetingService greetingService;

  public GreetingController(GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  @GetMapping
  public GreetingDto getIndex(@RequestParam(required = false) String name) {
    return greetingService.greet(StringUtils.isEmpty(name) ? "Elsevier" : name);
  }
}
