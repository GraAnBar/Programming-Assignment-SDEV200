import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Exercise14 extends HttpServlet {

    
    public void services(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        int count = 0;
        
        int first = Integer.parseInt(request.getParameter("one").trim());
        int second = Integer.parseInt(request.getParameter("two").trim());
        int third = Integer.parseInt(request.getParameter("three").trim());
        int fourth = Integer.parseInt(request.getParameter("four").trim());
        int fifth = Integer.parseInt(request.getParameter("five").trim());
        int sixth = Integer.parseInt(request.getParameter("six").trim());
        int seventh = Integer.parseInt(request.getParameter("seven").trim());
        int eighth = Integer.parseInt(request.getParameter("eight").trim());
        int nineth = Integer.parseInt(request.getParameter("nine").trim());
        int tenth = Integer.parseInt(request.getParameter("ten").trim());
        
        if(20 + 6 == first)
           count++;
        if(27 + 6 == second)
           count++;
        if(28 + 8 == third)
           count++;
        if(28 + 10 == fourth)
           count++;
        if(28 + 7 == fifth)
           count++;
        if(29 + 10 == sixth)
           count++;
        if(22 + 9 == seventh)
           count++;
        if(29 + 12 == eighth)
           count++;
        if(21 + 6 == nineth)
           count++;
        if(27 + 12 == tenth)
           count++;
        out.println("<html><body>");
        
        out.println("20 + 6 = "+first+""+( 20 + 6 == first ? "Correct" : "Wrong" ) + "<br>");
       out.println("27 + 6 = "+second+""+( 27 + 6 == second ? "Correct" : "Wrong" )+ "<br>");
       out.println("\n28 + 8 = "+third+""+( 28 + 8 == third ? "Correct" : "Wrong" )+ "<br>");
       out.println("\n28 + 10 = "+fourth+""+( 28 + 10 == fourth ? "Correct" : "Wrong" )+ "<br>");
       out.println("\n28 + 7 = "+fifth+""+( 28 + 7 == fifth ? "Correct" : "Wrong" )+ "<br>");
       out.println("\n29 + 10 = "+sixth+""+( 29 + 10 == sixth ? "Correct" : "Wrong" )+ "<br>");
       out.println("\n22 + 9 = "+seventh+""+( 22 + 9 == seventh ? "Correct" : "Wrong" )+ "<br>");
       out.println("\n29 + 12 = "+eighth+""+( 29 + 12 == eighth ? "Correct" : "Wrong" )+ "<br>");
       out.println("\n21 + 6 = "+nineth+""+( 21 + 6 == nineth ? "Correct" : "Wrong" )+ "<br>");
       out.println("\n27 + 12 = "+tenth+""+( 27 + 12 == tenth ? "Correct" : "Wrong" )+ "<br>");

       out.println("The total Correct count is : "+count);

       out.println("</body></html>");

       out.close();
    }

}
