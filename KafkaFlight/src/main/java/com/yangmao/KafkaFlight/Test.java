package com.yangmao.KafkaFlight;

import java.net.Authenticator;
import java.net.InetAddress;
import java.net.PasswordAuthentication;
import java.util.Properties;
import java.util.Timer;
import java.util.TimerTask;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;

import org.glassfish.jersey.jackson.JacksonFeature;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import kafka.javaapi.producer.Producer;
import kafka.producer.KeyedMessage;
import kafka.producer.ProducerConfig;

public class Test {
	static class MyTask extends TimerTask{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
			Properties props = new Properties();
			props.put("metadata.broker.list", "sandbox.hortonworks.com:6667");
			props.put("zk.connect", "localhost:2181");
			props.put("serializer.class", "kafka.serializer.StringEncoder");
			props.put("request.required.acks", "1");
			
			String TOPIC = "yuan_fleet";
			
			ProducerConfig config = new ProducerConfig(props);
			
			Producer<String, String> producer = new Producer<String, String>(config);
			KeyedMessage<String, String> message = new KeyedMessage<String, String>(TOPIC, "hello");
			producer.send(message);
		}
		
	}
	
	public static class CustomAuthenticator extends Authenticator{
		// Called when password authorization is needed
		protected PasswordAuthentication getPasswordAuthentication() {

			// Get information about the request
			String prompt = getRequestingPrompt();
			System.out.println(prompt);
			String hostname = getRequestingHost();
			System.out.println(hostname);
			InetAddress ipaddr = getRequestingSite();
			System.out.println(ipaddr);
			int port = getRequestingPort();
			System.out.println(port);

			String username = ""; // TODO
			String password = ""; // TODO

			// Return the information (a data holder that is used by Authenticator)
			return new PasswordAuthentication(username, password.toCharArray());

		}
	}
	
	public static void main(String[] args) throws JsonProcessingException {
//		Timer timer = new Timer();
//		timer.scheduleAtFixedRate(new MyTask(), 0, 1000);
		Authenticator.setDefault(new CustomAuthenticator());
		
		Client client;
		client = ClientBuilder.newClient();
		// enable POJO mapping using Jackson - see
		// https://jersey.java.net/documentation/latest/user-guide.html#json.jackson
		client.register(JacksonFeature.class); 

		Invocation.Builder bldr = client.target("http://flightxml.flightaware.com/json/FlightXML2/FleetArrived?fleet=AAL&howMany=3&offset=0").request("application/json");
		MyResponse far = bldr.get(MyResponse.class);
		
		ObjectMapper om = new ObjectMapper();
		for(Arrival arrival:far.getFleetArrivedResult().getArrivals()){
			System.out.println(om.writeValueAsString(arrival));
		}
		
//		System.out.println(far);

		
	}
}
