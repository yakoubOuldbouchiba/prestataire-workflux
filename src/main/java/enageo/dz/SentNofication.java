package enageo.dz;

import jakarta.inject.Named;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
@Named
public class SentNofication implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
            System.out.println("Please Check list opi to validate");
    }
}
