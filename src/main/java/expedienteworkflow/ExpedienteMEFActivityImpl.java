package expedienteworkflow;

public class ExpedienteMEFActivityImpl implements ExpedienteMEFActivity{
    @Override
    public void digitalization(String recordId, String year, String entity, String entityDescription, String operationType,
                               String operationDescription) {
        System.out.println("DIGITALIZATION PROCESS INIT-> Record  ["+recordId+"] " +
                "with YEAR : ["+year+"]" +
                "at Entity: ["+entity+"]" +
                "with Description: ["+entityDescription+"]" +
                "with Operation: ["+operationType+"] -> ["+operationDescription+"]"
        );
    }

    @Override
    public void validation(String recordId, String year, String entity, String entityDescription, String operationType,
                           String operationDescription) {
        System.out.println("DIGITALIZATION PROCESS INIT-> Record  ["+recordId+"] " +
                "with YEAR : ["+year+"]" +
                "at Entity: ["+entity+"]" +
                "with Description: ["+entityDescription+"]" +
                "with Operation: ["+operationType+"] -> ["+operationDescription+"]");
    }

    @Override
    public void registration(String recordId, String year, String entity, String entityDescription, String operationType,
                             String operationDescription) {
        System.out.println("DIGITALIZATION PROCESS INIT-> Record  ["+recordId+"] " +
                "with YEAR : ["+year+"]" +
                "at Entity: ["+entity+"]" +
                "with Description: ["+entityDescription+"]" +
                "with Operation: ["+operationType+"] -> ["+operationDescription+"]");
    }

    @Override
    public void enqueue(String recordId, String year, String entity, String entityDescription, String operationType,
                        String operationDescription) {
        System.out.println("DIGITALIZATION PROCESS INIT-> Record  ["+recordId+"] " +
                "with YEAR : ["+year+"]" +
                "at Entity: ["+entity+"]" +
                "with Description: ["+entityDescription+"]" +
                "with Operation: ["+operationType+"] -> ["+operationDescription+"]");
    }

    @Override
    public void distribution(String recordId, String year, String entity, String entityDescription, String operationType,
                             String operationDescription) {
        System.out.println("DIGITALIZATION PROCESS INIT-> Record  ["+recordId+"] " +
                "with YEAR : ["+year+"]" +
                "at Entity: ["+entity+"]" +
                "with Description: ["+entityDescription+"]" +
                "with Operation: ["+operationType+"] -> ["+operationDescription+"]");
    }
}
