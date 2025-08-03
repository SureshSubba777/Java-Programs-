<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Process</title>
</head>
<body>
    <%
    // Initialize connection and statement objects to null
    Connection con = null;
    PreparedStatement ps = null;

    try {
        // 1. Correctly retrieve parameters and handle potential nulls
        // Using getParameter (correct spelling)
        String name = request.getParameter("Name");
        String password = request.getParameter("password");

        // Basic validation: Check if parameters are provided
        if (name == null || name.trim().isEmpty() || password == null || password.trim().isEmpty()) {
            out.print("<h3>Error: Name and password cannot be empty. Please go back and fill both fields.</h3>");
            return; // Stop further processing if inputs are invalid
        }

        // 2. Establish database connection
        // It's better to externalize credentials, but for demonstration, they are here.
        // In a real application, use JNDI or a configuration file.
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "@#$123Sh");

        // 3. Use Prepared Statement to prevent SQL Injection
        String sql = "INSERT INTO login (name, password) VALUES (?, ?)"; // Use actual column names
        ps = con.prepareStatement(sql);

        // Set the parameters for the prepared statement
        ps.setString(1, name);
        ps.setString(2, password);

        // 4. Execute the update
        int rowsAffected = ps.executeUpdate();

        if (rowsAffected > 0) {
            out.print("<h3>Login successfully! Welcome, " + name + "!</h3>");
        } else {
            out.print("<h3>Login failed. No rows affected.</h3>");
        }

    } catch (SQLException e) {
        // 5. Handle SQL exceptions
        out.print("<h3>Database Error: An error occurred during the login process. Please try again later.</h3>");
        out.print("<p>Error Details: " + e.getMessage() + "</p>"); // For debugging, remove in production
        e.printStackTrace(); // Log the stack trace to the server console
    } catch (Exception e) {
        // 6. Handle any other unexpected exceptions
        out.print("<h3>An unexpected error occurred.</h3>");
        out.print("<p>Error Details: " + e.getMessage() + "</p>"); // For debugging, remove in production
        e.printStackTrace(); // Log the stack trace
    } finally {
        // 7. Close database resources in a finally block to ensure they are released
        // even if an exception occurs. Close in reverse order of creation.
        try {
            if (ps != null) {
                ps.close();
            }
        } catch (SQLException e) {
            System.err.println("Error closing PreparedStatement: " + e.getMessage());
        }
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            System.err.println("Error closing Connection: " + e.getMessage());
        }
    }
    %>
</body>
</html>