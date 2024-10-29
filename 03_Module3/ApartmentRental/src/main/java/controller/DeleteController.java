package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@WebServlet(name = "deleteController",value = "/delete")
public class DeleteController extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response){
//        showDelete(request, response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String state = request.getParameter("state");
        switch (state){
            case "confirm":
                showDelete(request, response);
                break;
            case "yes":
                doDelete(request, response);
        }

    }

    public static void showDelete(HttpServletRequest request, HttpServletResponse response) {

        RequestDispatcher rd = request.getRequestDispatcher("view/delete.jsp");
        String[] deleteId = request.getParameterValues("isdelete");
//        System.out.println(Arrays.toString(deleteId));
//        System.out.println();
        request.setAttribute("deleteId", Arrays.asList(deleteId));


        try {
            rd.forward(request, response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("view/home.jsp");
        String deleteId = request.getParameter("deleteId");
        System.out.println("deleteId");
        System.out.println(deleteId);

        response.sendRedirect(request.getContextPath() + "/home");
    }
}
