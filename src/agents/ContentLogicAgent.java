package agents;

import models.Product;
import java.util.*;

public class ContentLogicAgent {

    public Map<String, Object> generateContentBlocks(Product product) {

        Map<String, Object> contentBlocks = new LinkedHashMap<>();

        contentBlocks.put("name", product.getName());
        contentBlocks.put("concentration", product.getConcentration());
        contentBlocks.put("skinType", product.getSkinType());
        contentBlocks.put("keyIngredients", product.getKeyIngredients());
        contentBlocks.put("benefits", generateBenefitsBlock(product));
        contentBlocks.put("usage", generateUsageBlock(product));
        contentBlocks.put("sideEffects", product.getSideEffects());
        contentBlocks.put("price", product.getPrice());

        return contentBlocks;
    }

    private List<String> generateBenefitsBlock(Product product) {
        List<String> benefits = new ArrayList<>();
        for (String benefit : product.getBenefits()) {
            benefits.add("Helps with " + benefit.toLowerCase());
        }
        return benefits;
    }

    private String generateUsageBlock(Product product) {
        return "Recommended usage: " + product.getHowToUse();
    }
}
