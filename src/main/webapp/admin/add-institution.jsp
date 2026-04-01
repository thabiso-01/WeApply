<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Institution</title>
</head>
<body>
    <h1>Add New Institution</h1>
    <form action="/admin/addInstitution" method="post">
        <label for="institutionName">Institution Name:</label>
        <input type="text" id="institutionName" name="institutionName" required />
        <br />
        <label for="institutionAddress">Address:</label>
        <input type="text" id="institutionAddress" name="institutionAddress" required />
        <br />
        <input type="submit" value="Add Institution" />
    </form>
</body>
</html>