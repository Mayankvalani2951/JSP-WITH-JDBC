#INSERTDATA.java
<% 
 try{ 
 Class.forName("com.mysql.jdbc.Driver"); 
 Connection 
con=DriverManager.getConnection("jdbc:mysql://localhost/College", 
"root", ""); 
 Statement st=con.createStatement(); 
 String r,s,c; 
 r=request.getParameter("txtRlno"); 
 s=request.getParameter("txtName"); 
 c=request.getParameter("txtCity"); 
 String qry="Insert into student 
values("+r+",'"+s+"','"+c+"')"; 
 int rows = st.executeUpdate(qry); 
 out.println(rows+ "<b> Record(s) Inserted</b><br>"); 
 st.close(); 
 con.close(); 
 }catch(Exception e){ 
 e.printStackTrace(); 
 } 
 %> 