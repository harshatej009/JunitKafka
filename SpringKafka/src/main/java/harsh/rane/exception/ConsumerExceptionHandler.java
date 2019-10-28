package harsh.rane.exception;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.listener.ErrorHandler;

public class ConsumerExceptionHandler implements ErrorHandler {

	@Override
	public void handle(Exception thrownException, ConsumerRecord<?, ?> data) {
		// TODO Auto-generated method stub
	//	System.err.println("Harshatej Rane");
		System.err.println(thrownException+""+data);
	}
}

