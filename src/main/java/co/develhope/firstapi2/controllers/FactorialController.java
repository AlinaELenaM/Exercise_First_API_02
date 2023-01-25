package co.develhope.firstapi2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.math.BigInteger;

@RestController
@RequestMapping("/factorial")
public class FactorialController{

    @GetMapping("/{n}")
    public BigInteger getFactorialOfN(@PathVariable Integer n){
        BigInteger factorial = BigInteger.ONE;
        for(int i = 1; i <= n; ++i)
        {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }
}