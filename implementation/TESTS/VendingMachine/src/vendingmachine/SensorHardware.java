/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine;

import java.util.ArrayList;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

/**
 *
 * @author Anon
 */
public class SensorHardware {
    
    private ArrayList<Integer> activeWeightSensors; 
    private ArrayList<Integer> activeTemperatureSensrs;
    private int acceleratorAddress;
    private int paymentHardwareAddress;
        

    public SensorHardware(ArrayList<Integer> activeWeightSensors, ArrayList<Integer> activeTemperatureSensrs, int acceleratorAddress, int paymentHardwareAddress) {
        this.activeWeightSensors = activeWeightSensors;
        this.activeTemperatureSensrs = activeTemperatureSensrs;
        this.acceleratorAddress = 666;
        this.paymentHardwareAddress=0; /*Not sure here yet*/
    }
    public String getCurrentWeigt(){
    String tmp ="";
      int len = this.activeWeightSensors.size();
      for(int i=0;i<len;i++){
         tmp="Slot_"+i+"_"+this.activeWeightSensors.get(i).toString()+",";
      }
      return tmp;
    }
    public String getcurrentTemperature(){
       String tmp="";
       int len = this.activeTemperatureSensrs.size();
       for(int i=0;i<len;i++){
         tmp="Slot_"+i+"_"+this.activeTemperatureSensrs.get(i).toString()+",";
      }
      return tmp;
    }
    public void setUpData(){
        String content1      = this.getCurrentWeigt();
        String topic1        = "activeWeightSensors";
        String content2     = this.getCurrentWeigt();
        String topic2      = "activeTempSensors";
        String content3      = ""+this.acceleratorAddress;
        String topic3      = "AccelData";
        String content4      =""+this.paymentHardwareAddress;
        String topic4      = "PaymetHardware";
        pushData(content1,topic1);
        pushData(content2,topic2);
        pushData(content3,topic3);
        pushData(content4,topic4);
    }
    public void pushData(String content,String topic){
        
        int qos             = 2;
        String broker       = "tcp://iot.eclipse.org:1883";
        String clientId     = "EsyVending";
        MemoryPersistence persistence = new MemoryPersistence();
        
        try {
            MqttClient sampleClient = new MqttClient(broker, clientId, persistence);
            MqttConnectOptions connOpts = new MqttConnectOptions();
            connOpts.setCleanSession(true);
            System.out.println("Connecting to broker: "+broker);
            sampleClient.connect(connOpts);
            System.out.println("Connected");
            System.out.println("Publishing message: "+content);
            MqttMessage message = new MqttMessage(content.getBytes());
            message.setQos(qos);
            sampleClient.publish(topic, message);
            System.out.println("Message published");
            sampleClient.disconnect();
            System.out.println("Disconnected");
            System.exit(0);
        } catch(MqttException me) {
            System.out.println("reason "+me.getReasonCode());
            System.out.println("msg "+me.getMessage());
            System.out.println("loc "+me.getLocalizedMessage());
            System.out.println("cause "+me.getCause());
            System.out.println("excep "+me);
            me.printStackTrace();
        }
    }
}
