<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>page d'eudiant</title>
<link rel="stylesheet" href="fonts/font.css">
<link rel="stylesheet" href="css/pageEtu1.css">
</head>
<body>
<div class="container">
        <div class="left-box">
   
      
            <ul>
             	
                <li class="item active">
                    <i class="icon icon-file"></i>
                    Mon profil
                </li>
                <li class="item">
                     <i class="icon icon-transfer"></i>
                    Mon absence
                </li>
                 <li class="item">
                    <img scr="image/ut1.png">
                </li>
               <!--  <li class="item">
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
            	
                <span class="current-tag">Mon profil</span>
               
                <div class="btn">
                    <i class="icon icon-search"></i>
                </div>
                
            </div>
            
           <div class="middle">
  
           		<div> <b>Nom : </b>hh</div>
            	<div> Prenom :</div>
            	<div> Email :</div>
            	<div> Type :</div>
            	<div> Formation :</div>
            	<div> Photo :</div>
            	 <!--<div class="col-md-2" style="margin-top: 10px;">
    				<label class="control-label file" style="position: relative;">
	        			<div>           
	            		<img id="userUrl"  style="border-radius: 100px;" src="${user.userUrl}"> 
	        			</div>
	        			<input type="file" id="photo" style="position: absolute;font-size: 18px;right: 0;top: 0;opacity: 0;">
	        			<input type="hidden" id="userId" style="position: absolute;font-size: 18px;right: 0;top: 0;opacity: 0;" value="${user.userId}">
   				   </label>
    				<p style="margin-left: 20px;">点击头像选择图片，再点击上传</p>
    				<input id="changeBtn" style="width: 100px;margin-left: 20px;" class="btn btn-info" value="上传" >
				</div>-->
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