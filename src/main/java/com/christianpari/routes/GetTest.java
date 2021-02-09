package com.christianpari.routes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test") // make a root route for this route
public class GetTest {

  @GetMapping("/String")
  public String test() { return "This is the GET req!"; }

  @GetMapping("/pathVari/{id}") // if path variable name matches variable name in parameter then don't have to specify w/ annotation
  public Object test(@PathVariable Integer id) { return "This is the id requested: " + id; }

  @GetMapping("/reqParam")
  public Object test2(@RequestParam int id) {
    return "ID: " + id;
  }
}
