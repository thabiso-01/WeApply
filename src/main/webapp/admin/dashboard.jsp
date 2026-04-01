<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Admin Dashboard</title>
    <link rel="stylesheet" href="path/to/your/styles.css">
</head>
<body>
    <h1>Admin Dashboard</h1>
    <h2>Institution Management</h2>
    <section>
        <h3>Add Institution</h3>
        <form action="addInstitution" method="post">
            <input type="text" name="institutionName" placeholder="Institution Name" required>
            <button type="submit">Add Institution</button>
        </form>
    </section>
    <section>
        <h3>Manage Institutions</h3>
        <table>
            <thead>
                <tr>
                    <th>Institution Name</th>
                    <th>Actions</th>
                </tr>
            </thead>
            <tbody>
                <!-- Dynamically populated with institutions -->
            </tbody>
        </table>
    </section>
</body>
</html>