<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.io.*,java.util.List,java.util.ArrayList,ajax.metier.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>page d'enseignant</title>
<link rel="stylesheet" href="fonts/font.css">
<link rel="stylesheet" href="css/pageEnseign1.css">
<script type="text/JavaScript" src="js/fc.js"></script>

			
</head>
<body>
<div class="container">
        <div class="left-box">
   
            <ul>
             	
                <li class="item active">
                 <i class="icon icon-vault"></i>
                    
                    Mon emploi du temps
                </li>
                <li class="item">
                     <i class="icon icon-favorite"></i>
                    Bilan
                </li>
                <li class="item">
                    <i class="icon icon-file"></i>
                    Liste des étudiants
                </li>
                
                
                
            </ul>
            <div class="user-info">
                
                <span>Déconnexion</span>
                <i class="icon icon-gear"></i>
            </div>
        </div>
        <div class="right-box">
        	<div class="photo" style="width:127px;height:62px"> 
        	</div>
            <div class="top">
            	
                <span class="current-tag">Fiche d'appel</span>
               
                <div class="btn">
                    <i class="icon icon-search"></i>
                </div>
                
            </div>
            
           <div class="middle">
           <a href="ServletEnseignTest?login=bour@123.com&semaine=1">Retour</a>  
           <%  
           ArrayList<Etudiant> listEtudiant=new ArrayList<Etudiant>();
           if(listEtudiant!=null){
           listEtudiant=(ArrayList<Etudiant>)request.getAttribute("etudiants");
           out.println("<table>");
           out.println("<tr>");
           out.println("<th>Nom</th>");
           out.println("</tr>");
           for(Etudiant e:listEtudiant) {
        	   out.println("<tr>");
        	   out.println("<td>"+e.getNom()+"</td>");
        	   
			
				 out.println("</tr>");
			}
           out.println("</table>");}
           %>
           
        
           
   		   </div>
            <!--   <div class="handler"></div> -->
        </div>
    </div>
    <script >
 // 获取要操作的元素
    let items=document.querySelectorAll('.item');
    let current_tag=document.querySelector('.current-tag');
    let handler=document.querySelector('.handler');
    let left_box=document.querySelector('.left-box');

    // 设置选中项的样式
    function setActive(){
        items.forEach((item)=>{
            item.classList.remove('active');
        })
        this.classList.add('active');
        current_tag.innerText=this.innerText;
    }
    // 为每一个li设置点击事件
    items.forEach((item)=>{
        item.addEventListener('click',setActive);
    })

    handler.addEventListener('click',function(){
        if(!this.classList.contains('close')){
            left_box.style.width=0;
            this.classList.add('close');
        }else{
            left_box.style.width=250+'px';
            this.classList.remove('close');
        }
    })
   
    </script>
</body>
</html>