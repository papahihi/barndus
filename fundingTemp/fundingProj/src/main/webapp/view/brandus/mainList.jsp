<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix ="c" uri = "http://java.sun.com/jsp/jstl/core" %>


  <div class="divmain"> 
 <ul class="mainList">  
 <c:forEach items="${mainList }" var ="dto" varStatus="no">  
	
 	
	<li class= "itemtitle"> <a href ="Detail?title=${dto.title}"> <img src="../listimg/${dto.wname}" alt="" class = "mainImg"/> </a></li>
	
</c:forEach>
</ul> 
</div> 
