package expedienteworkflow;

import io.temporal.activity.ActivityOptions;
import io.temporal.common.RetryOptions;
import io.temporal.workflow.Workflow;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class ExpedienteMEFWorkflowImpl implements ExpedienteMEFWorkflow{

    private static final String VALIDATION = "Validation";
    // RetryOptions specify how to automatically handle retries when Activities fail.
    private final RetryOptions retryoptions = RetryOptions.newBuilder()
            .setInitialInterval(Duration.ofSeconds(1))
            .setMaximumInterval(Duration.ofSeconds(100))
            .setBackoffCoefficient(2)
            .setMaximumAttempts(500)
            .build();
    private final ActivityOptions defaultActivityOptions = ActivityOptions.newBuilder()
            // Timeout options specify when to automatically timeout Activities if the process is taking too long.
            .setStartToCloseTimeout(Duration.ofSeconds(5))
            // Optionally provide customized RetryOptions.
            // Temporal retries failures by default, this is simply an example.
            .setRetryOptions(retryoptions)
            .build();
    // ActivityStubs enable calls to methods as if the Activity object is local, but actually perform an RPC.
    private final Map<String, ActivityOptions> perActivityMethodOptions = new HashMap<String, ActivityOptions>(){{
        put(VALIDATION, ActivityOptions.newBuilder().setHeartbeatTimeout(Duration.ofSeconds(5)).build());
    }};
    private final ExpedienteMEFActivity mefActivity = Workflow.newActivityStub(ExpedienteMEFActivity.class, defaultActivityOptions, perActivityMethodOptions);
    @Override
    public void ProcessRecord(String recordId, String year, String entity, String entityDescription, String operationType,
                              String operationDescription) {

        mefActivity.digitalization( recordId,  year,  entity,  entityDescription,  operationType,
                  operationDescription);

        mefActivity.validation( recordId,  year,  entity,  entityDescription,  operationType,
                operationDescription);

        mefActivity.registration( recordId,  year,  entity,  entityDescription,  operationType,
                operationDescription);

        mefActivity.enqueue( recordId,  year,  entity,  entityDescription,  operationType,
                 operationDescription);

        mefActivity.distribution( recordId,  year,  entity,  entityDescription,  operationType,
                 operationDescription);

    }
}
