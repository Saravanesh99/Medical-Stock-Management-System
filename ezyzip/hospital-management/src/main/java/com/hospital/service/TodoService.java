<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<div class="container">
	<div class="row">
		<div class="col-md-6 col-md-offset-3 ">
			<div class="panel panel-primary">
				<div class="panel-heading">Add Supplier</div>
				<div class="panel-body">
					<form:form method="post" modelAttribute="todo">
						<form:hidden path="id" />
					<fieldset class="form-group">
							<form:label path="medicineName">Medicine Name</form:label>
							<form:input path="medicineName" type="text" class="form-control"
								required="required" />
							<form:errors path="medicineName" cssClass="text-warning" />
						</fieldset>
						<fieldset class="form-group">
							<form:label path="quantity">OrderQuantity</form:label>
							<form:input path="quantity" type="text" class="form-control"
								required="required" />
							<form:errors path="quantity" cssClass="text-warning" />
						</fieldset>
	
							<fieldset class="form-group">
							<form:label path="description">Supplier Desc</form:label>
							<form:input path="description" type="text" class="form-control"
								required="required" />
							<form:errors path="description" cssClass="text-warning" />
						</fieldset>
						<fieldset class="form-group">
							<form:label path="targetDate"> Date</form:label>
							<form:input path="targetDate" type="text" class="form-control"
								required="required" />
							<form:errors path="targetDate" cssClass="text-warning" />
						</fieldset>

						<button type="submit" class="btn btn-success">Save</button>
					</form:form>
				</div>
			</div>
		</div>
	</div>
</div>
<%@ include file="common/footer.jspf"%>