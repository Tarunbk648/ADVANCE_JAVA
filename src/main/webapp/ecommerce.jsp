<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>TechGear Store - Premium Electronics</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }
        body {
            font-family: 'Roboto', sans-serif;
            background: #f5f5f5;
            color: #333;
        }
        .navbar {
            display: flex;
            justify-content: space-between;
            align-items: center;
            padding: 15px 50px;
            background: #fff;
            box-shadow: 0 2px 10px rgba(0,0,0,0.1);
        }
        .logo {
            font-size: 28px;
            color: #0066cc;
            font-weight: bold;
        }
        .nav-links {
            display: flex;
            gap: 25px;
            align-items: center;
        }
        .nav-links a {
            color: #333;
            text-decoration: none;
            font-weight: 500;
        }
        .cart-icon {
            font-size: 24px;
            position: relative;
        }
        .cart-count {
            position: absolute;
            top: -8px;
            right: -8px;
            background: #e74c3c;
            color: #fff;
            border-radius: 50%;
            width: 20px;
            height: 20px;
            font-size: 12px;
            display: flex;
            align-items: center;
            justify-content: center;
        }
        .hero {
            background: linear-gradient(135deg, #0066cc 0%, #004499 100%);
            padding: 80px 50px;
            color: #fff;
            display: flex;
            justify-content: space-between;
            align-items: center;
        }
        .hero-content {
            max-width: 500px;
        }
        .hero h1 {
            font-size: 56px;
            margin-bottom: 20px;
        }
        .hero p {
            font-size: 20px;
            margin-bottom: 30px;
            opacity: 0.9;
        }
        .shop-btn {
            padding: 18px 45px;
            background: #fff;
            color: #0066cc;
            border: none;
            border-radius: 30px;
            font-size: 18px;
            font-weight: bold;
            cursor: pointer;
        }
        .hero-image {
            font-size: 150px;
        }
        .products {
            padding: 80px 50px;
            max-width: 1400px;
            margin: 0 auto;
        }
        .section-title {
            text-align: center;
            font-size: 42px;
            color: #333;
            margin-bottom: 50px;
        }
        .product-grid {
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(280px, 1fr));
            gap: 30px;
        }
        .product-card {
            background: #fff;
            border-radius: 15px;
            padding: 25px;
            box-shadow: 0 5px 15px rgba(0,0,0,0.1);
            transition: transform 0.3s, box-shadow 0.3s;
        }
        .product-card:hover {
            transform: translateY(-5px);
            box-shadow: 0 10px 25px rgba(0,0,0,0.15);
        }
        .product-image {
            height: 200px;
            background: #f0f0f0;
            border-radius: 10px;
            display: flex;
            align-items: center;
            justify-content: center;
            font-size: 80px;
            margin-bottom: 20px;
        }
        .product-badge {
            background: #e74c3c;
            color: #fff;
            padding: 5px 12px;
            border-radius: 15px;
            font-size: 12px;
            position: absolute;
            margin-top: -240px;
        }
        .product-card h3 {
            font-size: 20px;
            margin-bottom: 10px;
        }
        .product-card .rating {
            color: #f39c12;
            margin-bottom: 10px;
        }
        .product-card .price {
            font-size: 28px;
            font-weight: bold;
            color: #0066cc;
            margin-bottom: 15px;
        }
        .product-card .old-price {
            text-decoration: line-through;
            color: #999;
            font-size: 18px;
            margin-left: 10px;
        }
        .add-to-cart {
            width: 100%;
            padding: 12px;
            background: #0066cc;
            border: none;
            border-radius: 8px;
            color: #fff;
            font-weight: bold;
            cursor: pointer;
            transition: background 0.3s;
        }
        .add-to-cart:hover {
            background: #0055aa;
        }
        .features {
            background: #fff;
            padding: 60px 50px;
        }
        .features-grid {
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(250px, 1fr));
            gap: 30px;
            max-width: 1200px;
            margin: 0 auto;
        }
        .feature-item {
            text-align: center;
            padding: 30px;
        }
        .feature-item .icon {
            font-size: 48px;
            margin-bottom: 20px;
        }
        .feature-item h3 {
            font-size: 20px;
            margin-bottom: 10px;
        }
        .feature-item p {
            color: #666;
        }
        .footer {
            background: #333;
            padding: 40px 50px;
            text-align: center;
            color: #fff;
        }
    </style>
