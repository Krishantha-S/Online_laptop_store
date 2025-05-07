<%-- 
    Document   : all_recent_laps
    Created on : 05-May-2024, 11:02:23
    Author     : wwwkr
--%>

<%@page import="java.util.List"%>
<%@page import="entity.LapDtls"%>
<%@page import="DAO.LapDAOImpl"%>
<%@page import="DB.DBConnect"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>All Recent Laptops</title>
        <%@include file="allComponent/allCss.jsp" %>
        <style type="text/css">
            .crd-ho:hover{
                background-color: #fcf7f7; 
            }
        </style>
    </head>
    <body>
        <%@include file="allComponent/navbar.jsp" %>

        <div class="container-fluid">
            <div class="row p-3">

                    <%
                        LapDAOImpl dao2 = new LapDAOImpl(DBConnect.getConn());
                        List<LapDtls> list2 = dao2.getAllRecentLaps();
                        for (LapDtls b : list2) {%>
                    <div class="col-md-3">
                        <div class="card crd-ho mt-2">
                            <div class="card-body text-center">
                                <img alt="" src="laptop/<%=b.getPhotoName()%>" style="width:150px; height: 150px;" class="img-thumblin">
                                <p><%=b.getLapName()%></p>
                                <p>

                                    <%
                                    if (b.getLapCategory().equals("Old")) {%>
                                    Categories:<%=b.getLapCategory()%></p>
                                <div class="row text-center">
                                    <a href="" class="btn btn-success btn-sm ml-5">View Details</a>
                                    <a href="" class="btn btn-danger btn-sm ml-1"><%=b.getPrice()%></a>
                                </div>
                                <%} else {%>
                                Categories:<%=b.getLapCategory()%></p>
                                <div class="row text-center">
                                    <a href="" class="btn btn-danger btn-sm ml-5"><i class="fa-solid fa-cart-plus"></i>Add</a>
                                    <a href="" class="btn btn-success btn-sm ml-1">View Details</a>
                                    <a href="" class="btn btn-danger btn-sm ml-1"><%=b.getPrice()%></a>
                                </div>
                                <%}
                                %>    
                            </div>
                        </div>
                    </div>
                    <% }
                    %>  
                </div>
            </div>
        
    </body>
</html>
