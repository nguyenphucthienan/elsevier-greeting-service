package com.elsevier.elseviergreetingservice.mapper;

import com.elsevier.elseviergreetingservice.domain.Greeting;
import com.elsevier.elseviergreetingservice.dto.GreetingDto;
import org.springframework.stereotype.Component;

@Component
public class GreetingMapper {

  public GreetingDto greetingToGreetingDto(Greeting greeting) {
    GreetingDto greetingDto = new GreetingDto();
    greetingDto.setMessage(greeting.getMessage());
    return greetingDto;
  }
}
