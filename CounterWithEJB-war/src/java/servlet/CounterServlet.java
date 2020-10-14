package servlet;

import ejb.CounterEJBInterface;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Massi
 */
public class CounterServlet extends HttpServlet {

    
    /*protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }*/
    
    @EJB
    private CounterEJBInterface compteur;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

            String operation = "";
            //operation = request.getParameter("operation");

            if(operation.equals("incr")){
                compteur.incr();
            }else if(operation.equals("decr")){
                compteur.decr();
            }else if(operation.equals("raz")){
                compteur.raz();
            }

            /*String valeur = compteur.getValue()+"";
            request.setAttribute("valeur", valeur);*/
        
            request.setAttribute("valeur", "0");
        this.getServletContext().getRequestDispatcher("/CounterJsp.jsp").forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String operation = "";
            operation = request.getParameter("operation");

            System.out.println("Marche");    
            if(operation.equals("incr")){
                System.out.println("JY SUIISS");
                compteur.incr();
            }else if(operation.equals("decr")){
                compteur.decr();
            }else if(operation.equals("raz")){
                compteur.raz();
            }
            
            request.setAttribute("valeur", compteur.getValue()+"");
        
            //request.setAttribute("valeur", "BONOBO");
        this.getServletContext().getRequestDispatcher("/CounterJsp.jsp").forward(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
