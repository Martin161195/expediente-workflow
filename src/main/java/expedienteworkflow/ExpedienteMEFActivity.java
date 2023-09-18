package expedienteworkflow;

import io.temporal.activity.ActivityInterface;
import io.temporal.activity.ActivityMethod;

@ActivityInterface
public interface ExpedienteMEFActivity {


    @ActivityMethod
    void digitalization(String recordId);
    @ActivityMethod
    void validation(String recordId);
    @ActivityMethod
    void registration(String recordId);
    @ActivityMethod
    void enqueue(String recordId);
    @ActivityMethod
    void distribution(String recordId);
}
