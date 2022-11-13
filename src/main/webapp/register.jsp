<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>New game</title>
</head>
<body>
<h2>new user</h2>
<form action="/sign-up" method="post">
    <p>
        <label>
            name
            <input type="text" name="name">
        </label>
    </p>
    <p>
        <label>
            password
            <input type="password" name="password">
        </label>
    </p>
    <button type="submit">register</button>
</form>

<h2>existing user</h2>
<form action="/sign-in" method="post">
    <p>
        <label>
            name
            <input type="text" name="name">
        </label>
    </p>
    <p>
        <label>
            password
            <input type="password" name="password">
        </label>
    </p>
    <button type="submit">sign in</button>
</form>
</body>
</html>
