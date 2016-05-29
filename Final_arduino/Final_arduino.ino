#include <AcceleroMMA7361.h>
AcceleroMMA7361 accelero;
int x;
int y;
int z;



#include <SoftwareSerial.h>
SoftwareSerial BTSerial(2, 3); // RX | TX

// Pin definitions
  const int pinA = 5;
  const int pinB = 4;
  int p;
  float count;
 
 
 char command;
String string;
boolean ledon = false;


  void setup()
  {
      Serial.begin(9600);
 accelero.begin(9, 12, 11, 10, A0, A1, A2);
 accelero.setARefVoltage(5); //sets the AREF voltage to 3.3V
 accelero.setSensitivity(LOW); //sets the sensitivity to +/-6G
 accelero.calibrate();
  
  // set the two pins as inputs with internal pullups
  pinMode(pinA, INPUT_PULLUP);
  pinMode(pinB, INPUT_PULLUP);
  
  pinMode(13,OUTPUT); //Led is connected here
  BTSerial.begin(9600); //Begin the serial communication using bluetooth
  Serial.begin(9600);




    //Serial.print(" jfrtyty");
  }

  void loop()
  {
    if (BTSerial.available() > 0)
    {string = "";}
    
    while(BTSerial.available()> 0)
    {
      command = ((byte)BTSerial.read());
      
    
    if(command == '1')
    {
       count=0;
      Serial.println("");
      Serial.println("");
      Serial.println("start");
      while(true){
      boolean k   = digitalRead(pinB);
      if (k ^ p)
        {
        count++;
        p = k;
        //Serial.print((count/30)*2);
        //Serial.println("cm");
        }

       command = ((byte)BTSerial.read());
        
      if(command == '2'){
        Serial.println("measure");
        
        //Serial.println(string);
        break;
        
        }
        
    }

      Serial.print((count/30)*2);
    Serial.println("cm");
    count=0;
    
     
    }
    
    else if(command =='3')
    {
        boolean l= true;
      char j;
      while(l){


         x = accelero.getXAccel();
         y = accelero.getYAccel();
         z = accelero.getZAccel();
         Serial.print("\nx: ");
         Serial.print(x);
         Serial.print(" \ty: ");
         Serial.print(y);
         Serial.print(" \tz: ");
         Serial.print(z);
         //Serial.print("\tG*10^-2");
         delay(500); //make it readabl

         //reset
        if(BTSerial.available()){
        j=BTSerial.read();
        command=j;
        return;
        }
       
        command = ((byte)BTSerial.read());
        
        
        if(command == '4')
        {
        Serial.println("Off");
        
         break; 
         }
        
        }
    }

     else if(command =='0')
    {
        Serial.println("Off");
    }
    
  
 }
  } 

 

    
