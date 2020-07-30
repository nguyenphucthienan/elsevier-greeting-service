package com.elsevier.elseviergreetingservice.controller;

import com.elsevier.elseviergreetingservice.dto.GreetingDto;
import com.elsevier.elseviergreetingservice.payload.response.GreetingResponse;
import com.elsevier.elseviergreetingservice.service.GreetingService;
import org.modelmapper.ModelMapper;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/greetings")
public class GreetingController {

  private final GreetingService greetingService;

  private final ModelMapper modelMapper;

  public GreetingController(GreetingService greetingService, ModelMapper modelMapper) {
    this.greetingService = greetingService;
    this.modelMapper = modelMapper;
  }

  @GetMapping
  public GreetingResponse getGreeting(@RequestParam(required = false) String name) {
    GreetingDto greetingDto = greetingService.greet(StringUtils.isEmpty(name) ? "Elsevier" : name);
    return modelMapper.map(greetingDto, GreetingResponse.class);
  }

  @GetMapping("/admin")
  public GreetingResponse getAdminGreeting() {
    GreetingDto greetingDto = greetingService.greet("Admin");
    return modelMapper.map(greetingDto, GreetingResponse.class);
  }
}
