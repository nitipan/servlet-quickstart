<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <title>Document</title>

    <link href="<c:url value="/css/styles.css" />" rel="stylesheet">
    <script src="<c:url value="/js/app.js" />"></script>
  </head>
  <body>
    <h2>Hello ${name}</h2>
  </body>
</html>
