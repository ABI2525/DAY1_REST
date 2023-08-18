package com.example.demo.ApiController;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ApiController3 {
   @Value("${var}")
   private String MyFavColor;
   @GetMapping("/da")
   public String getMyFav()
   {
	   return "My Favourite color is " + MyFavColor;
   }
}
