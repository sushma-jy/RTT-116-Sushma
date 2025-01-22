<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Hair Haven - Your Styling Sanctuary</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css" integrity="sha384-k6RqeWeci5ZR/Lv4MR0sA0FfDOM6PtEKbChzYYJWW9deA5UPXr5QIv9K6LJWFeKS" crossorigin="anonymous">
    <style>
        body {
            margin: 0;
            font-family: 'Poppins', sans-serif;
            background: linear-gradient(to bottom, #ffe6f0, #ffffff);
            color: #444;
        }
        .hero {
            background: url('images/haircare1.jpg') no-repeat center center/cover;
            color: #494a4c;
            text-align: center;
            padding: 60px 20px;
            text-shadow: 0 2px 5px rgba(0, 0, 0, 0.7);
        }
        .hero h1 {
            font-size: 4em;
            font-weight: 700;
            margin: 0;
        }
        .hero p {
            font-size: 1.5em;
            margin: 20px 0;
        }
        .btn {
            display: inline-block;
            padding: 15px 30px;
            font-size: 1em;
            color: white;
            background-color: #ff6f61;
            border: none;
            border-radius: 5px;
            text-transform: uppercase;
            cursor: pointer;
            text-decoration: none;
            transition: background-color 0.3s;
        }
        .btn:hover {
            background-color: #e64550;
        }
        #products-table {
            padding: 50px 20px;
            text-align: center;
        }
        .table-wrapper {
            overflow-x: auto;
        }
        table {
            width: 90%;
            margin: 0 auto;
            border-collapse: collapse;
            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.2);
            border: 1px solid #ddd;
        }
        th, td {
            padding: 15px;
            text-align: center;
            border: 1px solid #ddd;
        }
        th {
            background-color: #ff6f61;
            color: white;
            text-transform: uppercase;
            font-weight: bold;
        }
        tr{
            background-color: #e49b9b;
        }
        tr:hover {
            background-color: #c5b8b8;
        }
        td {
            font-size: 1em;
        }
        .footer {
            background-color: #222;
            color: white;
            text-align: center;
            padding: 20px;
        }
        .footer p {
            margin: 5px 0;
        }
        .footer a {
            color: #ff6f61;
            text-decoration: none;
        }
        .footer a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
<jsp:include page="include/header.jsp"/>

<!-- Hero Section -->
<div class="hero">
    <h1>Glam&Gloss</h1>
    <p>Your Sanctuary for Premium Hair Styling Products</p>
    <a class="btn" href="/Product/searchProduct">Explore Now</a>
<!--</div> -->

<!-- Products Table Section -->
<!--<div id="products-table"> -->
    <h2>Popular Picks</h2>
    <p>Explore some of our top-rated products carefully curated for you!</p>
    <div class="table-wrapper">
        <table>
            <thead>
            <tr>
                <th>Product Name</th>
                <th>Description</th>
                <th>Price</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>Silky Smooth Shampoo</td>
                <td>Nourishes and adds shine to your hair.</td>
                <td>$15.99</td>
            </tr>
            <tr>
                <td>Volumizing Conditioner</td>
                <td>Perfect for adding volume to thin hair.</td>
                <td>$12.99</td>
            </tr>
            <tr>
                <td>Heat Protectant Spray</td>
                <td>Shields hair from heat damage during styling.</td>
                <td>$10.50</td>
            </tr>
            <tr>
                <td>Argan Oil Serum</td>
                <td>Hydrates and smooths frizzy hair.</td>
                <td>$18.75</td>
            </tr>
            </tbody>
        </table>
    </div>
</div>

<!-- Footer -->
<div class="footer">
    <p>&copy; 2025 Hair Haven. All rights reserved.</p>
    <p>
        Designed with <i class="fas fa-heart" style="color: #ff6f61;"></i> by Hair Haven Team |
        <a href="privacy-policy.jsp">Privacy Policy</a> |
        <a href="terms-and-conditions.jsp">Terms & Conditions</a>
    </p>
</div>

<jsp:include page="include/footer.jsp"/>
</body>
</html>
