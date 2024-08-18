
import org.jpmml.evaluator.Evaluator;
import org.jpmml.evaluator.LoadingModelEvaluatorBuilder;
import org.jpmml.evaluator.InputField;
import org.jpmml.evaluator.TargetField;
import org.jpmml.evaluator.OutputField;
import java.io.File;
import java.util.List;
import java.util.Map;

public class JPMMLEvaluator {
    public static void main(String[] args) throws Exception {
        // Load the JPMML model
        Evaluator evaluator = new LoadingModelEvaluatorBuilder().load(new File("credit-ratings.pmml")).build();
        evaluator.verify();
        System.out.println("PMML Loaded");

        // Printing input (x1, x2, .., xn) fields
        List<InputField> inputFields = evaluator.getInputFields();
        System.out.println("Input fields: " + inputFields);

        // Printing primary result (y) field(s)
        List<TargetField> targetFields = evaluator.getTargetFields();
        System.out.println("Target field(s): " + targetFields);

        // Printing secondary result (eg. probability(y), decision(y)) fields
        List<OutputField> outputFields = evaluator.getOutputFields();
        System.out.println("Output fields: " + outputFields);
           
    }
}
