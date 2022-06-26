package com.trybe.cars.controller;

import com.trybe.cars.model.Car;
import com.trybe.cars.service.CarsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Classe CarsController.
 */

@RestController
@RequestMapping("/cars")
public class CarsController {

  @Autowired
  private CarsService service;

  /**
   * Gets the all cars.
   *
   * @return the all cars
   */
  @GetMapping
  public ResponseEntity<List<Car>> getAllCars() {
    /* try { */
    List<Car> carList = service.getAllCars();
    return ResponseEntity.ok().body(carList);
    /*
     * } catch (NoSuchElementException e) { return
     * ResponseEntity.status(404).body(null); }
     */

  }
}
