<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="../../../assets/css/list.css">
</head>
<body>
    
    <div class="container">
        <table>
            
            <thead>
                
                <tr>
                    
                    <th>N°</th>
                    <th>Nombre</th>
                    <th>Descripción</th>
                    <th>Actualizar</th>
                    <th>Eliminar</th>
                </tr>
                
            </thead>
            
            <tbody>
                <c:forEach var="publicacion" items="${publicar}">

                    <tr>
                    
                        <td id="publi">${publicacion.getidPublicacion()}</td>
                        <td>${publicacion.getnombreUsua()}</td>
                        <td>${publicacion.getdescripcion()}</td>
                        <td><input type="submit" value="actualizar"></td>
                        <td><input type="submit" value="eliminar"></td>
                     </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
    
    </div>
    
</body>
</html>