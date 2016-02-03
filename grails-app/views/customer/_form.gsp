<%@ page import="demograils.Customer" %>



<div class="fieldcontain ${hasErrors(bean: customerInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="customer.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" maxlength="99" required="" value="${customerInstance?.name}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: customerInstance, field: 'status', 'error')} ">
	<label for="status">
		<g:message code="customer.status.label" default="Status" />
		
	</label>
	<g:checkBox name="status" value="${customerInstance?.status}" />
</div>

<div class="fieldcontain ${hasErrors(bean: customerInstance, field: 'email', 'error')} required">
	<label for="email">
		<g:message code="customer.email.label" default="Email" />
		<span class="required-indicator">*</span>
	</label>
	<g:field type="email" name="email" maxlength="99" required="" value="${customerInstance?.email}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: customerInstance, field: 'contactName', 'error')} ">
	<label for="contactName">
		<g:message code="customer.contactName.label" default="Contact Name" />
		
	</label>
	<g:textField name="contactName" maxlength="99" value="${customerInstance?.contactName}"/>
</div>

