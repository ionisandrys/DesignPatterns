package singleton2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCSingleton {

	// create a JDBCSingleton class
	// static member holds only one instance of this class
	
	private static JDBCSingleton jdbc;
	
	// preventing instantiation of this class from any other class
	private JDBCSingleton(){}
	
	// providing global point of access
	
	public static JDBCSingleton getInstance(){
		
		if(jdbc==null){
			jdbc = new JDBCSingleton();
		}
		
		return jdbc;
	}
	
	
		// get the connection from methods 
	
	private static Connection getConnection() throws ClassNotFoundException, SQLException{
		
		Connection conn = null;
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/singleton?useSSL=false", "student", "student" );
		return conn;
	}
	
	// insert a record in database table
	
	public int insert(String name, String pass) throws SQLException{
		
		Connection c = null;
		
		PreparedStatement ps = null;
		
		int recordCounter = 0;
		
		try{
			
			c= this.getConnection();
			ps = c.prepareStatement("insert into userdata(name,pass) values(?,?)");
			ps.setString(1, name);
			ps.setString(2, pass);
			recordCounter = ps.executeUpdate();
			
			
			} catch(Exception e){e.printStackTrace();}
		finally{
			if (ps!=null){  
                ps.close();  
            }if(c!=null){  
                c.close(); 
		}
		
	}
	
	return recordCounter;
	
	
	
	
	
	}
	
	// viewing data
	
	
	public void view(String name) throws SQLException{
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try{
			
			conn = this.getConnection();
			ps = conn.prepareStatement("select * from userdata where name=?");
			ps.setString(1, name);
			rs=ps.executeQuery();
			while(rs.next()){
				System.out.println("Name= "+ rs.getString(2)+"\t"+"Password= "+ rs.getString(3));
			}}
			
			 catch (Exception e) { System.out.println(e);}  
	          finally{  
	                    if(rs!=null){  
	                        rs.close();  
	                    }if (ps!=null){  
	                      ps.close();  
	                  }if(conn!=null){  
	                      conn.close();  
	                  }   
	                }  
			
			}
		
		public int update(String name, String password) throws SQLException{
			
			Connection c = null;
			PreparedStatement ps = null;
			
			int recordCounter = 0;
			
			try{
				
				c=this.getConnection();
				ps=c.prepareStatement(" update userdata set pass=? where name='"+name+"' ");
			ps.setString(1, password);
			recordCounter = ps.executeUpdate();
				
				}catch (Exception e) {  e.printStackTrace(); } finally{  
                
            if (ps!=null){  
                ps.close();  
            }if(c!=null){  
                c.close();  
            }   
         }  
       return recordCounter;  
    }  
		
	
	
//to delete the data from the database   
public int delete(int id) throws SQLException{  
     Connection c=null;  
     PreparedStatement ps=null;  
     int recordCounter=0;  
     try {  
              c=this.getConnection();  
             ps=c.prepareStatement(" delete from userdata where id='"+ id+"' ");  
             recordCounter=ps.executeUpdate();  
     } catch (Exception e) { e.printStackTrace(); }   
     finally{  
     if (ps!=null){  
             ps.close();  
    }if(c!=null){  
             c.close();  
     }   
  }  
    return recordCounter;  
 }  
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


