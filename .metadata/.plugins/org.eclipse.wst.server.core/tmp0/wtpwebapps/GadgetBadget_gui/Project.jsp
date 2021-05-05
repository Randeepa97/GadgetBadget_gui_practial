<%@page import="model.ProjectServlet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
			<title>Project Management - GadgetBadget</title>
			
			<link href="myStyle.css" rel="stylesheet" />
		<link rel="stylesheet" href="Views/bootstrap.min.css">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
		<script src="Components/jquery-3.5.0.min.js"></script>
		<script src="Components/Project.js"></script>
</head>
<body>


<div class="container">
	
			<p class="font-weight-bold">
				<center>
					<h1><u><i><b>Project Management - GadgetBadget</b></i></u></h1>
				</center>
			</p>
			<br><br>
			
			<fieldset>
	
				<legend><b>Add Project Details</b></legend>
					<form id="PROJECT" name="PROJECT" class="border border-light p-5">
						
						<div class="form-outline mb-4">
						    <label class="form-label" for="form6Example3" class="col-sm-2 col-form-label col-form-label-sm">project_type:</label>
						    <input type="text" id="project_type" class="form-control" name="project_type">						    
						</div>
						
						<div class="form-outline mb-4">
						    <label class="form-label" for="form6Example3" class="col-sm-2 col-form-label col-form-label-sm">project_name:</label>
						    <input type="text" id="project_name" class="form-control" name="project_name">						    
						</div>
						
						<div class="form-outline mb-4">
						    <label class="form-label" for="form6Example3" class="col-sm-2 col-form-label col-form-label-sm">researcher:</label>
						    <input type="text" id="researcher" class="form-control" name="researcher">						    
						</div>
						
						<div class="form-outline mb-4">
						    <label class="form-label" for="form6Example3" class="col-sm-2 col-form-label col-form-label-sm">description:</label>
						    <input type="text" id="description" class="form-control" name="description">						    
						</div>
					
						 
					
						<br> 
						
						<input id="btnSave" name="btnSave" type="button" value="Save" class="btn btn-primary btn-lg btn-block"> 
						<input type="hidden" id="hidProjectIDSave" name="hidProjectIDSave" value="">
					</form>
				
					<div id="alertSuccess" class="alert alert-success"></div>
					<div id="alertError" class="alert alert-danger"></div>			
			</fieldset>
			
			<br> 
			
			<div class="container" id="ProjectGrid">
				<fieldset>
					<legend><b>View Project Details</b></legend>
					<form method="post" action="Project.jsp" class="table table-striped">
						<%
							ProjectServlet viewProject = new ProjectServlet();
											out.print(viewProject.readProject());
						%>
					</form>
					<br>
				</fieldset>
			</div>
		</div>

 
</body>
</html>