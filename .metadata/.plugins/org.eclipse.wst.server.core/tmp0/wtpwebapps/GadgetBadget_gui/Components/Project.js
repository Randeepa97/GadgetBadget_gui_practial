//hide alert
$(document).ready(function() {

	$("#alertSuccess").hide();
	$("#alertError").hide();
	$("#hidProjectIDSave").val("");
	$("#PROJECT")[0].reset();
});

$(document).on("click", "#btnSave", function(event) {

	// Clear alerts---------------------
	$("#alertSuccess").text("");
	$("#alertSuccess").hide();
	$("#alertError").text("");
	$("#alertError").hide();
	
	// Form validation-------------------
	var status = validateItemForm();
	if (status != true) {
		$("#alertError").text(status);
		$("#alertError").show();
		return;
	}
	
	// If valid------------------------
	var type = ($("#hidProjectIDSave").val() == "") ? "POST" : "PUT";

	$.ajax({
		url : "ProjectAPI",
		type : type,
		data : $("#PROJECT").serialize(),
		dataType : "text",
		complete : function(response, status) {
			onItemSaveComplete(response.responseText, status);
		}
	});

});

function onItemSaveComplete(response, status) {
	
	if (status == "success") {
		
		var resultSet = JSON.parse(response);
		
		if (resultSet.status.trim() == "success") {
			
			$("#alertSuccess").text("Successfully saved.");
			$("#alertSuccess").show();
			$("#ProjectGrid").html(resultSet.data);
			
		} else if (resultSet.status.trim() == "error") {
			
			$("#alertError").text(resultSet.data);
			$("#alertError").show();
		}
	} 
	else if (status == "error") {
		
		$("#alertError").text("Error while saving.");
		$("#alertError").show();
		
	} else {
		
		$("#alertError").text("Unknown error while saving..");
		$("#alertError").show();
	}
	
	$("#hidProjectIDSave").val("");
	$("#PROJECT")[0].reset();
}

$(document).on("click", ".btnRemove", function(event) {
	
	$.ajax({
		url : "ProjectAPI",
		type : "DELETE",
		data : "project_id=" + $(this).data("project_id"),
		dataType : "text",
		complete : function(response, status) {
			onItemDeleteComplete(response.responseText, status);
		}
	});
});

function onItemDeleteComplete(response, status) {
	
	if (status == "success") {
		
		var resultSet = JSON.parse(response);
		
		if (resultSet.status.trim() == "success") {
			
			$("#alertSuccess").text("Successfully deleted.");
			$("#alertSuccess").show();
			$("#ProjectGrid").html(resultSet.data);
			
		} else if (resultSet.status.trim() == "error") {
			
			$("#alertError").text(resultSet.data);
			$("#alertError").show();
		}
		
	} else if (status == "error") {
		
		$("#alertError").text("Error while deleting.");
		$("#alertError").show();
		
	} else {
		
		$("#alertError").text("Unknown error while deleting..");
		$("#alertError").show();
	}
}

// UPDATE==========================================
$(document).on("click",".btnUpdate",function(event)
		{
			$("#hidProjectIDSave").val($(this).data("project_id"));
			$("#project_type").val($(this).closest("tr").find('td:eq(0)').text());
			$("#project_name").val($(this).closest("tr").find('td:eq(1)').text());
			$("#researcher").val($(this).closest("tr").find('td:eq(2)').text());
			$("#description").val($(this).closest("tr").find('td:eq(3)').text());
			
		});


// CLIENTMODEL=========================================================================
function validateItemForm() {
	
	// project_type
	if ($("#project_type").val().trim() == "") {
		return "Please insert project_type.";
	}
	
	// project_name
	if ($("#project_name").val().trim() == "") {
		return "Please insert project_name.";
	}
	
	// researcher
	if ($("#researcher").val().trim() == "") {
		return "Please insert researcher.";
	}

	// description
	if ($("#description").val().trim() == "") {
		return "Please insert description.";
	}
	
	
	
	return true;
}
