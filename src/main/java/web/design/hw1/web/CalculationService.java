package web.design.hw1.web;

import org.springframework.stereotype.Service;

@Service
public class CalculationService {

    public String calculate(String operator, int x, int y) {
        switch (operator.toLowerCase()) {
            case "sum":
                return String.format("%d=%d+%d", (x + y), x, y);
            case "mult":
                return String.format("%d=%d*%d", (x * y), x, y);
            case "subtract":
                return String.format("%d=%d-%d", (x - y), x, y);
            case "div":
                if (y == 0) {
                    return "Error: Division by zero";
                }
                return String.format("%d=%d/%d", (x / y), x, y);
            default:
                return "Error: Unsupported operation";
        }
    }
}
