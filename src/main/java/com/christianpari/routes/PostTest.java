package com.christianpari.routes;

import com.christianpari.model.TestObject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostTest {

  @PostMapping("/test")
  public TestObject test(
    @RequestBody TestObject body
    , @RequestHeader("x-auth-token") String jwt
  ) {
    System.out.println("Auth Token: " + jwt);
    System.out.println(body.first + " " + body.middle + " " + body.last);
    body.last = "#########";
    return body;
  }

}
