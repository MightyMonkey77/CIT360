<%-- 
    Document   : reports
    Created on : Mar 30, 2019, 7:48:45 PM
    Author     : benjaminlangston
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="CSS/style.css" rel="stylesheet" type="text/css"/>
        <title>Reports</title>
        
  <!--      <style>

            fieldset {
                font-weight: bold;      
            }

            form {
                padding: 2em 2em 2em 2em;    
                background-color: gray;
                width: 50%;
                border: solid black;
                border-width: 1em;   
                margin-left: auto;
                margin-right: auto;
                
            }
            
            body {
                
                margin-left: auto;
                margin-right: auto;
                background-color: darkslategray;
            }

            center {
                background-color: gray; 
                padding: 2em;
                
            }
            
           

        </style> -->
    </head>
    <body>
        <div class="forms">
        <form action="<%=request.getContextPath()%>/InventoryReport"  method="get">
        <p><input type="submit"/> Inventory Report and Removal</p>
        <input type=button onClick="parent.location='userhome.jsp'" 
                   value='Return'>
  
        </form><br><br>
        
        <form action="<%=request.getContextPath()%>/UserReport"  method="get">
        <p><input type="submit"/> User Report and Removal</p>
        <input type=button onClick="parent.location='userhome.jsp'" 
                   value='Return'>
  
        </form><br><br>
        
        <form action="<%=request.getContextPath()%>/OnlineStoreController"  method="get">
        <p><input type="submit"/> Online Store items</p>
        <input type=button onClick="parent.location='userhome.jsp?id=22&uname=blangston&fname=Ben%20&lname=Langston'" 
                   value='Return'>
  
        </form><br><br>
        </div>
    </body>
</html>
