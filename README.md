# JDBC_Tutorial_Telusko

## Types of JDBC Drivers:
- **Type-1 driver or JDBC-ODBC bridge driver**
- **Type-2 driver or Native-API driver**
- **Type-3 driver or Network Protocol driver**
- **Type-4 driver or Thin driver**

## Steps:
1] import the pkg (java.sql.*)
2] load and register the driver class (mysql: com.mysql.jdbc.driver)
- **Class.forName('com.mysql.jdbc.driver)**
3] establish connection
- **Connection con=DriverManager.getConnection(url,name,pass);**
4] create statement (statement, prepared statement, callable statement)
- **Statement st=con.createStatement();**
5] execute query
- **ResultSet rs=st.executeQuery('select * from Student');**
6] process results
7] close connection
