package controller;

import bean.User;
import service.UserService;
import service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "UserServlet", urlPatterns = "/user")
public class UserServlet extends HttpServlet {
    static UserService userService = new UserServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String action = request.getParameter("actionUser");
            if(action.equals("create")){
                create(request,response);

            }else if(action.equals("delete")){
                delete(request,response);

            }else if(action.equals("update")){
                update(request,response);

            }if(action == null){

        }
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("actionUser");
        if(action == null){
            list(request,response);
        }else if(action.equals("create")){
                showCreateForm(request,response);
        }else if(action.equals("delete")){
            showDeleteForm(request,response);

        }else if(action.equals("view")){
            view(request,response);

        }else if(action.equals("update")){
            showFormUpdate(request,response);
        }else if(action.equals("find")){
            findUser(request,response);
        }else if(action.equals("permision")){
            addUserPermision(request, response);
        }else if(action.equals("permision_without_transaction")){
            userService.insertWithoutTransaction();
        }
    }

    private void addUserPermision(HttpServletRequest request, HttpServletResponse response) {
        userService.addUserTransaction();
    }

    private void findUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String country = request.getParameter("byCountry");
        List<User> userList = userService.findByCountry(country);
        request.setAttribute("userList",userList);
        request.setAttribute("byCountry",country);
        request.getRequestDispatcher("find_by_country.jsp").forward(request,response);
    }

    private void create(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        Integer id = Integer.valueOf(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");
//        userService.save(new User( name,email,country));
        try {
            userService.insertUserStore(new User(name,email,country));
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        list(request,response);
    }

    private void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer id = Integer.valueOf(request.getParameter("id"));
//        userService.deleteById(id);
        userService.deleteByIdStore(id);
        list(request,response);
    }

    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("create.jsp").forward(request,response);
    }

    private void showDeleteForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer id = Integer.valueOf(request.getParameter("id"));
        User user = userService.findById(id);
        request.setAttribute("user",user);
        request.getRequestDispatcher("delete.jsp").forward(request,response);

    }

    private void view(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer id = Integer.valueOf(request.getParameter("id"));
//        User user = userService.findById(id);
        User user = userService.getUserById(id);
        request.setAttribute("user",user);
        request.getRequestDispatcher("view.jsp").forward(request,response);
    }

    private void showFormUpdate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer id = Integer.valueOf(request.getParameter("id"));
        User user = userService.findById(id);
        request.setAttribute("user",user);
        request.getRequestDispatcher("update.jsp").forward(request,response);
    }

    private void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        List<User> userList = userService.findAll();
        List<User> userList = userService.findAllStore();
        request.setAttribute("userList",userList);
        request.getRequestDispatcher("list.jsp").forward(request,response);
    }
    private void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer id = Integer.valueOf(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");
//        userService.save(new User(id,name,email,country));
        userService.updateByIdStore(name,email,country,id);
        list(request,response);
    }
}
