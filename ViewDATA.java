#ViewDATA.java
<%
try{
 Class.forName("com.mysql.jdbc.Driver"); 
 Connection 
con=DriverManager.getConnection("jdbc:mysql://localhost/College", 
"root", ""); 
 Statement st=con.createStatement(); 
 String qry="select * from student"; 
 ResultSet rs = st.executeQuery(qry); 
 out.println("<table border=1>"); 
 out.println("<thead><b>Student's List</b></thead>"); 
 out.println("<tr>"); 
 out.println("<th>Rlno<th>Name<th>City</tr>"); 
 while(rs.next()){ 
 int r; 
 String s,c; 
 r=rs.getInt("rlno"); 
 s=rs.getString("sname"); 
 c=rs.getString("city"); 
 out.println("<tr>"); 
 out.println("<td>"+r+"<td>"+s+"<td>"+c+"</tr>"); 
 } 
 out.println("</table>"); 
 rs.close(); 
 st.close(); 
 con.close(); 
 }catch(Exception e){ 
 e.printStackTrace(); 
 } 
 %>