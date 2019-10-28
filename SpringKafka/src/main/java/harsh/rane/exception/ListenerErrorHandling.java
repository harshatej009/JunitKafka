package harsh.rane.exception;

import org.springframework.kafka.listener.KafkaListenerErrorHandler;
import org.springframework.kafka.listener.ListenerExecutionFailedException;
import org.springframework.messaging.Message;

public class ListenerErrorHandling implements KafkaListenerErrorHandler{

	@Override
	public Object handleError(Message<?> message, ListenerExecutionFailedException exception) {
		// TODO Auto-generated method stub
		
		System.err.println("this occured");
		return handleError(message, exception);
	}

}
