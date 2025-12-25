package agents;

import models.Product;
import java.util.*;

public class QuestionGeneratorAgent {

    public Map<String, List<String>> generateQuestions(Product product) {

        Map<String, List<String>> questionsByCategory = new LinkedHashMap<>();

        // Informational Questions
        questionsByCategory.put("Informational", Arrays.asList(
                "What is " + product.getName() + "?",
                "What are the key ingredients in this product?",
                "What skin types is this product suitable for?"
        ));

        // Usage Questions
        questionsByCategory.put("Usage", Arrays.asList(
                "How do I use " + product.getName() + "?",
                "When should I apply this serum?",
                "Can I use this product daily?"
        ));

        // Safety Questions
        questionsByCategory.put("Safety", Arrays.asList(
                "Does this product have any side effects?",
                "Is this product safe for sensitive skin?",
                "Can this product cause irritation?"
        ));

        // Pricing & Purchase Questions
        questionsByCategory.put("Pricing", Arrays.asList(
                "What is the price of this product?",
                "Is this product affordable compared to similar serums?",
                "Is this product worth the price?"
        ));

        // Comparison Questions
        questionsByCategory.put("Comparison", Arrays.asList(
                "How does this product compare to other Vitamin C serums?",
                "Is this better than other serums in the same price range?",
                "What makes this product different from competitors?"
        ));

        return questionsByCategory;
    }
}
