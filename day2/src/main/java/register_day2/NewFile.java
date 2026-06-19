package register_day2;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/NewFile")
public class NewFile extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String mobNo = request.getParameter("mobNo");
        String address = request.getParameter("address");
        String pass = request.getParameter("pass");

        try {

            long phoneNo = Long.parseLong(mobNo);

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/batch432",
                    "root",
                    "root");

            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO register(name,email,mobNo,address,password) VALUES(?,?,?,?,?)");

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setLong(3, phoneNo);   // Corrected
            ps.setString(4, address);
            ps.setString(5, pass);

            int check = ps.executeUpdate();

            if (check > 0) {
                out.println("<h2 style='color:green'>Registration Successful!</h2>");
            } else {
                out.println("<h2 style='color:red'>Registration Failed!</h2>");
            }

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
            out.println("<h2 style='color:red'>Error : " + e.getMessage() + "</h2>");
        }
    }
}