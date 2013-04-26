/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Visit.Function;


import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author 猫的鱼儿
 */
public class Checkimage extends HttpServlet {

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
        
        System.out.println("hello");
        
        HttpSession session =request.getSession(false);
        response.setContentType("image/gif");
        response.setHeader("Pragma", "No-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        int width=80,height=30;
        BufferedImage image=new BufferedImage(width,height,
        BufferedImage.TYPE_INT_BGR);//表示一个具有 8 位 RGB 颜色分量的图像，对应于 Windows 或 Solaris 风格的 BGR 颜色模型，具有打包为整数像素的 Blue、Green 和 Red 三种颜色。
        Graphics g=image.getGraphics();//获取图形上下文
        Random random=new Random();
        g.setColor(getRandColor(200,250));//背景颜色
        g.fillRect(0, 0, width, height);
        for(int i=0;i<155;i++)
        {
            int x_1=random.nextInt(width);
            int y_1=random.nextInt(height);
            int x_2=random.nextInt(width);
            int y_2=random.nextInt(height);
            g.drawLine(x_1, y_1, x_2, y_2);
        }
        String sRand="";
        for(int i=0;i<4;i++)
        {
            String rand=String.valueOf(random.nextInt(10));
            sRand+=rand;
            //将验证码显示到图像中
            g.setColor(new Color(20+random.nextInt(110),20+random.nextInt(110),
                20+random.nextInt(110)));
            //设置随机字符的颜色
            g.drawString(rand,13*i+6,16);
        }
        ServletOutputStream out=response.getOutputStream();
        session.setAttribute("random", sRand);
        JPEGImageEncoder encoder=JPEGCodec.createJPEGEncoder(out);
        encoder.encode(image);
        out.close();
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

    private Color getRandColor(int fc, int bc) {
        Random random=new Random();
        if(fc>255)fc=255;
        if(bc>255)bc=255;
        int r=fc+random.nextInt(bc-fc);
        int b=fc+random.nextInt(bc-fc);
        int g=fc+random.nextInt(bc-fc);
        return new Color(r,b,g);
    }
}
