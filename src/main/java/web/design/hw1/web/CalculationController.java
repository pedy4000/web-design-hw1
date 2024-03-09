package web.design.hw1.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculationController {

    private final CalculationService calculationService;

    @Autowired
    public CalculationController(CalculationService calculationService) {
        this.calculationService = calculationService;
    }

    @GetMapping("/calc/{operator}/{x}/{y}")
    public String calculate(@PathVariable String operator, @PathVariable int x, @PathVariable int y) {
        return calculationService.calculate(operator, x, y);
    }
}
