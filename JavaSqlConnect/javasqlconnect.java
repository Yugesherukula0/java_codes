import java.sql.*;

public class javasqlconnect{
    public static void main(String[] args) throws ClassNotFoundException,SQLException{
        // loading driver class
        Class.forName("com.mysql.cj.jdbc.Driver");
        // establishing the connection
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3360/intro","root","root");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from emp");
        while(rs.next()){
            System.out.print(rs.getInt("empno")  );
            System.out.println(rs.getString("ename"));
            System.out.println(rs.getString("job"));
            System.out.println(rs.getInt("mgr"));
            System.out.println(rs.getDate("hiredate"));
            System.out.println(rs.getInt("comm"));
            System.out.println(rs.getInt("deptno"));
        }

    }
    
}