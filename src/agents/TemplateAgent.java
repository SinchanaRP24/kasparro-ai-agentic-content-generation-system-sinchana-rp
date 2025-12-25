package agents;

import java.util.*;

public class TemplateAgent {

    // FAQ Page Template
    public Map<String, Object> buildFAQPage(
            Map<String, List<String>> questionsByCategory
    ) {
        Map<String, Object> faqPage = new LinkedHashMap<>();
        faqPage.put("pageType", "FAQ");
        faqPage.put("sections", questionsByCategory);
        return faqPage;
    }

    // Product Page Template
    public Map<String, Object> buildProductPage(
            Map<String, Object> contentBlocks
    ) {
        Map<String, Object> productPage = new LinkedHashMap<>();
        productPage.put("pageType", "Product");
        productPage.put("content", contentBlocks);
        return productPage;
    }

    // Comparison Page Template
    public Map<String, Object> buildComparisonPage(
            Map<String, Object> productA,
            Map<String, Object> productB
    ) {
        Map<String, Object> comparisonPage = new LinkedHashMap<>();
        comparisonPage.put("pageType", "Comparison");
        comparisonPage.put("productA", productA);
        comparisonPage.put("productB", productB);
        return comparisonPage;
    }
}