</head>
<body>
    <nav class="navbar">
        <div class="logo">TechGear</div>
        <div class="nav-links">
            <a href="#products">Products</a>
            <a href="#deals">Deals</a>
            <a href="#support">Support</a>
            <a href="#account">Account</a>
            <div class="cart-icon">🛒<span class="cart-count">3</span></div>
        </div>
    </nav>

    <section class="hero">
        <div class="hero-content">
            <h1>Next-Gen Tech</h1>
            <p>Discover the latest in premium electronics with cutting-edge technology and unbeatable prices.</p>
            <button class="shop-btn">Shop Now</button>
        </div>
        <div class="hero-image">📱💻🎧</div>
    </section>

    <section class="products" id="products">
        <h2 class="section-title">Featured Products</h2>
        <div class="product-grid">
            <div class="product-card">
                <div class="product-badge">HOT</div>
                <div class="product-image">📱</div>
                <h3>ProMax Smartphone X</h3>
                <div class="rating">★★★★★ (1,245)</div>
                <div class="price">$999<span class="old-price">$1,199</span></div>
                <button class="add-to-cart">Add to Cart</button>
            </div>
            <div class="product-card">
                <div class="product-badge">NEW</div>
                <div class="product-image">💻</div>
                <h3>UltraBook Pro 15"</h3>
                <div class="rating">★★★★☆ (892)</div>
                <div class="price">$1,499</div>
                <button class="add-to-cart">Add to Cart</button>
            </div>
            <div class="product-card">
                <div class="product-image">🎧</div>
                <h3>Wireless Studio Headphones</h3>
                <div class="rating">★★★★★ (2,341)</div>
                <div class="price">$299<span class="old-price">$349</span></div>
                <button class="add-to-cart">Add to Cart</button>
            </div>
            <div class="product-card">
                <div class="product-image">⌚</div>
                <h3>Smart Watch Series 5</h3>
                <div class="rating">★★★★☆ (567)</div>
                <div class="price">$399</div>
                <button class="add-to-cart">Add to Cart</button>
            </div>
            <div class="product-card">
                <div class="product-badge">SALE</div>
                <div class="product-image">📷</div>
                <h3>Digital Camera 4K</h3>
                <div class="rating">★★★★★ (423)</div>
                <div class="price">$799<span class="old-price">$999</span></div>
                <button class="add-to-cart">Add to Cart</button>
            </div>
            <div class="product-card">
                <div class="product-image">🎮</div>
                <h3>Gaming Console Pro</h3>
                <div class="rating">★★★★★ (3,892)</div>
                <div class="price">$499</div>
                <button class="add-to-cart">Add to Cart</button>
            </div>
            <div class="product-card">
                <div class="product-image">🔊</div>
                <h3>Bluetooth Speaker Max</h3>
                <div class="rating">★★★★☆ (1,123)</div>
                <div class="price">$149<span class="old-price">$199</span></div>
                <button class="add-to-cart">Add to Cart</button>
            </div>
            <div class="product-card">
                <div class="product-image">⌨️</div>
                <h3>Mechanical Keyboard RGB</h3>
                <div class="rating">★★★★★ (789)</div>
                <div class="price">$129</div>
                <button class="add-to-cart">Add to Cart</button>
            </div>
        </div>
    </section>

    <section class="features">
        <div class="features-grid">
            <div class="feature-item">
                <div class="icon">🚚</div>
                <h3>Free Shipping</h3>
                <p>On orders over $50</p>
            </div>
            <div class="feature-item">
                <div class="icon">🔄</div>
                <h3>Easy Returns</h3>
                <p>30-day return policy</p>
            </div>
            <div class="feature-item">
                <div class="icon">🔒</div>
                <h3>Secure Payment</h3>
                <p>100% secure checkout</p>
            </div>
            <div class="feature-item">
                <div class="icon">💬</div>
                <h3>24/7 Support</h3>
                <p>Dedicated customer service</p>
            </div>
        </div>
    </section>

    <footer class="footer">
        <p>&copy; 2024 TechGear Store. Quality electronics for modern life.</p>
    </footer>
</body>
</html>
