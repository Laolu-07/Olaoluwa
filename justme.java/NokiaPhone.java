import java.util.Scanner;
public class NokiaPhone {
public static void main(String[] args){
Scanner input = new Scanner (System.in);

        System.out.println("welcome to NOKIA 3310. \n Here are your menus");
        System.out.println("1. Phone book");
        System.out.println("2. Messages");       
        System.out.println("3. Chat");
        System.out.println("4. Call register");
        System.out.println("5. Tones");
        System.out.println("6. Settings");
        System.out.println("7. Call divert");
        System.out.println("8. Games");
        System.out.println("9. Calculator");
        System.out.println("10. Reminder");
        System.out.println("11. Clock");
        System.out.println("12. Profiles");
        System.out.println("13. SIM services");
        System.out.println("Please select your menu");

System.out.print("Enter option: ");
int menu = input.nextInt();

    switch (menu) {
        
        case 1:  System.out.println("\n Phone book");

        System.out.println("1. Search");
        System.out.println("2. Service Nos.");
        System.out.println("3. Add name.");
        System.out.println("4. Erase.");
        System.out.println("5. Edit");
        System.out.println("6. Assigns tone");
        System.out.println("7. Send b'card");
        System.out.println("8. Options");
        System.out.println("9. Speed dials");
        System.out.println("10. voice tags");

System.out.println("Enter option: ");
int Phonebook = input.nextInt();
        
        switch (Phonebook) {
            case 1:  System.out.println("1. Search");
break;
            case 2: System.out.println("2. Service Nos.");
break;
            case 3: System.out.println("3. Add name.");
break;

            case 4: System.out.println("4. Erase.");
break;
            case 5: System.out.println("5. Edit");
break;
            case 6: System.out.println("6. Assigns tone");
break;
            case 7: System.out.println("7. Send b'card");
break;
            case 8: System.out.println("8. Options");
                    System.out.println("1: Type of view");
                    System.out.println("2: Memory status");
int options = input.nextInt();

switch (options) {
            case 1: System.out.println();
          
             
break;
        default : System.out.println("invalid");

}
break;
            case 9: System.out.println("9. Speed dial");
break;
            case 10: System.out.println("10. Voice tags");
break;
default: System.out.println ("invalid");



break;

}
          

      case 2: System.out.println ("\n Messages") ;

        System.out.println ("1. Write messages");
        System.out.println ("2. Inbox");
        System.out.println ("3. Outbox"); 
        System.out.println ("4. Picture messages");
        System.out.println ("5. Templates");
        System.out.println ("6. Smileys");
        System.out.println ("7. Messages Settings"); 
        System.out.println ("8. Info service");
        System.out.println ("9. Voice mailbox number");
        System.out.println ("10. Service command editor");
int Messages = input.nextInt();

        switch (Messages) {
                
            case 1:  System.out.println("1. Write messages");
break;
            case 2: System.out.println("2. Inbox.");
break;
            case 3: System.out.println("3. Outbox.");
break;
            case 4: System.out.println("4. Picture.");
break;
            case 5: System.out.println("5. Templates");
break;
            case 6: System.out.println("6. Smileys");
break;
            case 7: System.out.println("7. Message settings");

                    System.out.println("1: Set");
                    System.out.println("2: Common");
System.out.println("Enter option: ");
int set = input.nextInt();
switch (set) {
            case 1: System.out.println();
         

                    System.out.println("1: Message centre number");
                    System.out.println("2: Message sent as");

                    System.out.println("3. Message validity");
break;
            case 2: System.out.println();
          
    
       
                    System.out.println("1: Delivery reports");
                    System.out.println("2: Reply via same centre");
                    System.out.println("3. Character support");
          
             
break;
}
break;
            case 8: System.out.println("8. info service");
break;
            case 9: System.out.println("9. Smileys");
break;
            case 10: System.out.println("10. Service command editor");
break;

default : System.out.println("invalid");
break;
            
}
        case 3: System.out.println ("\n Chat") ;
               
break; 

 case 4: System.out.println ("\n Call register") ;

        System.out.println ("1. Missed call");
        System.out.println ("2. Recieved call");
        System.out.println ("3. Dialled numbers"); 
        System.out.println ("4. Erase recent call lists");
        System.out.println ("5. Show call durations");
        System.out.println ("6. Show call cost"); 
        System.out.println ("7. Call cost settings");
        System.out.println ("8. Prepaid credit");
 
int Callregister = input.nextInt();

  switch (Callregister) {
                
            case 1:  System.out.println("1. Missed call");
break;
            case 2: System.out.println("2. Recieved call.");
break;
            case 3: System.out.println("3. Dialled number.");
break;
            case 4: System.out.println("4. Erase recent call durations.");
break;
            case 5: System.out.println("5. \n Show call duration");
                    System.out.println("1: Last call duration");
                    System.out.println("2: All calls' duration");
                    System.out.println("3: Recieved call duration");
                    System.out.println("4: Dialled call duration");
                    System.out.println("5: Clear timers");


          
             
break;
        default : System.out.println("invalid");


            case 6: System.out.println("6. \n Show call cost.");
                    System.out.println("1: Last call cost");
                    System.out.println("2: All calls' call");
                    System.out.println("3: Clear counters");
break;
            case 7: System.out.println("7.\n Call cost settings.");
                    System.out.println("1: Call cost limit");
                    System.out.println("2: Show cost");

            case 8:  System.out.println("8. Prepaid credit");
break;
}
        
            case 5: System.out.println ("\n Tones") ;
        System.out.println ("1. Ringing tone");
        System.out.println ("2. Ringing volume");
        System.out.println ("3. Incoming call alerts"); 
        System.out.println ("4. Composer");
        System.out.println ("5. Message alert tones");
        System.out.println ("6. Show Keypad tones"); 
        System.out.println ("7. Warning and game tones");
        System.out.println ("8. Vibrating alerts");
        System.out.println ("9. Screen Saver");


int Tones = input.nextInt();

  switch (Tones) {
                
            case 1:  System.out.println("1. Ringing tone");
break;
            case 2: System.out.println("2. Ringing volume.");
break;
            case 3: System.out.println("3. Incoming call alerts.");
break;
            case 4: System.out.println("4. Composer.");
break;        
            case 5:  System.out.println("5. Message alert tone");
break;
            case 6: System.out.println("6. Keypad tone.");
break;
            case 7: System.out.println("7. Warning and game tones.");
break;
            case 8: System.out.println("8. Vibrating alert.");
break;
            case 9: System.out.println("9. Screen saver");
break;
}
   case 6: System.out.println ("\n Settings") ;
        System.out.println ("1. Call settings");
        System.out.println ("2. Phone settings");
        System.out.println ("3. Security settings"); 
        System.out.println ("4. Restore factory settings");

    
int Settings = input.nextInt();

    switch (Settings) {
            case 1: System.out.println ("\nCall settings");
int Call = input.nextInt();
        switch (Call) {
        case 1:
             System.out.println ("\n Call settings");
        System.out.println ("1. Automatic redial");
        System.out.println ("2. Speed dialing"); 
        System.out.println ("3. Call waiting options");
         System.out.println ("4. Own number sending");
        System.out.println ("5. Phone line in use");
        System.out.println ("6. Automatic answer"); 
break;
}
int Phone = input.nextInt();
    switch (Phone) {
        case 2:
             System.out.println ("\n Phone settings");
        System.out.println ("1. Language");
        System.out.println ("2. Cell info display"); 
        System.out.println ("3. Welcome note");
        System.out.println ("4. Network selection");
        System.out.println ("5. light");
        System.out.println ("6. Confirm SIM service actions"); 
break;
}

int Security = input.nextInt();
    switch (Security) {
        case 3:
             System.out.println ("\n Security settings");
  System.out.println ("1. PIN code request");
        System.out.println ("2. Call barring service"); 
        System.out.println ("3. Closed user group");
        System.out.println ("4. Phone security");
        System.out.println ("5. Fixed dialing");
        System.out.println ("6. Change access codes");       
break;
}
            case 4: System.out.println("4. Restore factory settings.");
break;        
}

            case 7: System.out.println("7. Call divert.");
break;        

             case 8: System.out.println("8. Games.");
break;        
             case 9: System.out.println("9. Calculator.");
break;        
             case 10: System.out.println("10. Reminders.");
break;        
             case 11: System.out.println(" \nClock.");
                      System.out.println ("1. Alarm clock");
                      System.out.println ("2. Clock settings"); 
                      System.out.println ("3. Date settings");
                      System.out.println ("4. stopwatch");
                      System.out.println ("5. Countdown");
                      System.out.println ("6. Auto update of date and time");     
break;        
                        
           case 12: System.out.println("12. profiles");
break;        

             case 13: System.out.println("13. SIM service");
break;            

}

 }   
}

