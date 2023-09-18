package expedienteworkflow;

import io.temporal.activity.ActivityInterface;
import io.temporal.activity.ActivityMethod;

@ActivityInterface
public interface ExpedienteMEFActivity {


    @ActivityMethod
    void digitalization(String recordId, String year, String entity, String entityDescription, String operationType,
                        String operationDescription);
    @ActivityMethod
    void validation(String recordId, String year, String entity, String entityDescription, String operationType,
                    String operationDescription);
    @ActivityMethod
    void registration(String recordId, String year, String entity, String entityDescription, String operationType,
                      String operationDescription);
    @ActivityMethod
    void enqueue(String recordId, String year, String entity, String entityDescription, String operationType,
                 String operationDescription);
    @ActivityMethod
    void distribution(String recordId, String year, String entity, String entityDescription, String operationType,
                      String operationDescription);
}
