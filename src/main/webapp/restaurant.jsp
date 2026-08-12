<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Savory Bites - Fine Dining Experience</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }
        body {
            font-family: 'Georgia', serif;
            background: #1a1a1a;
            color: #f4f4f4;
        }
        .navbar {
            display: flex;
            justify-content: space-between;
            align-items: center;
            padding: 20px 50px;
            background: #0d0d0d;
            border-bottom: 2px solid #c9a227;
        }
        .logo {
            font-size: 32px;
            color: #c9a227;
            font-weight: bold;
        }
        .nav-links {
            display: flex;
            gap: 30px;
        }
        .nav-links a {
            color: #f4f4f4;
            text-decoration: none;
            font-size: 16px;
            transition: color 0.3s;
        }
        .nav-links a:hover {
            color: #c9a227;
        }
        .hero {
            background: linear-gradient(rgba(0,0,0,0.7), rgba(0,0,0,0.7)), url('https://images.unsplash.com/photo-1517248135467-4c7edcad34c4?w=1920');
            background-size: cover;
            background-position: center;
            height: 80vh;
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
            text-align: center;
        }
        .hero h1 {
            font-size: 72px;
            margin-bottom: 20px;
            color: #c9a227;
        }
        .hero p {
            font-size: 24px;
            margin-bottom: 40px;
            max-width: 600px;
        }
        .reserve-btn {
            padding: 18px 50px;
            background: #c9a227;
            border: none;
            border-radius: 5px;
            color: #1a1a1a;
            font-size: 18px;
            font-weight: bold;
            cursor: pointer;
            transition: background 0.3s;
        }
        .reserve-btn:hover {
            background: #e6b82d;
        }
        .menu-section {
            padding: 80px 50px;
            max-width: 1200px;
            margin: 0 auto;
        }
        .section-title {
            text-align: center;
            font-size: 48px;
            color: #c9a227;
            margin-bottom: 50px;
        }
        .menu-grid {
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(350px, 1fr));
            gap: 40px;
        }
        .menu-item {
            background: #2a2a2a;
            padding: 30px;
            border-radius: 10px;
            border-left: 4px solid #c9a227;
        }
        .menu-item h3 {
            font-size: 24px;
            color: #c9a227;
            margin-bottom: 10px;
        }
        .menu-item .price {
            font-size: 28px;
            color: #f4f4f4;
            font-weight: bold;
            margin-bottom: 15px;
        }
        .menu-item p {
            color: #aaa;
            line-height: 1.6;
        }
        .chef-section {
            background: #0d0d0d;
            padding: 80px 50px;
            text-align: center;
        }
        .chef-section h2 {
            font-size: 48px;
            color: #c9a227;
            margin-bottom: 30px;
        }
        .chef-section p {
            font-size: 20px;
            max-width: 800px;
            margin: 0 auto;
            color: #aaa;
        }
        .footer {
            background: #0d0d0d;
            padding: 40px 50px;
            text-align: center;
            border-top: 2px solid #c9a227;
        }
    </style>
</head>
<body>
    <nav class="navbar">
        <div class="logo">Savory Bites</div>
        <div class="nav-links">
            <a href="#menu">Menu</a>
            <a href="#chef">Our Chef</a>
            <a href="#reservations">Reservations</a>
            <a href="#contact">Contact</a>
        </div>
    </nav>

    <section class="hero">
        <h1>Taste Excellence</h1>
        <p>Experience culinary artistry where every dish tells a story of passion and tradition</p>
        <button class="reserve-btn">Reserve Your Table</button>
    </section>

    <section class="menu-section" id="menu">
        <h2 class="section-title">Signature Dishes</h2>
        <div class="menu-grid">
            <div class="menu-item">
                <h3>Wagyu Beef Tartare</h3>
                <div class="price">$45</div>
                <p>Hand-cut A5 Wagyu with truffle aioli, quail egg, and microgreens served with artisan crostini</p>
            </div>
            <div class="menu-item">
                <h3>Pan-Seared Scallops</h3>
                <div class="price">$38</div>
                <p>Hokkaido scallops with cauliflower purée, crispy pancetta, and saffron butter sauce</p>
            </div>
            <div class="menu-item">
                <h3>Duck Confit</h3>
                <div class="price">$42</div>
                <p>Slow-cooked duck leg with cherry reduction, roasted root vegetables, and potato galette</p>
            </div>
            <div class="menu-item">
                <h3>Lobster Thermidor</h3>
                <div class="price">$58</div>
                <p>Maine lobster in cognac cream sauce with gruyère gratin, served with asparagus</p>
            </div>
            <div class="menu-item">
                <h3>Truffle Risotto</h3>
                <div class="price">$35</div>
                <p>Arborio rice with black truffle, parmesan crisp, and aged balsamic reduction</p>
            </div>
            <div class="menu-item">
                <h3>Chocolate Soufflé</h3>
                <div class="price">$18</div>
                <p>Dark chocolate soufflé with vanilla bean ice cream and raspberry coulis</p>
            </div>
        </div>
    </section>

    <section class="chef-section" id="chef">
        <h2>Meet Our Chef</h2>
        <p>Chef Marcus Laurent brings 25 years of Michelin-star experience from Paris, Tokyo, and New York. His philosophy blends classical French techniques with modern innovation, creating dishes that honor tradition while embracing the future.</p>
    </section>

    <footer class="footer">
        <p>&copy; 2024 Savory Bites Restaurant. Open Tuesday - Sunday, 6PM - 11PM</p>
    </footer>
</body>
</html>
