package Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@WebServlet(name = "DownLoadServlet")
public class DownLoadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        response.setHeader("Content-disposition","attachment;filename="+java.net.URLEncoder.encode("下载.jpg","utf-8"));
        try {

            File f=new File(getServletContext().getRealPath("./")+"upload"+File.separator+"1.jpg");
            FileInputStream in=new FileInputStream(f);
            OutputStream outputStream=response.getOutputStream();

            int n=0;
            byte b[]=new byte[500];
            while ((n=in.read(b))!=-1){
                outputStream.write(b,0,n);
            }
           outputStream.close();
            in.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
