package expedienteworkflow;

public class ExpedienteMEFActivityImpl implements ExpedienteMEFActivity{
    @Override
    public void digitalization(String recordId) {
        System.out.println("DIGITALIZATION PROCESS INIT-> Record  ["+recordId+"]");
    }

    @Override
    public void validation(String recordId) {
        System.out.println("VALIDATION PROCESS INIT-> Record  ["+recordId+"]");
    }

    @Override
    public void registration(String recordId) {
        System.out.println("REGISTRATION PROCESS INIT-> Record  ["+recordId+"]");
    }

    @Override
    public void enqueue(String recordId) {
        System.out.println("ENQUEUE PROCESS INIT-> Record  ["+recordId+"]");
    }

    @Override
    public void distribution(String recordId) {
        System.out.println("DISTRIBUTION PROCESS INIT-> Record  ["+recordId+"]");
    }
}
