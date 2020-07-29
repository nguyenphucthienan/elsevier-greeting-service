package com.elsevier.elseviergreetingservice.service;

import com.elsevier.elseviergreetingservice.dto.GreetingDto;

public interface GreetingService {

  GreetingDto greet(String name);
}
