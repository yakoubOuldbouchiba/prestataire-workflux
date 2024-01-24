package enageo.dz;


import jakarta.inject.Named;
import lombok.extern.slf4j.Slf4j;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;


@Named
public class SendEmail implements JavaDelegate {
    

    
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
    
        String Signataire = (String) delegateExecution.getVariable("signataire");
        System.out.println("mail sended by " + Signataire);
    
    }
}
