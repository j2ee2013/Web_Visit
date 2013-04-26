/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Visit.Control;

import java.io.IOException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Visit.Entity.User;

/**
 *
 * @author 猫的鱼儿
 */
public class ManageLogin extends HttpServlet {

    @PersistenceContext(unitName="Web_VisitPU")
    EntityManager em;
    
    
    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String userName = request.getParameter("userName");
        String userPwd = request.getParameter("userPwd");
        
        System.out.println("name="+userName+";pwd="+userPwd);
        
        //request.setAttribute("checkuserinfo", CheckUserInfo(userName,userPwd));
        if(CheckUserInfo(userName,userPwd)){
            request.getRequestDispatcher("success.jsp").forward(request, response);
        }else{
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private boolean CheckUserInfo(String userName,String userPwd) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        Query query=em.createNamedQuery("User.checkUserInfo");
        query.setParameter("userName", userName);
        query.setParameter("userPwd", userPwd);
        if(query.getResultList().isEmpty())
            return false;
        else return true;
    }
}
