
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
    <h4>Actualizar publicacion</h4>
    <input class="controls" type="text" name="idUsuario" id="idUsuario" placeholder="Ingrese su id">
    <input class="controls" type="text" name="nombreUsua" id="nombreUsua" placeholder="Ingrese su nuevo nombre">
    <input class="controls" type="text" name="descripcion" id="descripcion" placeholder="Ingrese su nueva descripcion">
    <input class="controls" type="password" name="correo" id="correo" placeholder="Ingrese su Contraseña">
    <p>Estoy de acuerdo con <a href="#">Terminos y Condiciones</a></p>
    <input class="botons" type="submit" name="accion" value="Actualizar">
   
    </form>
  </section>

</body>
</html>