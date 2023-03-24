<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.io.*,java.util.List,java.util.ArrayList,ajax.metier.Seance"%>
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
            	
                <span class="current-tag">Mon emploi du temps</span>
               
                <div class="btn">
                    <i class="icon icon-search"></i>
                </div>
                
            </div>
            
           <div class="middle">
           <p><a href="ServletEnseignTest?login=bour@123.com&semaine=1">Semaine1</a>  <a href="ServletEnseignTest?login=bour@123.com&semaine=2">Semaine2</a></p>
           <%  ArrayList<Seance> seances=new ArrayList<Seance>();
           seances=(ArrayList<Seance>)request.getAttribute("seances");
           %>
           
        
       
           
           		<table class="tftable" style="height: 600px;float: right;border: 1px solid white;border-collapse: collapse;">
								<thead style="text-align: center;">
									<tr style="height: 45px;width:80px">
										<th scope="col" style="width:80px"></th>
										<th scope="col">Lundi</th>
										<th scope="col">Mardi</th>
										<th scope="col">Mercredi</th>
										<th scope="col">Jeudi</th>
										<th scope="col">Vendredi</th>
									</tr>
								</thead>

								<tbody style="text-align: center;">
									<tr style="height: 45px;">
										<th scope="row" >8:00-9:30
										</th>
										<td id="table_1_1" style="width: 130px;"> 
										<%if(seances!=null){
				            					String tempsDeb="08:00";
				            					String tempsFin="09:30";
			                					for(int i=0;i<seances.size();i++){
			                						if(seances.get(i).getNumeroSemaine()==1){
			                							if(tempsDeb.equals(seances.get(i).getHeureDebut()) || tempsFin.equals(seances.get(i).getHeureFin())){
			                								out.println("<p style='color:red'><a href=ServletFicheAppel?idC="+seances.get(i).getC().getIdC()+"&idS="+seances.get(i).getIdSeance()+">"+seances.get(i).getC().getNomc()+"</a></p>");
			                									
			                							}
			                						}} }
			                						%>
									         </td>
										<td id="table_2_1">
										<%if(seances!=null){
				            					String tempsDeb="08:00";
				            					String tempsFin="09:30";
			                					for(int i=0;i<seances.size();i++){
			                						if(seances.get(i).getNumeroSemaine()==2){
			                							if(tempsDeb.equals(seances.get(i).getHeureDebut()) || tempsFin.equals(seances.get(i).getHeureFin())){
			                								out.println(seances.get(i).getC().getNomc());}
			                						}} }%>
										</td>
										<td id="table_3_1"><%if(seances!=null){
				            					String tempsDeb="08:00";
				            					String tempsFin="09:30";
			                					for(int i=0;i<seances.size();i++){
			                						if(seances.get(i).getNumeroSemaine()==3){
			                							if(tempsDeb.equals(seances.get(i).getHeureDebut()) || tempsFin.equals(seances.get(i).getHeureFin())){
			                								out.println(seances.get(i).getC().getNomc());}
			                						}} }%></td>
										<td id="table_4_1">
										<%if(seances!=null){
				            					String tempsDeb="08:00";
				            					String tempsFin="09:30";
			                					for(int i=0;i<seances.size();i++){
			                						if(seances.get(i).getNumeroSemaine()==4){
			                							if(tempsDeb.equals(seances.get(i).getHeureDebut()) || tempsFin.equals(seances.get(i).getHeureFin())){
			                								out.println(seances.get(i).getC().getNomc());}
			                						}} }%></td>
										<td id="table_5_1">
										<%if(seances!=null){
				            					String tempsDeb="08:00";
				            					String tempsFin="09:30";
			                					for(int i=0;i<seances.size();i++){
			                						if(seances.get(i).getNumeroSemaine()==5){
			                							if(tempsDeb.equals(seances.get(i).getHeureDebut()) || tempsFin.equals(seances.get(i).getHeureFin())){
			                								out.println(seances.get(i).getC().getNomc());}
			                						}} }%></td>

									</tr>
									<tr style="height: 45px">
										<th scope="row">9:30-11:00
										</th>
										<td id="table_1_2">
										<%if(seances!=null){
				            					String tempsDeb="09:30";
				            					String tempsFin="11:00";
				            					for(int i=0;i<seances.size();i++){
			                						if(seances.get(i).getNumeroSemaine()==1){
			                							if(tempsDeb.equals(seances.get(i).getHeureDebut()) || tempsFin.equals(seances.get(i).getHeureFin())){
			                								out.println(seances.get(i).getC().getNomc());}
			                							}} }%>
										</td>
										<td id="table_2_2">
										<%if(seances!=null){
				            					String tempsDeb="09:30";
				            					String tempsFin="11:00";
				            					for(int i=0;i<seances.size();i++){
			                						if(seances.get(i).getNumeroSemaine()==2){
			                							if(tempsDeb.equals(seances.get(i).getHeureDebut()) || tempsFin.equals(seances.get(i).getHeureFin())){
			                								out.println(seances.get(i).getC().getNomc());}
			                							}} }%></td>
										<td id="table_3_2">
										<%if(seances!=null){
				            					String tempsDeb="09:30";
				            					String tempsFin="11:00";
				            					for(int i=0;i<seances.size();i++){
			                						if(seances.get(i).getNumeroSemaine()==3){
			                							if(tempsDeb.equals(seances.get(i).getHeureDebut()) || tempsFin.equals(seances.get(i).getHeureFin())){
			                								out.println(seances.get(i).getC().getNomc());}
			                							}} }%></td>
										<td id="table_4_2">
										<%if(seances!=null){
				            					String tempsDeb="09:30";
				            					String tempsFin="11:00";
				            					for(int i=0;i<seances.size();i++){
			                						if(seances.get(i).getNumeroSemaine()==4){
			                							if(tempsDeb.equals(seances.get(i).getHeureDebut()) || tempsFin.equals(seances.get(i).getHeureFin())){
			                								out.println(seances.get(i).getC().getNomc());}
			                							}} }%></td>
										<td id="table_5_2">
										<%if(seances!=null){
				            					String tempsDeb="09:30";
				            					String tempsFin="11:00";
				            					for(int i=0;i<seances.size();i++){
			                						if(seances.get(i).getNumeroSemaine()==5){
			                							if(tempsDeb.equals(seances.get(i).getHeureDebut()) || tempsFin.equals(seances.get(i).getHeureFin())){
			                								out.println(seances.get(i).getC().getNomc());}
			                							}} }%></td>
									</tr>
									<tr style="height: 45px">
										<th scope="row">11:00-12:30
										</th>
										<td id="table_1_3"><%if(seances!=null){
				            					String tempsDeb="11:00";
				            					String tempsFin="12:30";
				            					for(int i=0;i<seances.size();i++){
			                						if(seances.get(i).getNumeroSemaine()==1){
			                							if(tempsDeb.equals(seances.get(i).getHeureDebut()) || tempsFin.equals(seances.get(i).getHeureFin())){
			                								out.println(seances.get(i).getC().getNomc());}
			                							}} }%></td>
										<td id="table_2_3"><%if(seances!=null){
				            					String tempsDeb="11:00";
				            					String tempsFin="12:30";
				            					for(int i=0;i<seances.size();i++){
			                						if(seances.get(i).getNumeroSemaine()==2){
			                							if(tempsDeb.equals(seances.get(i).getHeureDebut()) || tempsFin.equals(seances.get(i).getHeureFin())){
			                								out.println(seances.get(i).getC().getNomc());}
			                							}} }%></td>
										<td id="table_3_3"><%if(seances!=null){
				            					String tempsDeb="11:00";
				            					String tempsFin="12:30";
				            					for(int i=0;i<seances.size();i++){
			                						if(seances.get(i).getNumeroSemaine()==3){
			                							if(tempsDeb.equals(seances.get(i).getHeureDebut()) || tempsFin.equals(seances.get(i).getHeureFin())){
			                								out.println(seances.get(i).getC().getNomc());}
			                							}} }%></td>
										<td id="table_4_3"><%if(seances!=null){
				            					String tempsDeb="11:00";
				            					String tempsFin="12:30";
				            					for(int i=0;i<seances.size();i++){
			                						if(seances.get(i).getNumeroSemaine()==4){
			                							if(tempsDeb.equals(seances.get(i).getHeureDebut()) || tempsFin.equals(seances.get(i).getHeureFin())){
			                								out.println(seances.get(i).getC().getNomc());}
			                							}} }%></td>
										<td id="table_5_3"><%if(seances!=null){
				            					String tempsDeb="11:00";
				            					String tempsFin="12:30";
				            					for(int i=0;i<seances.size();i++){
			                						if(seances.get(i).getNumeroSemaine()==5){
			                							if(tempsDeb.equals(seances.get(i).getHeureDebut()) || tempsFin.equals(seances.get(i).getHeureFin())){
			                								out.println(seances.get(i).getC().getNomc());}
			                							}} }%></td>
									</tr>
									<tr style="height: 45px">
										<th scope="row">12:30-14:00
										</th>
										<td id="table_1_4"><%if(seances!=null){
				            					String tempsDeb="12:30";
				            					String tempsFin="14:00";
				            					for(int i=0;i<seances.size();i++){
			                						if(seances.get(i).getNumeroSemaine()==1){
			                							if(tempsDeb.equals(seances.get(i).getHeureDebut()) || tempsFin.equals(seances.get(i).getHeureFin())){
			                								out.println(seances.get(i).getC().getNomc());}
			                							}} }%></td>
										<td id="table_2_4"><%if(seances!=null){
				            					String tempsDeb="12:30";
				            					String tempsFin="14:00";
				            					for(int i=0;i<seances.size();i++){
			                						if(seances.get(i).getNumeroSemaine()==2){
			                							if(tempsDeb.equals(seances.get(i).getHeureDebut()) || tempsFin.equals(seances.get(i).getHeureFin())){
			                								out.println(seances.get(i).getC().getNomc());}
			                							}} }%></td>
										<td id="table_3_4">
										<%if(seances!=null){
				            					String tempsDeb="12:30";
				            					String tempsFin="14:00";
				            					for(int i=0;i<seances.size();i++){
			                						if(seances.get(i).getNumeroSemaine()==3){
			                							if(tempsDeb.equals(seances.get(i).getHeureDebut()) || tempsFin.equals(seances.get(i).getHeureFin())){
			                								out.println(seances.get(i).getC().getNomc());}
			                							}} }%></td>
										<td id="table_4_4"><%if(seances!=null){
				            					String tempsDeb="12:30";
				            					String tempsFin="14:00";
				            					for(int i=0;i<seances.size();i++){
			                						if(seances.get(i).getNumeroSemaine()==4){
			                							if(tempsDeb.equals(seances.get(i).getHeureDebut()) || tempsFin.equals(seances.get(i).getHeureFin())){
			                								out.println(seances.get(i).getC().getNomc());}
			                							}} }%></td>
										<td id="table_5_4"><%if(seances!=null){
				            					String tempsDeb="12:30";
				            					String tempsFin="14:00";
				            					for(int i=0;i<seances.size();i++){
			                						if(seances.get(i).getNumeroSemaine()==5){
			                							if(tempsDeb.equals(seances.get(i).getHeureDebut()) || tempsFin.equals(seances.get(i).getHeureFin())){
			                								out.println(seances.get(i).getC().getNomc());}
			                							}} }%></td>
									</tr>
									<tr style="height: 45px">
										<th scope="row">14:00-15:30
										</th>
										<td id="table_1_5">
										<%if(seances!=null){
				            					String tempsDeb="14:00";
				            					String tempsFin="15:30";
				            					for(int i=0;i<seances.size();i++){
			                						if(seances.get(i).getNumeroSemaine()==1){
			                							if(tempsDeb.equals(seances.get(i).getHeureDebut()) || tempsFin.equals(seances.get(i).getHeureFin())){
			                								out.println(seances.get(i).getC().getNomc());}
			                						}} }%>
										</td>
										<td id="table_2_5">
										<%if(seances!=null){
				            					String tempsDeb="14:00";
				            					String tempsFin="15:30";
				            					for(int i=0;i<seances.size();i++){
			                						if(seances.get(i).getNumeroSemaine()==2){
			                							if(tempsDeb.equals(seances.get(i).getHeureDebut()) || tempsFin.equals(seances.get(i).getHeureFin())){
			                								out.println(seances.get(i).getC().getNomc());}
			                						}} }%></td>
										<td id="table_3_5"><%if(seances!=null){
				            					String tempsDeb="14:00";
				            					String tempsFin="15:30";
				            					for(int i=0;i<seances.size();i++){
			                						if(seances.get(i).getNumeroSemaine()==3){
			                							if(tempsDeb.equals(seances.get(i).getHeureDebut()) || tempsFin.equals(seances.get(i).getHeureFin())){
			                								out.println(seances.get(i).getC().getNomc());}
			                						}} }%></td>
										<td id="table_4_5"><%if(seances!=null){
				            					String tempsDeb="14:00";
				            					String tempsFin="15:30";
				            					for(int i=0;i<seances.size();i++){
			                						if(seances.get(i).getNumeroSemaine()==4){
			                							if(tempsDeb.equals(seances.get(i).getHeureDebut()) || tempsFin.equals(seances.get(i).getHeureFin())){
			                								out.println(seances.get(i).getC().getNomc());}
			                						}} }%></td>
										<td id="table_5_5"><%if(seances!=null){
				            					String tempsDeb="14:00";
				            					String tempsFin="15:30";
				            					for(int i=0;i<seances.size();i++){
			                						if(seances.get(i).getNumeroSemaine()==5){
			                							if(tempsDeb.equals(seances.get(i).getHeureDebut()) || tempsFin.equals(seances.get(i).getHeureFin())){
			                								out.println(seances.get(i).getC().getNomc());}
			                						}} }%></td>
									</tr>
									<tr style="height: 45px">
										<th scope="row">15:30-17:00
										</th>
										<td id="table_1_6"><%if(seances!=null){
				            					String tempsDeb="15:30";
				            					String tempsFin="17:00";
				            					for(int i=0;i<seances.size();i++){
			                						if(seances.get(i).getNumeroSemaine()==1){
			                							if(tempsDeb.equals(seances.get(i).getHeureDebut()) || tempsFin.equals(seances.get(i).getHeureFin())){
			                								out.println(seances.get(i).getC().getNomc());}
			                						}} }%></td>
										<td id="table_2_6"><%if(seances!=null){
				            					String tempsDeb="15:30";
				            					String tempsFin="17:00";
				            					for(int i=0;i<seances.size();i++){
			                						if(seances.get(i).getNumeroSemaine()==2){
			                							if(tempsDeb.equals(seances.get(i).getHeureDebut()) || tempsFin.equals(seances.get(i).getHeureFin())){
			                								out.println(seances.get(i).getC().getNomc());}
			                						}} }%></td>
										<td id="table_3_6"><%if(seances!=null){
				            					String tempsDeb="15:30";
				            					String tempsFin="17:00";
				            					for(int i=0;i<seances.size();i++){
			                						if(seances.get(i).getNumeroSemaine()==3){
			                							if(tempsDeb.equals(seances.get(i).getHeureDebut()) || tempsFin.equals(seances.get(i).getHeureFin())){
			                								out.println(seances.get(i).getC().getNomc());}
			                						}} }%></td>
										<td id="table_4_6"><%if(seances!=null){
				            					String tempsDeb="15:30";
				            					String tempsFin="17:00";
				            					for(int i=0;i<seances.size();i++){
			                						if(seances.get(i).getNumeroSemaine()==4){
			                							if(tempsDeb.equals(seances.get(i).getHeureDebut()) || tempsFin.equals(seances.get(i).getHeureFin())){
			                								out.println(seances.get(i).getC().getNomc());}
			                						}} }%></td>
										<td id="table_5_6"><%if(seances!=null){
				            					String tempsDeb="15:30";
				            					String tempsFin="17:00";
				            					for(int i=0;i<seances.size();i++){
			                						if(seances.get(i).getNumeroSemaine()==5){
			                							if(tempsDeb.equals(seances.get(i).getHeureDebut()) || tempsFin.equals(seances.get(i).getHeureFin())){
			                								out.println(seances.get(i).getC().getNomc());}
			                						}} }%></td>
									</tr>
									<tr style="height: 45px">
										<th scope="row">17:00-18:30
										</th>
										<td id="table_1_7"><%if(seances!=null){
				            					String tempsDeb="17:00";
				            					String tempsFin="18:30";
				            					for(int i=0;i<seances.size();i++){
			                						if(seances.get(i).getNumeroSemaine()==1){
			                							if(tempsDeb.equals(seances.get(i).getHeureDebut()) || tempsFin.equals(seances.get(i).getHeureFin())){
			                								out.println(seances.get(i).getC().getNomc());}
			                						}} }%></td>
										<td id="table_2_7"><%if(seances!=null){
				            					String tempsDeb="17:00";
				            					String tempsFin="18:30";
				            					for(int i=0;i<seances.size();i++){
			                						if(seances.get(i).getNumeroSemaine()==2){
			                							if(tempsDeb.equals(seances.get(i).getHeureDebut()) || tempsFin.equals(seances.get(i).getHeureFin())){
			                								out.println(seances.get(i).getC().getNomc());}
			                						}} }%></td>
										<td id="table_3_7"><%if(seances!=null){
				            					String tempsDeb="17:00";
				            					String tempsFin="18:30";
				            					for(int i=0;i<seances.size();i++){
			                						if(seances.get(i).getNumeroSemaine()==3){
			                							if(tempsDeb.equals(seances.get(i).getHeureDebut()) || tempsFin.equals(seances.get(i).getHeureFin())){
			                								out.println(seances.get(i).getC().getNomc());}
			                						}} }%></td>
										<td id="table_4_7"><%if(seances!=null){
				            					String tempsDeb="17:00";
				            					String tempsFin="18:30";
				            					for(int i=0;i<seances.size();i++){
			                						if(seances.get(i).getNumeroSemaine()==4){
			                							if(tempsDeb.equals(seances.get(i).getHeureDebut()) || tempsFin.equals(seances.get(i).getHeureFin())){
			                								out.println(seances.get(i).getC().getNomc());}
			                						}} }%></td>
										<td id="table_5_7"><%if(seances!=null){
				            					String tempsDeb="17:00";
				            					String tempsFin="18:30";
				            					for(int i=0;i<seances.size();i++){
			                						if(seances.get(i).getNumeroSemaine()==5){
			                							if(tempsDeb.equals(seances.get(i).getHeureDebut()) || tempsFin.equals(seances.get(i).getHeureFin())){
			                								out.println(seances.get(i).getC().getNomc());}
			                						}} }%></td>
									</tr>
									<tr style="height: 45px">
										<th scope="row">18:30-20:00
										</th>
										<td id="table_1_8"><%if(seances!=null){
				            					String tempsDeb="18:30";
				            					String tempsFin="20:00";
				            					for(int i=0;i<seances.size();i++){
			                						if(seances.get(i).getNumeroSemaine()==1){
			                							if(tempsDeb.equals(seances.get(i).getHeureDebut()) || tempsFin.equals(seances.get(i).getHeureFin())){
			                								out.println(seances.get(i).getC().getNomc());}
			                						}} }%></td>
										<td id="table_2_8"><%if(seances!=null){
				            					String tempsDeb="18:30";
				            					String tempsFin="20:00";
				            					for(int i=0;i<seances.size();i++){
			                						if(seances.get(i).getNumeroSemaine()==2){
			                							if(tempsDeb.equals(seances.get(i).getHeureDebut()) || tempsFin.equals(seances.get(i).getHeureFin())){
			                								out.println(seances.get(i).getC().getNomc());}
			                						}} }%></td>
										<td id="table_3_8"><%if(seances!=null){
				            					String tempsDeb="18:30";
				            					String tempsFin="20:00";
				            					for(int i=0;i<seances.size();i++){
			                						if(seances.get(i).getNumeroSemaine()==3){
			                							if(tempsDeb.equals(seances.get(i).getHeureDebut()) || tempsFin.equals(seances.get(i).getHeureFin())){
			                								out.println(seances.get(i).getC().getNomc());}
			                						}} }%></td>
										<td id="table_4_8"><%if(seances!=null){
				            					String tempsDeb="18:30";
				            					String tempsFin="20:00";
				            					for(int i=0;i<seances.size();i++){
			                						if(seances.get(i).getNumeroSemaine()==4){
			                							if(tempsDeb.equals(seances.get(i).getHeureDebut()) || tempsFin.equals(seances.get(i).getHeureFin())){
			                								out.println(seances.get(i).getC().getNomc());}
			                						}} }%></td>
										<td id="table_5_8"><%if(seances!=null){
				            					String tempsDeb="18:30";
				            					String tempsFin="20:00";
				            					for(int i=0;i<seances.size();i++){
			                						if(seances.get(i).getNumeroSemaine()==5){
			                							if(tempsDeb.equals(seances.get(i).getHeureDebut()) || tempsFin.equals(seances.get(i).getHeureFin())){
			                								out.println(seances.get(i).getC().getNomc());}
			                						}} }%></td>
									</tr>
									
								</tbody>
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