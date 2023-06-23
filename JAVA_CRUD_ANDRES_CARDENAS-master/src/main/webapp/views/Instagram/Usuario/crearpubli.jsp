<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <link rel="stylesheet" href="../../../assets/css/registroIns.css">
  <title>Formulario Registro</title>
</head>
<body>
  <section class="form-register">
    <form action="publicacion" method="post">
    <h4>Formulario Registro</h4>
        
    <input class="controls" type="text" name="nombres" id="nombres" placeholder="Ingrese su Nombre">
    
    <input class="controls" type="email" name="descripcion" id="descripcion" placeholder="Ingrese una descripcion">
    
    
    <input class="botons" type="submit" name="accion" value="Registrar">
  </form> 
  </section>

</body>
</html>