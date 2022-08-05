package com.calculadora.calculadora.controllers;


import com.calculadora.calculadora.models.Numbers;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

 @GetMapping("/somar/{a}/{b}")
    public int somar(@PathVariable int a, @PathVariable int b){
     return a + b;
}

 @GetMapping("/subtrair")
    public int subtrair(@RequestParam(name = "a") int a, @RequestParam(name = "b") int b){
    return a - b;
 }

    @PostMapping("/mult")
    public int multiplicar(@RequestBody Numbers numbers){
        return numbers.a * numbers.b;
    }
    @GetMapping("/dividir")
    public int dividir(@RequestParam(name = "a") int a, @RequestParam(name = "b") int b){
        return a - b;
    }

}