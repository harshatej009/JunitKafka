package harsh.rane.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

public class Sender {
	
	//private static final Logger LOGGER =LoggerFactory.getLogger(Sender.class);

    @Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

    public void send(String payload) 
    {
    	 System.err.println("message sending");
		    kafkaTemplate.send("helloworld.t", payload);
		    System.err.println("message sent");
	}
}
