<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>page de scolarité</title>
<link rel="stylesheet" href="fonts/font.css">
<link rel="stylesheet" href="css/pageEtu1.css">
</head>
<body>
<div class="container">
        <div class="left-box">
   
      
            <ul>
             	
                <li class="item active">
                    <i class="icon icon-file"></i>
                    Liste de justificatifs d'absence
                </li>
                 <!-- <li class="item">
                     <i class="icon icon-transfer"></i>
                    Mon absence
                </li>
                 <li class="item">
                    <img scr="image/ut1.png">
                </li>
               <li class="item">
                    <i class="icon icon-like"></i>
                    收藏夹
                </li>
                <li class="item">
                    <i class="icon icon-vault"></i>
                    保险箱
                </li>
                <li class="item">
                    <i class="icon icon-favorite"></i>
                    订阅
                </li>
                <li class="item">
                    <i class="icon icon-trash"></i>
                    回收站
                </li> 
                <hr>
                <li class="item">
                    <i class="icon icon-transfer"></i>
                    传输列表
                </li>-->
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
            	
                <span class="current-tag"> Liste de justificatifs d'absence</span>
               
                <div class="btn">
                    <i class="icon icon-search"></i>
                </div>
                
            </div>
            
           <div class="middle">
  				<table style="text-align:center">
	  				<tr>
					    <th>Date</th>
					    <th>Cours</th>
					    <th>Etudiant</th>
					    <th>Enseignant</th>
					    <th>Fichier</th>
					    <th>Etat</th>
					    
					  </tr>
					  <tr>
					    <td>Alfreds Futterkiste</td>
					    <td>Maria Anders</td>
					    <td>Germany</td>
					    <td>Germany</td>
					  </tr>
					
  				</table>
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