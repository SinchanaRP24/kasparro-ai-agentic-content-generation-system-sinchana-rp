package agents;

import models.Product;
import java.util.Arrays;

public class DataParserAgent {

    public Product parseProductData() {

        Product product = new Product(
                "GlowBoost Vitamin C Serum",
                "10% Vitamin C",
                Arrays.asList("Oily", "Combination"),
                Arrays.asList("Vitamin C", "Hyaluronic Acid"),
                Arrays.asList("Brightening", "Fades dark spots"),
                "Apply 2–3 drops in the morning before sunscreen",
                "Mild tingling for sensitive skin",
                699
        );

        return product;
    }
}

