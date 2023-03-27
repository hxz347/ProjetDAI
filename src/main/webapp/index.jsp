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
                    <form action="CtrlPageConnexion" method="post">
                        <div class="inputBox">
                            <input type="text" name="id" placeholder="IDENTIFIANT" required="required">

                        </div>
                        <div class="inputBox">
                            <input type="password" name="pwd" placeholder="MOT DE PASSE" required="required">

                        </div>
                        <div class="radio">
                        	<label><input type="radio" name="type" value="Etudiant" required="required">Etudiant</label>
                        	<label><input type="radio" name="type" value="Enseignant" required="required">Enseignant</label>
                        	<label><input type="radio" name="type" value="Scolarite" required="required">Scolarite</label>
                        </div>
                        <div class="inputBox">
                            <input type="submit" value="SE CONNECTER">

                        </div>
                        
                    </form>
                    <div class="MessageAlter">${requestScope.msg_erreur}</div>
                </div>
            </div>
        </div>
    </section>

</body>

</html>
