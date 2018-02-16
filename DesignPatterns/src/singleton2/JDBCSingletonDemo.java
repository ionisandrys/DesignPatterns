package singleton2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JDBCSingletonDemo {

	static int count = 1;
	static int choice;
	
	
	public static void main(String[] args) throws IOException {
		
		// getting the only object available
		JDBCSingleton jdbc = JDBCSingleton.getInstance(); 
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do{
			
			System.out.println("Operatiuni");  
	        System.out.println(" --------------------- ");  
	        System.out.println(" 1. Inserare ");  
	        System.out.println(" 2. Citire      ");  
	        System.out.println(" 3. Stergere    ");  
	        System.out.println(" 4. Update    ");  
	        System.out.println(" 5. Iesire      ");
			
	        System.out.print("\n");  
	        System.out.print("Alegeti o operatiune care va intereseaza: ");
	        
	        choice = Integer.parseInt(br.readLine());
	     
	        switch(choice){
	        
	       
	        case 1:{  
                System.out.print(" Introduceti un username: ");
                String username = br.readLine();
                System.out.println("Introduceti o parola");
                String password = br.readLine();
                
                try{
                	int i = jdbc.insert(username, password);
                	if(i>0){
                		System.out.println((count++)+" Date introduse cu succes! ");
                		
                	}else{
                		System.out.println("Date neinserate");
                	}
                	
                }catch(Exception e){
                	System.out.println(e);
                }
                	
               System.out.println("Apasati ENTER pentru a continua...");
               System.in.read();
                	
                	 }
	        break;
	        
	        case 2:{
	        	System.out.println("Introduceti username : ");
	        	String username = br.readLine();
	        
	        	try{
	        		jdbc.view(username);
	        		
	        		
	        	}catch(Exception e){
	        		System.out.println("Apasati ENTER pentru a continua....");
	        		System.in.read();
	        	}
	        	break;
	        }
	        	
	        	
	        	case 3:{
	        		System.out.print("Introduceti id-ul pentru care vreti sa stergeti datele");
	        		int id = Integer.parseInt(br.readLine());
	        		
	        		try{
	        			int i = jdbc.delete(id);
	        			if(i>0){
	        				System.out.println((count++)+ "Datele au fost eliminate...");
	        			}else{
	        				System.out.println("Datele nu au fost sterse!");
	        			}
	        			}catch(Exception e){System.out.println(e);}
	        		System.out.println("Apasati ENTER pentru a continua...");
	        		System.in.read();
	        		
	        	} break;
	        	
	        	
	        
	        
	        
	        case 4:{  
                System.out.print("Introduceti numele pentru care vreti sa updatati: ");  
                String username=br.readLine();  
                System.out.print("Introduceti noua parola... ");  
                String password=br.readLine();  
                  
                try {  
                        int i= jdbc.update(username, password);  
                        if (i>0) {  
                        System.out.println((count++) + " Datele au fost modificate");  
                        }  
                      
                    } catch (Exception e) {  
                      System.out.println(e);  
                    }  
                 System.out.println("Apasati ENTER pentru a continua...");  
                 System.in.read();  
                  
               }// end of case 4  
             break;  
               
         default:  
                 return;  
    }  
      
   } while (choice!=4);   
}  
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	       

}
