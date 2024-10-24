#DELETEDATA.java
<% 
 try{ 
 Class.forName("com.mysql.jdbc.Driver"); 
 Connection 
con=DriverManager.getConnection("jdbc:mysql://localhost/College", 
"root", ""); 
 Statement st=con.createStatement(); 
 String r; 
 r=request.getParameter("txtRlno"); 
 String qry="Delete from student where rlno="+r; 
 int rows = st.executeUpdate(qry); 
 out.println(rows+ "<b> Record(s) Deletede</b>"); 
 st.close();
 con.close();
 }catch(Exception e){ 
 e.printStackTrace(); 
 } 
 %>
