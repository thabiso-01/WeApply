<%@ page import="java.util.List" %>
<%@ page import="model.Institution" %>

<h2>Institutions</h2>

<table border="1">
<tr>
    <th>Name</th>
    <th>Type</th>
    <th>Province</th>
    <th>Website</th>
</tr>

<%
List<Institution> list =
    (List<Institution>)request.getAttribute("institutions");

for(Institution i : list){
%>

<tr>
<td><%= i.getName() %></td>
<td><%= i.getType() %></td>
<td><%= i.getProvince() %></td>
<td>
<a href="<%= i.getWebsite() %>">Visit</a>
</td>
</tr>

<%
}
%>

</table>