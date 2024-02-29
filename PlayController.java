package com.poc.seb.embedded.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/play")
@RequiredArgsConstructor
public class PlayController {

  @Operation(summary = "Get message from Aliens", description = "It is a staged message of course!")
  @ApiResponses(value = {@ApiResponse(responseCode = "200")})
  @GetMapping("/greet")
  public String searchGreetings() {
    return "Hello Multiverse";
  }
}
