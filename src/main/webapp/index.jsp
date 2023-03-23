<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no">
	<title>UT1 - gestion de l’appel </title>
	<link rel="stylesheet" href="css/index.css">
</head>
<body>
  <section>
       
        <div class="box">
            <!-- 背景圆 -->
            <div class="circle" style="--x:0"></div>
            <div class="circle" style="--x:1"></div>
            <div class="circle" style="--x:2"></div>
            <div class="circle" style="--x:3"></div>
            <div class="circle" style="--x:4"></div>
            <!-- 登录框 -->
            <div class="container">
                <div class="form">
                    <h2>AUTHENTIFICATION</h2>
                    <form action="CtrlConnection" method="get">
                        <div class="inputBox">
                            <input type="text" name="id" placeholder="IDENTIFIANT">

                        </div>
                        <div class="inputBox">
                            <input type="password" name="pwd" placeholder="MOT DE PASSE">

                        </div>
                        <div class="radio">
                        	<label><input type="radio" name="type">Etudiant</label>
                        	<label><input type="radio" name="type">Enseignant</label>
                        	<label><input type="radio" name="type">Scolarite</label>
                        </div>
                        <div class="inputBox">
                            <input type="submit" value="SE CONNECTER">

                        </div>
                        
                    </form>
                </div>
            </div>
        </div>
    </section>

</body>

</html>
