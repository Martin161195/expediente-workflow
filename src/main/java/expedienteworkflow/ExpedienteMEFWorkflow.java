package expedienteworkflow;

import io.temporal.workflow.WorkflowInterface;
import io.temporal.workflow.WorkflowMethod;

@WorkflowInterface
public interface ExpedienteMEFWorkflow {

    @WorkflowMethod
    void ProcessRecord(String recordId, String year, String entity, String entityDescription, String operationType,
                       String operationDescription);
}
