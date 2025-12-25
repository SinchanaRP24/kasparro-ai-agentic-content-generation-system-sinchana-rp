import orchestrator.ContentPipeline;
import agents.OutputAgent;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        System.out.println("Agentic content generation system started");

        ContentPipeline pipeline = new ContentPipeline();
        Map<String, Map<String, Object>> result = pipeline.runPipeline();

        OutputAgent outputAgent = new OutputAgent();

        outputAgent.writeJsonToFile("faq.json", result.get("faq"));
        outputAgent.writeJsonToFile("product_page.json", result.get("productPage"));
        outputAgent.writeJsonToFile("comparison_page.json", result.get("comparisonPage"));

        System.out.println("Content generation completed successfully.");
    }
}
