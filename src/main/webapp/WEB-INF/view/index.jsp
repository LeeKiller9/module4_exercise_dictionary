<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dictionary</title>
</head>
<body>
<h1>Simple Dictionary</h1>
<form action="/search">
    <label for="search">Input word</label>
    <input type="text" id="search" name="search" value="${word}">
    <p>Meaning: ${mean}</p>
    <button type="submit">Search</button>
</form>
</body>
</html>
