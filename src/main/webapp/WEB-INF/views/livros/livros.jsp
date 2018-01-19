<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="bindingResult" value="${requestScope['org.springframework.validation.BindingResult.livros']}"/>
<form action='/livros/salva' method="post">
            <input type="hidden" name="cdLivro" value="${livros.cdLivro}">

            <div class="form-group">
                <label for="nome">Titulo:</label>
                <input id="nome" type="text" name="titulo" class="form-control" value="${livros.titulo}">
                <c:forEach items="${bindingResult.getFieldErrors('titulo')}" var="error">
                    <span class="text-danger">${error.defaultMessage}</span>
                </c:forEach>
            </div>

		
 			<div class="form-group"> 
		<label for="preco">Preço:</label> 
				<input id="preco" type="text" name="preco" class="form-control" value="${livros.preco}"> 
				<c:forEach items="${bindingResult.getFieldErrors('preco')}" var="error">  
 					<span class="text-danger">${error.defaultMessage}</span> 
				</c:forEach> 
 			</div> 

            <button type="submit" class="btn btn-primary">Gravar</button>            
        </form>
<form action='/livros/lista' method="get">
            <button type="submit" class="btn btn-primary">Listagem</button>
</form>
</body>
</html>