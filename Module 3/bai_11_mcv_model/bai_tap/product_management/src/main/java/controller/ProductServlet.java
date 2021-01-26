package controller;

import model.Product;
import service.ProductService;
import service.impl.ProductServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet" , urlPatterns = {"","/products"})
public class ProductServlet extends HttpServlet {
    private ProductService productService = new ProductServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null) {
            updateProduct(request, response);

        }else if(action.equals("create")){
            create(request,response);

        }else if(action.equals("delete")){
            deleteProduct(request,response);

        }else if(action.equals("edit")){
            updateProduct(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null){
            listProduct(request,response);
        }else if(action.equals("view")){
            viewProduct(request,response);

        }else if(action.equals("edit")){
            showEditForm(request,response);

        }else if(action.equals("create")){
            request.getRequestDispatcher("create.jsp").forward(request,response);

        }else if(action.equals("delete")){
            showDeleteForm(request,response);

        }
    }

    private void showDeleteForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer id = Integer.parseInt(request.getParameter("id"));
        Product product = productService.findById(id);
        request.setAttribute("product",product);
        request.getRequestDispatcher("delete.jsp").forward(request,response);
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer id = Integer.parseInt(request.getParameter("id"));
        Product product = productService.findById(id);
        request.setAttribute("product",product);
        request.getRequestDispatcher("edit.jsp").forward(request,response);
    }

    private void viewProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer id = Integer.parseInt(request.getParameter("id"));
        Product product = productService.findById(id);
        request.setAttribute("product",product);
        request.getRequestDispatcher("view.jsp").forward(request,response);
    }

    private void create(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer id = productService.getSize()+1;
        String name = request.getParameter("price");
        Double price = Double.valueOf(request.getParameter("price"));
        String description = request.getParameter("description");
        String brand = request.getParameter("brand");
        productService.save(new Product(id,name,price,description,brand));
        listProduct(request,response);
    }

    private void updateProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer id = Integer.valueOf(request.getParameter("id"));
        String name = request.getParameter("name");
        Double price = Double.valueOf(request.getParameter("price"));
        String description = request.getParameter("description");
        String brand = request.getParameter("brand");
        productService.save(new Product(id,name,price,description,brand));
        listProduct(request,response);
    }
    private void deleteProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer id = Integer.valueOf(request.getParameter("id"));
        productService.deleteById(id);
        listProduct(request,response);
    }
    private void listProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product> products = productService.findAll();
        request.setAttribute("productFromServlet",products);
        request.getRequestDispatcher("list.jsp").forward(request,response);
    }
}
