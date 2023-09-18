package expedienteworkflow;

import io.temporal.client.WorkflowClient;
import io.temporal.serviceclient.WorkflowServiceStubs;
import io.temporal.worker.Worker;
import io.temporal.worker.WorkerFactory;

public class ExpedienteMEFWorker {

    public static void main(String[] args) {

        WorkflowServiceStubs serviceStubs = WorkflowServiceStubs.newLocalServiceStubs();
        WorkflowClient client  = WorkflowClient.newInstance(serviceStubs);

        WorkerFactory factory = WorkerFactory.newInstance(client);

        Worker worker = factory.newWorker(TaskQueueShared.EXPEDIENTE_MEF_TASK_QUEUE);

        worker.registerWorkflowImplementationTypes(ExpedienteMEFWorkflowImpl.class);

        worker.registerActivitiesImplementations(new ExpedienteMEFActivityImpl());

        factory.start();
    }
}
