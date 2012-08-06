package com.hopcroft.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hopcroft.example.domain.Car;

@Controller
@RequestMapping("/car")
public class CarController {
	
    
   @RequestMapping(value="/car", method=RequestMethod.GET )
   public String getCar(ModelMap model) {
	   System.out.println("entro en el getCar");
       Car car = new Car();
       car.setBrand("Ferrari");
       car.setModel("F40");
       car.setPrize(1000000);
       car.setYear(1995);
       model.addAttribute("model", car);
       return "car";
   }

//   @RequestMapping(value="/store", method=RequestMethod.POST)
//   public @ResponseBody Long addProvider(@RequestBody Provider provider) {
//       final Provider storedProvider = providerStore.sotreProvider(provider);
//       return storedProvider.getId();
//   }   
//    
//   @RequestMapping(value="/{id}", method=RequestMethod.GET)
//   public @ResponseBody Provider getProvider(@PathVariable Long id) {
//       final Provider provider = providerStore.loadProvider(id);
//       if (provider == null) {
//           throw new ResourceNotFoundException(id);
//       }
//       return provider; 
//   }

}
