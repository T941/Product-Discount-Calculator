import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;

@WebServlet(name = "DiscountCalculatorServlet",urlPatterns = "/calculator")
public class DiscountCalculatorServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String productDescription = request.getParameter("productDescription");
        float listPrice = Float.parseFloat(request.getParameter("listPrice"));
        float discount = Float.parseFloat(request.getParameter("discountPercent"));
        float discountPercent = discount / 100;
        float discountAmount = (float) (discountPercent * listPrice * 0.1);
        float discountPrice = listPrice - discountAmount;
        PrintWriter writer=response.getWriter();
        DecimalFormat decimalFormat=new DecimalFormat("#");
        writer.println("<html>");
        writer.println("Discount Amout: "+decimalFormat.format(discountAmount)+"$<br>");
        writer.println("Discount Price: "+decimalFormat.format(discountPrice)+"$");
        writer.println("</html>");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
