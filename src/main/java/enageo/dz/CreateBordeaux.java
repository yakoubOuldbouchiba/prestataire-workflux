package enageo.dz;

import jakarta.inject.Named;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

@Named
public class CreateBordeaux implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        String Signataire = (String) delegateExecution.getVariable("signataire");
        System.out.println("bordeaux by " + Signataire);
    }
}
