<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>form processing</title>
</head>
<body>
    <font aria-setsize="3"">
        <br> <br> <center>
            <h2>
                Processing Html form
                <hr color="red" size="3">
                <% 
                int x = Integer.parseInt(request.getParameter("first"));
                int y = Integer.parseInt(request.getParameter("Second"));
                int z = x+y;
                out.println("Sum: "+z);
                %>

            </h2>
        </center>

    </font>
</body>
</html>