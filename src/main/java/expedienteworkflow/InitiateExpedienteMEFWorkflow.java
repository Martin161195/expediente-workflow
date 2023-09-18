package expedienteworkflow;

import io.temporal.api.common.v1.WorkflowExecution;
import io.temporal.client.WorkflowClient;
import io.temporal.client.WorkflowOptions;
import io.temporal.serviceclient.WorkflowServiceStubs;

import java.util.UUID;

public class InitiateExpedienteMEFWorkflow {

    public static void main(String[] args) {
        WorkflowServiceStubs service = WorkflowServiceStubs.newLocalServiceStubs();
        WorkflowOptions options = WorkflowOptions.newBuilder()
                .setTaskQueue(TaskQueueShared.EXPEDIENTE_MEF_TASK_QUEUE)
                // A WorkflowId prevents this it from having duplicate instances, remove it to duplicate.
                .setWorkflowId("expediente-mef-workflow")
                .build();
        // WorkflowClient can be used to start, signal, query, cancel, and terminate Workflows.
        WorkflowClient client = WorkflowClient.newInstance(service);
        // WorkflowStubs enable calls to methods as if the Workflow object is local, but actually perform an RPC.
        ExpedienteMEFWorkflow workflow = client.newWorkflowStub(ExpedienteMEFWorkflow.class, options);
        String recordId = UUID.randomUUID().toString();
        String year = "2013";
        String entity = "1289";
        String entityDescription = "REGION LIMA- HOSP. BARRANCA CAJATAMBO Y SERV. BASICOS DE SALUD" ;
        String operationType = "N";
        String operationDescription= "GASTO-ADQUISICIÓN DE BIENES Y SERVICIOS";

        /*
        String purcharseMethod = "CA";
        String purcharseDescription = "LEY DE CONTRATACIONES DEL ESTADO";
        String selectionType = "18";
        String selectionDescription = "ADJUDICACIÓN SIN PROCESO"; */

        // Asynchronous execution. This process will exit after making this call.
        WorkflowExecution we = WorkflowClient.start(workflow::ProcessRecord,  recordId,  year,  entity,  entityDescription,  operationType,
                 operationDescription);

        System.out.printf("\nInit process of Record %s  is processing\n", recordId);
        System.out.printf("\nWorkflowID: %s RunID: %s", we.getWorkflowId(), we.getRunId());
        System.exit(0);
    }
}
