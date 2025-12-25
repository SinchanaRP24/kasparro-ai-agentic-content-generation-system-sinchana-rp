package agents;

import java.util.*;

public class ComparisonAgent {

    public Map<String, Object> createFictionalProductB() {

        Map<String, Object> productB = new LinkedHashMap<>();

        productB.put("name", "RadiancePlus Vitamin C Serum");
        productB.put("concentration", "15% Vitamin C");
        productB.put("skinType", Arrays.asList("Normal", "Dry"));
        productB.put("keyIngredients", Arrays.asList("Vitamin C", "Niacinamide"));
        productB.put("benefits", Arrays.asList("Brightening", "Improves skin texture"));
        productB.put("usage", "Apply once daily at night");
        productB.put("sideEffects", "May cause dryness for sensitive skin");
        productB.put("price", 899);

        return productB;
    }
}

